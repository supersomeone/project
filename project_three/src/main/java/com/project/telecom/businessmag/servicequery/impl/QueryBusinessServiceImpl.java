package com.project.telecom.businessmag.servicequery.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.project.telecom.beans.BusinessBean;
import com.project.telecom.beans.Pager;
import com.project.telecom.businessmag.daoquery.IQueryBusinessDao;
import com.project.telecom.businessmag.daoquery.impl.QueryBusinessDaoImpl;
import com.project.telecom.businessmag.servicequery.IQueryBusinessService;

/**
 * @author xc
 * @version 1.0
 * @created 14-6��-2018 9:25:59
 */
@Service
public class QueryBusinessServiceImpl implements IQueryBusinessService{
	@Resource
	private IQueryBusinessDao queryBusinessDaoImpl;
	@Override
	public BusinessBean findAllById(long id) {
		// TODO Auto-generated method stub
		return queryBusinessDaoImpl.findAllById(id);
	}

	@Override
	public Pager findPagerByBusinessBean(Map map,Pager pager) {
		int totalRows=queryBusinessDaoImpl.findPagerByBusinessBean(map);
		List<BusinessBean> datas=queryBusinessDaoImpl.findBusinessByMapToPager(map, pager);
		pager.setDatas(datas);
		pager.setTotalRows(totalRows);
		return pager;
	}


}