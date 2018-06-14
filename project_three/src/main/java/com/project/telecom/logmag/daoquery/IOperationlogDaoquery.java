package com.project.telecom.logmag.daoquery;

import com.project.telecom.beans.OperationLogBean;
import com.project.telecom.beans.PagerBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6ÔÂ-2018 9:25:57
 */
public interface IOperationlogDaoquery {

	/**
	 * 
	 * @param id
	 */
	public int findAllById(OperationLogBean id);

	/**
	 * 
	 * @param pager
	 */
	public int findPagerByOperationLogBean(PagerBean pager);

}