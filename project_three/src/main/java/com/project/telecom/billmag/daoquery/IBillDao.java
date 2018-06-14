package com.project.telecom.billmag.daoquery;

import java.util.List;
import java.util.Map;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6ÔÂ-2018 9:25:56
 */
public interface IBillDao {

	/**
	 * 
	 * @param map
	 */
	public int countPagerBeanByAccountmonthBean(Map map);

	/**
	 * 
	 * @param map
	 */
	public int countPagerBeanByServicebillBean(Map map);

	/**
	 * 
	 * @param map
	 */
	public int countPagerBeanByServicemonthBean(Map map);

	/**
	 * 
	 * @param map
	 */
	public List getPagerBeanByAccountmonthBean(Map map);

	/**
	 * 
	 * @param map
	 */
	public List getPagerBeanByServicebillBean(Map map);

	/**
	 * 
	 * @param map
	 */
	public List getPagerBeanByServicemonthBean(Map map);

}