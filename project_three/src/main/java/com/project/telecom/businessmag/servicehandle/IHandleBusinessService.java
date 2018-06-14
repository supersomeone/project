package com.project.telecom.businessmag.servicehandle;

import com.project.telecom.beans.ServiceBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6ÔÂ-2018 9:25:57
 */
public interface IHandleBusinessService {

	/**
	 * 
	 * @param business
	 */
	public ServiceBean addBusiness(ServiceBean business);

	/**
	 * 
	 * @param business
	 */
	public ServiceBean closeBusiness(ServiceBean business);

	/**
	 * 
	 * @param business
	 */
	public ServiceBean deleteBusiness(ServiceBean business);

	/**
	 * 
	 * @param business
	 */
	public ServiceBean openBusiness(ServiceBean business);

	/**
	 * 
	 * @param business
	 */
	public ServiceBean updateBusiness(ServiceBean business);

}