package com.project.telecom.expensesmag.servicequery.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.project.telecom.beans.PricingBean;
import com.project.telecom.expensesmag.daoquery.IExpensesDaoquery;
import com.project.telecom.expensesmag.servicequery.IExpensesServicequery;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:55
 */
@Service
public class ExpensesServicequeryImpl implements IExpensesServicequery{
	@Resource
	private IExpensesDaoquery iExpensesDaoquery;

	@Override
	public int getPagerBeanByNum() {
		// TODO Auto-generated method stub
		return iExpensesDaoquery.getPagerBeanByNum();
	}

	@Override
	public PricingBean getPricingBeanById(long id) {
		// TODO Auto-generated method stub
		return iExpensesDaoquery.getPricingBeanById(id);
	}

	@Override
	public List<PricingBean> getPricingBeanByPagers(Map map) {
		// TODO Auto-generated method stub
		return iExpensesDaoquery.getPricingBeanByPagers(map);
	}

	

}