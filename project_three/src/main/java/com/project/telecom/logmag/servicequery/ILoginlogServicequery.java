package com.project.telecom.logmag.servicequery;

import java.util.Map;

import com.project.telecom.beans.LoginLogBean;
import com.project.telecom.beans.Pager;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:57
 */
public interface ILoginlogServicequery {

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
	public Pager findPagerByLoginlogBean(Pager pager, Map map);

}