<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>



<style>
	#thumbnail-view {
			border:1px solid #ddd;
			height:300px;
		}
		#thumbnail-items .img-thumbnail{
			height:60px;
		}
		#info-table input[type=text],#info-table textarea{
			display:block;
			width:100%;
		}
		#info-table textarea{
			resize:none;
			height:260px;
		}
</style>
<script>
$(document).on("click","form button",function(e){
	if(!$(this).hasClass("submit-button")){
		return false;
	}
});
</script>
<script>
		$(document).on("change","#thumbnail-items input[type=file]",function(){
			//불러진 파일의 확장자를 읽어봅니다.
            if( /(\.png|\.jpeg|\.jpg|\.gif|\.bmp)$/.test($(this).val()) ){
            		//FileRender를 사용 가능한 경우
                    if (this.files && this.files[0]) {
                            var reader = new FileReader();
                            var sender = this;
                            reader.onload = function (e) {
                            	$(sender).parents(".thumbnail-item").find("img").attr('src', e.target.result);
                            	console.log("it!",$(sender).parents(".thumbnail-item"),$(sender).parents(".thumbnail-item").find("img"));
                    		}
                            reader.readAsDataURL(this.files[0]);
                    } else {
                    	//FileRender가 불가능한 경우 (대채로 IE구버전)
                    	$(this).parents(".thumbnail-item").find("img").attr('src', $(this).val());
                    }
            } else {
            	//파일 확장자가 올바르지 않은경우
            	alert("썸네일은 반드시 이미지여야 합니다.");
            	$(this).val("");
            }}
		);
</script>
<style>
#thumbnail-view{
	position:relative;
}
#sticker-view {
	position:absolute;
	overflow:hidden;
	margin:0;
	padding:0;
	top:0;
	right:0;
	width:100px;
	height:100px;
	z-index:1;
}
#sticker-view.active {
	overflow:initial;
}
#sticker-view li{
	list-style:none;
	background-color:#753;
	color:white;
	z-index:2;
	position:absolute;
	margin:0;
	padding:0;
	width:100px;
	height:100px;
	text-align:center;
	line-height:100px;
	cursor:pointer;
}
#sticker-view li:hover {
	border:1px solid blue;
}
</style>
<script>
$(document).on("click","#sticker-view",function(e){
	if( $(this).is(".active") ){
		e.preventDefault();
		var target = e.target;
		if( $(target).is("li") ){
			$("#sticker-view-value").val($(target).data("value"));
			$(this).removeClass("active");
			var selectedIndex = $(this).find("ul li").index(target);
			$(this).find("ul li").each(function(index){
				$(this).css("left",( (index-selectedIndex) *100)+"px");
			});
		}
	} else {
		$(this).addClass("active");
	}
});
$(function(){
	//스티커 초기 위치를 잡아줍니다.
	$("#sticker-view-display li").each(function(index){
		$(this).css("left",100*index);
	});
});
</script>





<h1>상품등록</h1>
<hr/>

<form action="file.do" method="post" enctype="multipart/form-data">
	<div class="row">
		<div class="col-xs-6">
			
			<div id="thumbnail-view">
				
				<div id="sticker-view">
					<ul id="sticker-view-display">
						<li data-value="0">없음</li>
						<li data-value="1">BEST</li>
						<li data-value="2">SPECIAL</li>
						<li data-value="3">SALE</li>
					</ul>
					<input id="sticker-view-value" name="STICKER" type="hidden" value="0" />
				</div>
				이미지
			</div>
			<br/>
			<div id="thumbnail-items" class="row">
				<div class="thumbnail-item col-xs-2">
					<img class="img-thumbnail full-width">
				</div>
				<div class="thumbnail-item col-xs-2">
					<img class="img-thumbnail full-width">
					<label class="full-width">
						<input type="file" name="ITEMIMG2" class="hidden" />
						<span class="btn btn-default btn-sm full-width">찾기</span>
					</label>
				</div>
				<div class="thumbnail-item col-xs-2">
					<img class="img-thumbnail full-width">
					<label class="full-width">
						<input type="file" name="ITEMIMG3" class="hidden" />
						<span class="btn btn-default btn-sm full-width">찾기</span>
					</label>
				</div>
				<div class="thumbnail-item col-xs-2">
					<img class="img-thumbnail full-width">
					<label class="full-width">
						<input type="file" name="ITEMIMG4" class="hidden" />
						<span class="btn btn-default btn-sm full-width">찾기</span>
					</label>
				</div>
				<div class="thumbnail-item col-xs-2">
					<img class="img-thumbnail full-width">
					<label class="full-width">
						<input type="file" name="ITEMIMG5" class="hidden" />
						<span class="btn btn-default btn-sm full-width">찾기</span>
					</label>
				</div>
			</div>
		</div>
		
		<br>

<br>

	
		<div class="col-xs-6">
			<table id="info-table" class="table table-bordered">
				<tbody>
					<tr>
						<th>규격</th>
						<td>
							<label>크기
								<select name="item_size">
									<option value="x">4호</option>
								</select>
							</label>
							<label>크림
								<select name="item_cream">
									<option value="1">생크림</option>
									<option value="2">초코크림</option>
								</select>
							</label>
						</td>
					</tr>
					<tr>
						<th>토핑</th>
						<td>
							<label>토핑1
								<select name="item_fruit1">
									<option value="s">딸기</option>
									<option value="b">바나나</option>
									<option value="g">포도</option>
								</select>
							</label>
							<label>토핑2
								<select name="item_fruit2">
									<option value="s">딸기</option>
									<option value="b">바나나</option>
									<option value="g">포도</option>
								</select>
							</label>
							<label>토핑3
								<select name="item_fruit3">
									<option value="s">딸기</option>
									<option value="b">바나나</option>
									<option value="g">포도</option>
								</select>
							</label>
						</td>
					</tr>
					<tr>
						<th>제품명</th>
						<td><input name="ITEMNAME" type="text"></td>
					</tr>
					<tr>
						<th>가격</th>
						<td><input name="PRICE" type="text"></td>
					</tr>
					<tr>
						<th>칼로리</th>
						<td><input name="ITEMCALORIE" type="text"></td>
					</tr>
					<tr>
						<th>상세정보</th>
						<td><textarea name="ITEMINFO"></textarea></td>
					</tr>
				</tbody>
			</table>
			<br />
			<div class="layout">
				<div class="layout-right">
					<button class="btn btn-primary submit-button">등록</button>
				</div>
			</div>
		</div>
	</div>
</form>