package com.project.telecom.logmag.servicequery;

import java.util.List;
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
	 * @param map
	 */
	public int findAllByNum(Map map);

	/**
	 * 
	 * @param map
	 */
	public List<LoginLogBean> findPagerByLoginlogBean(Map map);


}