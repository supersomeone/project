package com.project.telecom.businessmag.servicequery;

import com.project.telecom.beans.Pager;
import com.project.telecom.beans.ServiceBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:58
 */
public interface IQueryBusinessService {

	/**
	 * 
	 * @param id
	 */
	public ServiceBean findAllById(long id);

	/**
	 * 
	 * @param pager
	 */
	public Pager findPagerByBusinessBean(Pager pager);

}