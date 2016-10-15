package com.dept.web.controller.app.model;

import java.util.List;

import com.dept.web.dao.model.Product;
import com.dept.web.dao.model.app.base.BaseData;

public class AppIndex extends BaseData {
	private String count;
	private String total;
	private List<Product> productList;
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
}