package net.may5.service;

import java.util.List;

import net.may5.dto.OrderCount;

public interface SttService {

	public int getDailyCountForOrder(String orderDate);

	public int getOrderCount();

	public int getCustomerCount();

	public int getDCustomerCount();

	public int getDailyCountForMenu();

	public int getCakeCount();

	public List<OrderCount> orderCountPerHour(String orderDate);

}
