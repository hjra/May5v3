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
	<div id="alimi">알리미 수정 중이에요~</div>
	<div id="forma">
		<f:form action="levelCodeSearch.do" method="post">
			<select name="dcategory">
				<option value="levelCode">고객등급</option>
				<option value="orderNumber">주문번호</option>
				<option value="cstId">고객아이디</option>
			</select>
			<input id="alimisearch" type="text" name="searchText">
			<input id="alimibutton" type="submit" value="Search"/>
		</f:form>
	</div>
 	<div id="listname"><div id="l1">번호</div>
						<div id="l2">고객등급</div>
						<div id="l3">회원아이디</div>
						<div id="l4">주문번호</div>
						<div id="l7">확인</div>
						<div id="l8">이미지</div>
						<div id="l5">메세지</div>
						<div id="l6">전송</div>
	</div>

<!-- /////////////////////////////// -->


	<c:choose>
		<c:when test="${sessionScope.mngLogin.mngId == null }">
			<td><input type="text" maxlength="300" style="width: 300px"
				placeholder="의견을 등록하시려면 먼저 로그인을 해주세요" readonly></td>
		</c:when>
		<c:otherwise>
			<td><input type="text" id="noticeComment"
				name="noticeComment" maxlength="300" style="width: 300px"
				placeholder="의견을 140자 이내로 적어주세요"></td>
		</c:otherwise>
	</c:choose>
	
	
	<div>${sessionScope.mngLogin.mngId}</div>

	<div align="center"><input type="submit" id="ok" value="등록"
		${sessionScope.mngLogin.mngId == null?" disabled":"" }></div>



	<c:choose>
		<c:when test="${sessionScope.mngLogin.mngId == null }">

		</c:when>

		<c:otherwise>
			<td></td>
		</c:otherwise>
	</c:choose>


	<!-- /////////////////////////////// -->
<c:forEach var="orders" varStatus="status" items="${alimilist}">
<form action="mailProcNotice.do" method="POST">
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
			<div id="a7" title="확인">확인</div>
			<div id="a8" title="이미지">이미지</div>
			<div id="a5" title="메세지">
				<input type="hidden" name="orderCode" value="${orders.orderCode}">
				<input type="text" name="description" value="${orders.noticeComment}">
				<input type="hidden" name="cstId" value="${orders.cstId }">
			</div>
			<div id="a6" title="보내기버튼">
			<input id="a6send"  type="submit" value="메일전송" >
			</div>	
			<div id="aa"></div>
		</div>
</form>
	</c:forEach>
<!-- /////////////////////////////// -->

<table>
	<tr>
		<td colspan="6" align="center"><c:if test="${page <= 1 }">[이전]&nbsp; </c:if>
			<c:if test="${page > 1 }">
				<a href="menuInfo.do?itemId=${cstId }&page=${page-1}">이전</a>&nbsp;</c:if>
			<c:forEach begin="${startpage }" end="${endpage }" var="a">
				<c:if test="${a==page }">[${a}]</c:if>
				<c:if test="${a!=page }">
					<a href="menuInfo.do?cstId=${cstId }&page=${a}">[${a}]</a>&nbsp;</c:if>
			</c:forEach> <c:if test="${page>=maxpage }">[다음]</c:if> <c:if
				test="${page<maxpage }">
				<a href="menuInfo.do?cstId=${cstId }&page=${page+1}">[다음]</a>
			</c:if></td>
	</tr>
</table>



	<!-- /////////////////////////////// -->



	<div id="form">
		<a href="mngLoginForm.do">loginForm으로~</a>
	</div>
</div>