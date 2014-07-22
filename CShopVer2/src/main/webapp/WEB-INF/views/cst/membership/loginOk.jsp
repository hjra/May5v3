<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<h1>
${sessionScope.cstLogin.cstName} 고객님의 로그인을 환영합니다.
</h1>
고객님께서는 C#에서 제공되는 모든 서비스를 이용하실 수 있습니다.

	<br>
	<a href="menuList.do">MENU</a>
	<br>
	<a href="advanceOrder.do">ORDER</a>
	<br>
	<a href="about.do">ABOUT</a>
	<br>
	<a href="myPage.do">MY C#</a>