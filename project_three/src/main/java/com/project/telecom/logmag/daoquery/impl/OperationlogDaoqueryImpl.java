package com.project.telecom.logmag.daoquery.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.project.telecom.beans.OperationLogBean;
import com.project.telecom.logmag.daoquery.IOperationlogDaoquery;
import com.project.telecom.logmag.mapper.OperationlogMapper;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:59
 */
@Repository
public class OperationlogDaoqueryImpl implements IOperationlogDaoquery{
	@Resource
	private OperationlogMapper operationlogMapper;
	@Override
	public int findAllByNum(Map map) {
		// TODO Auto-generated method stub
		return operationlogMapper.findAllByNum(map);
	}

	@Override
	public List<OperationLogBean> findPagerByOperationLogBean(Map map) {
		// TODO Auto-generated method stub
		return operationlogMapper.findPagerByOperationLogBean(map);
	}


}