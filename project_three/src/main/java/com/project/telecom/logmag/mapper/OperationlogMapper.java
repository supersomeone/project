package com.project.telecom.logmag.mapper;

import java.util.List;
import java.util.Map;

import com.project.telecom.beans.OperationLogBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:59
 */
public interface OperationlogMapper {
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