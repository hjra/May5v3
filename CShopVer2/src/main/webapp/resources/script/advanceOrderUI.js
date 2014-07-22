$(document).ready(function() {
	$(function(){
		var cbox = $('#cream')[0];

		$('#creamImg').click(function() {
		    cbox.checked = !cbox.checked;
		    this.src = (cbox.checked)?
		    		"/CShop/resources/img/cake/CreamC.png"
		    		:"/CShop/resources/img/cake/CreamF.png";
			});	
	});	
	
	$(".dragTop").mobiledraganddrop({
		targets : "#dropTop, #itemBasket",
		status : "#status"
	});
	$("#btnChoice").click(function() {
		$('#choiceItem').html('');
		$('#choiceItem2').html('');
		var sizeId = $('input:radio[name=size]:checked').attr('value');
		var creamId = $('input:checkbox[id=cream]').attr("checked")? '2':'1';
		/* alert("선택된 크기: " + sizeId+"\n선택된 크림: " + creamId); */

		var topLen = $('#dropTop > .dragTop > .dragImg').length;
		/* alert("선택된 토핑 수: " + topLen); */

		var toppingList = $.map($('#dropTop > .dragTop > .dragImg'),function(n, i) {
			return n.id;
		});
		/* alert("toppingList: " + toppingList); */
		var toppingId = toppingList.sort().join('');
		/* alert("배열 join 결과: " + toppingId); */

		/* var strId = toppingList.replace(",","");
		 alert(", 삭제 결과: "+strId); */
		/* $("<input type='text' name='itemId' value='"
			+ toppingList.sort() +"'>").insertAfter('#choiceItem'); */

		$('#choiceItem').append("<input type='hidden' name='itemId' value='"
			+ sizeId + creamId + toppingId + "'>");
		$('#choiceItem2').append("<img id='itemImage' src='/CShop/resources/img/cake/"
				+ sizeId + creamId + toppingId + "1.png'>");
	});
	
	$(function(){
	    $("#btnChoice, #modal-background, #modal-close").click(function() {
	        $("#modal-content, #modal-background").toggleClass("active");
	    });
	});
	
	
});
function setImageRadio(){
	document.getElementById('sizeL').src=
	(document.getElementsByName('size')[0].checked==true)?"/CShop/resources/img/cake/L2.png":"/CShop/resources/img/cake/L1.png";

	document.getElementById('sizeM').src=
	(document.getElementsByName('size')[1].checked==true)?"/CShop/resources/img/cake/M2.png":"/CShop/resources/img/cake/M1.png";

	document.getElementById('sizeS').src=
	(document.getElementsByName('size')[2].checked==true)?"/CShop/resources/img/cake/S2.png":"/CShop/resources/img/cake/S1.png";
}