package com.project.telecom.logmag.daohandle;

import com.project.telecom.beans.OperationLogBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6ÔÂ-2018 9:25:57
 */
public interface IOperationlogDaohandle {

	/**
	 * 
	 * @param operationlog
	 */
	public void AddOperation(OperationLogBean operationlog);

}