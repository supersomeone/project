package com.project.telecom.accountingmag.servicequery.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.project.telecom.accountingmag.daoquery.IQueryAccountDao;
import com.project.telecom.accountingmag.servicequery.IQueryAccountService;
import com.project.telecom.beans.AccountBean;
import com.project.telecom.beans.Pager;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:55
 */
@Service
public class AccountServicequeryImpl implements IQueryAccountService{
	@Resource
	private IQueryAccountDao accountDaoqueryImpl; 
	@Override
	public AccountBean findAllById(long id) {
		// TODO Auto-generated method stub
		return accountDaoqueryImpl.findAllById(id);
	}

	@Override
	public Pager findPagerByAccountBean(Map map, Pager pager) {
		List<AccountBean> datas=accountDaoqueryImpl.findAccountsByMapToPager(map, pager);
		int totalRows=accountDaoqueryImpl.findPagerByAccountBean(map);
		
		pager.setDatas(datas);
		pager.setTotalRows(totalRows);
		return pager;
	}


}