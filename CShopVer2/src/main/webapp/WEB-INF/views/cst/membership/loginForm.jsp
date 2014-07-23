<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<link href="/CShop/resources/css/member/loginform.css" rel="stylesheet">
<div class="useroption">
<div class="useroptiona">
<div class="useroptionb">
<div class="optiona">LOGIN</div>
			<div class="abn"></div>
			<div class="aba"></div>  
			
<div class="ddd">
	<f:form action="cstLoginProcess.do" method="Post"
		commandName="customer">
		<div class="test">
			<f:input path="cstId" placeholder="USER ID OR ORDER NUMBER" />
		</div>
		<div class="test">
			<f:password path="cstPassword" placeholder="PASSWORD" />
		</div>
		<div>${errMsg}</div>
		<input type="submit" value="SIGN UP" class="ased" style="font-weight:bold">
		<div class="testt">
			<input name="stayLogin" type="checkbox" value="T">Stay Signed
			in
		</div>
	</f:form>
</div>
<br>
<div>
	<hr>
	<a href="scInfoForm.do">SEARCH ID / PASSWORD</a> | <a
		href="termsForm.do">JOIN</a>
</div>
</div>
</div>
</div>

