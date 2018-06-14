package com.project.telecom.commonmag.daoquery;

import com.project.telecom.beans.AdminBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6ÔÂ-2018 9:25:58
 */
public interface IQueryCommonDao {

	/**
	 * 
	 * @param admin
	 */
	public AdminBean findAdminBean(AdminBean admin);

}