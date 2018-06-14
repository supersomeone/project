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
 * ��½��־
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:58
 */
@Entity
@Table(name="t_login_log")
public class LoginLogBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7114948588376222682L;

	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private Long id;
	
	@Column(length=20)
	private String ip;
	
	@Column(length=20)
	private String name;
	
	@Column(length=20)
	private String state;
	
	@Column
	private Date time;

	public LoginLogBean() {
		// TODO Auto-generated constructor stub
	}

	public LoginLogBean(Long id, String ip, String name, String state, Date time) {
		super();
		this.id = id;
		this.ip = ip;
		this.name = name;
		this.state = state;
		this.time = time;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "LoginLogBean [id=" + id + ", ip=" + ip + ", name=" + name + ", state=" + state + ", time=" + time + "]";
	}
	

	

}