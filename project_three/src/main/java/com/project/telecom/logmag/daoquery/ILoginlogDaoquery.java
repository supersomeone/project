package com.project.telecom.logmag.daoquery;

import java.util.Map;

import com.project.telecom.beans.LoginLogBean;
import com.project.telecom.beans.PagerBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6ÔÂ-2018 9:25:57
 */
public interface ILoginlogDaoquery {

	/**
	 * 
	 * @param id
	 */
	public LoginLogBean findAllById(int id);

	/**
	 * 
	 * @param pager
	 * @param map
	 */
	public PagerBean findPagerByLoginlogBean(PagerBean pager, Map map);

}