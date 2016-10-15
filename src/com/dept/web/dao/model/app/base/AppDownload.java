package com.dept.web.dao.model.app.base;

import java.util.List;

import com.dept.web.dao.model.app.base.AppDownloadData;
import com.dept.web.dao.model.app.base.BaseData;

public class AppDownload extends BaseData {
	/**
	 * apk检查更新数据集合
	 */
	private List<AppDownloadData> dataList;

	public List<AppDownloadData> getDataList() {
		return dataList;
	}

	public void setDataList(List<AppDownloadData> dataList) {
		this.dataList = dataList;
	}
}