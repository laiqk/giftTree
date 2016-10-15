package com.dept.web.controller.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dept.web.dao.model.app.base.BaseData;
import com.dept.web.general.util.tools.iphelper.IPSeeker;
import com.dept.web.general.util.tools.iphelper.IPUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sendinfo.common.lang.StringUtil;
import com.sendinfo.xspring.controller.BaseController;
import com.sendinfo.xspring.ibatis.page.PageRequest;

/**
 * 基础类
 * 
 * @ClassName: WebController.java
 * @Description:
 *
 */
public class WebController extends BaseController {
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