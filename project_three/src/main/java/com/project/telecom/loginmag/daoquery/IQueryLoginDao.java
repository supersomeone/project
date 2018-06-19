package com.project.telecom.loginmag.daoquery;

import com.project.telecom.beans.AccountBean;
import com.project.telecom.beans.AdminBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:57
 */
public interface IQueryLoginDao {

	/**
	 * 查询管理员账户
	 * @param admin
	 * @return
	 */
	public AdminBean findByUserInfo(AdminBean admin);
	
	/**
	 * 查询普通账户
	 * @param account
	 * @return
	 */
	public AccountBean findByUserInfo(AccountBean account);
}