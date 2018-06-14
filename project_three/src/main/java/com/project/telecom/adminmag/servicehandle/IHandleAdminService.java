package com.project.telecom.adminmag.servicehandle;

import com.project.telecom.beans.AdminBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:57
 */
public interface IHandleAdminService {

	/**
	 * 
	 * @param admin
	 */
	public void addAdmin(AdminBean admin);

	/**
	 * 
	 * @param admin
	 */
	public void deleteAdmin(AdminBean admin);

	/**
	 * 
	 * @param admin
	 */
	public void updateAdmin(AdminBean admin);

}