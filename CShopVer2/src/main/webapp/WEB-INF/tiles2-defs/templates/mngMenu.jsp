<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<!--
	아무 element나 href를 달아주면 링크가 작동됩니다.
	href가 없을시 부모 element의 기본링크를 따라갑니다.
-->
<div id="gnb">
	<menu>
		<li>
			<div class="icon">
				<span class="glyphicon glyphicon-user"></span>
			</div>
			<div class="text">
				<dl>
					<dt href="allMemberInfoForm.do">고객정보</dt>
					<dd><a href="allMemberInfoForm.do">전체고객정보</a></dd>
					<dd><a href="vipListForm.do">VIP고객정보</a></dd>
					<dd><a href="blackListForm.do">관심고객정보</a></dd>
					<dd><a href="managerQnA.do">QnA관리</a></dd>
				</dl>
			</div>
		</li>
		<li>
			<div class="icon">
				<span class="glyphicon glyphicon-tags"></span>
			</div>
			<div class="text">
				<dl>
					<dt href="orderListMng.do">주문정보</dt>
				</dl>
			</div>
		</li>
		<li>
			<div class="icon">
				<span class="glyphicon glyphicon-gift"></span>
			</div>
			<div class="text">
				<dl>
					<dt href="menuListMng.do">상품관리</dt>
					<dd><a href="menuListMng.do">상품정보</a></dd>
					<dd><a href="menuStockMng.do">상품재고</a></dd>
				</dl>
			</div>
		</li>
		<li>
			<div class="icon">
				<span class="glyphicon glyphicon-shopping-cart"></span>
			</div>
			<div class="text">
				<dl>
					<dt href="dlvNotice.do">배송정보</dt>
					<dd><a href="dlvNotice.do">알리미</a></dd>
					<dd><a href="dlvNotice.do">선물옵션</a></dd>
				</dl>
			</div>
		</li>
		<li>
			<div class="icon">
				<span class="glyphicon glyphicon-stats"></span>
			</div>
			<div class="text">
				<dl>
					<dt href="dailyReport.do">통계</dt>
					<dd><a href="orderReport.do">판매분석</a></dd>
					<dd><a href="menuReport.do">예약분석</a></dd>
					<dd><a href="salesReport.do">매출분석</a></dd>
					<dd><a href="memberReport.do">고객분석</a></dd>
				</dl>
			</div>
		</li>
		<li>
			<div class="icon">
				<span class="glyphicon glyphicon-cog"></span>
			</div>
			<div class="text">
				<dl>
					<dt href="managerInfo.do">직원정보</dt>
				</dl>
			</div>
		</li>
		<li>
			<div class="icon">
				<span class="glyphicon glyphicon-info-sign"></span>
			</div>
			<div class="text">
				<dl>
					<dt>아이콘 참조</dt>
					<dd><a href="http://getbootstrap.com/components/">아이콘 참조 링크</a></dd>
				</dl>
			</div>
		</li>
	</menu>
</div>