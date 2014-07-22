<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="true"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="/CShop/resources/css/payment.css" rel="stylesheet">
<%@ page import="java.util.*, java.text.*"  %>
<%
 java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
 String today = formatter.format(new java.util.Date());
%>
<div class="useroption">
<div class="useroptiona">
<div class="useroptionb">
<div class="optiona">ADVANCE ORDER</div>
			<div class="abn"></div>
			<div class="aba">결제</div> 
			<div class="abs"></div>
			<div class="abc"></div>



<f:form action="paymentOk.do" method="post" commandName="orders">
<fieldset>
<c:choose>
	<c:when test="${orders.payCode == 1}">
	<div class="payTypez">
	<div class="abcz">신용카드..</div>
		<div class="pTq">
			<span class="nameq"><label for="">주문상품</label></span>
			<span>
				<c:forEach var="itemId" items="${itemId }">
					<c:if test="${itemId.itemId == orders.itemId }">
						<input type="text" value="${itemId.itemName }" name="itemName">
					</c:if>
				</c:forEach>
			</span>
		</div>
		<div class="pTq">
			<span class="nameq"><label for="">상품금액</label></span>
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
		<div class="pTq">
			<span class="nameq"><label for="">할부기간</label></span>
			<span>
				<select id="selectBox" name="installmentTerm" title="installment" >
 					<c:forEach var="term" items="${installment }">
 						<option value="${term.installmentTerm }">${term.installmentTerm }</option>
 					</c:forEach>
 				</select>
 			</span>
		</div>
		<div class="pqq">
			<span class="namqq"><label for="">ISP저장매체 선택</label></span>
			</div>
			<div class="pqqaa">
				<input type="radio" value="" id="isp" name="isp">PC
				<input type="radio" value="" id="isp" name="isp">휴대폰
				<input type="radio" value="" id="isp" name="isp">이동식 디스크
				<input type="radio" value="" id="isp" name="isp">IC카드
		</div>
		<div class="pqqa">
			<span class="namqqa"><label for="">ISP비밀번호</label></span>
			<span><input type="password" name="" ></span>
		</div>
		</div>
	</c:when>
	<c:when test="${orders.payCode == 2}">
<div class="payTypea">
	<div class="abcc">계좌이체..</div>
		<div class="pTa">
			<span class="name"><label for="">주문상품</label></span>
			<span>
				<c:forEach var="itemId" items="${itemId }">
					<c:if test="${itemId.itemId == orders.itemId }">
						<input type="text" value="${itemId.itemName }" name="itemName">
					</c:if>
				</c:forEach>
			</span>
		</div>
		<div class="pTa">
			<span class="name"><label for="">상품금액</label></span>
			<span>
				<c:forEach var="itemId" items="${itemId }">
					<c:if test="${itemId.itemId == orders.itemId }">
						<c:forEach var="optionPrice" items="${optionPrice }">
							<c:if test="${optionPrice.optionCode == orders.optionCode }">
								<input type="text" value="${itemId.price*orders.orderAmount + 

optionPrice.optionPrice }" name="totalPrice">
							</c:if>
						</c:forEach>
					</c:if>
				</c:forEach>
			</span>
		</div>
		<div class="pTa">
			<span class="name"><label for="">계좌번호</label></span>
			<span><input type="text" name="" placeholder="ex)908070605040"> </span><!-- ('-'없이) -->
		</div>
		<div class="pTd">
			<span class="nameac"><label for="">계좌비밀번호</label></span>
			<span><input type="password" name=""> </span><!-- 4자리 -->
		</div>
		<div class="pTee">
			<span class="nameas"><label for="">주민번호</label></span>
			<span><input type="text" name="" placeholder="6자리"> - <input type="text" name="" placeholder="7자리"></span>
		</div>
		</div>
	</c:when>
	<c:when test="${orders.payCode == 3}">
	<div class="useroptionba">
	<div class="payTypeb">
	<div class="abcq">휴대폰 소액결제</div>
		<div class="paa">
			<span class="nvme"><label for="">주문상품</label></span>
			<span>
				<c:forEach var="itemId" items="${itemId }">
					<c:if test="${itemId.itemId == orders.itemId }">
						<input type="text" value="${itemId.itemName }" name="itemName">
					</c:if>
				</c:forEach>
			</span>
		</div>
		<div class="paa">
			<span class="nvme"><label for="">결제금액</label></span>
			<span>
				<c:forEach var="itemId" items="${itemId }">
					<c:if test="${itemId.itemId == orders.itemId }">
						<c:forEach var="optionPrice" items="${optionPrice }">
							<c:if test="${optionPrice.optionCode == orders.optionCode }">
								<input type="text" value="${itemId.price*orders.orderAmount + 

optionPrice.optionPrice }" name="totalPrice">
							</c:if>
						</c:forEach>
					</c:if>
				</c:forEach>
			</span>
		</div>
		<div class="paa">
			<span class="nvme"><label for="">결제일시</label></span>
			<div class="nvmea"><%out.print(today); %></div>
		</div>
		<div class="pad">
			<span class="nameacw"><label for="">이동통신사</label></span>
			<span class="nameaca">
				<c:forEach var="telecoms" items="${telecoms }">
					<input type="radio" value="${telecoms.telecomCode }">${telecoms.telecomName }
				</c:forEach>
			</span>
		</div>
		<div class="paee">
			<span class="nameacw"><label for="">휴대폰번호</label></span>
			<span><input type="tel" name="" placeholder="ex)01098765432"></span>
		</div>
		<div class="paae">
			<span class="nvmee"><label for="">주민번호</label></span>
			<span><input type="text" name="" placeholder="6자리"> - <input type="text" name="" placeholder="7자리"></span>
		</div>
		<div class="paeee">
			<span class="nameass"><label for="">결제알림이메일</label></span>
			<span><input type="email" name="" placeholder="ex)id@domain.com"></span>
		</div>
		</div>
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
		<input type="reset" value="재입력"  class="ased" style="font-weight:bold" />
		<input type="button" onclick="javascript:history.back(-1)" value="이전" class="aseda" style="font-weight:bold"/>
		<input type="submit" value="다음" class="aseda" style="font-weight:bold"/>
	</p>
</fieldset>
</f:form>
</div>
</div>
</div>


<script type="text/javascript"></script>
<script src="resources/script/advanceOrder.js"></script>