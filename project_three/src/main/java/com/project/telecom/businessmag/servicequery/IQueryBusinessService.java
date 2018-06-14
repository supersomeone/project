package com.project.telecom.businessmag.servicequery;

import com.project.telecom.beans.ServiceBean;
import com.project.telecom.beans.PagerBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6ÔÂ-2018 9:25:58
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
	public PagerBean findPagerByBusinessBean(PagerBean pager);

}