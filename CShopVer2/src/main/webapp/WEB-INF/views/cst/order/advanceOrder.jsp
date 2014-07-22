<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="true"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="/CShop/resources/css/advanceOrderUI.css" rel="stylesheet">
<script type="text/javascript" src="resources/js/jquery.min.js"></script>
<script type="text/javascript" src="resources/js/jquery.mobiledragdrop.js"></script>
<script type="text/javascript" src="resources/script/advanceOrderUI.js"></script>
<script type="text/javascript"></script>



<div id="modal-background"></div>
<div id="modal-content">
	<f:form action="orderDetail.do" method="post">
		<div id="choiceItem"></div>
		<div id="choiceItem2"></div>
		
		<br/>
		<input type="submit" value="주문하기"><input type="button" value="돌아가기" id="modal-close">
	</f:form>
	
</div>

<div class="row-fluid">
	<div class="col-xs-12">
		<input type="button" value="선택한 케익  보기" id="btnChoice">
	</div>
</div>


<div class="clearfix"></div>
<br>
<div id="how">
	<div class="row-fluid">
		<div class="col-sm-12">
			<div class="sizeRadio">
				<input type="radio" name="size" style="display:none" value="S">
				<input type="radio" name="size" style="display:none" value="M">
				<input type="radio" name="size" style="display:none" value="L">

				<img src="/CShop/resources/img/cake/L1.png" id="sizeL" class="sizeImgRadio"
				onClick="document.getElementsByName('size')[0].checked=true; setImageRadio();" alt="큰 케익">
				<img src="/CShop/resources/img/cake/M1.png" id="sizeM" class="sizeImgRadio"
				onClick="document.getElementsByName('size')[1].checked=true; setImageRadio();" alt="중간 케익">
				<img src="/CShop/resources/img/cake/S1.png" id="sizeS" class="sizeImgRadio"
				onClick="document.getElementsByName('size')[2].checked=true; setImageRadio();" alt="작은 케익">
				
				<div class="creamCheck">
					<img id="creamImg" src = "/CShop/resources/img/cake/CreamF.png" />
					<input type="checkbox" id="cream" style="visibility:hidden;"/>
				</div>
			</div>
		</div>
	</div>
	<div class="row-fluid">
		<div class="col-sm-6">
			<div class="drop" id="dropTop"></div>
		</div>
		<div class="col-sm-6">
			<br>
			<div id="itemBasket">
				<div class="dragTop" id="s1">
					<img id="S" class="dragImg" usemap="#mapS.png"
						src="/CShop/resources/img/cake/TopS.png">
				</div>
				<div class="dragTop" id="b1">
					<img id="B" class="dragImg" usemap="#mapB.png"
						src="/CShop/resources/img/cake/TopB.png">
				</div>
				<div class="dragTop" id="g1">
					<img id="G" class="dragImg" usemap="#mapG.png"
						src="/CShop/resources/img/cake/TopG.png">
				</div>
				<div class="dragTop" id="s2">
					<img id="S" class="dragImg" usemap="#mapS.png"
						src="/CShop/resources/img/cake/TopS.png">
				</div>
				<div class="dragTop" id="b2">
					<img id="B" class="dragImg" usemap="#mapB.png"
						src="/CShop/resources/img/cake/TopB.png">
				</div>
				<div class="dragTop" id="g2">
					<img id="G" class="dragImg" usemap="#mapG.png"
						src="/CShop/resources/img/cake/TopG.png">
				</div>
				<div class="dragTop" id="s3">
					<img id="S" class="dragImg" usemap="#mapS.png"
						src="/CShop/resources/img/cake/TopS.png">
				</div>
				<div class="dragTop" id="b3">
					<img id="B" class="dragImg" usemap="#mapB.png"
						src="/CShop/resources/img/cake/TopB.png">
				</div>
				<div class="dragTop" id="g3">
					<img id="G" class="dragImg" usemap="#mapG.png"
						src="/CShop/resources/img/cake/TopG.png">
				</div>
			</div>
		</div>
	</div>
</div>



<map name="mapS.png"><area shape="circle" coords="280,280,280" href="" target="" alt="딸기" /></map>
<map name="mapB.png"><area shape="circle" coords="280,280,280" href="" target="" alt="바나나" /></map>
<map name="mapG.png"><area shape="circle" coords="280,280,280" href="" target="" alt="포도" /></map>
<map name="mapC.png"><area shape="circle" coords="280,280,280" href="" target="" alt="초코크림" /></map>
<map name="mapF.png"><area shape="circle" coords="280,280,280" href="" target="" alt="생크림" /></map>






