package com.project.telecom.logmag.servicequery;

import java.util.Map;

import com.project.telecom.beans.OperationLogBean;
import com.project.telecom.beans.PagerBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6ÔÂ-2018 9:25:57
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
	public PagerBean findPagerByOperationLogBean(PagerBean pager, Map map);

}