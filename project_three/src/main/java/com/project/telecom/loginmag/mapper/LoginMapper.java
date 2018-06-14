package com.project.telecom.loginmag.mapper;

import com.project.telecom.beans.AdminBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6ÔÂ-2018 9:25:58
 */
public interface LoginMapper {

	/**
	 * 
	 * @param admins
	 */
	public AdminBean findAdminBeanByLoginNameAndPwd(AdminBean admins);

}