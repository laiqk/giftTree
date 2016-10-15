package com.dept.web.controller.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dept.web.controller.app.model.AppIndex;

@Controller
public class AppUserController extends WebController{
	@RequestMapping(value = "app/login")
	public String login(ModelMap map, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		AppIndex index = new AppIndex();
		index.setCode(1);
		index.setCount("1000");
		index.setMsg("叶子大撒比");
		index.setTotal("2000");
		return dataToJson(map,index);
	}
	
	
}
