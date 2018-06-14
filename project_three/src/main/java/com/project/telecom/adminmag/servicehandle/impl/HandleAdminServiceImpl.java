package com.project.telecom.adminmag.servicehandle.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.project.telecom.adminmag.daohandle.IHandleAdminDao;
import com.project.telecom.adminmag.servicehandle.IHandleAdminService;
import com.project.telecom.beans.AdminBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:56
 */
@Service
public class HandleAdminServiceImpl implements IHandleAdminService{
	
	@Resource
	private IHandleAdminDao iHandleAdminDao;
	@Override
	public void addAdmin(AdminBean admin) {
		iHandleAdminDao.save(admin);
	}

	@Override
	public void deleteAdmin(AdminBean admin) {
		iHandleAdminDao.delete(admin);
		
	}

	@Override
	public void updateAdmin(AdminBean admin) {
		
	}

}