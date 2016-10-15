package com.dept.web.dao.model.app.base;

public class AppDownloadData{
	/**
	 * apk版本
	 */
	private String version;
	
	/**
	 * apk下载地址
	 */
	private String downloadUrl;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
}