package com.project.telecom.loginmag.daohendle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.project.telecom.beans.AdminBean;


public interface IHandleLoginDao extends JpaRepository<AdminBean, Long>,JpaSpecificationExecutor<AdminBean>{

}
