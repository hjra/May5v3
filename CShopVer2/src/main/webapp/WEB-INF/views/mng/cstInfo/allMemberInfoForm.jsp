<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link rel="stylesheet" type="text/css" href="http://w2ui.com/src/w2ui-1.4.min.css" />
<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
<script type="text/javascript" src="http://w2ui.com/src/w2ui-1.4.min.js"></script>
<script src="resources/script/cstInfo.js"></script>
<script type="text/javascript"></script>

총 회원 ${count}명 O: 비회원, C: 일반회원, V: VIP, B: 관심고객<br>
<div id="gridAllCstInfo" style="width: 100%; height: 780px; overflow: hidden;"></div>

