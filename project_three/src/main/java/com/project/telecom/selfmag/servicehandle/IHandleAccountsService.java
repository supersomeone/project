package com.project.telecom.selfmag.servicehandle;

import com.project.telecom.beans.AccountBean;
import com.project.telecom.beans.AdminBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6ÔÂ-2018 9:25:57
 */
public interface IHandleAccountsService {

	/**
	 * 
	 * @param accounts
	 */
	public void updateTelphone(AccountBean accounts);

	/**
	 * 
	 * @param admin
	 */
	public void updateTelphone(AdminBean admin);

}