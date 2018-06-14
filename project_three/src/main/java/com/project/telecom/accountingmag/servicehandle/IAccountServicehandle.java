package com.project.telecom.accountingmag.servicehandle;

import com.project.telecom.beans.AccountBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6ÔÂ-2018 9:25:56
 */
public interface IAccountServicehandle {

	/**
	 * 
	 * @param account
	 */
	public void addAccount(AccountBean account);

	/**
	 * 
	 * @param account
	 */
	public void addManyAccount(AccountBean account);

	/**
	 * 
	 * @param account
	 */
	public void closeAccount(AccountBean account);

	/**
	 * 
	 * @param account
	 */
	public void deleteAccount(AccountBean account);

	/**
	 * 
	 * @param account
	 */
	public void openAccount(AccountBean account);

	/**
	 * 
	 * @param account
	 */
	public void updateAccount(AccountBean account);

}