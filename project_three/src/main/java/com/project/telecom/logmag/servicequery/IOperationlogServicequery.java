package com.project.telecom.logmag.servicequery;

import java.util.Map;

import com.project.telecom.beans.OperationLogBean;
import com.project.telecom.beans.Pager;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:57
 */
public interface IOperationlogServicequery {

	/**
	 * 
	 * @param id
	 */
	public OperationLogBean findAllById(int id);

	/**
	 * 
	 * @param pager
	 * @param map
	 */
	public Pager findPagerByOperationLogBean(Pager pager, Map map);

}