package com.project.telecom.powermag.daoquery;

import com.project.telecom.beans.PagerBean;
import com.project.telecom.beans.RightBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6ÔÂ-2018 9:25:58
 */
public interface IQueryRightDao {

	/**
	 * 
	 * @param pager
	 */
	public PagerBean findPagerByPagerBean(PagerBean pager);

	/**
	 * 
	 * @param id
	 */
	public RightBean findRightBeanById(long id);

}