package com.project.telecom.accountingmag.mapper;

import java.util.Map;

import org.springframework.util.StringUtils;

import com.project.telecom.beans.Pager;

public class AccountMapperSqlProvider {
	public String countAccountByMap(Map<String, Object> params) {
		Map<String , Object> map=(Map<String, Object>) params.get("map");
		StringBuilder sBuilder=new StringBuilder("select count(*) from t_account where ");
		if (!StringUtils.isEmpty(map.get("real_name"))) {
			sBuilder.append("real_name like'"+map.get("real_name")+"%'");
		}
	if (!StringUtils.isEmpty(map.get("account_number"))) {
		sBuilder.append(" and account_number like '"+map.get("account_number")+"%'");
	}
		return sBuilder.toString();	
	}
	
	public String findAccountsByMap(Map<String, Object> params) {
		Map<String , Object> map=(Map<String, Object>) params.get("map");
		Pager pager = (Pager) params.get("pager");
		int index=pager.getIndex();
		int rows=pager.getRows();
		StringBuilder sBuilder=new StringBuilder("select * from t_account where ");
		if (!StringUtils.isEmpty(map.get("real_name"))) {
			sBuilder.append("real_name like '"+map.get("real_name")+"%'");
		}
	if (!StringUtils.isEmpty(map.get("account_number"))) {
		sBuilder.append(" and account_number like '"+map.get("account_number")+"%'");
	}
	sBuilder.append(" limit "+index+","+rows);
		
		return sBuilder.toString();
		
	}
}
