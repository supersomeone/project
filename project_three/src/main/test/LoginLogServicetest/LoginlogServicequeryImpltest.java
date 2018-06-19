package LoginLogServicetest;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.project.telecom.logmag.servicequery.ILoginlogServicequery;
import com.project.telecom.logmag.servicequery.IOperationlogServicequery;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class LoginlogServicequeryImpltest {
	@Resource
	private ILoginlogServicequery iLoginlogServicequery;
	@Resource
	private IOperationlogServicequery iOperationlogServicequery;
	@Test
	public void Loginlogquery() {
		Map map = new HashMap<>();
		map.put("name", "张");
		map.put("ip", "1");
		map.put("begin", "0");
		map.put("rows", "2");
		
	}
	@Test
	public void Operationlog() {
		Map map = new HashMap<>();
		map.put("name", "1");
		map.put("ip", "1");
		map.put("begin", "0");
		map.put("rows", "2");
		
	}
	

}
