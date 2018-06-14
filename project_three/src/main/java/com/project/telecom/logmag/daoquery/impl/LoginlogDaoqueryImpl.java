package com.project.telecom.logmag.daoquery.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.project.telecom.beans.LoginLogBean;
import com.project.telecom.logmag.daoquery.ILoginlogDaoquery;
import com.project.telecom.logmag.mapper.LoginlogMapper;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:58
 */

@Repository
public class LoginlogDaoqueryImpl implements ILoginlogDaoquery{

	@Resource
	private LoginlogMapper loginlogMapper;
	
	@Override
	public int findAllByNum(Map map) {
		// TODO Auto-generated method stub
		return loginlogMapper.findAllByNum(map);
	}

	@Override
	public List<LoginLogBean> findPagerByLoginlogBean(Map map) {
		// TODO Auto-generated method stub
		return loginlogMapper.findPagerByLoginlogBean(map);
	}


}