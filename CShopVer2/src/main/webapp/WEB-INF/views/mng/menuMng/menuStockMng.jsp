<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true" %>
<script>
$(document)
.on("click","#datePicker", function(){
	location.href="datePicker.do";
})
.on("click","#stockToZero",function(){
	location.href="stockToZero.do";
});
 
</script>

<!-- 날짜선택, 마감작업 둘다 작동하도록    => itemController 에서 처리? 
1. 특정 날짜 선택하면, 상품재고 목록이 나타나도록
2. 마감버튼 클릭하면 상품재고가 0이 되도록-->



<h1>상품재고</h1>
<%-- 
orderCount::${orderCount}<br>
getOrderListSameItemId::${getOrderListSameItemId} --%>

<form method="get">
	<div class="row-fluid text-right">
		<span>선택된날짜</span>
		<input type="text" name="orderDate" placeholder="날짜를 선택해주세요" class="date-picker" id="thisDay" value="${paramDate}" />
		<input type="submit" value="검색" />
		<!-- <button id="stockToZero" class="btn btn-primary">마감</button> -->
	</div>
</form>

		
<br><br><br>
<ul>
	<c:forEach var="order"  items="${orderList}">
			<c:choose>
			<c:when test="${order.orderDate==thisDay}">오늘이에용!</c:when>
			<c:otherwise>
			<!-- 여기 특정날짜로 적용한다음에 그 날짜에 대한 주문목록만 나오고 싶당 -->
			<div>주문날짜 :: ${order.orderDate}</div>
			<li class="cake">
			<img src="/CShop/resources/img/cake/${order.itemId}1.png" alt="대표이미지" style="width: 200px; margin: 3px">
			<label>
			<div> 아이템 아이디 :: ${order.itemId}</div>
			<div> 주문수량      -      재고수</div>
			<div>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
			${order.orderAmount}&nbsp&nbsp&nbsp-&nbsp&nbsp&nbsp${order.stockAmount }</div>
			</label><br>
			</li>
			</c:otherwise>
			</c:choose>
	</c:forEach>
</ul>



