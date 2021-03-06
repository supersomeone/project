package com.project.telecom.reportmag.servicequery;

import com.project.telecom.beans.AccountBean;
import com.project.telecom.beans.PagerBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:56
 */
public interface IAccountService {

	/**
	 * 
	 * @param id
	 */
	public AccountBean findAccountBeanById(long id);

	/**
	 * 
	 * @param pager
	 */
	public PagerBean findPagerByAccountBean(PagerBean pager);

}