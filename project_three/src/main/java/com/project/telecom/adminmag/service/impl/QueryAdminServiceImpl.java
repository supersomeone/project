package com.project.telecom.adminmag.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.project.telecom.adminmag.dao.IQueryAdminDao;
import com.project.telecom.adminmag.service.IQueryAdminService;
import com.project.telecom.beans.AdminBean;
import com.project.telecom.beans.Pager;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:59
 */
@Service
public class QueryAdminServiceImpl implements IQueryAdminService{
	@Resource
	private IQueryAdminDao queryAdminDaoImpl;

	@Override
	public AdminBean findById(long id) {
		// TODO Auto-generated method stub
		return queryAdminDaoImpl.findById(id);
	}

	@Override
	public Pager findPagerByAdminBean(Pager pager) {
		// TODO Auto-generated method stub
		return queryAdminDaoImpl.findPagerByAdminBean(pager);
	}
	
}