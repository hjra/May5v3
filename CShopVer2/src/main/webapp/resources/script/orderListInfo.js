$(function () {
	$.ajax({
		type	: "POST",
		url		: "orderInfoJson.do",
		data	: "",
		dataType: "json",
		error: function(){
	        alert("데이터 로드 실패");},
		success : function(result){
	    	$.each(result, function(key){
	    		var j = result[key];
		//	alert("데이터 로드 성공"+j);
			var myRecords = [];
			for(var i in j){
				myRecords.push({
					recid : j[i].orderCode,
					orderDate : j[i].orderDate,
					itemId : j[i].itemId,
					itemName : j[i].itemName
						= (typeof j[i].itemName == "undefined") ? '': j[i].itemName,
					optionType : j[i].optionType
						= (typeof j[i].optionType == "undefined") ? '': j[i].optionType,
					optionPrice : j[i].optionPrice
						= (typeof j[i].optionPrice == "undefined") ? '': j[i].optionPrice,
					payType : j[i].payType
						= (typeof j[i].payType == "undefined") ? '': j[i].payType,
					dlvCharge : j[i].dlvCharge
						= (typeof j[i].dlvCharge == "undefined") ? '': j[i].dlvCharge,
					zipCode : j[i].zipCode
						= (typeof j[i].zipCode == "undefined") ? '': j[i].zipCode,
					orderDetailAddress : j[i].orderDetailAddress
						= (typeof j[i].orderDetailAddress == "undefined") ? '': j[i].orderDetailAddress,
					receiverName : j[i].receiverName
						= (typeof j[i].receiverName == "undefined") ? '': j[i].receiverName,
					receiverCP : j[i].receiverCP
						= (typeof j[i].receiverCP == "undefined") ? '': j[i].receiverCP
				});
			}
			$('#gridOrderInfo').w2grid({
				name : 'grid',
				header : '주 문 정 보',
				columns: [
				         /*  { field: 'orderCode', caption: '번호', size: '80px', resizable: true, sortable: true, editable: { type: 'text' } },*/
				           { field: 'itemId', caption: '상품ID', size: '80px', resizable: true, sortable: true },
				           { field: 'itemName', caption: '상품명', size: '50px', resizable: true, sortable: true },
				           { field: 'optionType', caption: '옵션<br>항목', size: '100px', resizable: true, sortable: true },
				           { field: 'optionPrice', caption: '옵션가', size: '100px', resizable: true, sortable: true },
				           { field: 'payType', caption: '결제<br>수단', size: '50px', resizable: true, sortable: true },
				           { field: 'dlvCharge', caption: '배송비', size: '50px', resizable: true, sortable: true },
				           { field: 'zipCode', caption: '우편코드', size: '100px', resizable: true, sortable: true },
				           { field: 'orderDetailAddress', caption: '상세주소', size: '100px', resizable: true, sortable: true },
				           { field: 'receiverName', caption: '수령자', size: '100px', resizable: true, sortable: true },
				           { field: 'receiverCP', caption: '수령자<br>휴대폰', size: '120px', resizable: true, sortable: true }
				           
				 ],
				records : myRecords,
				show: {
						 header : true,
	                     toolbar : true,
	                     footer : true,
	                     lineNumbers : true,
	                     selectColumn: true,
	                     expandColumn: true
	                 },
	                 
	                 searches: [
	                     { type: 'text', field: 'orderCode', caption: '번호' },
	                     { type: 'text', field: 'itemId', caption: '상품ID' },
	                     { type: 'text', field: 'itemName', caption: '상품명' }
	                 ],
	                 onExpand: function (e) {
	                     $('#'+e.box_id).html('<div style="padding: 10px"> 번호: '
	                   		  +j[e.recid].orderCode+'<br> 상품ID: '
	                   		  +j[e.recid].itemId+'<br> 상품명: '
	                   		  +j[e.recid].itemName+'<br> 옵션항목: '
	                   		  +j[e.recid].optionType+'<br> 옵션가: '
	                   		  +j[e.recid].optionPrice+'<br> 결제수단: '
	                   		  +j[e.recid].payType+'<br> 배송비: '
	                   		  +j[e.recid].dlvCharge+'<br> 우편코드: '
	                   		  +j[e.recid].zipCode+'<br> 상세주소: '
	                   		  +j[e.recid].orderDetailAddress+'<br> 수령자: '
	                   		  +j[e.recid].receiverName+'<br> 수령자 휴대폰: '
	                   		  +j[e.recid].receiverCP
	                   		  +'</div>').animate({ 'height': 160 }, 50);
	                }
			});
		});
		}
	});  
});

