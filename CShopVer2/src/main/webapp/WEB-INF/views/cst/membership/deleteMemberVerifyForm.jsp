<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ page session="true" %>
	회원탈퇴 인증폼
	<br>
	<f:form action="deleteMemberProcess.do" method="Post">
		<input type="submit" value="확인">
	</f:form>
