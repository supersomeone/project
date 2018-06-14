package com.project.telecom.logmag.daoquery;

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
	 * @param id
	 */
	public int findAllById(OperationLogBean id);

	/**
	 * 
	 * @param pager
	 */
	public int findPagerByOperationLogBean(Pager pager);

}