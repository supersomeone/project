package com.project.telecom.accountingmag.daoquery;

import java.util.List;
import java.util.Map;

import com.project.telecom.beans.AccountBean;
import com.project.telecom.beans.Pager;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:58
 */
public interface IQueryAccountDao {

	/**
	 * @author xc
	 *根据id查询账务账号 
	 * @param account
	 */
	public AccountBean findAllById(long id);

	/**
	 * @author xc
	 * 根据多参数查询账务账号总条数
	 * @param map 参数集合
	 */
	public int findPagerByAccountBean(Map map);
	/**
	 * @author xc
	 * 根据多参数查询账务账号集合
	 * @param pager分页对象
	 */
	public List<AccountBean> findAccountsByMapToPager(Map map,Pager pager);

}