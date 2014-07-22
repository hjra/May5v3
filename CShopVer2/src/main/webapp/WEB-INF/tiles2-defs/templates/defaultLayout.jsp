<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
	<title>Welcome to C#</title>
	<!-- charset을 정의해줘야 브라우져마다 언어가 깨지는일이 줄어듭니다-->
	<meta charset="utf-8">
	<!-- ie는 기본적으로 Compatible을 정의하지 않으면 낮은 버전으로 에뮬레이션 되어 구동됩니다.  -->
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=2">
	<meta name="viewport" content="width=480" />
	
	<!-- style -->
	<link href="/CShop/resources/css/bootstrap.min.css" rel="stylesheet">
	<link href="/CShop/resources/css/bootstrap.theme.min.css" rel="stylesheet">
	<link href="/CShop/resources/css/nody.css" rel="stylesheet">
	
	<!-- default js -->
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
	
</head>
<body>
	<tiles:insertAttribute name="body" />
</body>
</html>
