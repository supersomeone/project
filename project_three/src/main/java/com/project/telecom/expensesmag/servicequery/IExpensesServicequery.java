package com.project.telecom.expensesmag.servicequery;

import com.project.telecom.beans.PricingBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6ÔÂ-2018 9:25:56
 */
public interface IExpensesServicequery {

	/**
	 * 
	 * @param pricing
	 */
	public void deletePricingBean(PricingBean pricing);

	/**
	 * 
	 * @param pricing
	 */
	public void savePricingBean(PricingBean pricing);

	/**
	 * 
	 * @param pricing
	 */
	public void updatePricingBean(PricingBean pricing);

}