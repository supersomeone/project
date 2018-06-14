package com.project.telecom.selfmag.daohandle;

import com.project.telecom.beans.AccountBean;
import com.project.telecom.beans.AdminBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6ÔÂ-2018 9:25:57
 */
public interface IHandleAccountsDao {

	/**
	 * 
	 * @param account
	 */
	public void updateTelphone(AccountBean account);

	/**
	 * 
	 * @param admin
	 */
	public void updateTelphone(AdminBean admin);

}