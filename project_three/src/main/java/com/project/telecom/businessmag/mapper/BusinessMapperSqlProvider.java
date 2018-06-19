package com.project.telecom.businessmag.mapper;

import java.util.Map;

import org.springframework.util.StringUtils;

import com.project.telecom.beans.Pager;


public class BusinessMapperSqlProvider {

		public String  countBusinessToPager(Map<String, Object> params) {
			Map<String, Object> map=(Map<String, Object>) params.get("map");
			StringBuilder sBuilder=new StringBuilder("select count(*) from t_business where 1=1 ");
			if (StringUtils.hasLength((String)map.get("ip"))) {
				sBuilder.append(" and ip like '%"+map.get("ip")+"%' ");
			}
			if (StringUtils.hasLength((String)map.get("os_number"))) {
				sBuilder.append(" and os_number like '%"+map.get("os_number")+"%'");
			}
			return sBuilder.toString();
		}
		
		public String getBusinessesToPager(Map<String, Object> params) {
			Map<String, Object> map=(Map<String, Object>) params.get("map");
			Pager pager=(Pager) params.get("pager");
			StringBuilder sBuilder=new StringBuilder("select * from t_business where 1=1 ");
			if (StringUtils.hasLength((String)map.get("ip"))) {
				sBuilder.append(" and ip like '%"+map.get("ip")+"%' ");
			}
			if (StringUtils.hasLength((String)map.get("os_number"))) {
				sBuilder.append(" and os_number like '%"+map.get("os_number")+"%'");
			}
			sBuilder.append(" limit "+pager.getIndex()+","+pager.getRows());
			return sBuilder.toString();	
		}
}
