package com.project.telecom.adminmag.daohandle;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.telecom.beans.AdminBean;

/**
 * @author ASUS
 * @version 1.0
 * @created 14-6��-2018 9:25:57
 */
public interface IHandleAdminDao extends JpaRepository<AdminBean, Long>{

	
}