package net.may5.service;

import java.util.List;

import net.may5.dao.ManagerMapper;
import net.may5.dto.Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("managerService")
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private ManagerMapper managerMapper;
	
	@Override
	public Manager loginMng(Manager manager) {
		return managerMapper.loginMng(manager);
	}

	@Override
	public List<Manager> allMngInfoList() {
		return managerMapper.allMngInfoList();
	}

}
