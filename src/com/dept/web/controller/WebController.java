package com.dept.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.support.SessionStatus;

import com.dept.web.dao.model.User;
import com.dept.web.dao.model.app.base.BaseData;
import com.dept.web.general.context.HttpContext;
import com.dept.web.general.util.MD5;
import com.dept.web.general.util.SessionHelper;
import com.dept.web.general.util.SessionHelper.SessionType;
import com.dept.web.general.util.tools.iphelper.IPSeeker;
import com.dept.web.general.util.tools.iphelper.IPUtils;
import com.dept.web.service.UserService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sendinfo.common.lang.StringUtil;
import com.sendinfo.xspring.controller.BaseController;
import com.sendinfo.xspring.ibatis.page.PageRequest;

public class WebController extends BaseController {

	@Autowired
	protected UserService userService;

	/**
	 * 错误消息
	 */
	protected static final String ERRORMSG = "errormsg";

	/**
	 * 返回结果
	 */
	protected static final String CODE = "code";

	/**
	 * 返回结果信息
	 */
	protected static final String MSG = "msg";

	protected static final String SESSION_USER = "session_user";

	/**
	 * 最后签到时间
	 */
	protected static final String SESSION_SIGNIN_STATUS_LAST_TIME = "SIGNIN_LAST_TIME";

	/**
	 * 签到图标是否隐藏(true!false)
	 */
	protected static final String SESSION_SIGNIN_HIDDEN = "signin_hidden";
	
	protected static String RECV_ORD_ID = "RECV_ORD_ID_";
    
	protected static String NOTIFY_SUCCESS = "000";

	/**
	 * 自动识别request里翻页参数 pageNumber 页码 pageSize 每页记录数
	 * 
	 * @param pageRequest
	 * @param request
	 */
	public void populatePage(PageRequest<?> pageRequest, HttpServletRequest request) {

		String pageNumber = request.getParameter("pageNumber");
		if (StringUtil.isNotEmpty(pageNumber)) {
			pageRequest.setPageNumber(Integer.valueOf(pageNumber));
		}
		String pageSize = request.getParameter("pageSize");
		if (StringUtil.isNotEmpty(pageSize)) {
			pageRequest.setPageSize(Integer.valueOf(pageSize));
		}

	}

	/**
	 * 获取参数map (把HttpServletRequest里的ParameterMap统一转换成HashMap)
	 * 
	 * @param request
	 * @return
	 */
	public Map<String, String> getParamMap(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		Map<String, String> paramMap = new HashMap<String, String>();
		Enumeration<String> names = request.getParameterNames();
		while (names.hasMoreElements()) {
			String key = names.nextElement();
			paramMap.put(key, request.getParameter(key));
		}
		return paramMap;
	}

	final protected void out(HttpServletResponse response, Object target) {
		GsonBuilder gbuild = new GsonBuilder();
		PrintWriter out = null;
		try {
			response.setContentType("text/javascript;charset=UTF-8");
			out = response.getWriter();
			out.write(gbuild.create().toJson(target));
		} catch (IOException e) {
			throw new RuntimeException("Response writing failure.", e);
		} finally {
			out.close();
		}
	}

	final protected void out(HttpServletResponse response, String message) {
		PrintWriter out = null;
		try {
			response.setContentType("text/plain;charset=UTF-8");
			out = response.getWriter();
			out.write(message);
		} catch (IOException e) {
			throw new RuntimeException("Response writing failure.", e);
		} finally {
			out.close();
		}
	}

	/**
	 * 获得登录用户信息
	 * 
	 * <pre>
	 * 返回用户信息
	 * </pre>
	 * 
	 * @param request
	 * @return
	 */
	final protected User getCurrUser(HttpServletRequest request, HttpServletResponse response) {

		Integer userId = this.getUserId(request, response);
		if (userId == null || userId.intValue() <= 0) {
			return null;
		}

		return this.userService.queryByUserId(userId);

	}
	
	/**
	 * 获得登录用户信息
	 * 
	 * <pre>
	 * 返回用户信息
	 * </pre>
	 * 
	 * @param request
	 * @return
	 */
	final protected User getAccessTokenUser(HttpServletRequest request, HttpServletResponse response) 
	{

		String accessToken=request.getHeader("accessToken");
		if (accessToken == null ) {
			return null;
		}
		User u = new User();
		u.setAccesstoken(accessToken);
		User user=userService.getUser(u);

		return user;

	}
	
	

	final protected User getCurrUser(HttpServletRequest request) {
		Object user = request.getSession().getAttribute(SESSION_USER);
		if (user == null) {
			return null;
		}

		return (User) user;
	}

	final protected void putCurrUser(HttpServletRequest request, HttpServletResponse response, User user) {
		if (user == null) {
			SessionHelper.setUserId(request, response, null);
			request.getSession().setAttribute(SESSION_USER, user);
		} else {
			SessionHelper.setUserId(request, response, user.getId().longValue());
			request.getSession().setAttribute(SESSION_USER, user);
		}
	}

	private Integer getUserId(HttpServletRequest aRequest, HttpServletResponse aResponse) {
		Integer result = 0;
		boolean flag = false;
		User al = null;
		String strLoginedUser = "";
		String strLoginedPassword = "";
		String jessionId = "";

		try {
			result = SessionHelper.getUserId(aRequest, aResponse).intValue();

			if (result == null || result > 0l) {
				Cookie ary[] = aRequest.getCookies();
				if (ary != null && ary.length > 0) {
					for (Cookie item : ary) {
						if (HttpContext.SessionKey.LOGINED_USER.toString().equalsIgnoreCase(item.getName()))
							strLoginedUser = URLDecoder.decode(item.getValue(), "utf-8").replace("#", "@");

						if (HttpContext.SessionKey.LOGINED_PASSWORD.toString().equalsIgnoreCase(item.getName()))
							strLoginedPassword = item.getValue();
						if (HttpContext.SessionKey.JSESSIONID.toString().equalsIgnoreCase(item.getName()))
							jessionId = item.getValue();
					}

					if (StringUtil.isNotEmpty(strLoginedUser) && StringUtil.isNotEmpty(strLoginedPassword)) {
						User user = new User();
						user.setUsername(strLoginedUser);
						user = userService.getUser(user);
						if (user != null) {
							MD5 md5 = new MD5();
							String cookiePasswor = md5.getMD5ofStr(strLoginedUser + user.getPasswordHash()).toUpperCase();
							if (cookiePasswor.equals(strLoginedPassword)) {
								al = user;
							}

						}
					}

					if (al != null)
						flag = true;
				}
			}

			if (flag) {
				return al.getId();
			} else {
				return result;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}

	/**
	 * 获取http请求的实际IP
	 * 
	 * @return
	 */
	protected String getRequestIp(HttpServletRequest request) {
		String realip = IPUtils.getRemortIP(request);
		return realip;
	}

	/**
	 * 获取IP所在地
	 * 
	 * @return
	 */
	protected String getAreaByIp(HttpServletRequest request) {
		String realip = getRequestIp(request);
		return getAreaByIp(realip);
	}

	protected String getAreaByIp(String ip) {
		IPSeeker ipSeeker = IPSeeker.getInstance();
		String nowarea = ipSeeker.getArea(ip);
		return nowarea;
	}

	/**
	 * 
	 * @Description: 记住密码
	 * @param: @param request
	 * @param: @param response
	 * @param: @param status
	 * @param: @param username
	 * @param: @param password
	 * @param: @param userid
	 * @param: @param type on记住
	 * @param: @throws UnsupportedEncodingException
	 * @return: void
	 * @throws
	 */
	protected void rememberMe(HttpServletRequest request, HttpServletResponse response, SessionStatus status,

	String username, String password, long userid, String type) throws UnsupportedEncodingException {

		if (StringUtil.isEmpty(type) || type.equals("off")) {
			this.putCurrUser(request, response, null);
			status.setComplete();
			request.getSession().removeAttribute("session_user");
			Cookie ckUsername, ckSessionid;
			ckUsername = new Cookie(HttpContext.SessionKey.LOGINED_USER.getKey(), ""); // user是代表用户的bean

			ckUsername.setPath("/");
			response.addCookie(ckUsername);

			ckSessionid = new Cookie(HttpContext.SessionKey.LOGINED_PASSWORD.getKey(), "");

			ckSessionid.setPath("/");
			response.addCookie(ckSessionid);

			SessionHelper.setSession(request, SessionType.USER_ID, userid);

		} else if (type.equals("on")) {
//			//获取记住用户时系统时间
//			Calendar calendar = Calendar.getInstance();
//			Long loginTime = DateUtils.getTimeLong(calendar.getTime());
//			//设置时间为记住用户时间当天的23:59:59
//			calendar.set(Calendar.HOUR_OF_DAY, 23);
//			calendar.set(Calendar.MINUTE, 59);
//			calendar.set(Calendar.SECOND, 59);
//			Long todayTime = DateUtils.getTimeLong(calendar.getTime());
//			//获取记住用户当天剩余时间
//			int remainTime = (int) (todayTime - loginTime);
			//记住用户14天
			int remainTime = 60*60*24*14;
			
			/** cookies相关 start */
			Cookie ckUsername, ckSessionid;
			String value = URLEncoder.encode(username, "UTF-8");
			ckUsername = new Cookie(HttpContext.SessionKey.LOGINED_USER.getKey(), value.replace("@", "#")); // user是代表用户的bean
			ckUsername.setPath("/");
			ckUsername.setMaxAge(remainTime);// 设置Cookie有效期
			response.addCookie(ckUsername);

			MD5 md5 = new MD5();
			ckSessionid = new Cookie(HttpContext.SessionKey.LOGINED_PASSWORD.getKey(), md5.getMD5ofStr(username + password).toUpperCase());
			ckSessionid.setPath("/");
			ckSessionid.setMaxAge(remainTime);// 设置Cookie有效期
			response.addCookie(ckSessionid);

			/** cookies相关 end */
		} else {
			this.putCurrUser(request, response, null);
			status.setComplete();
			request.getSession().removeAttribute("session_user");
			Cookie ckUsername, ckSessionid;
			ckUsername = new Cookie(HttpContext.SessionKey.LOGINED_USER.getKey(), ""); // user是代表用户的bean

			ckUsername.setPath("/");
			response.addCookie(ckUsername);

			ckSessionid = new Cookie(HttpContext.SessionKey.LOGINED_PASSWORD.getKey(), "");

			ckSessionid.setPath("/");
			response.addCookie(ckSessionid);
		}

	}

	/**
	 * app数据转json
	 * 
	 * @param map
	 * @param baseData
	 * @return
	 */
	protected String dataToJson(ModelMap map, BaseData baseData) {
		Gson gson = new Gson();
		String res = gson.toJson(baseData);
		map.addAttribute("res", res);
		return "app/result";
	}
}