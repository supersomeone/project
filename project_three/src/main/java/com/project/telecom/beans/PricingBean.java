package com.project.telecom.beans;

import java.util.Date;

/**
 * 资费信息
 * @author ASUS
 * @version 1.0
 * @created 14-6月-2018 9:25:59
 */
public class PricingBean {

	/**
	 * 基本时长
	 */
	private int basictime;
	/**
	 * 基本费用
	 */
	private double charge;
	private long id;
	/**
	 * 开通时间
	 */
	private Date opentime;
	/**
	 * 资费说明
	 */
	private String pricingFee;
	/**
	 * 资费名称
	 */
	private String pricingName;
	/**
	 * 状态
	 */
	private int pricingState;
	/**
	 * 资费类型
	 */
	private int pricingType;
	/**
	 * 单位费用
	 */
	private double unitcost;

	public PricingBean(){

	}

	public void finalize() throws Throwable {

	}

}