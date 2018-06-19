package com.project.telecom.businessmag.daoquery.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.project.telecom.beans.BusinessBean;
import com.project.telecom.beans.Pager;
import com.project.telecom.businessmag.daoquery.IQueryBusinessDao;
import com.project.telecom.businessmag.mapper.BusinessMapper;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:59
 */
@Repository
public class QueryBusinessDaoImpl implements IQueryBusinessDao{
	@Resource
	private BusinessMapper businessMapper;
	@Override
	public BusinessBean findAllById(long id) {
		// TODO Auto-generated method stub
		return businessMapper.findBusinessById(id);
	}
	@Override
	public int findPagerByBusinessBean(Map map) {
		
		return businessMapper.countBusinessToPager(map);
	}
	@Override
	public List<BusinessBean> findBusinessByMapToPager(Map map, Pager pager) {
		
		return businessMapper.getBusinessesToPager(map, pager);
	}

	

}