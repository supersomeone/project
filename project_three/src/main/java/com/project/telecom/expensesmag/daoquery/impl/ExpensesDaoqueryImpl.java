package com.project.telecom.expensesmag.daoquery.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.project.telecom.beans.PricingBean;
import com.project.telecom.expensesmag.daoquery.IExpensesDaoquery;
import com.project.telecom.expensesmag.mapper.ExpensesMapper;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:55
 */
@Repository
public class ExpensesDaoqueryImpl implements IExpensesDaoquery{

	@Resource
	private ExpensesMapper expensesMapper;

	@Override
	public PricingBean getPricingBeanById(long id) {
		// TODO Auto-generated method stub
		return expensesMapper.getPricingBeanById(id);
	}

	@Override
	public List<PricingBean> getPricingBeanByPagers(Map map) {
		// TODO Auto-generated method stub
		return expensesMapper.getPricingBeanByPagers(map);
	}

	@Override
	public int getPagerBeanByNum() {
		// TODO Auto-generated method stub
		return expensesMapper.getPagerBeanByNum();
	}

	

	

}