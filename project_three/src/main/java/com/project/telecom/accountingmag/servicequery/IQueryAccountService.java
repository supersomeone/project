package com.project.telecom.accountingmag.servicequery;

import java.util.Map;

import com.project.telecom.beans.AccountBean;
import com.project.telecom.beans.Pager;

/**
 * @author xu
 * @version 1.0
 * @created 14-6��-2018 9:25:58
 */
public interface IQueryAccountService {

	/**
	 * 根据id查询账务账号
	 * @param account
	 */
	public AccountBean findAllById(long id);

	/**
	 * 多参数返回分页对象
	 * @param pager
	 */
	public Pager findPagerByAccountBean(Map map,Pager pager);

}