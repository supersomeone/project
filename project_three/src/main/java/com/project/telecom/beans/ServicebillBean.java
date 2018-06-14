package com.project.telecom.beans;

import java.util.Date;

/**
 * 业务账单表
 * @author ASUS
 * @version 1.0
 * @created 14-6月-2018 9:26:00
 */
public class ServicebillBean {

	/**
	 * 费用
	 */
	private double charge;
	private long id;
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
	private String osNumber;
	/**
	 * 资费套餐
	 */
	private String pricing;
	/**
	 * 使用时长
	 */
	private int time;

	public ServicebillBean(){

	}

	public void finalize() throws Throwable {

	}

}