package com.project.telecom.powermag.servicequery;

import com.project.telecom.beans.Pager;
import com.project.telecom.beans.RightBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:58
 */
public interface IQueryRightService {

	/**
	 * 
	 * @param pager
	 */
	public Pager findPagerByRightBean(Pager pager);

	/**
	 * 
	 * @param id
	 */
	public RightBean findRightBeanById(int id);

}