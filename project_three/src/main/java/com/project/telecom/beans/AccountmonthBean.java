package com.project.telecom.beans;


/**
 * 账务账号月账单
 * @author ASUS
 * @version 1.0
 * @created 14-6月-2018 9:25:54
 */
public class AccountmonthBean {

	/**
	 * 账务账号
	 */
	private String accountNumber;
	/**
	 * 费用
	 */
	private double charge;
	private long id;
	private String ip;
	/**
	 * 月份
	 */
	private int month;
	/**
	 * 支付方式
	 */
	private String payment;
	/**
	 * 支付状态
	 */
	private int payState;
	/**
	 * 使用时长
	 */
	private int time;
	/**
	 * 年
	 */
	private int year;

	public AccountmonthBean(){

	}

	public void finalize() throws Throwable {

	}

}