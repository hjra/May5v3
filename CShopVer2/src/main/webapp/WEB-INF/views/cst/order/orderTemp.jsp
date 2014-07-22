<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<h1>URL QRCode 생성하기 - 미니</h1>  
<f:form action="qrcode.do" method="post">  
    URL 입력: <input type="text" name="url" value="" style="width: 500px" maxlength="200"/>  
    <input type="submit" value="QRCode 생성"/> 
</f:form> 
