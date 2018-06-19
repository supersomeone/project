package com.project.telecom.loginmag.mapper;

import java.util.Date;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.project.telecom.beans.AdminBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:58
 */
public interface LoginMapper {

	/**
	 * 
	 * @param admins
	 */
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="adminName",column="admins_name",javaType=String.class),
		@Result(property="eamil",column="eamil",javaType=String.class),
		@Result(property="loginname",column="loginname",javaType=String.class),
		@Result(property="password",column="password",javaType=String.class),
		@Result(property="telphone",column="telphone",javaType=String.class),

	})
	@Select(value="select * from t_admin where admins_name=#{admins.adminName} and password=#{admins.password}")
	public AdminBean findAdminBeanByLoginNameAndPwd(AdminBean admins);

}