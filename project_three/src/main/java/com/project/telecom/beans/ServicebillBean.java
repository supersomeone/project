package com.project.telecom.beans;

import java.util.Date;

/**
 * ҵ���˵���
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:26:00
 */
public class ServicebillBean {

	/**
	 * ����
	 */
	private double charge;
	private long id;
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
	private String osNumber;
	/**
	 * �ʷ��ײ�
	 */
	private String pricing;
	/**
	 * ʹ��ʱ��
	 */
	private int time;

	public ServicebillBean(){

	}

	public void finalize() throws Throwable {

	}

}