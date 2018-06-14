package com.project.telecom.logmag.servicehandle;

import com.project.telecom.beans.OperationLogBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6ÔÂ-2018 9:25:57
 */
public interface IOperationlogServicehandle {

	/**
	 * 
	 * @param operationLog
	 */
	public void AddOperation(OperationLogBean operationLog);

}