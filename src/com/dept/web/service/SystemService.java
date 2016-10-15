package com.dept.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dept.web.dao.ISettingDAO;
import com.dept.web.dao.model.Setting;
import com.dept.web.dao.model.SettingExample;
import com.dept.web.dao.model.SettingExample.Criteria;
import com.sendinfo.common.lang.StringUtil;

@Service
public class SystemService {

	@Autowired
	private ISettingDAO settingDao;

	public Setting getSetting(Setting set) {
		SettingExample example = new SettingExample();
		Criteria crt =  example.createCriteria();
		if(StringUtil.isNotEmpty(set.getName())) crt.andNameEqualTo(set.getName());
		return settingDao.selectByExampleWithoutBLOBs(example).get(0);
	}
	
	
}
