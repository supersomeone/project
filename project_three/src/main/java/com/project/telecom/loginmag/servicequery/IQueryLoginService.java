package com.project.telecom.loginmag.servicequery;

import com.project.telecom.beans.AccountBean;
import com.project.telecom.beans.AdminBean;

public interface IQueryLoginService {

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
