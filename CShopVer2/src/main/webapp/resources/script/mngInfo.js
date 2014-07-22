$(function () {
	$.ajax({
		type	: "POST",
		url		: "allMngInfoJson.do",
		data	: "",
		dataType: "json",
		error: function(){
	        alert("데이터 로드 실패");},
	    success : function(result){
	    	$.each(result, function(key){
	    		var j = result[key];
	    		var myRecords = [];
	    		var count = 0;
	    		for(var i in j){
	    			myRecords.push({
	    				recid : count++,
	    				mngId : j[i].mngId,
	    				mngPassword : j[i].mngPassword = (typeof j[i].mngPassword == "undefined") ? '': j[i].mngPassword,
	    				mngRank : j[i].mngRank = (typeof j[i].mngRank == "undefined") ? '': j[i].mngRank,
						mngName : j[i].mngName = (typeof j[i].mngName == "undefined") ? '': j[i].mngName,
						mngCP : j[i].mngCP = (typeof j[i].mngCP == "undefined") ? '': j[i].mngCP,
						mngPhone : j[i].mngPhone = (typeof j[i].mngPhone == "undefined") ? '': j[i].mngPhone,
						mngEmail : j[i].mngEmail = (typeof j[i].mngEmail == "undefined") ? '': j[i].mngEmail,
						mngAddress : j[i].mngAddress = (typeof j[i].mngAddress == "undefined") ? '': j[i].mngAddress,
						mngEditPermission : j[i].mngEditPermission = (typeof j[i].mngEditPermission == "undefined") ? '': j[i].mngEditPermission,
						sttPermission : j[i].sttPermission = (typeof j[i].sttPermission == "undefined") ? '': j[i].sttPermission,
						mngInfoPermission : j[i].mngInfoPermission = (typeof j[i].mngInfoPermission == "undefined") ? '': j[i].mngInfoPermission,
						boardAccessPermission : j[i].boardAccessPermission = (typeof j[i].boardAccessPermission == "undefined") ? '': j[i].boardAccessPermission,
						cstInfoPermission : j[i].cstInfoPermission = (typeof j[i].cstInfoPermission == "undefined") ? '': j[i].cstInfoPermission,
						orderInfoPermission : j[i].orderInfoPermission = (typeof j[i].orderInfoPermission == "undefined") ? '': j[i].orderInfoPermission,
						dlvInfoPermission : j[i].dlvInfoPermission = (typeof j[i].dlvInfoPermission == "undefined") ? '': j[i].dlvInfoPermission,
						itemInfoPermission : j[i].itemInfoPermission = (typeof j[i].itemInfoPermission == "undefined") ? '': j[i].itemInfoPermission,
						mngImgPath : j[i].mngImgPath = (typeof j[i].mngImgPath == "undefined") ? '': j[i].mngImgPath
									
	    			});
	    		}
	    		$('#gridAllMngInfo').w2grid({
	    			name : 'grid',
	    			header : '직 원 정 보',
	    			columns: [
	    			 { field: 'mngId', caption: '아이디', size: '70px', resizable: true, sortable: true, editable: { type: 'text' } },
				     { field: 'mngName', caption: '이름', size: '50px', resizable: true, sortable: true },
				     { field: 'mngRank', caption: '등급', size: '30px', resizable: true, sortable: true },
				     { field: 'mngCP', caption: '휴대폰', size: '100px', resizable: true, sortable: true },
				     { field: 'mngPhone', caption: '전화번호', size: '100px', resizable: true, sortable: true },
				     { field: 'mngEmail', caption: 'E-mail', size: '120px', resizable: true, sortable: true },
				     { field: 'mngAddress', caption: '주소', size: '180px', resizable: true, sortable: true },
				     { field: 'mngEditPermission', caption: '직원<br>설정', size: '50px', resizable: true, sortable: true },
				     { field: 'sttPermission', caption: '통계<br>열람', size: '50px', resizable: true, sortable: true },
				     { field: 'mngInfoPermission', caption: '직원<br>열람', size: '50px', resizable: true, sortable: true },
				     { field: 'boardAccessPermission', caption: '게시판<br>열람', size: '50px', resizable: true, sortable: true },
				     { field: 'cstInfoPermission', caption: '고객<br>열람', size: '50px', resizable: true, sortable: true },
				     { field: 'orderInfoPermission', caption: '주문<br>열람', size: '50px', resizable: true, sortable: true },
				     { field: 'dlvInfoPermission', caption: '배송<br>열람', size: '50px', resizable: true, sortable: true },
				     { field: 'itemInfoPermission', caption: '상품<br>열람', size: '50px', resizable: true, sortable: true }
				           
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
	                 { type: 'text', field: 'mngId', caption: '아이디' },
	                 { type: 'text', field: 'mngName', caption: '이름' },
	                 { type: 'text', field: 'mngRank', caption: '등급' }
	                ],
	                onExpand: function (event) {
	                 $('#'+event.box_id).html('<div style="padding: 10px"> 아이디: '
	                		 +j[event.recid].mngId+'<br> 이름: '
	                		 +j[event.recid].mngName+'<br> 등급: '
	                   		 +j[event.recid].mngRank
	                   		 +'</div>').animate({ 'height': 160 }, 50);
	                }
	    		});
			});
		}
	});  
});
