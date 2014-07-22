<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<header id="master-header">
	<div class="header-heading">
		<div class="header-heading-title">
                  <div class="folder">
                      <span class="glyphicon glyphicon-list"></span>
                  </div><!-- inline-fix
            --><div class="brand">
                      C# 관리자페이지
                  </div>
			<div class="location">Home &gt; 대시보드</div>
		</div>
		<div class="header-heading-commands">
            <div class="info">
                <div class="messege"><a href="/CShop/homeImage.do">홈페이지</a></div>
                <div class="logout"><a href="mngLogoutProcess.do">로그아웃</a></div>
            </div>
		</div>
	</div>
</header>
