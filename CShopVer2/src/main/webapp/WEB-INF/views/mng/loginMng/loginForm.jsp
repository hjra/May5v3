<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!-- style -->
 
<link href="/CShop/resources/css/login-layout.css" rel="stylesheet">
<div class="master-wrapper">
	<f:form action="mngLoginProcess.do" method="Post" commandName="manager">
		<div class="context-login">
			<div class="header">
				<h3>C# ADMIN</h3>
			</div>
			<div class="main">
				
				<div class="text-danger">${errMsg}</div>
				
				<div class="login-input">
					<f:input path="mngId" placeholder="USER ID" />
					<img class="icon" src="resources/img/assets/admin-login-icon-id.png" alt="아이디" />	
				</div>
				
				<div class="login-input">
					<f:password path="mngPassword" placeholder="PASSWORD" />
					<img class="icon" src="resources/img/assets/admin-login-icon-password.png" alt="패스워드" />
				</div>
				
				<div class="login-checkbox">
					<label>
						<input name="stayLogin" type="checkbox" value="T">&nbsp;Stay Signed in
					</label>
				</div>
				
				<input class="button-login" type="submit" value="SIGN UP">
			</div>
			<a href="/CShop/homeImage.do">고객페이지</a>
		</div><!-- .context-login -->
		
	</f:form>
</div>
	
 
</div>