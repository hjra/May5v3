<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	알리미
	<br>
	<f:form action="orderList.do" method="post">
		<select name="dcategory">
			<option value="sall">모두</option>
			<option value="sorderCode">주문번호</option>
			<option value="sorderDate">주문일자</option>
			<option value="sitemName">상품명</option>
		</select>
		<input type="text" name="orderDate" value="cstId">
		<input type="submit" value="조회" />
	</f:form>
