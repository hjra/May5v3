<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
전체고객정보 조회 화면(JSON)
<table border="1">
	<tr>
		<th>아이디</th>
		<th>이름</th>
		<th>회원등급</th>
		<th>가입일</th>
		<th>생년월일</th>
		<th>전화번호</th>
	</tr>
	<c:forEach items="${customer}" var="customer">
		<tr>
			<td>${customer.CSTID}</td>
			<td>${customer.CSTNAME}</td>
			<td>${customer.LEVELNAME}</td>
			<td>${customer.CSTJOINDATE}</td>
			<td>${customer.CSTBIRTHDAY}</td>
			<td>${customer.CSTCP}</td>
		</tr>
	</c:forEach>
</table>