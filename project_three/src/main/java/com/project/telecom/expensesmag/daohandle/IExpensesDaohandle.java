package com.project.telecom.expensesmag.daohandle;

import java.util.Map;

import com.project.telecom.beans.PagerBean;
import com.project.telecom.beans.PricingBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6ÔÂ-2018 9:25:56
 */
public interface IExpensesDaohandle {

	/**
	 * 
	 * @param pager
	 * @param map
	 */
	public PagerBean getPagerBeanByPricingBean(PagerBean pager, Map map);

	/**
	 * 
	 * @param pricing
	 */
	public PricingBean getPricingBeanById(PricingBean pricing);

}