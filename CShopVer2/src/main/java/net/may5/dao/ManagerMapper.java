package net.may5.dao;

import java.util.List;

import net.may5.dto.Manager;

public interface ManagerMapper {
	
	/** 관리자페이지 */
	
	/* 로그인 */
	Manager loginMng(Manager manager);
	
	/* 직원정보 */
	List<Manager> allMngInfoList();
}
