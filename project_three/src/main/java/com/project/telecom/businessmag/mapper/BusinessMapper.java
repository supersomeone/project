package com.project.telecom.businessmag.mapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.mapping.FetchType;

import com.project.telecom.beans.AccountBean;
import com.project.telecom.beans.AdminBean;
import com.project.telecom.beans.BusinessBean;
import com.project.telecom.beans.Pager;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:55
 */
public interface BusinessMapper {
	
	@SelectProvider(type=BusinessMapperSqlProvider.class,method="countBusinessToPager")
	public int countBusinessToPager(@Param("map")Map map);
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="number",column="os_number",javaType=String.class),
		@Result(property="password",column="os_password",javaType=String.class),
		@Result(property="ip",column="ip",javaType=String.class),
		@Result(property="accounts",column="fk_account_id",javaType=AccountBean.class,one=@One(fetchType=FetchType.LAZY,select="com.project.telecom.accountingmag.mapper.AccountMapper.findAccountById")),
//		@Result(property="pricings",column="fk_pricing_id",javaType=AccountBean.class,one=@One(fetchType=FetchType.LAZY,select="getPricingBeanById"))
	})
	@SelectProvider(type=BusinessMapperSqlProvider.class,method="getBusinessesToPager")
	public List<BusinessBean> getBusinessesToPager(@Param("map")Map map,@Param("pager")Pager pager);
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="number",column="os_number",javaType=String.class),
		@Result(property="password",column="os_password",javaType=String.class),
		@Result(property="ip",column="ip",javaType=String.class),
		@Result(property="accounts",column="fk_account_id",javaType=AccountBean.class,one=@One(fetchType=FetchType.LAZY,select="com.project.telecom.accountingmag.mapper.AccountMapper.findAccountById")),
//		@Result(property="pricings",column="fk_pricing_id",javaType=AccountBean.class,one=@One(fetchType=FetchType.LAZY,select="getPricingBeanById"))
	})
	@Select(value="select * from t_business where id=#{id}")
	public BusinessBean findBusinessById(@Param("id")long id);

}