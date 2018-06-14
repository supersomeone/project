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
 * ��ɫ��Ϣ��
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:55
 */
@Entity
@Table(name="t_admin")
public class AdminBean implements Serializable{

	private static final long serialVersionUID = 3141471658380751778L;
	@Column(name="admins_name",length=20)
	private String adminName;
	
	@Column(name="eamil",length=20)
	private String eamil;
	
	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;
	
	@Column(name="loginname",length=20)
	private String loginName;
	
	@Column(name="password",length=20)
	private String password;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@Cascade(value= {CascadeType.SAVE_UPDATE})
	@JoinColumn(name="role_id")
	private RoleBean roles;
	
	@Column(name="telphone",length=20)
	private String telphone;
	public AdminBean(){

	}

	public AdminBean(String adminName, String eamil, long id, String loginName, String password, RoleBean roles,
			String telphone) {
		super();
		this.adminName = adminName;
		this.eamil = eamil;
		this.id = id;
		this.loginName = loginName;
		this.password = password;
		this.roles = roles;
		this.telphone = telphone;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getEamil() {
		return eamil;
	}

	public void setEamil(String eamil) {
		this.eamil = eamil;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RoleBean getRoles() {
		return roles;
	}

	public void setRoles(RoleBean roles) {
		this.roles = roles;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	@Override
	public String toString() {
		return "AdminBean [adminName=" + adminName + ", eamil=" + eamil + ", id=" + id + ", loginName=" + loginName
				+ ", password=" + password + ", roles=" + roles + ", telphone=" + telphone + "]";
	}
	
}