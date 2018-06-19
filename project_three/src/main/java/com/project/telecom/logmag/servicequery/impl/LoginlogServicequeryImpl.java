package com.project.telecom.logmag.servicequery.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.project.telecom.beans.LoginLogBean;
import com.project.telecom.beans.Pager;
import com.project.telecom.logmag.daohandle.ILoginlogDaohandle;
import com.project.telecom.logmag.daoquery.ILoginlogDaoquery;
import com.project.telecom.logmag.servicequery.ILoginlogServicequery;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:58
 */
@Service
public class LoginlogServicequeryImpl implements ILoginlogServicequery{
	@Resource
	private ILoginlogDaoquery loginlogDaoqueryImpl;
	@Override
	public int findAllByNum(Map map) {
		// TODO Auto-generated method stub
		return loginlogDaoqueryImpl.findAllByNum(map);
	}
	@Override
	public Pager findPagerByLoginlogBean(Pager pager, Map map) {
		// TODO Auto-generated method stub
		int totalRows = loginlogDaoqueryImpl.findAllByNum(map);
		List<?> datas = loginlogDaoqueryImpl.findPagerByLoginlogBean(map);
		pager.setTotalRows(totalRows);
		pager.setDatas(datas);
		return pager;
	}

	

	

}