package com.project.telecom.logmag.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.telecom.beans.Pager;
import com.project.telecom.logmag.servicehandle.ILoginloghandleService;
import com.project.telecom.logmag.servicequery.ILoginlogServicequery;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:58
 */
@RequestMapping("/Loginlog")
@RestController
public class LoginlogController {

	@Resource
	private ILoginlogServicequery iLoginlogServicequery;
	
	@Resource
	private ILoginloghandleService iLoginloghandleService;
	
	
	@RequestMapping(value = "/{index}/{rows}/{name}/{ip}", method = { RequestMethod.GET }, produces = {
	"application/json;charset=utf-8" })
	public Pager findCustomersByMapToPager(@PathVariable int index, @PathVariable int rows,
			@PathVariable String name, @PathVariable String ip) {
		Pager pager = new Pager(index, rows);
		Map map = new HashMap();
		map.put("name", name);
		map.put("ip", ip);
		try {
			pager = iLoginlogServicequery.findPagerByLoginlogBean(pager, map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return pager;
	}
	

}