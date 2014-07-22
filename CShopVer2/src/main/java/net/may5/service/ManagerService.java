package net.may5.service;

import java.util.List;

import net.may5.dto.Manager;

public interface ManagerService {
	
	/** 관리자페이지 */
	public Manager loginMng(Manager manager);			// 로그인
	public List<Manager> allMngInfoList();				// 직원정보
}
