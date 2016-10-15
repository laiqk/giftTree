package com.dept.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dept.web.context.ParameterMsg;
import com.dept.web.dao.IUserDAO;
import com.dept.web.dao.model.User;
import com.dept.web.dao.model.UserExample;
import com.sendinfo.common.lang.StringUtil;

@Service
public class UserService {
	@Autowired
	private IUserDAO userDao;

	public User getUser(User user) {
		UserExample example = new UserExample();
		UserExample.Criteria crt = example.createCriteria();
		
		if(StringUtil.isNotEmpty(user.getUsername()))
			crt.andUsernameEqualTo(user.getUsername());
		if(StringUtil.isNotEmpty(user.getAccesstoken()))
			crt.andAccesstokenEqualTo(user.getAccesstoken());
		List<User> list = userDao.selectByExample(example);
		if(list.size()>0) return list.get(0);
		return null;
	}

	public User queryByUserId(Integer userId) {
		return userDao.selectByPrimaryKey(userId);
	}

	public void addUser(User user) {
		userDao.insertSelective(user);
	}

}
