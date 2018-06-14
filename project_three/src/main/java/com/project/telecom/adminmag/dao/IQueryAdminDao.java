package com.project.telecom.adminmag.dao;

import java.util.Map;

import com.project.telecom.beans.AdminBean;
import com.project.telecom.beans.Pager;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:58
 */
public interface IQueryAdminDao {

	/**
	 * 
	 * @param id
	 */
	public AdminBean findById(long id);

	/**
	 * 
	 * @param pager
	 * @param map
	 */
	public Pager findPagerByAdminBean(Pager pager, Map map);

}