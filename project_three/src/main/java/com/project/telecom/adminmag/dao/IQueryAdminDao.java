package com.project.telecom.adminmag.dao;

import java.util.Map;

import com.project.telecom.beans.AdminBean;
import com.project.telecom.beans.Pager;

/**
 * @author xc
 * @version 1.0
 * @created 14-6��-2018 9:25:58
 */
public interface IQueryAdminDao {

	/**
	 * 根据id查询管理员对象
	 * @param id
	 */
	public AdminBean findById(long id);

	/**
	 * 查询管理员分页对象
	 * @param pager 分页参数对象
	 * @param map 多参数map集合
	 */
	public Pager findPagerByAdminBean(Pager pager);

}