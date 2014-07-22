<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>


<img src="/CShop/resources/img/cake/${anItem.itemId}1.png" alt="대표이미지" style="width: 300px">



<form action="commentProc.do" method="post">
<label> 아이템 아이디<input id="itemId" name="itemId"		value="${anItem.itemId}"></label> <br>
<label> 아이템 이름 <input name="itemName"		value="${anItem.itemName}"></label> <br> 
<label> 아이템 가격 <input name="itemPrice" value="${anItem.price}"></label> <br>
<label> 아이템 인포 <input name="itemInfo" value="${anItem.itemInfo }"></label> <br>
<br>
<img id="imgid" src="${pageContext.request.contextPath}/resources/newImage/${fileName}" />
<input type="hidden" name="cstCode" value="${sessionScope.cstLogin.cstCode}">
	<%
		int i = 0;
	%>
	<table class="table table-bordered">
		<tr>
			<td colspan="6">평점 및 댓글</td>
		</tr>
		<tr>
			<td width="66px">번호</td>
			<td width="100px"><label>평점</label> 
				<select name="grade" id="grade">
					<option value="5">★★★★★</option>
					<option value="4">★★★★☆</option>
					<option value="3">★★★☆☆</option>
					<option value="2">★★☆☆☆</option>
					<option value="1">★☆☆☆☆</option>
				</select></td>
			
			<c:choose>
				<c:when test="${sessionScope.cstLogin.cstId == null }">
				<td><input type="text" maxlength="300" style="width: 300px"
				placeholder="의견을 등록하시려면 먼저 로그인을 해주세요" readonly></td>
				</c:when>
				<c:otherwise>
			<td>
			<input type="text" id="evaluationContents" name="evaluationContents" maxlength="300" style="width: 300px"
				placeholder="의견을 140자 이내로 적어주세요"></td>
				</c:otherwise>
				</c:choose>
			<td>${sessionScope.cstLogin.cstId}</td>
			
			<td align="center">
			
					<input type="submit" id="ok" value="등록"${sessionScope.cstLogin.cstId == null?" disabled":"" }></td>
			
			<c:choose>
				<c:when test="${sessionScope.cstLogin.cstId == null }">
					<!-- <td width="100px" align="center">
					<a href="loginProc.do" class="classname">로긴</a></td> -->
				</c:when>
				<c:otherwise>
					<td width="40px">삭제
				</td>
				</c:otherwise>
			</c:choose>
			
		</tr>

		<c:forEach var="board" items="${evaluationList}">
			<%
				i++;
			%>
			<tr height="35px">
				<td align="center">${board.evaluationIndex}</td>
				<td align="center"><c:choose>
						<c:when test="${board.grade ==5}">
						★★★★★
			</c:when>
						<c:when test="${board.grade ==4}">
						★★★★☆
			</c:when>
						<c:when test="${board.grade ==3}">
						★★★☆☆
			</c:when>
						<c:when test="${board.grade ==2}">
						★★☆☆☆
			</c:when>
						<c:when test="${board.grade ==1}">
						★☆☆☆☆
			</c:when>
					</c:choose></td>
				<td>${board.evaluationContents }</td>
				<td>${board.cstId}</td>
				
				<td align="center">
				<fmt:formatDate value="${board.evaluationDate }" pattern="yyyy-MM-dd" />
				
			
			 <c:choose>
				<c:when test="${sessionScope.cstLogin.cstId == null }">

				</c:when>
				<c:when test="${sessionScope.cstLogin.cstCode == board.cstCode }">
				<td align="center"><a href="evaluationDelete.do?evaluationIndex=${board.evaluationIndex}&itemId=${anItem.itemId}">X</a>
				</td>
				</c:when>
				<c:otherwise>
				<td></td>
				</c:otherwise>
			</c:choose>
			</tr>

		</c:forEach>

		<tr>
			<td colspan="6" align="center"><c:if test="${page <= 1 }">[이전]&nbsp; </c:if>
				<c:if test="${page > 1 }">
					<a href="menuInfo.do?itemId=${itemId }&page=${page-1}">이전</a>&nbsp;</c:if>
					 <c:forEach begin="${startpage }" end="${endpage }" var="a">
					<c:if test="${a==page }">[${a}]</c:if>
					<c:if test="${a!=page }">
						<a href="menuInfo.do?itemId=${itemId }&page=${a}">[${a}]</a>&nbsp;</c:if>
				</c:forEach> <c:if test="${page>=maxpage }">[다음]</c:if> <c:if
					test="${page<maxpage }">
					<a href="menuInfo.do?itemId=${itemId }&page=${page+1}">[다음]</a>
				</c:if></td>
		</tr>


	</table>
</form>
