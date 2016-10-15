package com.dept.web.controller;

import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dept.web.context.ParameterMsg;
import com.dept.web.dao.model.User;
import com.dept.web.general.util.MD5;
import com.dept.web.general.util.RegExUtil;
import com.dept.web.general.util.StringUtils;
import com.dept.web.service.UserService;
import com.dept.web.service.business.MemberService;
import com.sendinfo.common.lang.StringUtil;
/**
 * 
* @ClassName: UserController  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author lqk 
* @date 2016年8月11日 下午2:48:58  
*
 */
@Controller
public class UserController extends WebController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private MemberService memberService;
	/**
	 * 
	* @Title: login 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param map
	* @param @param request
	* @param @param response
	* @param @param session
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws
	 */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(ModelMap map, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		Map<String, String> params = getParamMap(request);
		String username = params.get("username");
		map.addAttribute("username", username);
		String password = params.get("password");
		
		String verify = request.getParameter("verify");// 图片验证码
		String sessionToken = (String) session.getAttribute("captchaToken");// 系统存储验证码
		
		if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
			map.addAttribute(ERRORMSG, ParameterMsg.USERNAME_NOTEXIST);
			return "login";
		}
		
		if (null != verify)
		{
			if (StringUtil.isEmpty(verify) || StringUtil.isEmpty(sessionToken)) {
				map.addAttribute(ERRORMSG, ParameterMsg.IMAGE_CODE_ERROR);
				return "login";
			}

			if (!verify.equals(sessionToken)) {
				map.addAttribute(ERRORMSG, ParameterMsg.IMAGE_CODE_ERROR);
				return "login";
			}

		}
		
		User user = new User();
		user.setUsername(username);
		user = userService.getUser(user);

		if (user == null) {
			map.addAttribute(ERRORMSG, ParameterMsg.USERNAME_NOTEXIST);
			return "login";
		}
		MD5 md5 = new MD5();
		if (user.getPasswordHash().equals(md5.getMD5ofStr(password))) {
			putCurrUser(request, response, user);
		} else {
			map.addAttribute(ERRORMSG, ParameterMsg.USERNAME_NOTEXIST);
			return "login";
		}
		return "forward:myhome/center.html";
	}

	/**
	 * 
	* @Title: tologin 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param map
	* @param @param request
	* @param @param response
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws
	 */
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String tologin(ModelMap map, HttpServletRequest request, HttpServletResponse response) {
		String url = request.getParameter("Referer");
		map.addAttribute("returnUrl", url);
		map.addAttribute(ERRORMSG, getParamMap(request).get(ERRORMSG));
		map.addAttribute("username", request.getParameter("username"));
		map.addAttribute("code", request.getParameter("code"));
		return "login";
	}
	
	/**
	 * 
	* @Title: register 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param map
	* @param @param request
	* @param @param response
	* @param @param session
	* @param @return
	* @param @throws UnsupportedEncodingException    设定文件 
	* @return String    返回类型 
	* @throws
	 */
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String register(ModelMap map, HttpServletRequest request, HttpServletResponse response, HttpSession session) throws UnsupportedEncodingException {

		String mobile = request.getParameter("telphone");
		String password = request.getParameter("password");
		String repassword = request.getParameter("repassword");
		String ref = request.getParameter("ref");// 推荐人
		map.addAttribute("telphone", mobile);
		
		if ("请输入推荐人手机号码".equals(ref)) {
			ref = null;
		}
		int vflag = regValidate(password, repassword, mobile);
		switch (vflag) {

		case 1: // 密码为空
			map.addAttribute(ERRORMSG, ParameterMsg.REG_PASSWORD_EMPTY);
			break;
		case 2: // 密码格式为6-15位数字与字母组合,不能包含中文和空格
			map.addAttribute(ERRORMSG, ParameterMsg.USER_PASSWORD_ISNOTREGULAR);
			break;
		case 3: // 手机号码为空
			map.addAttribute(ERRORMSG, ParameterMsg.REG_PHONE_EMPTY);
			break;
		case 4: // 手机号码错误
			map.addAttribute(ERRORMSG, ParameterMsg.REG_PHONE_NOTCORRECT);
			break;
		case 5: // 两次密码输入不一致
			map.addAttribute(ERRORMSG, ParameterMsg.REG_PASSWORD_NOTSAME);
			break;
		default:
			break;
		}
		
		if (vflag != 0) {
			return "register";
		}
		
		User user = memberService.register(mobile, repassword, ref, 0, getRequestIp(request));

		putCurrUser(request, response, user);
		return "forward:myhome/center.html";
	}

	/**
	 * 跳转注册页面
	 * 
	 * @param map
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String signup(ModelMap map, HttpServletRequest request, HttpServletResponse response) {
		String ref = request.getParameter("ref");// 推荐人
		
		if (!StringUtils.isEmpty(ref)) {
			User u = new User();
			u.setUsername(ref);
			User user = userService.getUser(u);
			request.getSession().setAttribute("ref", user.getUsername());
		}
		
		return "register";
	}

	/**
	 * 注册验证
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	private int regValidate(String password, String repassword, String mobile) {

		// 检查密码是否为空
		if (StringUtil.isEmpty(password)) {
			return 1;
		}

		String regEx1 = "^\\w{6,15}$";// 6-15位密码,不能包含空格和中文
		String regEx2 = "^\\d+$";// 密码为纯数字
		String regEx3 = "^[a-zA-Z]+$";// 密码为纯字母
		if (!Pattern.matches(regEx1, password)) {
			return 2;
		}
		if (Pattern.matches(regEx2, password)) {
			return 2;
		}
		if (Pattern.matches(regEx3, password)) {
			return 2;
		}

		if (StringUtil.isEmpty(mobile)) {
			return 3;
		}

		/** 必须手机号 */
		if (!RegExUtil.isMobileNO(mobile)) {
			return 4;
		}

		// 两次密码输入是否不一致
		if (!password.equals(repassword)) {
			return 5;
		}

		return 0;
	}

	@RequestMapping("/loginout")
	public String loginout(HttpSession session) throws UnsupportedEncodingException {
		session.invalidate();
		return "redirect:/index.html";
	}
	
}