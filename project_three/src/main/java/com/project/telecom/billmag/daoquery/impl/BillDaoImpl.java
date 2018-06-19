package com.project.telecom.billmag.daoquery.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.project.telecom.billmag.daoquery.IBillDao;
import com.project.telecom.billmag.mapper.BillMapper;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:55
 */
@Repository
public class BillDaoImpl implements IBillDao{
	@Resource
	private BillMapper bm;

	@Override
	public int countPagerBeanByAccountmonthBean(Map map) {
		// TODO Auto-generated method stub
		return bm.countPagerBeanByAccountmonthBean(map);
	}

	@Override
	public int countPagerBeanByServicebillBean(Map map) {
		// TODO Auto-generated method stub
		return bm.countPagerBeanByServicebillBean(map);
	}

	@Override
	public int countPagerBeanByServicemonthBean(Map map) {
		// TODO Auto-generated method stub
		return bm.countPagerBeanByServicemonthBean(map);
	}

	@Override
	public List getPagerBeanByAccountmonthBean(Map map) {
		// TODO Auto-generated method stub
		return bm.getPagerBeanByAccountmonthBean(map);
	}

	@Override
	public List getPagerBeanByServicebillBean(Map map) {
		// TODO Auto-generated method stub
		return bm.getPagerBeanByServicebillBean(map);
	}

	@Override
	public List getPagerBeanByServicemonthBean(Map map) {
		// TODO Auto-generated method stub
		return bm.getPagerBeanByServicemonthBean(map);
	}

}