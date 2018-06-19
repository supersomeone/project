package com.project.telecom.loginmag.servicehandle;

import com.project.telecom.beans.AccountBean;
import com.project.telecom.beans.AdminBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:57
 */
public interface IHandleLoginService {

	/**
	 * 修改管理员信息
	 * @param admin
	 * @return
	 */
	public AdminBean updateUserInfo(AdminBean admin);
	
	/**
	 * 修改普通用户信息
	 * @param account
	 * @return
	 */
	public AccountBean updateUserInfo(AccountBean account);

}