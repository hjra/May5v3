<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ page session="true" %>
<link href="/CShop/resources/css/homeimage.css" rel="stylesheet">
<header>
	<nav>
		<div class="chome content"> 

			<div class="home">
				<div class="mainicon">

					<div class="icona"><img src="/CShop/resources/img/main/bbb.png" width="78px" height="65px"></div>
					<div class="iconb"><img src="/CShop/resources/img/main/bbs.png" width="78px" height="65px"></div>
					<div class="iconc"><img src="/CShop/resources/img/main/bgg.png" width="78px" height="65px"></div>

					<div class="icond"><img src="/CShop/resources/img/main/bgs.png" width="78px" height="65px"></div>
					<div class="icone"><img src="/CShop/resources/img/main/ggb.png" width="78px" height="65px"></div>
					<div class="iconf"><img src="/CShop/resources/img/main/ggg.png" width="78px" height="65px"></div>

					<div class="icong"><img src="/CShop/resources/img/main/ggs.png" width="78px" height="65px"></div>
					<div class="iconh"><img src="/CShop/resources/img/main/sgs.png" width="78px" height="65px"></div>
					<div class="iconi"><img src="/CShop/resources/img/main/sss.png" width="78px" height="65px"></div>
 
				</div>
  
				<div class="m">
					<div>THE FRUIT CAKE STORE</div> 
					<div>CONBINATION OF FRUIT CAKE</div>
					<div class="ma">MADE IN KOREA - BIT C# PROJECT</div>
					<div id="aaa"><a href=".menu">
						<div class="icons"></div>
						<div class="homemenu"></div></a>
					</div>
				</div>

			</div>
		</div>
		<div class="menu">
			<div class="menua">
				<a href="menuList.do">MENU</a>
			</div>
		</div>
		<div class="order">
			<div class="ordera">
				<a href="advanceOrder.do">ORDER</a>
			</div>
			<div class="orderb">
				<a href="orderList.do">ORDERSEARCH</a>
			</div>


		</div>
		<div class="about">
			<div class="abouta">ABOUT</div>

		</div>
	</nav>
</header>

<script>
	//fixed main layout
	$(function() {
		$("main").css({
			"padding-left" : 0,
			"padding-right" : 0
		});
	});
	
	$('nav a').click(function(event) {
		  var id = $(this).attr("href");
		  var offset = 70;
		  var target = $(id).offset().top - offset;
		  $('html, body').animate({
		    scrollTop: target
		  }, 500);
		  event.preventDefault();
		});


</script>
