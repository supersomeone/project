package com.project.telecom.adminmag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.project.telecom.beans.AdminBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:55
 */
public interface AdminMapper {
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="adminName",column="admins_name",javaType=String.class),
		@Result(property="eamil",column="eamil",javaType=String.class),
		@Result(property="password",column="password",javaType=String.class),
		@Result(property="loginName",column="loginname",javaType=String.class),
		@Result(property="telphone",column="telphone",javaType=String.class)
	})
	@Select(value="select * from t_admin limit #{begin},#{rows}")
	public List<AdminBean> findAllAdminToPager(@Param("begin") int begin,@Param("rows") int rows);
	
	@Select(value="select count(*) from t_admin")
	public int countAdmin();
	
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="adminName",column="admins_name",javaType=String.class),
		@Result(property="eamil",column="eamil",javaType=String.class),
		@Result(property="password",column="password",javaType=String.class),
		@Result(property="loginName",column="loginname",javaType=String.class),
		@Result(property="telphone",column="telphone",javaType=String.class)
	})
	@Select(value="select * from t_admin where id=#{id}")
	public AdminBean findAdminById(@Param("id")long id);
};


