<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=2">
<link href="/CShop/resources/css/orderList.css" rel="stylesheet">
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="/CShop/resources/js/web.js"></script>
<script src="/CShop/resources/js/orderList.js"></script>
<script src="/CShop/resources/js/dlvNotice.js"></script>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<title>Insert title here</title>
<div class="useroption">
<div class="useroptiona">
<div class="useroptionb">
<div class="optiona">ORDER SEARCH</div>
			<div class="abn"></div>
			<div class="aba"></div>  
			
			
			
<div id="alimimain">

	<div id="forma">
		<f:form action="orderlistSearch.do" method="post">
			<select name="ocategory">
				<option value="orderDate">주문일자</option>
				<option value="orderNumber">주문번호</option>
				<option value="itemName">상품명</option>
			</select>
			<input id="alimisearch" type="text" name="searchOrder">
			<input id="alimibutton" type="submit" value="Search"/>
		</f:form>
	</div>
 	<div id="listname"><div id="l1">주문일자</div>
						<div id="l2">주문번호</div>
						<div id="l3">상품명</div>
						<div id="l4">상품금액</div>
						<div id="l7">처리현황</div>
						<div id="l8">상세내역</div>
						<div id="l5">취소</div>
	</div> 
	
	<c:forEach var="orders" items="${orderlist}">

		<div id="am">	
			
			<div id="a1" title="번호">
			
		 
			
				<div id="apa">${fn:replace(orders.orderDate,'-','')}</div>
				<div id="aa1">
					<div id="aaq1">${orders.itemName}</div>
					<div id="aaq2">${orders.price}</div>
					<div id="aaq3">${fn:replace(orders.orderDate,'-','')}${orders.sameTimeCount}${orders.itemId}</div>
				
				
				
				
				<div id="aa5" title="상세내역">
			
				
 
				<!-- 상세내역 웹 -->

				<section class="detailhome">
					<input id="dtbutton" name="dtb" type="checkbox" >
					<article class="orderartcle">		
						<div class="as">
						<a href="http://localhost:8080/CShop/orderList.do" title="Close" class="close">X</a>
						<div class="image">${orders.noticeImg}</div>
						<div class="Commenta">${orders.noticeComment}</div>
						<div class="dtinformation">
							<div class="alla">
								<div class="oda">
									<div class="odinfoa">주문상세정보</div>
								</div>
								<div class="odina">
									<div class="odinfoo">주문번호:${fn:replace(orders.orderDate,'-','')}${orders.sameTimeCount}${orders.itemId}</div>
									<div class="oddayy">주문일자:${orders.orderDate}</div>
									<div class="itemnamee">상품명:${orders.itemName}</div>
									<div class="itemprice">판매가:${orders.price}</div>
									<div class="stockAmount">수량:${orders.stockAmount}</div>
								</div>
							</div>


							<!-- 결제정보  -->
							<div id="mninfoa">
								<div id="mninfo">결제정보</div>
								<div id="mna">
									<div id="itemmnq">판매금액</div>
									<div id="dlvmnq">배 송 비</div>
									<div id="mn">결제</div>
								</div>
								<div id="mnc">
									<div id="itemmn">${orders.price}원</div>
									<div id="dlvmn">${orders.dlvCharge}원</div>
									<div id="orderDateq">입금일:</div>
									<div id="orderDate">${fn:replace(orders.orderDate,'-','')}</div>
									<div id="pointCodeq">적립:</div>
									<div id="pointCode">${orders.pointCode}</div>
									<div id="pointCodeq">결제종류:</div>
									<div id="pointCode">신용카드${orders.payType}</div>
									<div id="allmnq">총 결제금액:</div>
									<div id="allmn">${orders.price}</div><%-- ${orders.dlvCharge}+${orders.stockAmount}+ --%>
								</div>
							</div>



							<!-- 주문자정보  -->
							<div id="myinfoa">
								<div id="myinfo">주문자 정보</div>
								<div id="mya">
									<div id="mynq">보내시는분</div>
									<div id="hpq">휴대폰번호</div>
									<div id="cstemailq">email</div>
								</div>
								<div id="myq">
									<div id="my">${orders.cstName}조인성</div>
									<div id="hp">${orders.cstCP}0103059324</div>
									<div id="cstemail">${orders.cstEmail}adde@hatd.com</div>
									<div id="zero"></div>
								</div>
							</div>

							<!-- 배송지정보  -->
							<div id="youinfoa">
								<div id="youinfo">배송지 정보</div>
								<div id="youa">
									<div id="younq">보내시는분</div>
									<div id="yhpq">휴대폰번호</div>
									<div id="phoneq">전화번호</div>
									<div id="addressq">주소</div>
								</div>
								<div id="youq">
									<div id="you">${orders.receiverName}</div>
									<div id="yhp">${orders.receiverCP}</div>
									<div id="phone">${orders.receiverPhone}</div>
									<div id="address">${orders.orderDetailAddress}</div>
								</div>
							</div>
						</div>
						
					</div>
					</article>
				</section>
				
			</div>
				
				
				</div>
			</div>
			 
			
			
			
			
			
			<div id="a2" title="주문일자">${fn:replace(orders.orderDate,'-','')}</div>
			<div id="a3" title="주문번호">${fn:replace(orders.orderDate,'-','')}${orders.sameTimeCount}${orders.itemId}</div>
			<div id="a4" title="상품명">${orders.itemName}</div>
			<div id="a7" title="상품금액">${orders.price}</div>
			<div id="a8" title="처리현황">${orders.noticeType}결제완료</div>
			<div id="a5" title="상세내역">
			
				

				<!-- 상세내역 웹 -->
 
				<section class="detailhome">
					<input id="dtbutton" name="dtb" type="checkbox">
					<article class="orderartcle">		
						<div class="as">
						<a href="http://localhost:8080/CShop/orderList.do" title="Close" class="close">X</a>
						<div class="image">
							<img src="/CShop/resources/img/cake/${orders.itemId}1.png" alt="이미지" style="width:230px;" >
						</div>
						<div class="Commenta">${orders.noticeComment}</div>
						<div class="dtinformation">
							<div class="alla">
								<div class="oda">
									<div class="odinfoa">주문상세정보</div>
								</div>
								<div class="odina">
									<div class="odinfoo">주문번호:${fn:replace(orders.orderDate,'-','')}${orders.sameTimeCount}${orders.itemId}</div>
									<div class="oddayy">주문일자:${orders.orderDate}</div>
									<div class="itemnamee">상품명:${orders.itemName}</div>
									<div class="itemprice">판매가:${orders.price}</div>
									<div class="stockAmount">수량:${orders.stockAmount}</div>
								</div>
							</div>


							<!-- 결제정보  -->
							<div id="mninfoa">
								<div id="mninfo">결제정보</div>
								<div id="mna">
									<div id="itemmnq">판매금액</div>
									<div id="dlvmnq">배 송 비</div>
									<div id="mn">결제</div>
								</div>
								<div id="mnc">
									<div id="itemmn">${orders.price}원</div>
									<div id="dlvmn">${orders.dlvCharge}원</div>
									<div id="orderDateq">입금일:</div>
									<div id="orderDate">${fn:replace(orders.orderDate,'-','')}</div>
									<div id="pointCodeq">적립:</div>
									<div id="pointCode">${orders.pointCode}</div>
									<div id="pointCodeq">결제종류:</div>
									<div id="pointCode">신용카드${orders.payType}</div>
									<div id="allmnq">총 결제금액:</div>
									<div id="allmn">${orders.price}</div><%-- ${orders.dlvCharge}+${orders.stockAmount}+ --%>
								</div>
							</div>



							<!-- 주문자정보  -->
							<div id="myinfoa">
								<div id="myinfo">주문자 정보</div>
								<div id="mya">
									<div id="mynq">보내시는분</div>
									<div id="hpq">휴대폰번호</div>
									<div id="cstemailq">email</div>
								</div>
								<div id="myq">
									<div id="my">${orders.cstName}조인성</div>
									<div id="hp">${orders.cstCP}0103059324</div>
									<div id="cstemail">${orders.cstEmail}adde@hatd.com</div>
									<div id="zero"></div>
								</div>
							</div>

							<!-- 배송지정보  -->
							<div id="youinfoa">
								<div id="youinfo">배송지 정보</div>
								<div id="youa">
									<div id="younq">보내시는분</div>
									<div id="yhpq">휴대폰번호</div>
									<div id="phoneq">전화번호</div>
									<div id="addressq">주소</div>
								</div>
								<div id="youq">
									<div id="you">${orders.receiverName}</div>
									<div id="yhp">${orders.receiverCP}</div>
									<div id="phone">${orders.receiverPhone}</div>
									<div id="address">${orders.orderDetailAddress}</div>
								</div>
							</div>
						</div>
						
					</div>
					</article>
				</section>
				
			</div>
			<div id="a6" title="취소" >
				<input id="a6send" type="button" value="취소" class="ased" style="font-weight:bold"/>
			</div>
			<div id="aa"></div>
		</div>

	</c:forEach>

	
</div>
</div>
</div>
</div>
