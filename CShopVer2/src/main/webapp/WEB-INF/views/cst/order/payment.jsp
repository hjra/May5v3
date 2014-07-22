<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="true"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page import="java.util.*, java.text.*"  %>
<%
 java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
 String today = formatter.format(new java.util.Date());
%>


<h1>결제결제결제</h1>

<div class="useroption">
<div class="useroptiona">
<div class="useroptionb">
<div class="optiona">ADVANCE ORDER</div>
			<div class="abn"></div>
			<div class="aba"></div>  
			<div class="abs">*는 필수입력 항목입니다</div>
			<div class="abc">결제정보</div>

<f:form action="paymentOk.do" method="post" commandName="orders">
<fieldset>
<c:choose>
	<c:when test="${orders.payCode == 1}">
	신용카드..
		<div class="">
			<span class=""><label for="">주문상품</label></span>
			<span>
				<c:forEach var="itemId" items="${itemId }">
					<c:if test="${itemId.itemId == orders.itemId }">
						<input type="text" value="${itemId.itemName }" name="itemName">
					</c:if>
				</c:forEach>
			</span>
		</div>
		<div class="">
			<span class=""><label for="">상품금액</label></span>
			<span>
				<c:forEach var="itemId" items="${itemId }">
					<c:if test="${itemId.itemId == orders.itemId }">
						<c:forEach var="optionPrice" items="${optionPrice }">
							<c:if test="${optionPrice.optionCode == orders.optionCode }">
								<input type="text" value="${itemId.price*orders.orderAmount + optionPrice.optionPrice }" name="totalPrice">
							</c:if>
						</c:forEach>
					</c:if>
				</c:forEach>
			</span>
		</div>
		<div class="">
			<span class=""><label for="">할부기간</label></span>
			<span>
				<select id="selectBox" name="installmentTerm" title="installment" >
 					<c:forEach var="term" items="${installment }">
 						<option value="${term.installmentTerm }">${term.installmentTerm }</option>
 					</c:forEach>
 				</select>
 			</span>
		</div>
		<div class="">
			<span class=""><label for="">ISP저장매체 선택</label></span>
			<span>
				<input type="radio" value="" id="isp" name="isp">PC
			</span>
			<span>
				<input type="radio" value="" id="isp" name="isp">휴대폰
			</span>
			<span>
				<input type="radio" value="" id="isp" name="isp">이동식 디스크
			</span>
			<span>
				<input type="radio" value="" id="isp" name="isp">IC카드
			</span>
		</div>
		<div class="">
			<span class=""><label for="">ISP비밀번호</label></span>
			<span><input type="password" name="" ></span>
		</div>
	</c:when>
	<c:when test="${orders.payCode == 2}">
	계좌이체..
		<div class="">
			<span class=""><label for="">주문상품</label></span>
			<span>
				<c:forEach var="itemId" items="${itemId }">
					<c:if test="${itemId.itemId == orders.itemId }">
						<input type="text" value="${itemId.itemName }" name="itemName">
					</c:if>
				</c:forEach>
			</span>
		</div>
		<div class="">
			<span class=""><label for="">상품금액</label></span>
			<span>
				<c:forEach var="itemId" items="${itemId }">
					<c:if test="${itemId.itemId == orders.itemId }">
						<c:forEach var="optionPrice" items="${optionPrice }">
							<c:if test="${optionPrice.optionCode == orders.optionCode }">
								<input type="text" value="${itemId.price*orders.orderAmount + optionPrice.optionPrice }" name="totalPrice">
							</c:if>
						</c:forEach>
					</c:if>
				</c:forEach>
			</span>
		</div>
		<div class="">
			<span class=""><label for="">계좌번호</label></span>
			<span><input type="text" name="" placeholder="ex)908070605040"> ('-'없이)</span>
		</div>
		<div class="">
			<span class=""><label for="">계좌비밀번호</label></span>
			<span><input type="password" name=""> 4자리</span>
		</div>
		<div class="">
			<span class=""><label for="">주민번호</label></span>
			<span><input type="text" name="" placeholder="6자리"> - <input type="text" name="" placeholder="7자리"></span>
		</div>
	</c:when>
	<c:when test="${orders.payCode == 3}">
	휴대폰 소액결제
		<div class="">
			<span class=""><label for="">주문상품</label></span>
			<span>
				<c:forEach var="itemId" items="${itemId }">
					<c:if test="${itemId.itemId == orders.itemId }">
						<input type="text" value="${itemId.itemName }" name="itemName">
					</c:if>
				</c:forEach>
			</span>
		</div>
		<div class="">
			<span class=""><label for="">결제금액</label></span>
			<span>
				<c:forEach var="itemId" items="${itemId }">
					<c:if test="${itemId.itemId == orders.itemId }">
						<c:forEach var="optionPrice" items="${optionPrice }">
							<c:if test="${optionPrice.optionCode == orders.optionCode }">
								<input type="text" value="${itemId.price*orders.orderAmount + optionPrice.optionPrice }" name="totalPrice">
							</c:if>
						</c:forEach>
					</c:if>
				</c:forEach>
			</span>
		</div>
		<div class="">
			<span class=""><label for="">결제일시</label></span>
			<span><%out.print(today); %></span>
		</div>
		<div class="">
			<span class=""><label for="">이동통신사</label></span>
			<span>
				<c:forEach var="telecoms" items="${telecoms }">
					<input type="radio" value="${telecoms.telecomCode }">${telecoms.telecomName }
				</c:forEach>
			</span>
		</div>
		<div class="">
			<span class=""><label for="">휴대폰번호</label></span>
			<span><input type="tel" name="" placeholder="ex)01098765432"></span>
		</div>
		<div class="">
			<span class=""><label for="">주민번호</label></span>
			<span><input type="text" name="" placeholder="6자리"> - <input type="text" name="" placeholder="7자리"></span>
		</div>
		<div class="">
			<span class=""><label for="">결제알림이메일</label></span>
			<span><input type="email" name="" placeholder="ex)id@domain.com"></span>
		</div>
	</c:when>
</c:choose>
		<input type="hidden" value="${orders.itemId }" name="itemId">
		<input type="hidden" value="${orders.orderAmount }" name="orderAmount">
		<input type="hidden" value="${orders.optionCode }" name="optionCode">
		<input type="hidden" value="${orders.cardMessage }" name="cardMessage">
		<input type="hidden" value="${orders.receiverName }" name="receiverName">
		<input type="hidden" value="${orders.receiverCP }" name="receiverCP">
		<input type="hidden" value="${orders.receiverEmail }" name="receiverEmail">
		<input type="hidden" value="${orders.orderDetailAddress }" name="orderDetailAddress">
		<input type="hidden" value="${orders.dlvinfoyn }" name="dlvinfoyn">
		<input type="hidden" value="${orders.dlvwarn }" name="dlvwarn">
		<input type="hidden" value="${orders.payCode }" name="payCode">
	<p>
		<input type="reset" value="재입력"/>
		<input type="button" onclick="javascript:history.back(-1)" value="이전"/>
		<input type="submit" value="다음"/>
	</p>
</fieldset>
</f:form>
</div>
</div>
</div>


<script type="text/javascript"></script>
<script src="resources/script/advanceOrder.js"></script>