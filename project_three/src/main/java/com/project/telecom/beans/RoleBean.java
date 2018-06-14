package com.project.telecom.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:55
 */
@Entity
@Table(name="t_role")
public class RoleBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6157321541299427587L;
	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;
	@Column(name="role_name",length=20)
	private String roleName;
	@Column(name="role_type",length=20)
	private int roleType;

	public RoleBean(){

	}

	public RoleBean(long id, String roleName, int roleType) {
		super();
		this.id = id;
		this.roleName = roleName;
		this.roleType = roleType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public int getRoleType() {
		return roleType;
	}

	public void setRoleType(int roleType) {
		this.roleType = roleType;
	}

	@Override
	public String toString() {
		return "RoleBean [id=" + id + ", roleName=" + roleName + ", roleType=" + roleType + "]";
	}


}