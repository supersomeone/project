package com.project.telecom.expensesmag.servicequery;

import java.util.List;
import java.util.Map;

import com.project.telecom.beans.Pager;
import com.project.telecom.beans.PricingBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:56
 */
public interface IExpensesServicequery {

	/**
	 * 
	 * @param pager
	 * @param map
	 */
	public int getPagerBeanByNum();

	/**
	 * 
	 * @param pricing
	 */
	public PricingBean getPricingBeanById(long id);
	/**
	 * 
	 * @param pricing
	 */
	public Pager getPricingBeanByPagers(Map map,Pager pager);

}