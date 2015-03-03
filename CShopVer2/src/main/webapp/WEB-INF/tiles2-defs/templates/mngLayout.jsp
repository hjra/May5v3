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
	<link href="/CShop/resources/css/admin-layout.css" rel="stylesheet">
	<link href="http://code.jquery.com/ui/1.9.2/themes/smoothness/jquery-ui.css" rel="stylesheet">
	
	<!-- default js -->
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
	<script src="/CShop/resources/js/admin.js"></script>
	
	<!-- datepicker 부분 -->
	<script type="text/javascript" src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
	<script type="text/javascript" src="jquery.ui.datepicker-ko.js"></script>
	<script type="text/javascript">
	$(function(){
		$('.date-picker').datepicker({
			dateFormat: 'yy-mm-dd',
			monthNamesShort: ['1월','2월','3월','4월','5월','6월',
			                  '7월','8월','9월','10월','11월','12월'],
			dayNamesMin: ['일','월','화','수','목','금','토'],
			changeMonth: true,
			changeYear: true,
			minDate: '-100y',
			yearRange: 'c-100:c+0',
			showButtonPanel: true,
			currentText: '오늘 날짜',
			closeText: '닫기',
			showMonthAfterYear: true,
			showOtherMonths: true,
			selectOtherMonths: false,
		});
	});
	</script>
</head>
<body>
	<tiles:insertAttribute name="header" />
	<main>
		<section class="local-side">
			<tiles:insertAttribute name="menu" />
		</section>
		<section class="local-side-contents">
			<tiles:insertAttribute name="body" />
		</section>
	</main>
</body>
</html>
