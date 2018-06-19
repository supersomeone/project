package com.project.telecom.businessmag.daohandle;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.project.telecom.beans.BusinessBean;

/**
 * @author xc
 * @version 1.0
 * @created 14-6��-2018 9:25:57
 */
public interface IHandleBusinessDao extends JpaRepository<BusinessBean, Long>,JpaSpecificationExecutor<BusinessBean>{


}