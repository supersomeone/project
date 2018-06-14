package com.project.telecom.powermag.daohandle;

import com.project.telecom.beans.RightBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6ÔÂ-2018 9:25:57
 */
public interface IHandleRightDao {

	/**
	 * 
	 * @param right
	 */
	public void addRight(RightBean right);

	/**
	 * 
	 * @param right
	 */
	public void deleteRight(RightBean right);

	/**
	 * 
	 * @param right
	 */
	public void updateRight(RightBean right);

}