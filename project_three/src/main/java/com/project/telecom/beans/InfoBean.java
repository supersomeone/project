package com.project.telecom.beans;

import java.util.Date;

/**
 * ������Ϣ��ϸ��
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:57
 */
public class InfoBean {

	private long id;
	/**
	 * ʱ��
	 */
	private double inTime;
	/**
	 * ������ip
	 */
	private String ip;
	/**
	 * ����ʱ��
	 */
	private Date loginTime;
	/**
	 * �ǳ�ʱ��
	 */
	private Date logoutTime;
	/**
	 * ҵ���˺�
	 */
	private int os;

	public InfoBean(){

	}

	public void finalize() throws Throwable {

	}

}