package com.project.telecom.accountingmag.servicequery;

import com.project.telecom.beans.AccountBean;
import com.project.telecom.beans.Pager;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:58
 */
public interface IQueryAccountService {

	/**
	 * 
	 * @param account
	 */
	public AccountBean findAllById(AccountBean account);

	/**
	 * 
	 * @param pager
	 */
	public int findPagerByAccountBean(Pager pager);

}