package com.project.telecom.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.project.telecom.beans.Pager;
import com.project.telecom.billmag.servicequery.IBillService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class TestBillServiceImpl {
	@Resource
	private IBillService billServiceImpl;
	
	@Test
	public void findPagerBeanByAccountmonthBean() {
		Map map = new HashMap();
		map.put("accountNumber", "0");
		map.put("identity", null);
		map.put("realName", null);
		map.put("year", 0);
		
		Pager page = new Pager(1, 3);
		map.put("index", page.getIndex());
		map.put("rows", page.getRows());
		map.put("page", page.getPage());
		
		page = billServiceImpl.findPagerBeanByAccountmonthBean(page, map);
		Assert.assertNotNull(page.getDatas());
		System.out.println(page);
	}
	
	
	
	@Test
	public void findPagerBeanByServicemonthBean() {
		Map map = new HashMap();
		map.put("id", 1l);
		
		Pager page = new Pager(1, 3);
		map.put("index", page.getIndex());
		map.put("rows", page.getRows());
		map.put("page", page.getPage());
		
		page = billServiceImpl.findPagerBeanByServicemonthBean(page, map);
		Assert.assertNotNull(page.getDatas());
		System.out.println(page);
	}
	
	
	@Test
	public void findPagerBeanByServicebill() {
		Map map = new HashMap();
		map.put("id", 1l);
		
		Pager page = new Pager(1, 3);
		map.put("index", page.getIndex());
		map.put("rows", page.getRows());
		map.put("page", page.getPage());
		
		page = billServiceImpl.findPagerBeanByServicebill(page, map);
		Assert.assertNotNull(page.getDatas());
		System.out.println(page);
	}

}
