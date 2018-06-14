package com.project.telecom.adminmag.dao;

import java.util.Map;

import com.project.telecom.beans.AdminBean;
import com.project.telecom.beans.PagerBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6ÔÂ-2018 9:25:58
 */
public interface IQueryAccountDao {

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
	public PagerBean findPagerByAdminBean(PagerBean pager, Map map);

}