<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="true"%>
<link href="/CShop/resources/css/member/loginok.css" rel="stylesheet">
<div class="useroption">
	<div class="useroptiona">
		<div class="useroptionb">
			<div class="optiona">C# MEMBER</div>
			<div class="abn"></div>

			<div class="user">${sessionScope.cstLogin.cstName} 고객님의 로그인을
				환영합니다.</div>
			<div class="allservice">C#에서 제공되는 모든 서비스를 이용하실 수 있습니다.</div>
			<div class="menu">
				<a href="menuList.do"  class="ased" style="font-weight:bold">MENU</a>
				<a href="advanceOrder.do" class="ased" style="font-weight:bold">ORDER</a>
				<a href="about.do" class="ased" style="font-weight:bold">ABOUT</a>
				<a href="myPage.do" class="ased" style="font-weight:bold">MY C#</a>
			</div>
		</div>
	</div>
</div>
