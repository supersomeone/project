package com.project.telecom.businessmag.servicehandle;

import com.project.telecom.beans.BusinessBean;

/**
 * @author xc
 * @version 1.0
 * @created 14-6��-2018 9:25:57
 */
public interface IHandleBusinessService {

	/**
	 * 添加业务账号
	 * @param business
	 */
	public BusinessBean addBusiness(BusinessBean business);

	/**
	 * 关闭业务
	 * @param business
	 */
	public void closeBusiness(long id);

	/**
	 * 删除业务
	 * @param business
	 */
	public void deleteBusiness(BusinessBean business);

	/**
	 * 开通业务账号
	 * @param business
	 */
	public void openBusiness(long id);

	/**
	 * 修改业务账号
	 * @param business
	 */
	public BusinessBean updateBusiness(BusinessBean business);
	
	/**
	 * 查询id
	 * @param id业务账号id
	 * @return 业务账号对象
	 */
	public BusinessBean findBusinessById(long id);

}