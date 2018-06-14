package com.project.telecom.beans;

import java.util.Date;

/**
 * 服务信息详细表
 * @author ASUS
 * @version 1.0
 * @created 14-6月-2018 9:25:57
 */
public class InfoBean {

	private long id;
	/**
	 * 时长
	 */
	private double inTime;
	/**
	 * 服务器ip
	 */
	private String ip;
	/**
	 * 登入时间
	 */
	private Date loginTime;
	/**
	 * 登出时间
	 */
	private Date logoutTime;
	/**
	 * 业务账号
	 */
	private int os;

	public InfoBean(){

	}

	public void finalize() throws Throwable {

	}

}