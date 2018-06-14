package com.project_three.test.admintest;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.project.telecom.adminmag.servicehandle.IHandleAdminService;
import com.project.telecom.beans.AdminBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class AdminServiceImplTest {
	@Resource
	private IHandleAdminService handleAdminServiceImpl;
	@Test
	public void addAdmin() {
		AdminBean admin=new AdminBean();
		admin.setAdminName("张三");
		admin.setEamil("1101449082@qq.com");
		admin.setLoginName("zs");
		admin.setPassword("123456");
		handleAdminServiceImpl.addAdmin(admin);
	}
	
	@Test
	public void updateAdmin() {
		AdminBean admin=handleAdminServiceImpl.findAdmin(2);
		admin.setAdminName("zhangsan");
		handleAdminServiceImpl.updateAdmin(admin);
	}
	@Test
	public void deleteAdmin() {
		AdminBean admin=handleAdminServiceImpl.findAdmin(2);
		handleAdminServiceImpl.deleteAdmin(admin);
	}
	
}
