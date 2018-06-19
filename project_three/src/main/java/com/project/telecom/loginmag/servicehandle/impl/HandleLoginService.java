package com.project.telecom.loginmag.servicehandle.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.project.telecom.accountingmag.daohandle.IHandleAccountDao;
import com.project.telecom.beans.AccountBean;
import com.project.telecom.beans.AdminBean;
import com.project.telecom.loginmag.daohendle.IHandleLoginDao;
import com.project.telecom.loginmag.servicehandle.IHandleLoginService;

@Service
public class HandleLoginService implements IHandleLoginService{

	@Resource
	private IHandleLoginDao handleLoginDao;
	@Resource
	private IHandleAccountDao handleAccountDao;
	@Override
	public AdminBean updateUserInfo(AdminBean admin) {
		// TODO Auto-generated method stub
		return handleLoginDao.saveAndFlush(admin);
	}

	@Override
	public AccountBean updateUserInfo(AccountBean account) {
		// TODO Auto-generated method stub
		return handleAccountDao.saveAndFlush(account);
	}

}
