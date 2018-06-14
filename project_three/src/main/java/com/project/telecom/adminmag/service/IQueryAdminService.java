package com.project.telecom.adminmag.service;

import com.project.telecom.beans.AdminBean;
import com.project.telecom.beans.Pager;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:58
 */
public interface IQueryAdminService {

	/**
	 * 
	 * @param id
	 */
	public AdminBean findById(long id);

	/**
	 * 
	 * @param pager
	 */
	public Pager findPagerByAdminBean(Pager pager);

}