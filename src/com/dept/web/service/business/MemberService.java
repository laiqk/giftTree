package com.dept.web.service.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dept.web.context.ParameterMsg;
import com.dept.web.dao.model.User;
import com.dept.web.general.util.DateUtils;
import com.dept.web.general.util.MD5;
import com.dept.web.general.util.StringUtils;
import com.dept.web.service.UserService;


@Service
public class MemberService {

	@Autowired
	private UserService userService;

	

	/**
	 * 注册
	 * 
	 * @param username
	 * @param mobile
	 * @param password
	 * @param ref
	 * @return
	 */
	@Transactional()
	public User register(String username, String password, String ref, Integer isApp, String ip) {

		User user = new User();
		user.setMobile(username);
		User u1 = userService.getUser(user);
		if (u1 != null) {
			throw new IllegalStateException(ParameterMsg.REG_PHONE_USERNAME);
		}
		
		if (!StringUtils.isEmpty(ref)) {
			user.setUsername(ref);
			u1 = userService.getUser(user);
			if (u1 == null) {
				throw new IllegalStateException(ParameterMsg.REG_INVITED_NOTEXIST);
			} else {
				user.setInviteUserid(u1.getId());// 推荐人
			}
		}

		user.setUsername(username);

		Long nowTime = DateUtils.getNowTimeStr();
		
		MD5 md5 = new MD5();
		String passwordHash = md5.getMD5ofStr(password);
		user.setPasswordHash(passwordHash);
		user.setPasswordPayHash(passwordHash);
		user.setCreatedIp(ip);
		user.setCreatedAt(nowTime.intValue());
		userService.addUser(user);
		User newUser = userService.getUser(user);
		return newUser;
	}
	
}
