<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="/CShop/resources/css/orderReceiver.css" rel="stylesheet">

<div class="useroption">
<div class="useroptiona">
<div class="useroptionb">
<div class="optiona">ADVANCE ORDER</div>
			<div class="abn"></div>
			<div class="aba"></div>  
			<div class="abs">*는 필수입력 항목입니다</div>
			<div class="abc">수령인정보</div>

<f:form action="advanceOrderPayment.do" method="post" commandName="orders" onkeypress="return event.keyCode!=13">
	<div class="od"> 
		<div class="odDlvInfoYn">
			<span><label for="dlvinfoyn"><strong>*</strong>배송 여부</label></span>
			<span>
				<input type="radio" value="dn" name="dlvinfoyn" onclick="div_OnOff5(this.value,'dn');" checked="checked"/>직접수령
				<input type="radio" value="dy" name="dlvinfoyn" onclick="div_OnOff5(this.value,'dy');"/>배송(2500원)
			</span>
		</div>
	</div>
	<div id="dy" style="display: none;">
	<div class="od">
		<c:choose>
			<c:when test="${sessionScope.cstLogin.cstId == null }">
				<div class="odName">
					<div class="name"><label for="receiverName">*이름</label></div>
					<div class="namee"><input type="text" name="receiverName" placeholder="ex)홍명보" /></div>
				</div>
			</c:when> 
			<c:otherwise>
				<div class="orinfoyn">
					<label for="orinfoyn"><strong>*</strong>기존정보 사용여부</label>
					<input type="radio" value="uy" name="receive"   checked="checked" 
								onclick="location.href='cstExistingInfo.do?cstId=${sessionScope.cstLogin.cstId}'"/>기존정보사용
						<input type="radio" value="un" name="receive"  />새로입력
				</div>
				<div class="odName">
					<span><label for="name"><strong>*</strong>이름</label></span>
					<span><input type="text" id="receiverName" placeholder="ex)홍명보"  value="${cstExistingInfo.cstName}"/></span>
				</div>
			</c:otherwise>
		</c:choose>
	</div>
	<div class="od">
		<div class="odCp">
			<span><label for="receiverCP"><strong>*</strong>휴대전화번호</label></span>
			<span><input type="tel" id="receiverCP" name="receiverCP" placeholder="ex)01098765432" value="${cstExistingInfo.cstCP}"/></span>
		</div>
	</div>
	<div class="od">
		<div class="odEmail">
			<span><label for="receiverEmail">이메일</label></span>
			<span><input type="email" id="receiverEmail" name="receiverEmail" placeholder="ex)id@domain.com" value="${cstExistingInfo.cstEmail}"/></span>
		</div>
	</div>
	
	
	<div class="od">
		<c:choose>
			<c:when test="${sessionScope.cstLogin.cstId == null }">
			<div class="odAddress">
				<span><label for="address"><strong>*</strong>주소</label></span>
				<div id="zipCodeDiv"></div>
					<input type="text" id="scZipText" placeholder="ADDRESS" value="" class="row_text"
							onkeydown="if (event.keyCode == 13) document.getElementById('scZipBtn').click()">
					<input type="button" id="scZipBtn" value="SEARCH">
				<div id="scZipCheck"></div>
				<div id="zipInfoDiv" style="width: 100%; height: 100px; overflow: auto; display: none;">
					<table id="zipInfoTable"></table>
				</div>
			</div>
			<div class="odDetailAddress">
				<span><label for="detailAddress"><strong>*</strong>상세주소</label></span>
				<span><f:input path="orderDetailAddress" placeholder="ADDRESS DETAIL" /></span>
			</div>
			</c:when>
			<c:otherwise>
				<span><label for="address"><strong>*</strong>주소</label></span>
				<span>
					<input type="text" style="width: 500px" id="address"  
								value="${cstExistingInfo.sido } ${cstExistingInfo.sigungu } ${cstExistingInfo.dongubmyon } 
									${cstExistingInfo.dong } ${cstExistingInfo.li } ${cstExistingInfo.doromyong } 
									${cstExistingInfo.buildingNum1 }-${cstExistingInfo.buildingNum2 } ${cstExistingInfo.sigunguBuildingName } 
									${cstExistingInfo.cstDetailAddress }"/>
				</span>
			</c:otherwise>
		</c:choose>
	</div>
	</div>
	
	<div class="od">
		<div class="odDlvWarn">
			<span><label for="dlvwarn">배송시 주의사항</label></span>
			<span><input type="text" id="dlvwarn" name="dlvwarn"/></span>
		</div>
	</div>
	<div id="dn" style="display: block;">
	<div class="od">
		<c:choose>
			<c:when test="${sessionScope.cstLogin.cstId == null }">
				<div class="odName">
					<span class="name"><label for="receiverName"><strong>*</strong>이름</label></span>
					<span><input type="text" name="receiverName" placeholder="ex)홍명보" /></span>
				</div>
			</c:when>
			<c:otherwise>
				<div class="orinfoyn">
					<span><label for="orinfoyn"><strong>*</strong>기존정보 사용여부</label></span>
					<span>
						<input type="radio" value="uy" name="receive"  checked="checked" 
								onclick="location.href='cstExistingInfo.do?cstId=${sessionScope.cstLogin.cstId}'"/>기존정보사용
						<input type="radio" value="un" name="receive"  />새로입력
					</span>
				</div>
				<div class="odName">
					<span><label for="name"><strong>*</strong>이름</label></span>
					<span><input type="text" id="receiverName" placeholder="ex)홍명보"  value="${cstExistingInfo.cstName}"/></span>
				</div>
			</c:otherwise>
		</c:choose>
	</div>
	
	<div class="od">
		<div class="odCp"> 
			<span class="nameaa"><label for="receiverCP">*휴대전화번호</label></span>
			<span><input type="tel" id="receiverCP" name="receiverCP" placeholder="ex)01098765432"  value="${cstExistingInfo.cstCP}"/></span>
		</div>
	</div>
	<div class="od">
		<div class="odEmail">
			<span class="nameab"><label for="receiverEmail">이메일</label></span>
			<span><input type="email" id="receiverEmail" name="receiverEmail" placeholder="ex)id@domain.com" value="${cstExistingInfo.cstEmail}"/></span>
		</div>
	</div>  
	</div>
	<div class="adf">
			<input type="reset" value="재입력" class="ased" style="font-weight:bold" />
			<input type="button" onclick="javascript:history.back(-1)" value="이전" class="aseda" style="font-weight:bold"/>
			<input type="submit" value="다음" class="aseda" style="font-weight:bold"/>
	</div>
		<input type="hidden" value="${orders.orderAmount }" name="orderAmount">
		<input type="hidden" value="${orders.optionCode }" name="optionCode">
		<input type="hidden" value="${orders.cardMessage }" name="cardMessage">
		<input type="hidden" value="${orders.itemId }" name="itemId">
		<input type="hidden" value="${orders.url }" name="url">
</f:form>

</div>
</div>
</div>


<script src="resources/script/advanceOrder.js"></script>
<script type="text/javascript"></script>
