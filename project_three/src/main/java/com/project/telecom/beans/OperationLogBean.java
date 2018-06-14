package com.project.telecom.beans;

import java.util.Date;

/**
 * 系统日志
 * @author ASUS
 * @version 1.0
 * @created 14-6月-2018 9:25:59
 */
public class OperationLogBean {

	private Long id;
	private String module;
	private String name;
	private String operation;
	private String roleType;
	private Date time;

	public OperationLogBean(){

	}

	public void finalize() throws Throwable {

	}

}