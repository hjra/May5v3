package net.may5.service;

import java.util.List;

import net.may5.dao.SttMapper;
import net.may5.dto.OrderCount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("sttService")
public class SttServiceImpl implements SttService {

	@Autowired
	private SttMapper sttMapper;
	
	@Override
	public int getDailyCountForOrder(String orderDate) {
		return sttMapper.getDailyCountForOrder(orderDate);
	}

	@Override
	public int getOrderCount() {
		return sttMapper.getOrderCount();
	}

	@Override
	public int getCustomerCount() {
		return sttMapper.getCustomerCount();
	}

	@Override
	public int getDCustomerCount() {
		return sttMapper.getDCustomerCount();
	}

	@Override
	public int getDailyCountForMenu() {
		return sttMapper.getDailyCountForMenu();
	}

	@Override
	public int getCakeCount() {
		return sttMapper.getCakeCount();
	}

	@Override
	public List<OrderCount> orderCountPerHour(String orderDate) {
		return sttMapper.orderCountPerHour(orderDate);
	}

	
}
