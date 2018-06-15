package com.project.telecom.logmag.daohandle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.project.telecom.beans.LoginLogBean;
import com.project.telecom.beans.OperationLogBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:57
 */

public interface IOperationlogDaohandle extends JpaRepository<OperationLogBean, Long>,JpaSpecificationExecutor<OperationLogBean>{


}