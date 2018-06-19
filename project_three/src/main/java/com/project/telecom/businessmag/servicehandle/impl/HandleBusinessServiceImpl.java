package com.project.telecom.businessmag.servicehandle.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.project.telecom.beans.BusinessBean;
import com.project.telecom.businessmag.daohandle.IHandleBusinessDao;
import com.project.telecom.businessmag.servicehandle.IHandleBusinessService;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:56
 */
@Service
public class HandleBusinessServiceImpl implements IHandleBusinessService{
	@Resource
	private IHandleBusinessDao iHandleBusinessDao;
	@Override
	public BusinessBean addBusiness(BusinessBean business) {
		
		return iHandleBusinessDao.save(business);
	}

	@Override
	public void closeBusiness(long id) {
		BusinessBean business=iHandleBusinessDao.findOne(id);
		iHandleBusinessDao.saveAndFlush(business);
	}

	@Override
	public void deleteBusiness(BusinessBean business) {
		// TODO Auto-generated method stub
		iHandleBusinessDao.delete(business);
	}

	@Override
	public void openBusiness(long id) {
		// TODO Auto-generated method stub
		BusinessBean business=iHandleBusinessDao.findOne(id);
		iHandleBusinessDao.saveAndFlush(business);
	}

	@Override
	public BusinessBean updateBusiness(BusinessBean business) {
		// TODO Auto-generated method stub
		return iHandleBusinessDao.saveAndFlush(business);
	}
	public BusinessBean findBusinessById(long id) {
		// TODO Auto-generated method stub
		return iHandleBusinessDao.findOne(id);
	}

	
}