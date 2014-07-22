
package net.may5.service;

import java.util.List;
import java.util.Map;

import net.may5.dto.Customer;
import net.may5.dto.Orders;

public interface OrderService {

	public List<Orders> getAlimiList();

	public List<Orders> getOrderList();
	
	public List<Orders> getOrderListMng();
	
	public Customer getCstExistingInfo(String cstId);
	
	public List<Orders> getCardKind();
	
	public List<Orders> getPayKind();
	
	public List<Orders> getCardSection();
	
	public Orders getACardKind(int cardCode);
	
	public List<Orders> getInstallment();

	public List<Orders> getCashReceiptRequestInfoSave();
	
	public List<Orders> getCashReceiptRequestWay();
	
	public List<Orders> getDeduction();
	
	public List<Orders> getOptionPrice();
	
	public List<Orders> getTelecom();
	
	public List<Orders> getItemList();
	


	/*알리미*/
	public List<Orders> getLevelCodeSearch(String levelCode); // levelCode로 조회하기
	public List<Orders> getCstIdSearch(String cstId);		// cstId로 조회하기
	public List<Orders> getOrderNumberSearch(String orderDate ,String sameTimeCount , String itemId); // orderNumber로 조회하기

	/*주문내역*/
	public List<Orders> getorderDateSearch(String orderDate); // orderDate로 조회하기
	public List<Orders> getitemNameSearch(String itemName);		// itemName로 조회하기
	public List<Orders> getOrderlNumberSearch(String orderDate ,String sameTimeCount , String itemId); // orderNumber로 조회하기

	/* 알리미메세지  */
	public void setNewAlimi(Map<String, String> insertParam);
	public void setAlimimessage(Orders orders);
	public void setNoticeComment(Orders orders);
	
	/*선물옵션*/
	public List<Orders> getLevelCodepresent(String levelCode); // levelCode로 조회하기
	public List<Orders> getCstIdpresent(String cstId);		// cstId로 조회하기
	public List<Orders> getOrderNumberpresent(String orderDate ,String sameTimeCount , String itemId); // orderNumber로 조회하기
	public List<Orders> getPriceList();

	/*public OptionPrice getOptionCard();*/
}

