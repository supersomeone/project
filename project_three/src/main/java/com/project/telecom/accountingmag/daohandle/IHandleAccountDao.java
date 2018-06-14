package com.project.telecom.accountingmag.daohandle;

import java.util.List;

import com.project.telecom.beans.AccountBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6ÔÂ-2018 9:25:57
 */
public interface IHandleAccountDao {

	/**
	 * 
	 * @param account
	 */
	public void addAccount(AccountBean account);

	/**
	 * 
	 * @param account
	 */
	public void addManyAccount(List<AccountBean> account);

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