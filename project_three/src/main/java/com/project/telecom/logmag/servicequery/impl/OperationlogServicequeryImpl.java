package com.project.telecom.logmag.servicequery.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.project.telecom.beans.OperationLogBean;
import com.project.telecom.logmag.daohandle.IOperationlogDaohandle;
import com.project.telecom.logmag.daoquery.IOperationlogDaoquery;
import com.project.telecom.logmag.servicequery.IOperationlogServicequery;
@Service
public class OperationlogServicequeryImpl implements IOperationlogServicequery{
	@Resource
	private IOperationlogDaoquery operationlogDaoqueryImpl;
	@Override
	public int findAllByNum(Map map) {
		// TODO Auto-generated method stub
		return operationlogDaoqueryImpl.findAllByNum(map);
	}

	@Override
	public List<OperationLogBean> findPagerByOperationLogBean(Map map) {
		// TODO Auto-generated method stub
		return operationlogDaoqueryImpl.findPagerByOperationLogBean(map);
	}

}
