<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<script type="text/javascript">
	function dispTab(selectTab) {
		var obj1 = document.getElementById("scIdPhoneDiv");
		var obj2 = document.getElementById("scIdEmailDiv");
		if (selectTab == "0") {
			obj1.style.display = "block";
			obj2.style.display = "none";
			alert(obj.style.display);
		} else {
			obj1.style.display = "none";
			obj2.style.display = "block";
		}
	}
</script>
<h1>SEARCH ID</h1>
아이디 찾는 방법을 선택해 주세요.<br>
<f:form action="scIdProcess.do" method="post" commandName="customer">
	<div class="boxDiv">
		<input type="radio" name="scInfo" id="scIdPhone" onclick="dispTab('0');" checked>
		 회원정보에 등록한 휴대폰으로 인증하기
		<div id="scIdPhoneDiv" style="display: block">
			<div><f:input path="cstName" placeholder="USER NAME"/></div>
			<div><f:input path="cstCP" placeholder="MOBILE PHONE"/></div>
			<div>인증번호 받기-버튼</div>
			<div>인증번호 받기-텍스트필드</div>
		</div>
		<hr>
		<input type="radio" name="scInfo" id="scIdEmail" onclick="dispTab('1');"> 
		회원정보에 등록한 E-mail로 인증하기
		<div id="scIdEmailDiv" style="display: none">
			<div><f:input path="cstName" placeholder="USER NAME"/></div>
			<div><f:input path="cstEmail" placeholder="E-MAIL"/></div>
			<div>인증번호 받기-버튼</div>
			<div>인증번호 받기-텍스트필드</div>
		</div>
	</div>
	<br>
	<input type="submit" value="ID 찾기">
</f:form>
<br><br>
<h1>SEARCH PASSWORD</h1>
비밀번호를 찾고자 하는 아이디를 입력해 주세요.<br>
<f:form action="scPasswordProcess.do" method="post" commandName="customer">
	<f:input path="cstId" placeholder="USER ID"/>
	<input type="submit" value="PW 찾기">
</f:form>