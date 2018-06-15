package com.project.telecom.logmag.servicehandle.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.project.telecom.beans.LoginLogBean;
import com.project.telecom.logmag.daohandle.ILoginlogDaohandle;
import com.project.telecom.logmag.servicehandle.ILoginloghandleService;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:58
 */
@Service
public class LoginLoghandleServiceImpl implements ILoginloghandleService{
	@Resource
	private ILoginlogDaohandle iLoginlogDaohandle;

	@Override
	public void addLogin(LoginLogBean LoginLog) {
		// TODO Auto-generated method stub
		iLoginlogDaohandle.save(LoginLog);
	}
	
//	@Override
//	public void addLogin(LoginLogBean LoginLog) {
//		// TODO Auto-generated method stub
//		iLoginlogDaohandle.save(LoginLog);
//	}

	

}