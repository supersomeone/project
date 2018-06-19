package com.project.telecom.accountingmag.servicehandle;

import java.util.List;

import com.project.telecom.beans.AccountBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:56
 */
public interface IAccountServicehandle {

	/**@author xc
	 * 添加账务账号
	 * @param account账务对象
	 */
	public void addAccount(AccountBean account);

	/**
	 * @author xc
	 * 批量添加账务账号
	 * @param account账务对象
	 */
	public void addManyAccount(List<AccountBean> accounts);

	/**
	 * @author xc
	 * 关闭账务账号
	 * @param account账务对象
	 */
	public void closeAccount(AccountBean account);

	/**
	 * @author xc
	 * 删除账务账号
	 * @param account账务对象
	 */
	public void deleteAccount(AccountBean account);

	/**
	 * @author xc
	 * 开通账务账号
	 * @param account账务对象
	 */
	public void openAccount(AccountBean account);

	/**
	 * @author xc
	 * 修改账务账号
	 * @param account账务对象
	 */
	public void updateAccount(AccountBean account);
	
	/**
	 * @author xc
	 * 查询账务账号
	 * @param id账务账号id
	 */
	public AccountBean findAccountBeanById(long id);

}