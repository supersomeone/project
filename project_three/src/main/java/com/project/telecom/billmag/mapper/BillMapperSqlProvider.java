package com.project.telecom.billmag.mapper;

import java.util.Map;

import org.springframework.util.StringUtils;



public class BillMapperSqlProvider {
	
	public String countPagerBeanByAccountmonthBean(Map<String, Object> params) {
		Map map = (Map) params.get("map");
		StringBuilder sb=new StringBuilder("select count(m.id) from t_account_month as m left join t_account as a on m.fk_account_id = a.id where 1=1 ");
		String accountNumber=(String) map.get("accountNumber");
		String identity=(String) map.get("identity");
		String realName=(String) map.get("realName");
		int year= (int) map.get("year");
		int index=(int) map.get("index");
		int rows=(int) map.get("rows");
		
		if(StringUtils.hasLength(accountNumber)) {
			sb.append(" and a.account_number like concat('"+accountNumber+"','%')");
		}
		if(StringUtils.hasLength(identity)) {
			sb.append(" and a.identity like concat('"+identity+"','%')");
		}
		if(StringUtils.hasLength(realName)) {
			sb.append(" and a.real_name like concat('"+realName+"','%')");
		}
		if(year != 0) {
			sb.append(" and m.year= "+year);
		}
		
		return sb.toString();
	}
	
	
	
	public String getPagerBeanByAccountmonthBean(Map<String, Object> params) {
		Map map = (Map) params.get("map");
		StringBuilder sb=new StringBuilder("select a.real_name as arealName,a.identity as aidentity,a.account_number as aaccountNumber,m.charge,m.month,m.payment,m.pay_state from t_account_month as m left join t_account as a on m.fk_account_id = a.id where 1=1 ");
		String accountNumber=(String) map.get("accountNumber");
		String identity=(String) map.get("identity");
		String realName=(String) map.get("realName");
		int year= (int) map.get("year");
		int index=(int) map.get("index");
		int rows=(int) map.get("rows");
		
		if(StringUtils.hasLength(accountNumber)) {
			sb.append(" and a.account_number like concat('"+accountNumber+"','%')");
		}
		if(StringUtils.hasLength(identity)) {
			sb.append(" and a.identity like concat('"+identity+"','%')");
		}
		if(StringUtils.hasLength(realName)) {
			sb.append(" and a.real_name like concat('"+realName+"','%')");
		}
		if(year != 0) {
			sb.append(" and m.year = "+year);
		}
		sb.append(" limit "+index+","+rows);
		return sb.toString();
	}
	
	
	
	
	public String countPagerBeanByServicemonthBean(Map<String, Object> params) {
		Map map = (Map) params.get("map");
		Long id= (Long) map.get("id");
		StringBuilder sb=new StringBuilder("select count(id) from t_service_month where month = (select month from t_account_month where id = "+id+")");
		return sb.toString();
	}
	
	
	
	public String getPagerBeanByServicemonthBean(Map<String, Object> params) {
		Map map = (Map) params.get("map");
		Long id= (Long) map.get("id");
		StringBuilder sb=new StringBuilder("select * from t_service_month where month = (select month from t_account_month where id = "+id+")");
		
		int index=(int) map.get("index");
		int rows=(int) map.get("rows");
		sb.append(" limit "+index+","+rows+"");
		return sb.toString();
	}
	
	
	
	
	public String countPagerBeanByServicebillBean(Map<String, Object> params) {
		Map map = (Map) params.get("map");
		Long id= (Long) map.get("id");
		StringBuilder sb=new StringBuilder("select count(id) from t_servicebill where ip = (select ip from t_service_month where id = "+id+")");
		return sb.toString();
	}
	
	
	public String getPagerBeanByServicebillBean(Map<String, Object> params) {
		Map map = (Map) params.get("map");
		Long id= (Long) map.get("id");
		StringBuilder sb=new StringBuilder("select * from t_servicebill where ip = (select ip from t_service_month where id = "+id+")");
		
		int index=(int) map.get("index");
		int rows=(int) map.get("rows");
		sb.append(" limit "+index+","+rows+"");
		return sb.toString();
	}
	
	
	
//	public String countPagerBeanByServicebillBean(Map<String, Object> params) {
//		Map map = (Map) params.get("map");
//		StringBuilder sb=new StringBuilder("select count(id) from t_servicebill where 1 = 1");
//		return sb.toString();
//	}
//	
//	
//	public String getPagerBeanByServicebillBean(Map<String, Object> params) {
//		Map map = (Map) params.get("map");
//		StringBuilder sb=new StringBuilder("select * from t_servicebill where 1=1");
//		String ip = (String) map.get("ip");
//		
//		int index=(int) map.get("index");
//		int rows=(int) map.get("rows");
//		if(!StringUtils.hasLength(ip)) {
//			sb.append(" and ip like concat('"+ip+"','%')");
//		}
//		sb.append(" limit "+index+","+rows);
//		return sb.toString();
//	}
	
	
	
}
