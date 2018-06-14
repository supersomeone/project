package com.project.telecom.billmag.servicequery;

import java.util.Map;

import com.project.telecom.beans.Pager;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:56
 */
public interface IBillServicequery {

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
	public Pager findPagerBeanByServicebill(Pager pager, Map map);

	/**
	 * 
	 * @param pager
	 * @param map
	 */
	public Pager findPagerBeanByServicemonthBean(Pager pager, Map map);

}