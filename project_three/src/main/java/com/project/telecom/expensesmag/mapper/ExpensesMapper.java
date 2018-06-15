package com.project.telecom.expensesmag.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.project.telecom.beans.PricingBean;


/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:55
 */
public interface ExpensesMapper {
	/**
	 * 
	 * @param pager
	 * @param map
	 */
	
	@Select(value="select count(*) from t_pricing")
	public int getPagerBeanByNum();

	/**
	 * 
	 * @param pricing
	 */
	@Select(value="select * from t_pricing where id=#{id}")
	public PricingBean getPricingBeanById(@Param("id")long id);
	/**
	 * 
	 * @param pricing
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="pricingName",column="pricing_name",javaType=String.class),
		@Result(property="pricingType",column="pricing_type",javaType=Integer.class),
		@Result(property="basictime",column="basictime",javaType=Integer.class),
		@Result(property="charge",column="charge",javaType=Double.class),
		@Result(property="unitcost",column="unitcost",javaType=Double.class),
		@Result(property="opentime",column="opentime",javaType=Date.class),
		@Result(property="pricingFee",column="pricing_fee",javaType=String.class),
		@Result(property="pricingState",column="pricing_state",javaType=Integer.class)
	})
	@Select(value="select * from t_pricing limit #{map.begin},#{map.rows}")
	public List<PricingBean> getPricingBeanByPagers(@Param("map")Map map);

}