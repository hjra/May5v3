<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<style>
.test{
margin-top: 70px
}
</style>
로그인 입력폼
<div>
	<f:form action="cstLoginProcess.do" method="Post"
		commandName="customer">
		<div class="test">
			<f:input path="cstId" placeholder="USER ID OR ORDER NUMBER" />
		</div>
		<div>
			<f:password path="cstPassword" placeholder="PASSWORD" />
		</div>
		<div>${errMsg}</div>
		<input type="submit" value="SIGN UP">
		<div>
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

