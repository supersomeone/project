package pricingbean;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.project.telecom.beans.PricingBean;
import com.project.telecom.expensesmag.servicequery.IExpensesServicequery;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class ExpensesService {
	@Resource
	private IExpensesServicequery iExpensesServicequery;
	
//	@Test
//	public void ExpensesServicehandle() {
//		System.out.println("777777777777777  "+iExpensesServicequery.getPagerBeanByNum());
//		
//	}
//	
//	@Test
//	public void ExpensesServicehandle1() {
//		Map map = new HashMap<>();
//		map.put("begin", 0);
//		map.put("rows", 2);
//		System.out.println("666666666666  "+iExpensesServicequery.getPricingBeanByPagers(map));
//		
//	}
}
