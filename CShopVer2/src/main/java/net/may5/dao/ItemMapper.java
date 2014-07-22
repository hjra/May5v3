package net.may5.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.may5.dto.Evaluation;
import net.may5.dto.Item;
import net.may5.dto.Orders;


public interface ItemMapper {

	public Item getAnItem(String itemId);

	public List<Item> getItemList();
	
	public int getListCount();
	
	public int getAnItemListCount(String itemId);
	
	public List<Evaluation> getEvaluationList(HashMap<String, String> param);

	public List<Evaluation> getOrderList(String orderDate);

	public int getOrderListCount();
	
	public Orders getAnOrderList(String itemId);
	
	public List<Orders> getOrderListCountSameItemId();
	
	public void setNewItem(Map<String, String> insertParam);
	
	public int getOrderListDailyCount(String orderDate);

	public void deleteItem(String deleteItemId);
	
	public void modifyItem(Map<String, String> insertParam);

}