package com.project.telecom.financemag.daoquery;

import java.util.Map;

import com.project.telecom.beans.AccountmonthBean;
import com.project.telecom.beans.AccountyearBean;
import com.project.telecom.beans.Pager;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:58
 */
public interface IQueryFinanceDao {

	/**
	 * 
	 * @param id
	 */
	public AccountmonthBean findAccountmonthBeanById(long id);

	/**
	 * 
	 * @param id
	 */
	public AccountyearBean findAccountyearBeanById(long id);

	/**
	 * 
	 * @param pager
	 * @param map
	 */
	public Pager findPagerBeanByAccountmonthBean(Pager pager, Map map);

	/**
	 * 
	 * @param pager
	 * @param map
	 */
	public Pager findPagerBeanByAccountyearBean(Pager pager, Map map);

}