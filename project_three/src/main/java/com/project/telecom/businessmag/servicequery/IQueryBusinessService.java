package com.project.telecom.businessmag.servicequery;

import com.project.telecom.beans.Pager;

import java.util.Map;

import com.project.telecom.beans.BusinessBean;

/**
 * @author xc
 * @version 1.0
 * @created 14-6��-2018 9:25:58
 */
public interface IQueryBusinessService {

	/**
	 * 根据id查询业务
	 * @param id
	 */
	public BusinessBean findAllById(long id);

	/**
	 * 多参数查询分页对象
	 * @param pager分页参数对象
	 */
	public Pager findPagerByBusinessBean(Map map,Pager pager);

}