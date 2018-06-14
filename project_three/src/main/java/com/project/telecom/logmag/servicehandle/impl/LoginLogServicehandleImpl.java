package com.project.telecom.logmag.servicehandle.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.project.telecom.beans.LoginLogBean;
import com.project.telecom.logmag.daohandle.ILoginlogDaohandle;
import com.project.telecom.logmag.servicehandle.ILoginlogServicehandle;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:58
 */
@Service
public class LoginLogServicehandleImpl implements ILoginlogServicehandle{
	@Resource
	private ILoginlogDaohandle loginlogDaohandle;
	@Override
	public void AddLogin(LoginLogBean LoginLog) {
		// TODO Auto-generated method stub
		loginlogDaohandle.save(LoginLog);
	}

	

}