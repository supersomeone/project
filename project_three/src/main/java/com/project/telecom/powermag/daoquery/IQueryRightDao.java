package com.project.telecom.powermag.daoquery;

import com.project.telecom.beans.Pager;
import com.project.telecom.beans.RightBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:58
 */
public interface IQueryRightDao {

	/**
	 * 
	 * @param pager
	 */
	public Pager findPagerByPagerBean(Pager pager);

	/**
	 * 
	 * @param id
	 */
	public RightBean findRightBeanById(long id);

}