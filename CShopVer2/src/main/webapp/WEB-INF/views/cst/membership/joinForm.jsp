<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="content">
<nav class="map">
	<a href="">MEMBERSHIP</a> > <a href="">JOIN</a>
</nav>
<div class="box01">
	<a href="/CShop/"><img alt="logo" src="/CShop/resources/img/membership/logo.png" class="logo"></a>
	<f:form action="joinOk.do" method="Post" commandName="customer" onkeypress="return event.keyCode!=13">
	<div id="" class="joinList">	
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
				<button type="button" name="" id="" class="btn_rows">VERIFY</button>
			</div>
			<div id="codeDiv">
				<input type="text" name="code" placeholder="CODE" class="row_text">
				<button type="button" name="" id="" class="btn_rows">CONFIRM</button>
			</div>
			<div id="add1Div">
				<div id="zipCodeDiv"></div>
				<%-- <form method="post" action="javascript:nothing()"> --%>
				<input type="text" id="scZipText" placeholder="ADDRESS" value="" class="row_text"
					onkeydown="if (event.keyCode == 13) document.getElementById('scZipBtn').click()">
				<button type="button" id="scZipBtn" class="btn_rows">SEARCH</button>
			</div>
			<div id="scZipCheck"></div>
			<div id="zipInfoDiv"></div>
			<div id="add2Div">
				<f:input path="cstDetailAddress" placeholder="ADDRESS DETAIL" />
			</div>
		</div>
		<div class="btn_area">
			<f:hidden path="cstEmailAgreement" value="${cstEmailAgreement}" />
			<input type="submit" class="btn_join" value="JOIN OK">
			<input type="reset" class="btn_reset" value="RESET">
		</div>
	</div>
	</f:form>
</div>
</div>
<link href="resources/css/member/join.css" rel="stylesheet">
<script src="resources/script/member/zipSearch.js"></script>
<script type="text/javascript"></script>