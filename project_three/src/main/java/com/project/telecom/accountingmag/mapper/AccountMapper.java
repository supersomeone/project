package com.project.telecom.accountingmag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.project.telecom.beans.AccountBean;
import com.project.telecom.beans.Pager;

/**
 * @author xc
 * @version 1.0
 * @created 14-6��-2018 9:25:54
 */
public interface AccountMapper {
	
	@SelectProvider(type=AccountMapperSqlProvider.class,method="countAccountByMap")
	public int countAccountByMapToPager(@Param("map") Map map);
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="account",column="account_number",javaType=String.class),
		@Result(property="address",column="address",javaType=String.class),
		@Result(property="gender",column="gender",javaType=Integer.class),
		@Result(property="identity",column="identity",javaType=String.class),
		@Result(property="name",column="real_name",javaType=String.class),
		@Result(property="password",column="account_password",javaType=String.class),
		@Result(property="postcode",column="postcode",javaType=String.class),
		@Result(property="qq",column="qq",javaType=String.class),
		@Result(property="telphone",column="telphone",javaType=String.class),
		@Result(property="state",column="state",javaType=Integer.class)
	})
	@SelectProvider(type=AccountMapperSqlProvider.class,method="findAccountsByMap")
	public List<AccountBean> findAccountsByMapToPager(@Param("map")Map map,@Param("pager")Pager pager);
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="account",column="account_number",javaType=String.class),
		@Result(property="address",column="address",javaType=String.class),
		@Result(property="gender",column="gender",javaType=Integer.class),
		@Result(property="identity",column="identity",javaType=String.class),
		@Result(property="name",column="real_name",javaType=String.class),
		@Result(property="password",column="account_password",javaType=String.class),
		@Result(property="postcode",column="postcode",javaType=String.class),
		@Result(property="qq",column="qq",javaType=String.class),
		@Result(property="telphone",column="telphone",javaType=String.class),
		@Result(property="state",column="state",javaType=Integer.class)
	})
	@Select(value="select * from t_account where id=#{id}")
	public AccountBean findAccountById(@Param("id")long id);
}