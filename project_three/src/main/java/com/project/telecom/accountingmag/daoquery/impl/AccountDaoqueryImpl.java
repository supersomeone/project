package com.project.telecom.accountingmag.daoquery.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.project.telecom.accountingmag.daoquery.IQueryAccountDao;
import com.project.telecom.accountingmag.mapper.AccountMapper;
import com.project.telecom.beans.AccountBean;
import com.project.telecom.beans.Pager;
import com.project.telecom.reportmag.daoquery.IAccountDao;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:54
 */
@Repository
public class AccountDaoqueryImpl implements IQueryAccountDao{
	@Resource
	private AccountMapper accountMapper;

	@Override
	public AccountBean findAllById(long id) {
		// TODO Auto-generated method stub
		return accountMapper.findAccountById(id);
	}

	@Override
	public int findPagerByAccountBean(Map map) {
		int totalRows=accountMapper.countAccountByMapToPager(map);
		return totalRows;
	}

	@Override
	public List<AccountBean> findAccountsByMapToPager(Map map, Pager pager) {
		// TODO Auto-generated method stub
		List<AccountBean> accountBeans=accountMapper.findAccountsByMapToPager(map, pager);
		return accountBeans;
	}
}