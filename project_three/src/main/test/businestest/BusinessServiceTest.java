package businestest;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.project.telecom.beans.BusinessBean;
import com.project.telecom.beans.Pager;
import com.project.telecom.businessmag.servicehandle.IHandleBusinessService;
import com.project.telecom.businessmag.servicequery.IQueryBusinessService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class BusinessServiceTest {
	@Resource
	private IHandleBusinessService handleBusinessServiceImpl;
	@Resource
	private IQueryBusinessService queryBusinessServiceImpl;
	@Test
	public void addBusiness() {
		BusinessBean bean=new BusinessBean();
		bean.setNumber("321456");
		bean.setPassword("321333");
		bean.setIp("198.168.11");
		handleBusinessServiceImpl.addBusiness(bean);
	}
	@Test
	public void updateBusiness() {
		BusinessBean bean=handleBusinessServiceImpl.findBusinessById(3);
		bean.setPassword("9999999");
		handleBusinessServiceImpl.updateBusiness(bean);
	}
	@Test
	public void deleteBusiness() {
		BusinessBean bean=handleBusinessServiceImpl.findBusinessById(3);
		handleBusinessServiceImpl.deleteBusiness(bean);
	}
	@Test
	public void getPagerToBusiness() {
		Pager pager=new Pager();
		pager.setPage(1);
		pager.setRows(3);
		Map map=new HashMap();
		map.put("ip", "1");
		map.put("os_number", "321");
		pager=queryBusinessServiceImpl.findPagerByBusinessBean(map, pager);
		System.out.println(pager);
	}
}
