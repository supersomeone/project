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
 * ϵͳ��־
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:59
 */
@Entity
@Table(name="t_operation_log")
public class OperationLogBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1858248612877139994L;
	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private Long id;
	
	@Column(length=20)
	private String module;
	
	@Column(length=20)
	private String name;
	
	@Column(length=20)
	private String operation;
	
	@Column(length=20)
	private String role_Type;
	
	@Column
	private Date time;

	public OperationLogBean() {
		// TODO Auto-generated constructor stub
	}

	public OperationLogBean(Long id, String module, String name, String operation, String role_Type, Date time) {
		super();
		this.id = id;
		this.module = module;
		this.name = name;
		this.operation = operation;
		this.role_Type = role_Type;
		this.time = time;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getRole_Type() {
		return role_Type;
	}

	public void setRole_Type(String role_Type) {
		this.role_Type = role_Type;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "OperationLogBean [id=" + id + ", module=" + module + ", name=" + name + ", operation=" + operation
				+ ", role_Type=" + role_Type + ", time=" + time + "]";
	}
	

}