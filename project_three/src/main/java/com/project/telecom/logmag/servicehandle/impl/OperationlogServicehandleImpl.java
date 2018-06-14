package com.project.telecom.logmag.servicehandle.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.project.telecom.beans.OperationLogBean;
import com.project.telecom.logmag.daohandle.IOperationlogDaohandle;
import com.project.telecom.logmag.servicehandle.IOperationlogServicehandle;

@Service
public class OperationlogServicehandleImpl implements IOperationlogServicehandle{
	@Resource
	private IOperationlogDaohandle operationlogDaohandle;
	@Override
	public void AddOperation(OperationLogBean operationLog) {
		// TODO Auto-generated method stub
		operationlogDaohandle.save(operationLog);
	}

}
