package com.project.telecom.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

/**
 * ҵ���˺�
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:26:00
 */
@Entity
@Table(name="t_business")
public class BusinessBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5544868052541703664L;

	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@Cascade(value= {CascadeType.SAVE_UPDATE})
	@JoinColumn(name="fk_account_id")
	private AccountBean accounts;
	
	@Column(name="ip",length=20)
	private String ip;
	
	@Column(name="os_number",length=20)
	private String number;
	
	@Column(name="os_password",length=20)
	private String password;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@Cascade(value= {CascadeType.SAVE_UPDATE})
	@JoinColumn(name="fk_pricing_id")
	private PricingBean pricings;

	public BusinessBean(){

	}

	public BusinessBean(long id, AccountBean accounts, String ip, String number, String password,
			PricingBean pricings) {
		super();
		this.id = id;
		this.accounts = accounts;
		this.ip = ip;
		this.number = number;
		this.password = password;
		this.pricings = pricings;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public AccountBean getAccounts() {
		return accounts;
	}

	public void setAccounts(AccountBean accounts) {
		this.accounts = accounts;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public PricingBean getPricings() {
		return pricings;
	}

	public void setPricings(PricingBean pricings) {
		this.pricings = pricings;
	}

	@Override
	public String toString() {
		return "BusinessBean [id=" + id + ", accounts=" + accounts + ", ip=" + ip + ", number=" + number + ", password="
				+ password + ", pricings=" + pricings + "]";
	}

}