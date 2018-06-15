package com.project.telecom.logmag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.SelectProvider;

import com.project.telecom.beans.LoginLogBean;
import com.project.telecom.beans.OperationLogBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:59
 */
public interface OperationlogMapper {
	/**
	 * 
	 * @param map
	 */
	@SelectProvider(type=OperationlogMapperSqlProvider.class,method="findAllByNum")
	public int findAllByNum(@Param("map")Map map);

	/**
	 * 
	 * @param map
	 */
	@ResultType(value=OperationLogBean.class)
	@SelectProvider(type=OperationlogMapperSqlProvider.class,method="findPagerByOperationLogBean")
	public List<OperationLogBean> findPagerByOperationLogBean(@Param("map")Map map);
}