package com.project_three.test.accounttest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.project.telecom.accountingmag.servicehandle.IAccountServicehandle;
import com.project.telecom.accountingmag.servicequery.IQueryAccountService;
import com.project.telecom.beans.AccountBean;
import com.project.telecom.beans.Pager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class AccountServiceImplTest {
	@Resource
	private IAccountServicehandle accountServicehandleImpl;
	@Resource
	private IQueryAccountService accountServicequeryImpl;
	@Test
	public void saveAccount() {
		AccountBean  account=new AccountBean();
		account.setAccount("123456");
		account.setAddress("抚琴东南路");
		account.setGender(1);
		account.setName("李四");
		accountServicehandleImpl.addAccount(account);
	}
	@Test
	public void saveManyAccount() {
		List<AccountBean> accounts=new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			AccountBean  account=new AccountBean();
			account.setAccount("123456");
			account.setAddress("抚琴东南路");
			account.setGender(1);
			account.setName("王五");
			accounts.add(account);
		}
		accountServicehandleImpl.addManyAccount(accounts);
	}
	@Test
	public void deleteAccount() {
		AccountBean  account=accountServicehandleImpl.findAccountBeanById(4);
		accountServicehandleImpl.deleteAccount(account);
	}
	@Test
	public void updateAccount() {
		AccountBean  account=accountServicehandleImpl.findAccountBeanById(5);
		account.setName("麻子");
		account.setGender(2);
		accountServicehandleImpl.updateAccount(account);
	}
	@Test
	public void openAccount() {
		AccountBean  account=accountServicehandleImpl.findAccountBeanById(5);
		accountServicehandleImpl.openAccount(account);
	}
	@Test
	public void findPagerByAccountBean() {
		Map map=new HashMap<>();
		map.put("real_name", "王");
		map.put("account_number", "123");
		Pager pager=new Pager();
		pager.setPage(3);
		pager.setRows(3);
		pager=accountServicequeryImpl.findPagerByAccountBean(map, pager);
		System.out.println(pager);
	}
}
