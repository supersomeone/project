package com.project.telecom.beans;


/**
 * 角色信息表
 * @author ASUS
 * @version 1.0
 * @created 14-6月-2018 9:25:55
 */
public class AdminBean {

	/**
	 * 角色名称
	 */
	private String adminName;
	/**
	 * 邮箱
	 */
	private String eamil;
	/**
	 * 管理员id
	 */
	private long id;
	/**
	 * 账号
	 */
	private String loginName;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 角色信息
	 */
	private RoleBean roles;
	/**
	 * 电话
	 */
	private String telphone;

	public AdminBean(){

	}

	public void finalize() throws Throwable {

	}

}