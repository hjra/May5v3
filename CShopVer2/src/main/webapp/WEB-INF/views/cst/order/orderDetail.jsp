<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<link href="/CShop/resources/css/orderDetail.css" rel="stylesheet">
<div class="useroption">
<div class="useroptiona">
<div class="useroptionb">
<div class="optiona">ADVANCE ORDER</div>
			<div class="abn"></div>
			<div class="aba">회원수취정보</div> 
			<div class="abs">*는 필수입력 항목입니다</div>
			<div class="abc">선물하기 - 옵션</div>
<f:form action="orderReceiverInfo.do" method="post" commandName="orders">
	<fieldset>  
			<table border="1" style="" summary="옵션정보입력">
				<colgroup>
					<col style="width: 150px"/> 
					<col style="width: 370px"/> 
				</colgroup>
				<tbody> 
					<tr>
						<th scope="row"><label for="orderAmount">케이크 수량</label></th>
						<td>
							<input type="number" min="1" max="10" step="1"  name="orderAmount" required="required"  class="dfds">
						</td>
					</tr>
					<tr>
						<th scope="row"><label for=""><strong>*</strong>옵션선택</label></th>
						<td>
							<c:forEach var="optionChoose" items="${optionPrice }" end="5">
								<input type="radio" value="${optionChoose.optionCode }" name="optionCode" required="required">
									${optionChoose.optionType } ${optionChoose.optionPrice }원<br>
							</c:forEach>
						</td>
					</tr>
					<tr>
						<th scope="row"><label for="cardMessage">카드문구</label></th>
						<td>
							<input type="text" name="cardMessage" placeholder="ex)생일축하합니다" class="dfds"/>
						</td>
					</tr>
					<tr>
						<th scope="row"><label for="url">URL입력</label></th>
						<td>
							<input type="text" name="url" value="" placeholder="ex)http://www.naver.com/" style="width: 100%" maxlength="200"/>
						</td>
					</tr>
				</tbody> 
			</table>
			<div class="asdfd">
				<input type="reset" value="재 입 력" class="ased" style="font-weight:bold" />
				<input type="button" onclick="javascript:history.back(-1)" value="이전" class="aseda" style="font-weight:bold"/> 
					<c:choose>
						<c:when test="${sessionScope.cstLogin.cstId == null}">  
							<input type="hidden" value="${sessionScope.cstLogin.cstId}" name="cstId">
						</c:when>
						<c:otherwise>
							<input type="hidden" value="${sessionScope.cstLogin.cstId}" name="cstId">
						</c:otherwise>
					</c:choose>
				<input type="hidden" value="${itemId }" name="itemId">
				<input type="submit" value="다음"  class="aseda" style="font-weight:bold">
			</div>
	</fieldset>
</f:form>
</div>
</div>
</div>
