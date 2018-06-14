package com.project.telecom.reportmag.daoquery;

import com.project.telecom.beans.AccountBean;
import com.project.telecom.beans.Pager;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:56
 */
public interface IAccountDao {

	/**
	 * 
	 * @param id
	 */
	public AccountBean findAccountBeanById(long id);

	/**
	 * 
	 * @param pager
	 */
	public Pager findPagerByAccountBean(Pager pager);

}