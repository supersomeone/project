package LoginLogServicetest;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.project.telecom.beans.OperationLogBean;
import com.project.telecom.logmag.servicehandle.IOperationlogServicehandle;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class OperationlogServicehandleImpltest {
	@Resource
	private IOperationlogServicehandle iOperationlogServicehandle;
	
	@Test
	public void AddLoginlog() {
		OperationLogBean bean = new OperationLogBean();
		bean.setId(1l);
		bean.setModule("1");
		bean.setName("11");
		bean.setOperation("11");
		bean.setRole_Type("11");
		
		iOperationlogServicehandle.addOperation(bean);
	}
}
