package com.project.telecom.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * �ʷ���Ϣ
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:59
 */
@Entity
@Table(name="t_pricing")
public class PricingBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5489871993783790245L;
	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;//id
	
	@Column(name="pricing_name",length=20)
	private String pricingName;//资费名称
	
	@Column(name="pricing_type")
	private int pricingType;//资费类型
	
	@Column
	private int basictime;//基本时长
	
	@Column
	private double charge;//基本费用
	
	@Column
	private double unitcost;//单位费用
	
	@Column
	private Date opentime;//开通时间
	
	@Column(name="pricing_fee",length=20)
	private String pricingFee;//资费说明

	@Column(name="pricing_state")
	private int pricingState;//开没开通的状态
	

	public PricingBean(){

	}


	public PricingBean(long id, String pricingName, int pricingType, int basictime, double charge, double unitcost,
			Date opentime, String pricingFee, int pricingState) {
		super();
		this.id = id;
		this.pricingName = pricingName;
		this.pricingType = pricingType;
		this.basictime = basictime;
		this.charge = charge;
		this.unitcost = unitcost;
		this.opentime = opentime;
		this.pricingFee = pricingFee;
		this.pricingState = pricingState;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getPricingName() {
		return pricingName;
	}


	public void setPricingName(String pricingName) {
		this.pricingName = pricingName;
	}


	public int getPricingType() {
		return pricingType;
	}


	public void setPricingType(int pricingType) {
		this.pricingType = pricingType;
	}


	public int getBasictime() {
		return basictime;
	}


	public void setBasictime(int basictime) {
		this.basictime = basictime;
	}


	public double getCharge() {
		return charge;
	}


	public void setCharge(double charge) {
		this.charge = charge;
	}


	public double getUnitcost() {
		return unitcost;
	}


	public void setUnitcost(double unitcost) {
		this.unitcost = unitcost;
	}


	public Date getOpentime() {
		return opentime;
	}


	public void setOpentime(Date opentime) {
		this.opentime = opentime;
	}


	public String getPricingFee() {
		return pricingFee;
	}


	public void setPricingFee(String pricingFee) {
		this.pricingFee = pricingFee;
	}


	public int getPricingState() {
		return pricingState;
	}


	public void setPricingState(int pricingState) {
		this.pricingState = pricingState;
	}


	@Override
	public String toString() {
		return "PricingBean [id=" + id + ", pricingName=" + pricingName + ", pricingType=" + pricingType
				+ ", basictime=" + basictime + ", charge=" + charge + ", unitcost=" + unitcost + ", opentime="
				+ opentime + ", pricingFee=" + pricingFee + ", pricingState=" + pricingState + "]";
	}

	

}