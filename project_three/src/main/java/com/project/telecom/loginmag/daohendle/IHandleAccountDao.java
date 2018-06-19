package com.project.telecom.loginmag.daohendle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.project.telecom.beans.AccountBean;

public interface IHandleAccountDao extends JpaRepository<AccountBean, Long>,JpaSpecificationExecutor<AccountBean>{

}
