package com.project.telecom.loginmag.servicehendle;

import com.project.telecom.beans.AdminBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6ÔÂ-2018 9:25:57
 */
public interface ILoginService {

	/**
	 * 
	 * @param admins
	 */
	public AdminBean findAdminBeanByLoginNameAndPwd(AdminBean admins);

}