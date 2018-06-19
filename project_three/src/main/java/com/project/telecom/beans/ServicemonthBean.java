package com.project.telecom.beans;


/**
 * 业务账号月账单
 * @author ASUS
 * @version 1.0
 * @created 14-6月-2018 9:26:00
 */
public class ServicemonthBean {

	/**
	 * 账务账号
	 */
	private String accountId;
	/**
	 * 费用
	 */
	private double cahrge;
	private long id;
	/**
	 * 服务器信息
	 */
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
	 * 资费套餐
	 */
	private int pricing;
	/**
	 * 时长
	 */
	private double time;
	/**
	 * 年
	 */
	private int year;

	public ServicemonthBean(){

	}

	public ServicemonthBean(String accountId, double cahrge, String ip, int month, String osNumber, int pricing,
			double time, int year) {
		super();
		this.accountId = accountId;
		this.cahrge = cahrge;
		this.ip = ip;
		this.month = month;
		this.osNumber = osNumber;
		this.pricing = pricing;
		this.time = time;
		this.year = year;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public double getCahrge() {
		return cahrge;
	}

	public void setCahrge(double cahrge) {
		this.cahrge = cahrge;
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

	public String getOsNumber() {
		return osNumber;
	}

	public void setOsNumber(String osNumber) {
		this.osNumber = osNumber;
	}

	public int getPricing() {
		return pricing;
	}

	public void setPricing(int pricing) {
		this.pricing = pricing;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
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
		return "ServicemonthBean [accountId=" + accountId + ", cahrge=" + cahrge + ", id=" + id + ", ip=" + ip
				+ ", month=" + month + ", osNumber=" + osNumber + ", pricing=" + pricing + ", time=" + time + ", year="
				+ year + "]";
	}

	
}