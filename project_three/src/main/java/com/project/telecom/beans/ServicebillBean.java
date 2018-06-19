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
	private int pricing;
	/**
	 * 使用时长
	 */
	private int time;

	public ServicebillBean(){

	}

	public ServicebillBean(double charge, String ip, Date loginTime, Date logoutTime, String osNumber, int pricing,
			int time) {
		super();
		this.charge = charge;
		this.ip = ip;
		this.loginTime = loginTime;
		this.logoutTime = logoutTime;
		this.osNumber = osNumber;
		this.pricing = pricing;
		this.time = time;
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

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public Date getLogoutTime() {
		return logoutTime;
	}

	public void setLogoutTime(Date logoutTime) {
		this.logoutTime = logoutTime;
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

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "ServicebillBean [charge=" + charge + ", id=" + id + ", ip=" + ip + ", loginTime=" + loginTime
				+ ", logoutTime=" + logoutTime + ", osNumber=" + osNumber + ", pricing=" + pricing + ", time=" + time
				+ "]";
	}
	

}