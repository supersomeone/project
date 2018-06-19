package com.project.telecom.billmag.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.telecom.beans.Pager;
import com.project.telecom.billmag.servicequery.IBillService;
@RequestMapping("/bill")
@RestController
public class BillController {
	@Resource
	private IBillService billServiceImpl;
	
	@RequestMapping(value = "/{page}/{rows}/{accountNumber}/{identity}/{realName}/{year}", method = { RequestMethod.GET }, produces = {
	"application/json;charset=utf-8" })
	public Pager findPagerBeanByAccountmonthBean(@PathVariable int page, @PathVariable int rows,
			@PathVariable String accountNumber, @PathVariable String identity, @PathVariable String realName, @PathVariable int year) {
		Pager pager = new Pager(page, rows);
		Map params = new HashMap();
		params.put("accountNumber", accountNumber);
		params.put("identity", identity);
		params.put("realName", realName);
		params.put("year", year);
		try {
			pager = billServiceImpl.findPagerBeanByAccountmonthBean(pager, params);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return pager;
	}
	
	
	
	@RequestMapping(value = "/{page}/{rows}/{id}", method = { RequestMethod.GET }, produces = {
	"application/json;charset=utf-8" })
	public Pager findPagerBeanByServicemonthBean(@PathVariable int page, @PathVariable int rows,
			@PathVariable Long id) {
		Pager pager = new Pager(page, rows);
		Map params = new HashMap();
		params.put("id", id);
		try {
			pager = billServiceImpl.findPagerBeanByServicemonthBean(pager, params);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return pager;
	}
	
	
	
	@RequestMapping(value = "/{page}/{rows}/{id}", method = { RequestMethod.GET }, produces = {
	"application/json;charset=utf-8" })
	public Pager findPagerBeanByServicebill(@PathVariable int page, @PathVariable int rows,
			@PathVariable Long id) {
		Pager pager = new Pager(page, rows);
		Map params = new HashMap();
		params.put("id", id);
		try {
			pager = billServiceImpl.findPagerBeanByServicebill(pager, params);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return pager;
	}

}
