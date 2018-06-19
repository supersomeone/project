package com.project.telecom.accountingmag.daohandle;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.project.telecom.beans.AccountBean;

/**
 * @author 徐超
 * @version 1.0
 * @created 14-6��-2018 9:25:57
 */
public interface IHandleAccountDao extends JpaRepository<AccountBean, Long>,JpaSpecificationExecutor<AccountBean>{



}