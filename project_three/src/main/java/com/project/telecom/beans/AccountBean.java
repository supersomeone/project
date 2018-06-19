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
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:54
 */
@Entity
@Table(name="t_account")
public class AccountBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1572100828400008980L;

	@Column(name="account_number",length=20)
	private String account;
	
	@Column(name="address",length=20)
	private String address;
	
	@Column(name="gender",length=20)
	private int gender;
	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private Long id;
	
	@Column(name="identity",length=20)
	private String identity;
	
	@Column(name="real_name",length=20)
	private String name;
	
	@Column(name="account_password",length=20)
	private String password;
	
	@Column(name="postcode",length=20)
	private String postcode;
	
	@Column(name="qq",length=20)
	private String qq;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@Cascade(value= {CascadeType.SAVE_UPDATE})
	@JoinColumn(name="fk_role_id")
	private RoleBean role;
	
	@Column(name="telphone",length=20)
	private String telphone;
	@Column(name="state",length=20)
	private int state;
	public AccountBean(){

	}
	public AccountBean(String account, String address, int gender, Long id, String identity, String name,
			String password, String postcode, String qq, RoleBean role, String telphone, int state) {
		super();
		this.account = account;
		this.address = address;
		this.gender = gender;
		this.id = id;
		this.identity = identity;
		this.name = name;
		this.password = password;
		this.postcode = postcode;
		this.qq = qq;
		this.role = role;
		this.telphone = telphone;
		this.state = state;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public RoleBean getRole() {
		return role;
	}
	public void setRole(RoleBean role) {
		this.role = role;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "AccountBean [account=" + account + ", address=" + address + ", gender=" + gender + ", id=" + id
				+ ", identity=" + identity + ", name=" + name + ", password=" + password + ", postcode=" + postcode
				+ ", qq=" + qq + ", role=" + role + ", telphone=" + telphone + ", state=" + state + "]";
	}

	
}