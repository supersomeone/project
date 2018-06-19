package LoginLogServicetest;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.project.telecom.beans.LoginLogBean;
import com.project.telecom.logmag.daohandle.ILoginlogDaohandle;
import com.project.telecom.logmag.servicehandle.ILoginloghandleService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class LoginLogServicehandleImpltest {
	@Resource
	private ILoginloghandleService loginlogServicehandleImpl;
	
	@Test
	public void AddLoginlog() {
		LoginLogBean bean = new LoginLogBean();
		bean.setId(2l);
		bean.setIp("123");
		bean.setName("李四");
		bean.setState("操作了xxx业务");
		loginlogServicehandleImpl.addLogin(bean);
		
	}

}
