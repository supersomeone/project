package com.project.telecom.beans;


/**
 * 账务账号月账单
 * @author ASUS
 * @version 1.0
 * @created 14-6月-2018 9:25:54
 */
public class AccountmonthBean {

	/**
	 * 账务外联表
	 */
	private AccountBean accounts;
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

	public AccountmonthBean(AccountBean accounts, double charge, String ip, int month, String payment, int payState,
			int time, int year) {
		super();
		this.accounts = accounts;
		this.charge = charge;
		this.ip = ip;
		this.month = month;
		this.payment = payment;
		this.payState = payState;
		this.time = time;
		this.year = year;
	}

	public AccountBean getAccounts() {
		return accounts;
	}

	public void setAccounts(AccountBean accounts) {
		this.accounts = accounts;
	}

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public int getPayState() {
		return payState;
	}

	public void setPayState(int payState) {
		this.payState = payState;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "AccountmonthBean [accounts=" + accounts + ", charge=" + charge + ", id=" + id + ", ip=" + ip
				+ ", month=" + month + ", payment=" + payment + ", payState=" + payState + ", time=" + time + ", year="
				+ year + "]";
	}

	

}