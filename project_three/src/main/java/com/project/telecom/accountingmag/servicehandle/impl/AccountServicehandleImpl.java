package com.project.telecom.accountingmag.servicehandle.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.project.telecom.accountingmag.daohandle.IHandleAccountDao;
import com.project.telecom.accountingmag.servicehandle.IAccountServicehandle;
import com.project.telecom.beans.AccountBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:55
 */
@Service
public class AccountServicehandleImpl implements IAccountServicehandle{
	@Resource
	private IHandleAccountDao handleAccountDao;
	@Override
	public void addAccount(AccountBean account) {
		handleAccountDao.save(account);

	}

	@Override
	public void addManyAccount(List<AccountBean> accounts) {
		handleAccountDao.save(accounts);
		
	}

	@Override
	public void closeAccount(AccountBean account) {
		account.setState(0);
		handleAccountDao.saveAndFlush(account);
		
	}

	@Override
	public void deleteAccount(AccountBean account) {
		handleAccountDao.delete(account);
		
	}

	@Override
	public void openAccount(AccountBean account) {
		account.setState(1);
		handleAccountDao.saveAndFlush(account);
		
	}

	@Override
	public void updateAccount(AccountBean account) {
		handleAccountDao.saveAndFlush(account);
		
	}

	@Override
	public AccountBean findAccountBeanById(long id) {
		
		return handleAccountDao.findOne(id);
	}

}