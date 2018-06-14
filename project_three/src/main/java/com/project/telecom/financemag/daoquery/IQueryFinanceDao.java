package com.project.telecom.financemag.daoquery;

import java.util.Map;

import com.project.telecom.beans.AccountmonthBean;
import com.project.telecom.beans.AccountyearBean;
import com.project.telecom.beans.PagerBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6ÔÂ-2018 9:25:58
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
	public PagerBean findPagerBeanByAccountmonthBean(PagerBean pager, Map map);

	/**
	 * 
	 * @param pager
	 * @param map
	 */
	public PagerBean findPagerBeanByAccountyearBean(PagerBean pager, Map map);

}