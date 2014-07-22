<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="true"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="/CShop/resources/css/advanceOrderPayment.css" rel="stylesheet">
<div class="useroption">
<div class="useroptiona">
<div class="useroptionb">
<div class="optiona">ADVANCE ORDER</div>
			<div class="abn"></div>
			<div class="aba"></div>  
			<div class="abs">결제정보</div>
			<div class="abc">결제방법선택</div>

	<h1></h1>
	<f:form method="post" action="payment.do" commandName="orders">
	<fieldset>
	
	<!-- html 시작 -->
	일반결제 :
	<c:forEach var="payKinds" items="${payKind }" >
		<input type="radio" name="payCode" value="${payKinds.payCode }" 
			onclick="div_OnOff(this.value,'${payKinds.payCode }');">${payKinds.payType }
				
	</c:forEach>
	<div id="1" style="display: block">
		카드구분 : 
		<c:forEach var="cardSections" items="${cardSection }" >
			<input type="radio" name="cardSectionType" value="${cardSections.cardSectionType }" 
				onclick="div_OnOff2(this.value,'${cardSections.cardSectionType }');">${cardSections.cardSectionType }
		</c:forEach>
		
		<div id="개인카드" style="display: block">카드종류 : 
			<select name="cardName" id="selectBox"  title="cardKind">
				<c:forEach var="cardKinds" items="${cardKind }">
					<option value="${cardKinds.cardName}">${cardKinds.cardName}</option>
				</c:forEach>
 			</select>
 			
 			<br>할부기간 : 
 			<select id="selectBox" name="installmentTerm" title="installment" >
 				<c:forEach var="term" items="${installment }">
 					<option value="${term.installmentTerm }">${term.installmentTerm }</option>
 				</c:forEach>
 			</select>
 			<br>주문자동의 : <input id="allAgreement" type="checkbox" >전체동의<br>
 							<input name="serviceAgreement" type="checkbox" id="agreement">결제정보 수집 및 제공 동의하기<br>
							<input name="privacyAgreement" type="checkbox" id="agreement">개인정보 제3자 제공 동의하기<br>
							<input name="payAgreement" type="checkbox" id="agreement">위 상품의 판매정보를 명확히 확인하였으며 구매진행에 동의합니다
		</div>
		
		<div id="법인카드" style="display: none">카드종류 : 
			<select id="selectBox" name="cardName" title="cardKind">
				<c:forEach var="cardKinds" items="${cardKind }">
					<option value="${cardKinds.cardName}">${cardKinds.cardName}</option>
				</c:forEach>
 			</select>
 			<br>할부기간 : 
 			<select id="selectBox" name="installmentTerm" title="installment" >
 				<c:forEach var="term" items="${installment }">
 					<option value="${term.installmentTerm }">${term.installmentTerm }</option>
 				</c:forEach>
 			</select>

 			<br>주문자동의 : <input id="allAgreement1" type="checkbox" >전체동의<br>
 							<input name="serviceAgreement1" type="checkbox" id="agreement1">결제정보 수집 및 제공 동의하기<br>
							<input name="privacyAgreement1" type="checkbox" id="agreement1">개인정보 제3자 제공 동의하기<br>
							<input name="payAgreement1" type="checkbox" id="agreement1">위 상품의 판매정보를 명확히 확인하였으며 구매진행에 동의합니다
		</div>
	</div>
	<div id="2" style="display: none">
		
		현금영수증 :
		<c:forEach var="cashReceiptRequestInfoSaves" items="${cashReceiptRequestInfoSave }">
			<input type="radio" name="saveType" value="${cashReceiptRequestInfoSaves.saveType }" 
				onclick="div_OnOff3(this.value,'${cashReceiptRequestInfoSaves.saveType }');">${cashReceiptRequestInfoSaves.saveType }
		</c:forEach>
		
			<div id="신청 및 저장" style="display: block">
				공제용도 : 
				<c:forEach var="deductions" items="${deduction }" varStatus="status" begin="1">
					<input type="radio" name="deductionName" value="${deductions.deductionName }" 
						onclick="div_OnOff4(this.value,'${deductions.deductionName }');">${deductions.deductionName }
				</c:forEach>
				
				<div id="개인소득공제용" style="display: block">신청수단 : 
					<select id="selectBoxValue" name="wayType" title="cashReceiptRequestWay" >
						<c:forEach var="requestWay" items="${cashReceiptRequestWay }" varStatus="status" begin="1" end="3">
							<option value="${requestWay.wayType }">${requestWay.wayType }</option>
						</c:forEach>
					</select>
					<div id="inputSelect"></div>
				</div>
				<div id="사업자증빙용" style="display: none" >신청수단 : 
					<select id="selectBoxValue" name="wayType" title="cashReceiptRequestWay" >
						<c:forEach var="requestWay" items="${cashReceiptRequestWay }" varStatus="status" begin="1" end="4">
							<c:if test="${status.index!=2 }">		
							  <option value="${requestWay.wayType }">${requestWay.wayType }</option>
							</c:if>
						</c:forEach>
					</select>
					<div id="inputSelect1"></div>
				</div>
				
			</div>
			<div id="신청" style="display: none">
				공제용도 : 
				<c:forEach var="deductions" items="${deduction }" varStatus="status" begin="1">
					<input type="radio" name="deductionName" value="${deductions.deductionName }" 
						onclick="div_OnOff4(this.value,'${deductions.deductionName }');">${deductions.deductionName }
				</c:forEach>
				
				<div id="개인소득공제용" style="display: block">신청수단 : 
					<select id="selectBoxValue" name="wayType" title="cashReceiptRequestWay" >
						<c:forEach var="requestWay" items="${cashReceiptRequestWay }" varStatus="status" begin="1" end="3">
							<option value="${requestWay.wayType }">${requestWay.wayType }</option>
						</c:forEach>
					</select>
					<div id="inputSelect"></div>
				</div>
				<div id="사업자증빙용" style="display: none" >신청수단 : 
					<select id="selectBoxValue" name="wayType" title="cashReceiptRequestWay" >
						<c:forEach var="requestWay" items="${cashReceiptRequestWay }" varStatus="status" begin="1" end="4">
						
							<c:if test="${status.index!=2 }">		
							  <option value="${requestWay.wayType }">${requestWay.wayType }</option>
							</c:if>
						</c:forEach>
					</select>
					<div id="inputSelect1"></div>
				</div>
			</div>
			
			<div id="해당사항 없음" style="display: none">
				
			</div>
			<br>주문자동의 : <input id="allAgreement2" type="checkbox" >전체동의<br>
 							<input name="serviceAgreement2" type="checkbox" id="agreement2">결제정보 수집 및 제공 동의하기<br>
							<input name="privacyAgreement2" type="checkbox" id="agreement2">개인정보 제3자 제공 동의하기<br>
							<input name="payAgreement2" type="checkbox" id="agreement2">위 상품의 판매정보를 명확히 확인하였으며 구매진행에 동의합니다
	</div>
		
	<div id="3" style="display: none">
		휴대폰 결제안내 : 휴대폰 결제는 통신사에 따라 결제 한도 금액이 다릅니다.<br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		휴대폰 결제의 경우 가입하신 이동통신사에서 증빙을 발급 받을 수 있습니다.<br>
		<br>주문자동의 : <input id="allAgreement3" type="checkbox" >전체동의<br>
 							<input name="serviceAgreement3" type="checkbox" id="agreement3">결제정보 수집 및 제공 동의하기<br>
							<input name="privacyAgreement3" type="checkbox" id="agreement3">개인정보 제3자 제공 동의하기<br>
							<input name="payAgreement3" type="checkbox" id="agreement3">위 상품의 판매정보를 명확히 확인하였으며 구매진행에 동의합니다
	</div>
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
		<p>
			<input type="reset" value="재입력" class="ased" style="font-weight:bold"/>
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