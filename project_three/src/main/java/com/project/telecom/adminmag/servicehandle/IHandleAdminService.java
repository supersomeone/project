package com.project.telecom.adminmag.servicehandle;

import com.project.telecom.beans.AdminBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:57
 */
public interface IHandleAdminService {

	/**
	 * 增加管理员
	 * @param admin
	 */
	public void addAdmin(AdminBean admin);

	/**
	 * 删除管理员
	 * @param admin
	 */
	public void deleteAdmin(AdminBean admin);

	/**
	 * 修改管理员信息
	 * @param admin
	 */
	public void updateAdmin(AdminBean admin);

}