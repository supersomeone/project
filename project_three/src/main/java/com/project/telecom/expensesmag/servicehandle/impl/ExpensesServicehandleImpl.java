package com.project.telecom.expensesmag.servicehandle.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.project.telecom.beans.PricingBean;
import com.project.telecom.expensesmag.daohandle.IExpensesDaohandle;
import com.project.telecom.expensesmag.servicehandle.IExpensesServicehandle;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:55
 */
@Service
public class ExpensesServicehandleImpl implements IExpensesServicehandle{
	@Resource
	private IExpensesDaohandle iExpensesDaohandle;

	@Override
	public void deletePricingBean(PricingBean pricing) {
		// TODO Auto-generated method stub
		iExpensesDaohandle.delete(pricing);
	}

	@Override
	public void savePricingBean(PricingBean pricing) {
		// TODO Auto-generated method stub
		iExpensesDaohandle.save(pricing);
	}

	@Override
	public void updatePricingBean(PricingBean pricing) {
		// TODO Auto-generated method stub
		iExpensesDaohandle.saveAndFlush(pricing);
	}

	

}