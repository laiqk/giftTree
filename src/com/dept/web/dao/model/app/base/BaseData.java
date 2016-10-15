package com.dept.web.dao.model.app.base;

public class BaseData{
	
	/**
	 * 返回结果 0:失败 1:成功
	 */
	private Integer code;

	/**
	 * 结果信息
	 */
	private String msg;
	
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}