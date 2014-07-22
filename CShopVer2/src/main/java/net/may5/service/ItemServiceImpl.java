package net.may5.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.may5.dao.ItemMapper;
import net.may5.dto.Evaluation;
import net.may5.dto.Item;
import net.may5.dto.Orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemMapper itemMapper;
	
	private static HashMap<String, String> param = new HashMap<String, String>();

	@Override
	public Item getAnItem(String itemId) {
		return itemMapper.getAnItem(itemId);
		
	}

	@Override
	public List<Item> getItemList() {
		
		return itemMapper.getItemList();
	}
	
	//게시글 수
		@Override
		public int getListCount() {
			
			return itemMapper.getListCount();
		}

		@Override
		public List<Evaluation> getEvaluationList(String itemId, int page, int limit ) {
			int startrow = (page - 1) * 10;
			param.put("itemId", itemId);
			param.put("startrow", String.valueOf(startrow) );
			param.put("endrow", String.valueOf(startrow + limit));
			List<Evaluation> ev=  itemMapper.getEvaluationList(param);
			System.out.println("imp:e");
			return ev;
		}

		@Override
		public int getAnItemListCount(String itemId) {
			
			return itemMapper.getAnItemListCount(itemId);
		}

		@Override
		public List<Evaluation> getOrderList(String orderDate) {
			return itemMapper.getOrderList(orderDate);
		}

		@Override
		public int getOrderListCount() {
			return itemMapper.getOrderListCount();
		}

		@Override
		public Orders getAnOrderList(String itemId) {
			return itemMapper.getAnOrderList(itemId);
		}

		@Override
		public List<Orders> getOrderListCountSameItemId() {
			return itemMapper.getOrderListCountSameItemId();
		}

		@Override
		public void setNewItem(Map<String, String> insertParam) {
			itemMapper.setNewItem(insertParam);
		}

		@Override
		public void deleteItem(String deleteItemId) {
			itemMapper.deleteItem(deleteItemId);
		}

		@Override
		public int getOrderListDailyCount(String orderDate) {
			return itemMapper.getOrderListDailyCount(orderDate);
		}

		@Override
		public void modifyItem(Map<String, String> insertParam) {
			itemMapper.modifyItem(insertParam);
			
		}
}
