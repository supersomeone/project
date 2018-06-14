package com.project.telecom.commonmag.servicequery;

import com.project.telecom.beans.AdminBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6ÔÂ-2018 9:25:58
 */
public interface IQueryCommonService {

	/**
	 * 
	 * @param admin
	 */
	public AdminBean findAdminBean(AdminBean admin);

}