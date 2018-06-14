package com.project.telecom.logmag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.SelectProvider;

import com.project.telecom.beans.LoginLogBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:58
 */
public interface LoginlogMapper {
	/**
	 * 
	 * @param map
	 */
	@SelectProvider(type=LoginlogMapperSqlProvider.class,method="findAllByNum")
	public int findAllByNum(@Param("map")Map map);

	/**
	 * 
	 * @param map
	 */
	@ResultType(value=LoginLogBean.class)
	@SelectProvider(type=LoginlogMapperSqlProvider.class,method="findPagerByLoginlogBean")
	public List<LoginLogBean> findPagerByLoginlogBean(@Param("map")Map map);

}