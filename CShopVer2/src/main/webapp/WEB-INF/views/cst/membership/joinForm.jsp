<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="/CShop/resources/css/membership.css" rel="stylesheet">

회원가입 입력폼
<br>
<f:form action="joinOk.do" method="Post" commandName="customer" onkeypress="return event.keyCode!=13">
	<div class="row_group">
		<div id="idDiv">
			<f:input path="cstId" placeholder="USER ID" id="cstId" />
		</div>
		<span id="check"></span>
		<div id="pass1Div">
			<f:password path="cstPassword" placeholder="PASSWORD" />
		</div>
		<div id="pass2Div">
			<input type="password" name="cstPassword2"
				placeholder="PASSWORD CONFIRM">
		</div>
	</div>
	<div class="row_group">
		<div id="nameDiv">
			<f:input path="cstName" placeholder="NAME"/>
		</div>
		<div id="genderDiv">
			<f:radiobutton path="cstGender" value="M" label="Man" />
			<f:radiobutton path="cstGender" value="L" label="Lady" />
		</div>
		<div id="birthDiv">
			<f:input path="cstBirthday" placeholder="BIRTH DAY" 
				class="date-picker" />
		</div>
		<div id="mailDiv">
			<f:input path="cstEmail" placeholder="E-MAIL" />
		</div>
	</div>
	<div class="row_group">
		<div id="cPDiv">
			<f:input path="cstCP" placeholder="MOBILE PHONE"  />
		</div>
		<div id="codeDiv">
			<input type="text" name="code" placeholder="CODE" class="row_text">
		</div>
		<div id="add1Div">
			<div id="zipCodeDiv"></div>
			<%-- <form method="post" action="javascript:nothing()"> --%>
				<input type="text" id="scZipText" placeholder="ADDRESS" value="" class="row_text"
					onkeydown="if (event.keyCode == 13) document.getElementById('scZipBtn').click()">
				<input type="button" id="scZipBtn" value="SEARCH">
				<div id="scZipCheck"></div>
				<div id="zipInfoDiv" style="width: 100%; height: 100px; overflow: auto; display: none;">
					<table id="zipInfoTable"></table>
				</div>
			<%-- </form> --%>
			<%-- <f:input path="zipCode" placeholder="ADDRESS"/> --%>
			<%-- 			<f:select path="zipCode">
				<c:forEach var="zip" items="${zip}">
					<option value="${zip.zipCode}">${zip.sido}&nbsp;${zip.sigungu}</option>
				</c:forEach>
			</f:select> --%>
		</div>
		<div id="add2Div">
			<f:input path="cstDetailAddress" placeholder="ADDRESS DETAIL" />
		</div>
	</div>
	<div class="row_group">
		<f:hidden path="cstEmailAgreement" value="${cstEmailAgreement}" />
		<input type="submit" value="JOIN OK">
	</div>
</f:form>
<script src="resources/script/membership.js"></script>
<script type="text/javascript"></script>