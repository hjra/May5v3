<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>상품관리 페이지</h1>
<style>
#sticker-view {
	position:absolute;
	overflow:hidden;
	margin:0;
	padding:0;
	top:0;
	right:0;
	width:50px;
	height:50px;
	z-index:1;
}

#sticker-view li{
	list-style:none;
	background-color:#753;
	color:white;
	z-index:2;
	position:absolute;
	margin:0;
	padding:0;
	width:50px;
	height:50px;
	text-align:center;
	line-height:50px;
	font-size: x-small;
}

</style>
<script>
	$(document)
	.on("click","#deleteItemForSelected",function(){
		if(confirm("삭제하시겠습니까?")){
			$("#deleteForm").submit();
		}
	})
	.on("click","#insertNewItem",function(){
		location.href="menuInsertMng.do";
	});
</script>

<div class="row-fluid text-right">
	<button id="deleteItemForSelected" class="btn btn-primary">선택삭제</button>
	<button id="insertNewItem" class="btn btn-primary">상품등록</button>
</div>

<div class="clearfix"></div>
<div class="row-fluid">
	<form id="deleteForm" method="post" action="menuItemDelete.do">
		<c:forEach var="list" items="${collection}" varStatus="status">
			<ul class="menu-list">
				<li class="cake title">
					<c:choose>
						<c:when test="${status.index == 0}">
							<label>SMALL</label>						
						</c:when>
						<c:when test="${status.index == 1}">
							<label>MIDIUM</label>						
						</c:when>
						<c:when test="${status.index == 2}">
							<label>BIG</label>						
						</c:when>
						<c:otherwise>
							<label>ETC</label>
						</c:otherwise>
			</c:choose>
				</li>
				<c:forEach var="item" items="${list}">
					<li class="cake">
						<img onclick="location.href='menuModifyMng.do?itemId=${item.itemId}'" src="/CShop/resources/img/cake/${item.itemId}1.png" alt="대표이미지" style="width: 170px; margin: 10px">
						<%-- <a href="menuModifyMng.do?itemId=${item.itemId}">${item.itemName}</a> --%>
						<c:choose>
						
							<c:when test="${item.sticker == 1}"><div id="sticker-view"><ul id="sticker-view-display"><li data-value="1">BEST</li></ul></div></c:when>
							<c:when test="${item.sticker == 2}"><div id="sticker-view"><ul id="sticker-view-display"><li data-value="2">SPECIAL</li></ul></div></c:when>
							<c:when test="${item.sticker == 3}"><div id="sticker-view"><ul id="sticker-view-display"><li data-value="3">SALE</li></ul></div></c:when>
						
						</c:choose>
						<footer>
							<label>
								<input type="checkbox" name="deleteItem" value="${item.itemId }" /> 
								<span>${item.itemName}</span>
							</label>
						</footer>	
			 		</li>
				</c:forEach>
			</ul>
		</c:forEach>
	</form>
	<img id="imgid" src="${pageContext.request.contextPath}/resources/newImage/${fileName}" />
	
</div>	
