package com.project.telecom.businessmag.daoquery;

import java.util.List;
import java.util.Map;

import com.project.telecom.beans.AccountBean;
import com.project.telecom.beans.BusinessBean;
import com.project.telecom.beans.Pager;

/**
 * @author xc
 * @version 1.0
 * @created 14-6��-2018 9:25:58
 */
public interface IQueryBusinessDao {

	/**
	 * 根据id查询业务账号对象
	 * @param id
	 */
	public BusinessBean findAllById(long id);

	/**
	 * 多参数查询业务账号总条数
	 * @param map对参数集合
	 */
public int findPagerByBusinessBean(Map map);
	
/**
 * 多参数查询业务账号集合
 * @param pager分页对象
 */
public List<BusinessBean> findBusinessByMapToPager(Map map,Pager pager);

}