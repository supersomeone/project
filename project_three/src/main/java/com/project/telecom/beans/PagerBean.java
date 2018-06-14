package com.project.telecom.beans;

import java.util.List;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6月-2018 9:25:59
 */
public class PagerBean {

	/**
	 * 具体的数据
	 */
	private List<?> datas;
	private long id;
	/**
	 * 起始位置
	 */
	private int index;
	/**
	 * 升序或者降序
	 */
	private String order;
	/**
	 * 当前页码
	 */
	private int page;
	/**
	 * 每页显示的条数
	 */
	private int rows;
	/**
	 * 按照什么属性进行排序
	 */
	private String sort;
	/**
	 * 总页数
	 */
	private int totalPage;
	/**
	 * 总条数
	 */
	private int totalRows;

	public PagerBean(){

	}

	public void finalize() throws Throwable {

	}

}