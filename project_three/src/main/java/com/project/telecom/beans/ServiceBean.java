package com.project.telecom.beans;


/**
 * 业务账号
 * @author ASUS
 * @version 1.0
 * @created 14-6月-2018 9:26:00
 */
public class ServiceBean {

	/**
	 * 账务账号
	 */
	private AccountBean accounts;
	private long id;
	private String ip;
	/**
	 * OS账号
	 */
	private String number;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 资费
	 */
	private PricingBean pricings;

	public ServiceBean(){

	}

	public void finalize() throws Throwable {

	}

}