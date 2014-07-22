
package net.may5.service;

import java.util.List;
import java.util.Map;

import net.may5.dao.OrderMapper;
import net.may5.dto.Customer;
import net.may5.dto.Orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("orderService")
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderMapper orderMapper;

	public List<Orders> getAlimiList() {
		return orderMapper.getAlimiList();
	}
	
	public List<Orders> getOrderList() {
		return orderMapper.getOrderList();
	}

	@Override
	public List<Orders> getOrderListMng() {
		
		return orderMapper.getOrderListMng();
	}

	@Override
	public Customer getCstExistingInfo(String cstId) {
		
		return orderMapper.getCstExistingInfo(cstId);
	}

	@Override
	public List<Orders> getCardKind() {
		
		return orderMapper.getCardKind();
	}
	
	@Override
	public Orders getACardKind(int cardCode) {
		
		return orderMapper.getACardKind(cardCode);
	}
	
	@Override
	public List<Orders> getPayKind() {
		
		return orderMapper.getPayKind();
	}
	
	@Override
	public List<Orders> getCardSection() {
		
		return orderMapper.getCardSection();
	}

	@Override
	public List<Orders> getInstallment() {
		
		return orderMapper.getInstallment();
	}
	
	@Override
	public List<Orders> getCashReceiptRequestInfoSave() {
		
		return orderMapper.getCashReceiptRequestInfoSave();
	}

	@Override
	public List<Orders> getCashReceiptRequestWay() {
		
		return orderMapper.getCashReceiptRequestWay();
	}
	
	@Override
	public List<Orders> getDeduction(){
		
		return orderMapper.getDeduction();
	}
	
	@Override
	public List<Orders> getOptionPrice() {
		
		return orderMapper.getOptionPrice();
	}
	
	@Override
	public List<Orders> getTelecom() {
		
		return orderMapper.getTelecom();
	}
	
	@Override
	public List<Orders> getItemList() {
		
		return orderMapper.getItemList();
	}

	/*@Override
	public OptionPrice getOptionCard() {
		
		return orderMapper.getOptionCard();
	}*/

	
	
	/*알리미*/
	@Override
	public List<Orders> getLevelCodeSearch(String levelCode) {
		return orderMapper.getLevelCodeSearch(levelCode); // levelCode로 조회하기
	}

	@Override
	public List<Orders> getCstIdSearch(String cstId) {
		return orderMapper.getCstIdSearch(cstId); // cstId로 조회하기
	}

	@Override
	public List<Orders> getOrderNumberSearch(String orderDate, String sameTimeCount , String itemId) {
		return orderMapper.getOrderNumberSearch( orderDate,  sameTimeCount ,   itemId); // orderNumber로 조회하기
	}

	
	/*주문내역*/
	@Override
	public List<Orders> getorderDateSearch(String orderDate) {
		return orderMapper.getorderDateSearch(orderDate); // orderDate로 조회하기
	}

	@Override
	public List<Orders> getitemNameSearch(String itemName) {
		return orderMapper.getitemNameSearch(itemName); // itemName로 조회하기
	}
	
	@Override
	public List<Orders> getOrderlNumberSearch(String orderDate, String sameTimeCount , String itemId) {
		return orderMapper.getOrderlNumberSearch( orderDate,  sameTimeCount ,   itemId); // orderNumber로 조회하기
	}

	/* 알리미메세지 */
	@Override
	public void setNewAlimi(Map<String, String> insertParam) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setAlimimessage(Orders orders) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNoticeComment(Orders orders) {
		orderMapper.setNoticeComment(orders);
	}
	
	
	/*선물옵션*/
	@Override
	public List<Orders> getLevelCodepresent(String levelCode) {
		return orderMapper.getLevelCodeSearch(levelCode); // levelCode로 조회하기
	}

	@Override
	public List<Orders> getCstIdpresent(String cstId) {
		return orderMapper.getCstIdSearch(cstId); // cstId로 조회하기
	}

	@Override
	public List<Orders> getOrderNumberpresent(String orderDate, String sameTimeCount , String itemId) {
		return orderMapper.getOrderNumberSearch( orderDate,  sameTimeCount ,   itemId); // orderNumber로 조회하기
	}

	@Override
	public List<Orders> getPriceList() {
		return orderMapper.getPriceList();
	}

	
	
	

	

}


