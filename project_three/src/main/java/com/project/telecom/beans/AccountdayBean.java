package com.project.telecom.beans;


/**
 * 账务账号月账单
 * @author ASUS
 * @version 1.0
 * @created 14-6月-2018 9:25:54
 */
public class AccountdayBean {

	/**
	 * 账务账号
	 */
	private String ccountNumber;
	private int day;
	private long id;
	private String ip;
	/**
	 * 月
	 */
	private int month;
	/**
	 * 业务账号
	 */
	private String osNumber;
	/**
	 * 使用时长
	 */
	private double time;
	/**
	 * 年
	 */
	private int year;

	public AccountdayBean(){

	}

	public void finalize() throws Throwable {

	}

}