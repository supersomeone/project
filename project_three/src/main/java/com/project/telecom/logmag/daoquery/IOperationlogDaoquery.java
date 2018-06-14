package com.project.telecom.logmag.daoquery;

import java.util.List;
import java.util.Map;

import com.project.telecom.beans.OperationLogBean;
import com.project.telecom.beans.Pager;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:57
 */
public interface IOperationlogDaoquery {

	/**
	 * 
	 * @param map
	 */
	public int findAllByNum(Map map);

	/**
	 * 
	 * @param map
	 */
	public List<OperationLogBean> findPagerByOperationLogBean(Map map);

}