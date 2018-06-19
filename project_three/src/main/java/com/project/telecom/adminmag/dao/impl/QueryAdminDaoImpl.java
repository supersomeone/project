package com.project.telecom.adminmag.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.project.telecom.adminmag.dao.IQueryAdminDao;
import com.project.telecom.adminmag.mapper.AdminMapper;
import com.project.telecom.beans.AdminBean;
import com.project.telecom.beans.Pager;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:59
 */
@Repository
public class QueryAdminDaoImpl implements IQueryAdminDao{
	@Resource
	private AdminMapper adminMapper;
	@Override
	public AdminBean findById(long id) {
		// TODO Auto-generated method stub
		return adminMapper.findAdminById(id);
	}

	@Override
	public Pager findPagerByAdminBean(Pager pager) {
		int totalRows=adminMapper.countAdmin();
		List<AdminBean> datas=adminMapper.findAllAdminToPager(pager.getIndex(), pager.getRows());
		pager.setDatas(datas);
		pager.setTotalRows(totalRows);
		return pager;
	}


}