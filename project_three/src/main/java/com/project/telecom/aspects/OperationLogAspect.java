package com.project.telecom.aspects;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import javax.annotation.Resource;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.project.telecom.annotation.operlog;
import com.project.telecom.beans.OperationLogBean;
import com.project.telecom.logmag.daohandle.IOperationlogDaohandle;





@Component
@Aspect
public class OperationLogAspect {
	@Resource
	private IOperationlogDaohandle iOperationlogDaohandle;

//	@Pointcut(value="execution(* com.project.telecom.logmag.dao*.impl.*DaoImpl.*(..))")
//	public void pointcut() {}
	
	@Pointcut(value="@annotation(com.project.telecom.annotation.operlog)")
	public void annotation() {}
	
	@Before(value="annotation() && @annotation(operlog) ")
	public void beforeAdvice(JoinPoint jp,operlog operlog) {
		
		
		OperationLogBean bean = new OperationLogBean();
		Object target = jp.getTarget();//目标对象
		String method = jp.getSignature().getName();//目标方法
		Object[] objs = jp.getArgs();//目标方法中，接收的参数
		
		String module = operlog.module();
		bean.setModule(module);
		int type = operlog.type();
		if (type==1) {
			bean.setRole_Type("增加");
		}else if (type==2) {
			bean.setRole_Type("删除");
		}else if (type==3) {
			bean.setRole_Type("修改");
		}else if (type==0) {
			bean.setRole_Type("0");
		}
		
		
		String string = Arrays.deepToString(objs);
		bean.setOperation(string);
		
	
		bean.setModule(module);
		SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		bean.setTime(date);
		
		iOperationlogDaohandle.save(bean);
		
	
	}
	
	
	
	
	
}
