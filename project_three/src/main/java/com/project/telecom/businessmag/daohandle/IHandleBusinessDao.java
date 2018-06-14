package com.project.telecom.businessmag.daohandle;

import com.project.telecom.beans.ServiceBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6ÔÂ-2018 9:25:57
 */
public interface IHandleBusinessDao {

	/**
	 * 
	 * @param business
	 */
	public void addBusiness(ServiceBean business);

	/**
	 * 
	 * @param business
	 */
	public void closeBusiness(ServiceBean business);

	/**
	 * 
	 * @param business
	 */
	public void deleteBusiness(ServiceBean business);

	/**
	 * 
	 * @param business
	 */
	public void openBusiness(ServiceBean business);

	/**
	 * 
	 * @param business
	 */
	public void updateBusiness(ServiceBean business);

}