package com.project.telecom.businessmag.daoquery;

import com.project.telecom.beans.ServiceBean;
import com.project.telecom.beans.PagerBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6ÔÂ-2018 9:25:58
 */
public interface IQueryBusinessDao {

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