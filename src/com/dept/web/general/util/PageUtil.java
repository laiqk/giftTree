package com.dept.web.general.util;

import java.util.Map;

import com.sendinfo.xspring.ibatis.page.PageRequest;

/**
 * 分页查询工具类
 * @author Administrator
 *
 * @param <T>
 */
public class PageUtil<T> extends PageRequest<T> {

	private static final long serialVersionUID = -2493981872043947242L;

	private static final int DEFALT_PAGE_SIZE = 10;

	/**
	 * 默认第一页,每页10条
	 */
	public PageUtil() {
		this(0, DEFALT_PAGE_SIZE);
	}

	/**
	 * @param pageNumber 页码
	 */
	public PageUtil(int pageNumber) {
		this(pageNumber, DEFALT_PAGE_SIZE);
	}

	/**
	 * @param filters 查询条件
	 */
	public PageUtil(T filters) {
		this(0, DEFALT_PAGE_SIZE, filters);

	}
	
	/**
	 * @param pageNumber 页码
	 * @param filters 查询条件
	 */
	public PageUtil(int pageNumber, T filters) {
		this(pageNumber, DEFALT_PAGE_SIZE, filters);
		
	}
	
	/**
	 * @param pageNumber 页码
	 * @param filters 查询条件
	 */
	public PageUtil(T filters, int pageSize) {
		this(0, pageSize, filters);
		
	}

	/**
	 * @param pageNumber 页码
	 * @param pageSize 每页条数
	 */
	public PageUtil(int pageNumber, int pageSize) {
		this(pageNumber, DEFALT_PAGE_SIZE, null);
	}

	/**
	 * @param pageNumber 页码
	 * @param pageSize  每页条数
	 * @param filters 查询条件
	 */
	public PageUtil(int pageNumber, int pageSize, T filters) {
		super(pageNumber, pageSize, filters);
	}

	/**
	 * @param filterMap 查询条件
	 */
	@SuppressWarnings("unchecked")
	public PageUtil(Map<String, ? extends Object> filterMap) {
		super(0, DEFALT_PAGE_SIZE, (T) filterMap);
	}
	

}
