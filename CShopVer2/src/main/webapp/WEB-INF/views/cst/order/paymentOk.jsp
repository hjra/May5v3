<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="true"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<br><br><br><br>
<h1>결제완료</h1>

<f:form action="homeImage.do" method="post">
	주문 완료 되쓰요!! 완료된걸 보여줄까??
	<input type="submit" value="HOME">
</f:form>
