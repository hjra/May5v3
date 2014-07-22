$(function () {
	$.ajax({
		type	: "POST",
		url		: "blackCstInfoJsonForm.do",
		data	: "",
		dataType: "json",
		error: function(){
	        alert("데이터 로드 실패");},
		success : function(result){
	    	$.each(result, function(key){
	    		var j = result[key];
			var myRecords = [];
			for(var i in j){
				myRecords.push({
					recid : j[i].cstCode,
					cstId : j[i].cstId,
					cstName : j[i].cstName
						= (typeof j[i].cstName == "undefined") ? '': j[i].cstName,
					levelCode : j[i].levelCode
						= (typeof j[i].levelCode == "undefined") ? '': j[i].levelCode,
					cstJoinDate : j[i].cstJoinDate
						= (typeof j[i].cstJoinDate == "undefined") ? '': j[i].cstJoinDate,
					cstLastVisitDate : j[i].cstLastVisitDate
						= (typeof j[i].cstLastVisitDate == "undefined") ? '': j[i].cstLastVisitDate,
					cstPostCount : j[i].cstPostCount
						= (typeof j[i].cstPostCount == "undefined") ? '': j[i].cstPostCount,
					cstGender : j[i].cstGender
						= (typeof j[i].cstGender == "undefined") ? '': j[i].cstGender,
					cstBirthDay : j[i].cstBirthDay
						= (typeof j[i].cstBirthDay == "undefined") ? '': j[i].cstBirthDay,
					cstEmail : j[i].cstEmail
						= (typeof j[i].cstEmail == "undefined") ? '': j[i].cstEmail,
					cstCP : j[i].cstCP
						= (typeof j[i].cstCP == "undefined") ? '': j[i].cstCP,
					cstDetailAddress : j[i].cstDetailAddress
						= (typeof j[i].cstDetailAddress == "undefined") ? '': j[i].cstDetailAddress,
					cstQnAPermission : j[i].cstQnAPermission
						= (typeof j[i].cstQnAPermission == "undefined") ? '': j[i].cstQnAPermission
				});
			}
			$('#gridBlackCstInfo').w2grid({
				name : 'grid',
				columns: [
				           { field: 'cstId', caption: '아이디', size: '80px', resizable: true, sortable: true, editable: { type: 'text' } },
				           { field: 'cstName', caption: '이름', size: '80px', resizable: true, sortable: true },
				           { field: 'levelCode', caption: '회원<br>등급', size: '50px', resizable: true, sortable: true },
				           { field: 'cstJoinDate', caption: '가입일', size: '100px', resizable: true, sortable: true },
				           { field: 'cstLastVisitDate', caption: '최종방문일', size: '100px', resizable: true, sortable: true },
				           { field: 'cstPostCount', caption: '게시글<br> 수', size: '50px', resizable: true, sortable: true },
				           { field: 'cstGender', caption: '성별', size: '50px', resizable: true, sortable: true },
				           { field: 'cstBirthDay', caption: '생년월일', size: '100px', resizable: true, sortable: true },
				           { field: 'cstEmail', caption: 'E-mail', size: '100px', resizable: true, sortable: true },
				           { field: 'cstCP', caption: '전화번호', size: '100px', resizable: true, sortable: true },
				           { field: 'cstDetailAddress', caption: '주소', size: '120px', resizable: true, sortable: true },
				           { field: 'cstQnAPermission', caption: '글쓰기<br> 권한', size: '50px', resizable: true, sortable: true }
				           
				 ],
				records : myRecords,
				show: {
	                     toolbar : true,
	                     footer : true,
	                     lineNumbers : true,
	                     selectColumn: true,
	                     expandColumn: true
	                 },
	                 
	                 searches: [
	                     { type: 'text', field: 'cstId', caption: '아이디' },
	                     { type: 'text', field: 'cstName', caption: '이름' },
	                     { type: 'text', field: 'levelCode', caption: '회원등급' }
	                 ],
	                 onExpand: function (e) {
	                     $('#'+e.box_id).html('<div style="padding: 10px"> 아이디: '
	                   		  +j[e.recid].CSTID+'<br> 이름: '
	                   		  +j[e.recid].CSTNAME+'<br> 회원등급: '
	                   		  +j[e.recid].LEVELCODE+'<br> 가입일: '
	                   		  +j[e.recid].CSTJOINDATE+'<br> 최종방문일: '
	                   		  +j[e.recid].CSTLASTDATE+'<br> 게시글 수: '
	                   		  +j[e.recid].CSTPOSTCOUNT+'<br> 성별: '
	                   		  +j[e.recid].CSTGENDER+'<br> 생년월일: '
	                   		  +j[e.recid].CSTBIRTHDAY+'<br> E-mail: '
	                   		  +j[e.recid].CSTEMAIL+'<br> 전화번호: '
	                   		  +j[e.recid].CSTCP+'<br> 주소: '
	                   		  +j[e.recid].CSTDETAILADDRESS+'<br> 글쓰기 권한: '
	                   		  +j[e.recid].CSTQNAPERMISSION
	                   		  +'</div>').animate({ 'height': 160 }, 50);
	                }
			});
		});
		}
	});  
});

