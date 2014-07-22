<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=2">
<link href="/CShop/resources/css/orderNotice.css" rel="stylesheet">
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="/CShop/resources/js/web.js"></script>
<script src="/CShop/resources/js/dlvNotice.js"></script>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<title>Insert title here</title>
<div id="alimimain">
	<div id="alimi">선물옵션 수정 중이에요~</div>
	<div id="forma">
		<f:form action="levelCodePresent.do" method="post">
			<select name="dcategory">
				<option value="levelCode">모두</option>
				<option value="orderNumber">주문번호</option>
				<option value="cstId">아이디</option>
				<option value="cstId">고객등급</option>
				<option value="cstId">선물종류</option>
			</select>
			<input id="alimisearch" type="text" name="searchText">
			<input id="alimibutton" type="submit" value="검색"/>
		</f:form>
	</div>
 	<div id="listname"><div id="l1">번호</div>
						<div id="l2">고객등급</div>
						<div id="l3">회원아이디</div>
						<div id="l4">주문번호</div>
						<div id="l7">배송완료일</div>
						<div id="l8">선물종류</div>
						<div id="l5">금액</div>
						<div id="l6">처리현황</div>
	</div>

	<c:forEach var="orders" varStatus="status" items="${presentlist}">

		<div id="am">
			<div id="a1" title="번호">
				<div id="apa">누구세요?</div>
				<div id="ap">${status.count}</div>
				<div id="aa1">
					<div id="aaq1">${orders.levelCode}</div>
					<div id="aaq2">${orders.cstId}</div>
					<div id="aaq3">${fn:replace(orders.orderDate,'-','')}${orders.sameTimeCount}${orders.itemId}</div>
				</div>
			</div>
			<div id="a2" title="고객등급">${orders.levelCode}</div>
			<div id="a3" title="회원아이디">${orders.cstId}</div>
			<div id="a4" title="주문번호">${fn:replace(orders.orderDate,'-','')}${orders.sameTimeCount}${orders.itemId}</div>
			<div id="a7" title="배송완료일">${fn:replace(orders.orderDate,'-','')}</div>
			<div id="a8" title="선물종류">${orders.optionType}</div>
			<div id="a5" title="금액">${orders.optionPrice}</div>
			<div id="a6" title="처리현황">
				<input id="a6send" type="text" value="증정" />
			</div>
			<div id="aa"></div>
		</div>
	</c:forEach>

	<div id="form">
		<a href="mngLoginForm.do">loginForm으로~</a>
	</div>
</div>