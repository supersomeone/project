package com.project.telecom.billmag.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.mapping.FetchType;
import org.junit.internal.Classes;

import com.project.telecom.beans.AccountBean;
import com.project.telecom.beans.AccountmonthBean;
import com.project.telecom.beans.ServicebillBean;
import com.project.telecom.beans.ServicemonthBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:55
 */
public interface BillMapper {
	
	/**
	 * 查询满足条件的年信息的所有数据
	 * @param map
	 */
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="charge",column="charge",javaType=Double.class),
		@Result(property="ip",column="ip",javaType=String.class),
		@Result(property="month",column="month",javaType=Integer.class),
		@Result(property="payment",column="payment",javaType=String.class),
		@Result(property="payState",column="pay_state",javaType=Integer.class),
		@Result(property="time",column="time",javaType=Integer.class),
		@Result(property="year",column="year",javaType=Integer.class),
		
		
		@Result(property="accounts.identity",column="aidentity",javaType=String.class),
		@Result(property="accounts.accountNumber",column="aaccountNumber",javaType=String.class),
		@Result(property="accounts.realName",column="arealName",javaType=String.class)
		
//		@Result(property="list",column="fk_account_id",javaType=List.class,one=@One(fetchType=FetchType.LAZY,select="getAccountBeanById")),
		
	})
	@SelectProvider(type=BillMapperSqlProvider.class,method="getPagerBeanByAccountmonthBean")
	public List<AccountmonthBean> getPagerBeanByAccountmonthBean(@Param("map")Map map);
	
	/**
	 * 统计满足条件的年信息总条数
	 * @param map
	 */ 
	@SelectProvider(type=BillMapperSqlProvider.class,method="countPagerBeanByAccountmonthBean")
	public int countPagerBeanByAccountmonthBean(@Param("map")Map map);
	
	

	/**
	 * 统计满足条件的月信息总条数
	 * @param map
	 */
	
	@SelectProvider(type=BillMapperSqlProvider.class,method="countPagerBeanByServicemonthBean")
	public int countPagerBeanByServicemonthBean(@Param("map")Map map);

	/**
	 * 查询满足条件的月信息的所有数据
	 * @param map
	 */
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="osNumber",column="os_number",javaType=String.class),
		@Result(property="ip",column="ip",javaType=String.class),
		@Result(property="time",column="time",javaType=Double.class),
		@Result(property="cahrge",column="cahrge",javaType=Double.class),
		@Result(property="pricing",column="pricing",javaType=Integer.class),
		@Result(property="year",column="year",javaType=Integer.class),
		@Result(property="month",column="month",javaType=Integer.class)
	})
	@SelectProvider(type=BillMapperSqlProvider.class,method="getPagerBeanByServicemonthBean")
	public List<ServicemonthBean> getPagerBeanByServicemonthBean(@Param("map")Map map);
	
	/**
	 * 统计满足条件的服务器信息总条数
	 * @param map
	 */
	
	@SelectProvider(type=BillMapperSqlProvider.class,method="countPagerBeanByServicebillBean")
	public int countPagerBeanByServicebillBean(@Param("map")Map map);
	
	/**
	 * 查询满足条件的服务器信息的所有数据
	 * @param map
	 */
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="osNumber",column="os_number",javaType=String.class),
		@Result(property="ip",column="ip",javaType=String.class),
		@Result(property="time",column="time",javaType=Integer.class),
		@Result(property="cahrge",column="cahrge",javaType=Double.class),
		@Result(property="pricing",column="pricing",javaType=Integer.class),
		@Result(property="loginTime",column="login_time",javaType=Date.class),
		@Result(property="logoutTime",column="logout_time",javaType=Date.class)
	})
	@SelectProvider(type=BillMapperSqlProvider.class,method="getPagerBeanByServicebillBean")
	public List<ServicebillBean> getPagerBeanByServicebillBean(@Param("map")Map map);
}