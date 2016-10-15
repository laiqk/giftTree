package com.dept.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dept.web.dao.model.User;

/**
 * 
* @ClassName: CenterController  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author lqk 
* @date 2016年8月11日 下午3:03:10  
*
 */
@Controller
public class CenterController extends WebController {


	/**
	 * 侧边栏
	 * 
	 * @param map
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "myhome/user-sidebar")
	public String getleft(ModelMap map, HttpServletRequest request, HttpServletResponse response) throws Exception {
		User user = getCurrUser(request, response);
		map.addAttribute("user", user);

		String sidenav = request.getParameter("sidenav");
		map.addAttribute("menu",sidenav);
		if(StringUtils.isNotBlank(sidenav)){
			map.addAttribute("select", sidenav.substring(0,1));
		}
		
		return "myhome/user-sidebar";
	}

	/**
	 * 我的账户首页
	 * 
	 * @param map
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "myhome/center")
	public String center(ModelMap map, HttpServletRequest request, HttpServletResponse response) throws Exception {
		User user = getCurrUser(request, response);
		
		map.addAttribute("user", user);

		Integer userId = user.getId();
		
		
		return "myhome/center";
	}
}