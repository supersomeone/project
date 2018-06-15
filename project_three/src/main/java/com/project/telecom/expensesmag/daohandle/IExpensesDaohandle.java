package com.project.telecom.expensesmag.daohandle;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.telecom.beans.LoginLogBean;
import com.project.telecom.beans.Pager;
import com.project.telecom.beans.PricingBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:56
 */
public interface IExpensesDaohandle extends JpaRepository<PricingBean, Long>{
	


}