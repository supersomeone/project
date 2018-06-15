package com.project.telecom.logmag.mapper;

import java.util.Map;

import com.mysql.jdbc.StringUtils;

public class LoginlogMapperSqlProvider {
	public String findAllByNum(Map<String, Object> params) {
		Map<String, Object> map = (Map<String, Object>) params.get("map");
		StringBuilder sb = new StringBuilder("select count(*) from t_login_log where 1=1 ");
		if ((map.get("name")!=null)) {
			sb.append("and name like '"+map.get("name")+"%'");
		}else if ((map.get("ip")!=null)) {
			sb.append("and ip like '"+map.get("ip")+"%'");
		}else if ((map.get("startingtime")!=null)) {
			sb.append("and time > '"+map.get("startingtime"));
		}else if ((map.get("endtime")!=null)) {
			sb.append("and time < '"+map.get("endtime"));
		}
		
		return sb.toString();
	}
	
	public String findPagerByLoginlogBean(Map<String, Object> params) {
		Map<String, Object> map = (Map<String, Object>) params.get("map");
		StringBuilder sb = new StringBuilder("select * from t_login_log where 1=1 ");
		if ((map.get("name")!=null)) {
			sb.append("and name like '"+map.get("name")+"%'");
		}else if ((map.get("ip")!=null)) {
			sb.append("and ip like '"+map.get("ip")+"%'");
		}else if ((map.get("startingtime")!=null)) {
			sb.append("and time > '"+map.get("startingtime"));
		}else if ((map.get("endtime")!=null)) {
			sb.append("and time < '"+map.get("endtime"));
		}
		sb.append(" limit "+map.get("begin")+","+map.get("rows"));
		return sb.toString();
	}

}
