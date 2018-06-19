package com.project.telecom.logmag.mapper;

import java.util.Map;

public class OperationlogMapperSqlProvider {
	public String findAllByNum(Map<String, Object> params) {
		Map<String, Object> map = (Map<String, Object>) params.get("map");
		StringBuilder sb = new StringBuilder("select count(*) from t_operation_log where 1=1 ");
		if ((map.get("name")!=null)) {
			sb.append("and name like '"+map.get("name")+"%'");
		}else if ((map.get("startingtime")!=null)) {
			sb.append("and time > '"+map.get("startingtime"));
		}else if ((map.get("endtime")!=null)) {
			sb.append("and time < '"+map.get("endtime"));
		}
		
		return sb.toString();
	}
	public String findPagerByOperationLogBean(Map<String, Object> params) {
		Map<String, Object> map = (Map<String, Object>) params.get("map");
		StringBuilder sb = new StringBuilder("select * from t_operation_log where 1=1 ");
		if ((map.get("name")!=null)) {
			sb.append("and name like '"+map.get("name")+"%'");
		}else if ((map.get("startingtime")!=null)) {
			sb.append("and time > '"+map.get("startingtime"));
		}else if ((map.get("endtime")!=null)) {
			sb.append("and time < '"+map.get("endtime"));
		}
		sb.append(" limit "+map.get("index")+","+map.get("rows"));
		return sb.toString();
	}
}
