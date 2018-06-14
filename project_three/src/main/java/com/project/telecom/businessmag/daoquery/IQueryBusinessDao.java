package com.project.telecom.businessmag.daoquery;

import com.project.telecom.beans.ServiceBean;
import com.project.telecom.beans.Pager;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:58
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
	public Pager findPagerByBusinessBean(Pager pager);

}