<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<style>
li.stt {
	display: inline-block;
	width: 400px;
	height: 400px;
	border: 1px solid #ddd;
}
</style>
일일현황
<br>
<ul>
<li class="stt"><a href="orderReport.do">판매분석</a><br>
주문수량 :: ${getOrderCount}
케익수량 :: ${getCakeCount}
</li>

<li class="stt"><a href="menuReport.do">메뉴분석</a><br>
${getDailyCountForMenu}
</li>
</ul>
<ul>
<li class="stt">
<input  type="IMAGE" name="Button" value="Button"
onclick="location.href='salesReport.do'"
							src="/CShop/resources/img/button/money.png">
<a href="salesReport.do">매출분석</a><br>
</li>

<li class="stt"><a href="memberReport.do">고객분석</a><br>
${getCustomerResCount}
</li>
</ul>
