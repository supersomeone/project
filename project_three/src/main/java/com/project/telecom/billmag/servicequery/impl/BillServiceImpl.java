package com.project.telecom.billmag.servicequery.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.project.telecom.beans.Pager;
import com.project.telecom.billmag.daoquery.IBillDao;
import com.project.telecom.billmag.servicequery.IBillService;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:55
 */
@Service
public class BillServiceImpl implements IBillService{
	
	@Resource
	private IBillDao billDaoImpl;

	@Override
	public Pager findPagerBeanByAccountmonthBean(Pager pager, Map map) {
		// TODO Auto-generated method stub
		int totalRows = billDaoImpl.countPagerBeanByAccountmonthBean(map);
		List<?> datas = billDaoImpl.getPagerBeanByAccountmonthBean(map);
		pager.setTotalRows(totalRows);
		pager.setDatas(datas);
		return pager;
	}

	@Override
	public Pager findPagerBeanByServicebill(Pager pager, Map map) {
		// TODO Auto-generated method stub
		int totalRows = billDaoImpl.countPagerBeanByServicebillBean(map);
		List<?> datas = billDaoImpl.getPagerBeanByServicebillBean(map);
		pager.setTotalRows(totalRows);
		pager.setDatas(datas);
		return pager;
	}

	@Override
	public Pager findPagerBeanByServicemonthBean(Pager pager, Map map) {
		// TODO Auto-generated method stub
		int totalRows = billDaoImpl.countPagerBeanByServicemonthBean(map);
		List<?> datas = billDaoImpl.getPagerBeanByServicemonthBean(map);
		pager.setTotalRows(totalRows);
		pager.setDatas(datas);
		return pager;
	}

}