$(function allCstInfoAjax() {
	$.ajax({
		type	: "POST",
		url		: "allMemberInfoJsonForm2.do",
		data	: "",
		dataType: "json",
		error: function(){
	        alert("데이터 로드 실패");},
		success : function(j){
			var myRecords = [];
			for(var i in j.customer){
				myRecords.push({
					recid : j.customer[i].CSTCODE,
					cstId : j.customer[i].CSTID,
					cstName : j.customer[i].CSTNAME
						= (typeof j.customer[i].CSTNAME == "undefined") ? '': j.customer[i].CSTNAME,
					levelCode : j.customer[i].LEVELCODE
						= (typeof j.customer[i].LEVELCODE == "undefined") ? '': j.customer[i].LEVELCODE,
					cstJoinDate : j.customer[i].CSTJOINDATE
						= (typeof j.customer[i].CSTJOINDATE == "undefined") ? '': j.customer[i].CSTJOINDATE,
					cstLastVisitDate : j.customer[i].CSTLASTVISITDATE
						= (typeof j.customer[i].CSTLASTVISITDATE == "undefined") ? '': j.customer[i].CSTLASTVISITDATE,
					cstPostCount : j.customer[i].CSTPOSTCOUNT
						= (typeof j.customer[i].CSTPOSTCOUNT == "undefined") ? '': j.customer[i].CSTPOSTCOUNT,
					cstGender : j.customer[i].CSTGENDER
						= (typeof j.customer[i].CSTGENDER == "undefined") ? '': j.customer[i].CSTGENDER,
					cstBirthDay : j.customer[i].CSTBIRTHDAY
						= (typeof j.customer[i].CSTBIRTHDAY == "undefined") ? '': j.customer[i].CSTBIRTHDAY,
					cstEmail : j.customer[i].CSTEMAIL
						= (typeof j.customer[i].CSTEMAIL == "undefined") ? '': j.customer[i].CSTEMAIL,
					cstCP : j.customer[i].CSTCP
						= (typeof j.customer[i].CSTCP == "undefined") ? '': j.customer[i].CSTCP,
					cstDetailAddress : j.customer[i].CSTDETAILADDRESS
						= (typeof j.customer[i].CSTDETAILADDRESS == "undefined") ? '': j.customer[i].CSTDETAILADDRESS,
					cstQnAPermission : j.customer[i].CSTQNAPERMISSION
						= (typeof j.customer[i].CSTQNAPERMISSION == "undefined") ? '': j.customer[i].CSTQNAPERMISSION
				});
			}
			$('#gridAllCstInfo').w2grid({
				name : 'grid',
				header : '고객정보',
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
						 header : true,
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
	                 onExpand: function (event) {
	                     $('#'+event.box_id).html('<div style="padding: 10px"> 아이디: '
	                   		  +j.customer[event.recid].CSTID+'<br> 이름: '
	                   		  +j.customer[event.recid].CSTNAME+'<br> 회원등급: '
	                   		  +j.customer[event.recid].LEVELCODE+'<br> 가입일: '
	                   		  +j.customer[event.recid].CSTJOINDATE+'<br> 최종방문일: '
	                   		  +j.customer[event.recid].CSTLASTDATE+'<br> 게시글 수: '
	                   		  +j.customer[event.recid].CSTPOSTCOUNT+'<br> 성별: '
	                   		  +j.customer[event.recid].CSTGENDER+'<br> 생년월일: '
	                   		  +j.customer[event.recid].CSTBIRTHDAY+'<br> E-mail: '
	                   		  +j.customer[event.recid].CSTEMAIL+'<br> 전화번호: '
	                   		  +j.customer[event.recid].CSTCP+'<br> 주소: '
	                   		  +j.customer[event.recid].CSTDETAILADDRESS+'<br> 글쓰기 권한: '
	                   		  +j.customer[event.recid].CSTQNAPERMISSION
	                   		  +'</div>').animate({ 'height': 160 }, 50);
	                }
			});
		}
	});  
});

/* 가짜 데이터 넣을 때 사용한 예제
 $(function () {
    $('#grid').w2grid({ 
        name: 'grid', 
        url: 'allMemberInfoJsonForm2.do',
                  records: [
                            { "recid": 1, "CSTID": "John", "CSTNAME": "Doe", "LEVELCODE": "jdoe@gmail.com", "JOINDATE": "4/3/2012" },
                            { "recid": 2, "CSTID": "Stuart", "CSTNAME": "Motzart", "LEVELCODE": "jdoe@gmail.com", "JOINDATE": "4/3/2012" },
                            { "recid": 3, "CSTID": "Jin", "CSTNAME": "Franson", "LEVELCODE": "jdoe@gmail.com", "JOINDATE": "4/3/2012" },
                            { "recid": 4, "CSTID": "Susan", "CSTNAME": "Ottie", "LEVELCODE": "jdoe@gmail.com", "JOINDATE": "4/3/2012" },
                            { "recid": 5, "CSTID": "Kelly", "CSTNAME": "Silver", "LEVELCODE": "jdoe@gmail.com", "JOINDATE": "4/3/2012" },
                            { "recid": 6, "CSTID": "Francis", "CSTNAME": "Gatos", "LEVELCODE": "jdoe@gmail.com", "JOINDATE": "4/3/2012" },
                            { "recid": 7, "CSTID": "Mark", "CSTNAME": "Welldo", "LEVELCODE": "jdoe@gmail.com", "JOINDATE": "4/3/2012" },
                            { "recid": 8, "CSTID": "Thomas", "CSTNAME": "Bahh", "LEVELCODE": "jdoe@gmail.com", "JOINDATE": "4/3/2012" },
                            { "recid": 9, "CSTID": "Sergei", "CSTNAME": "Rachmaninov", "LEVELCODE": "jdoe@gmail.com", "JOINDATE": "4/3/2012" }
                        
                  { "recid": 1, "CSTNAME": "조유연", "CSTJOINDATE": "2014-06-30 14: 37: 03.0", "CSTID": "aaaa5", "CSTPOSTCOUNT": 7, "CSTEMAILAGREEMENT": "T", "CSTCP": "01012341234", "ZIPCODE": "GG000001", "LEVELNAME": "VIP", "LEVELCODE": "V", "CSTCODE": 1, "CSTEVALUATIONPERMISSION": "T", "CSTLASTVISITDATE": "2014-06-30 14: 37: 03.0", "CSTGENDER": "M", "CSTPASSWORD": "********", "CSTEMAIL": "aA@naver.com", "CSTDETAILADDRESS": "1층 101호", "CSTBIRTHDAY": "1989-01-02 00: 00: 00.0", "CSTQNAPERMISSION": "T" },
                  { "recid": 2, "CSTNAME": "김알마리아", "CSTJOINDATE": "2014-06-30", "CSTID": "15515311", "CSTPOSTCOUNT": 0, "CSTEMAILAGREEMENT": "T", "CSTCP": "01012341235", "ZIPCODE": "GG000002", "LEVELNAME": "NORMAL", "LEVELCODE": "N", "CSTCODE": 2, "CSTEVALUATIONPERMISSION": "T", "CSTLASTVISITDATE": "2014-06-30 14: 37: 04.0", "CSTGENDER": "L", "CSTPASSWORD": "********", "CSTEMAIL": "gagasd12@daum.net", "CSTDETAILADDRESS": "1층 102호", "CSTBIRTHDAY": "1989-01-02 00: 00: 00.0", "CSTQNAPERMISSION": "T" },
                  { "recid": 3, "CSTNAME": "김하영", "CSTJOINDATE": "2014-06-30 14: 37: 04.0", "CSTID": "ag4shdfsh", "CSTPOSTCOUNT": 10, "CSTEMAILAGREEMENT": "T", "CSTCP": "01012341236", "ZIPCODE": "GG000003", "LEVELNAME": "BLACK", "LEVELCODE": "B", "CSTCODE": 3, "CSTEVALUATIONPERMISSION": "F", "CSTLASTVISITDATE": "2014-06-30 14: 37: 04.0", "CSTGENDER": "M", "CSTPASSWORD": "********", "CSTEMAIL": "bbbaA@naver.com", "CSTDETAILADDRESS": "1층 103호", "CSTBIRTHDAY": "1989-01-02 00: 00: 00.0", "CSTQNAPERMISSION": "F" },
                  { "recid": 4, "CSTNAME": "김동섭", "CSTJOINDATE": "2014-06-30 14: 37: 05.0", "CSTID": "aaaa8", "CSTPOSTCOUNT": 0, "CSTEMAILAGREEMENT": "T", "ZIPCODE": "NN000000", "LEVELNAME": "탈퇴", "LEVELCODE": "D", "CSTCODE": 4, "CSTEVALUATIONPERMISSION": "T", "CSTLASTVISITDATE": "2014-06-30 14: 37: 05.0", "CSTGENDER": "M", "CSTQNAPERMISSION": "T" },
                  { "recid": 5, "CSTNAME": "구글구글", "CSTJOINDATE": "2014-06-30 14: 37: 05.0", "CSTID": "ghfhj", "CSTPOSTCOUNT": 5, "CSTEMAILAGREEMENT": "F", "CSTCP": "01012341238", "ZIPCODE": "GG000005", "LEVELNAME": "BLACK", "LEVELCODE": "B", "CSTCODE": 5, "CSTEVALUATIONPERMISSION": "F", "CSTLASTVISITDATE": "2014-06-30 14: 37: 05.0", "CSTGENDER": "L", "CSTPASSWORD": "********", "CSTEMAIL": "151212@korea.kr", "CSTDETAILADDRESS": "1층 105호", "CSTBIRTHDAY": "1989-01-02 00: 00: 00.0", "CSTQNAPERMISSION": "F" },
                  { "recid": 6, "CSTNAME": "박결", "CSTJOINDATE": "2014-06-30 14: 37: 05.0", "CSTID": "aaaa10", "CSTPOSTCOUNT": 1, "CSTEMAILAGREEMENT": "F", "CSTCP": "01012341239", "ZIPCODE": "GG000006", "LEVELNAME": "NORMAL", "LEVELCODE": "N", "CSTCODE": 6, "CSTEVALUATIONPERMISSION": "T", "CSTLASTVISITDATE": "2014-06-30 14: 37: 05.0", "CSTGENDER": "L", "CSTPASSWORD": "********", "CSTEMAIL": "aA@naver.com", "CSTDETAILADDRESS": "1층 106호", "CSTBIRTHDAY": "1989-01-02 00: 00: 00.0", "CSTQNAPERMISSION": "T" },
                  { "recid": 7, "CSTNAME": "오미자", "CSTJOINDATE": "2014-06-30 14: 37: 06.0", "CSTID": "155dtfdx", "CSTPOSTCOUNT": 4, "CSTEMAILAGREEMENT": "T", "CSTCP": "01012341240", "ZIPCODE": "GG000007", "LEVELNAME": "NORMAL", "LEVELCODE": "N", "CSTCODE": 7, "CSTEVALUATIONPERMISSION": "T", "CSTLASTVISITDATE": "2014-06-30 14: 37: 06.0", "CSTGENDER": "M", "CSTPASSWORD": "********", "CSTEMAIL": "aa@naver.com", "CSTDETAILADDRESS": "1층 107호", "CSTBIRTHDAY": "1989-01-02 00: 00: 00.0", "CSTQNAPERMISSION": "T" },
                  { "recid": 8, "CSTNAME": "도려망", "CSTJOINDATE": "2014-07-10 09: 46: 54.0", "CSTID": "doromang", "CSTPOSTCOUNT": 0, "CSTEMAILAGREEMENT": "T", "CSTCP": "01012341234", "ZIPCODE": "SO008772", "LEVELNAME": "NORMAL", "LEVELCODE": "N", "CSTCODE": 24, "CSTEVALUATIONPERMISSION": "T", "CSTLASTVISITDATE": "2014-07-10 09: 46: 54.0", "CSTGENDER": "L", "CSTPASSWORD": "12341234", "CSTEMAIL": "teste01@naver.com", "CSTBIRTHDAY": "2014-07-01 00: 00: 00.0", "CSTQNAPERMISSION": "T" },
                  { "recid": 9, "CSTNAME": "홍길동", "CSTJOINDATE": "2014-06-30 21: 32: 42.0", "CSTID": "test01", "CSTPOSTCOUNT": 0, "CSTEMAILAGREEMENT": "T", "CSTCP": "12451512", "ZIPCODE": "GG319913", "LEVELNAME": "NORMAL", "LEVELCODE": "N", "CSTCODE": 9, "CSTEVALUATIONPERMISSION": "T", "CSTLASTVISITDATE": "2014-06-30 21: 32: 42.0", "CSTGENDER": "M", "CSTPASSWORD": "1", "CSTEMAIL": "teste01@naver.com", "CSTDETAILADDRESS": "2층", "CSTBIRTHDAY": "2014-06-01 00: 00: 00.0", "CSTQNAPERMISSION": "T" },
                  { "recid": 11, "CSTNAME": "리리", "CSTJOINDATE": "2014-07-03 20: 03: 05.0", "CSTID": "test03", "CSTPOSTCOUNT": 0, "CSTCP": "ㄴㅁㅇㅎ", "ZIPCODE": "GG000001", "LEVELNAME": "NORMAL", "LEVELCODE": "N", "CSTCODE": 17, "CSTEVALUATIONPERMISSION": "T", "CSTLASTVISITDATE": "2014-07-03 20: 03: 05.0", "CSTGENDER": "L", "CSTPASSWORD": 1234, "CSTEMAIL": "ㅌ츈ㅇㅎ", "CSTDETAILADDRESS": "튜ㅠ", "CSTBIRTHDAY": "2014-07-09 00: 00: 00.0", "CSTQNAPERMISSION": "T" },
                  { "recid": 12, "CSTJOINDATE": "2014-07-03 20: 22: 41.0", "CSTID": "ㅇㅇㅇㅇㅇ", "CSTPOSTCOUNT": 0, "ZIPCODE": "GG000001", "LEVELNAME": "NORMAL", "LEVELCODE": "N", "CSTCODE": 19, "CSTEVALUATIONPERMISSION": "T", "CSTLASTVISITDATE": "2014-07-03 20: 22: 41.0", "CSTGENDER": "L", "CSTPASSWORD": 1111, "CSTEMAIL": "teste01@naver.com", "CSTBIRTHDAY": "2014-07-01 00: 00: 00.0", "CSTQNAPERMISSION": "T" },
                  { "recid": 13, "CSTNAME": "1234", "CSTJOINDATE": "2014-07-04 18: 09: 08.0", "CSTID": "ㅇㅇㅇㅇㅇ", "CSTPOSTCOUNT": 0, "CSTCP": "01012341234", "ZIPCODE": "GG000001", "LEVELNAME": "NORMAL", "LEVELCODE": "N", "CSTCODE": 21, "CSTEVALUATIONPERMISSION": "T", "CSTLASTVISITDATE": "2014-07-04 18: 09: 08.0", "CSTGENDER": "L", "CSTPASSWORD": "1234", "CSTEMAIL": "teste01@naver.com", "CSTBIRTHDAY": "2014-07-04 00: 00: 00.0", "CSTQNAPERMISSION": "T" },
                  { "recid": 14, "CSTNAME": "gfdjgfdj", "CSTJOINDATE": "2014-07-04 18: 45: 44.0", "CSTID": "ddfhfh", "CSTPOSTCOUNT": 0, "CSTCP": "fddfdf", "ZIPCODE": "GG000001", "LEVELNAME": "NORMAL", "LEVELCODE": "N", "CSTCODE": 22, "CSTEVALUATIONPERMISSION": "T", "CSTLASTVISITDATE": "2014-07-04 18: 45: 44.0", "CSTGENDER": "L", "CSTPASSWORD": "sdhf", "CSTEMAIL": "fdffg", "CSTDETAILADDRESS": "ddd", "CSTBIRTHDAY": "2014-07-24 00: 00: 00.0", "CSTQNAPERMISSION": "T" },
                  { "recid": 15, "CSTNAME": "ㅇㅇㅇㅇ", "CSTJOINDATE": "2014-07-10 09: 39: 20.0", "CSTID": "ㅇㅇㅇㅇㅇ", "CSTPOSTCOUNT": 0, "CSTCP": "01012341234", "ZIPCODE": "GG320027", "LEVELNAME": "NORMAL", "LEVELCODE": "N", "CSTCODE": 23, "CSTEVALUATIONPERMISSION": "T", "CSTLASTVISITDATE": "2014-07-10 09: 39: 20.0", "CSTGENDER": "M", "CSTPASSWORD": "dddd", "CSTEMAIL": "teste01@naver.com", "CSTBIRTHDAY": "2014-07-14 00: 00: 00.0", "CSTQNAPERMISSION": "T" },
                  { "recid": 16, "CSTNAME": "DongsupKim", "CSTJOINDATE": "2014-07-04 11: 53: 00.0", "CSTID": "DK", "CSTPOSTCOUNT": 0, "CSTCP": "01063099443", "ZIPCODE": "GG000001", "LEVELNAME": "NORMAL", "LEVELCODE": "N", "CSTCODE": 20, "CSTEVALUATIONPERMISSION": "T", "CSTLASTVISITDATE": "2014-07-04 11: 53: 00.0", "CSTGENDER": "M", "CSTPASSWORD": "may5", "CSTEMAIL": "lovesubi84@gmail.com", "CSTDETAILADDRESS": "우리집", "CSTBIRTHDAY": "1984-06-10 00: 00: 00.0", "CSTQNAPERMISSION": "T" },
                  { "recid": 17, "CSTNAME": "Dong", "CSTJOINDATE": "2014-07-12 14: 40: 55.0", "CSTID": "dong", "CSTPOSTCOUNT": 0, "CSTEMAILAGREEMENT": "T", "CSTCP": "01015771577", "ZIPCODE": "SO332336", "LEVELNAME": "NORMAL", "LEVELCODE": "N", "CSTCODE": 26, "CSTEVALUATIONPERMISSION": "T", "CSTLASTVISITDATE": "2014-07-12 14: 40: 55.0", "CSTGENDER": "M", "CSTPASSWORD": "may5", "CSTEMAIL": "lovesubi84@naver.com", "CSTDETAILADDRESS": "304", "CSTBIRTHDAY": "1950-06-25 00: 00: 00.0", "CSTQNAPERMISSION": "T" },
                  { "recid": 18, "CSTNAME": "길동이", "CSTJOINDATE": "2014-06-30 21: 40: 22.0", "CSTID": "test02", "CSTPOSTCOUNT": 0, "CSTEMAILAGREEMENT": "T", "CSTCP": "01015150000", "ZIPCODE": "GG006514", "LEVELNAME": "NORMAL", "LEVELCODE": "N", "CSTCODE": 11, "CSTEVALUATIONPERMISSION": "T", "CSTLASTVISITDATE": "2014-06-30 21: 40: 22.0", "CSTGENDER": "L", "CSTPASSWORD": "1231230", "CSTEMAIL": "teste01@naver.com", "CSTDETAILADDRESS": "150층", "CSTBIRTHDAY": "2014-06-02 00: 00: 00.0", "CSTQNAPERMISSION": "T" },
                  { "recid": 19, "CSTNAME": "길동이", "CSTJOINDATE": "2014-06-30 21: 43: 22.0", "CSTID": "test02", "CSTPOSTCOUNT": 0, "CSTCP": "01012341234", "ZIPCODE": "GG000001", "LEVELNAME": "NORMAL", "LEVELCODE": "N", "CSTCODE": 12, "CSTEVALUATIONPERMISSION": "T", "CSTLASTVISITDATE": "2014-06-30 21: 43: 22.0", "CSTGENDER": "L", "CSTPASSWORD": "123745", "CSTEMAIL": "teste01@naver.com", "CSTBIRTHDAY": "2014-06-02 00: 00: 00.0", "CSTQNAPERMISSION": "T" },
                  { "recid": 20, "CSTNAME": "길동이", "CSTJOINDATE": "2014-06-30 21: 44: 03.0", "CSTID": "test02", "CSTPOSTCOUNT": 0, "CSTCP": "01012341234", "ZIPCODE": "GG000001", "LEVELNAME": "NORMAL", "LEVELCODE": "N", "CSTCODE": 13, "CSTEVALUATIONPERMISSION": "T", "CSTLASTVISITDATE": "2014-06-30 21: 44: 03.0", "CSTGENDER": "L", "CSTPASSWORD": "123745", "CSTEMAIL": "teste01@naver.com", "CSTBIRTHDAY": "2014-06-02 00: 00: 00.0", "CSTQNAPERMISSION": "T" },
                  { "recid": 21, "CSTNAME": "길동이", "CSTJOINDATE": "2014-06-30 21: 44: 35.0", "CSTID": "test02", "CSTPOSTCOUNT": 0, "CSTCP": "01012341234", "ZIPCODE": "GG000001", "LEVELNAME": "NORMAL", "LEVELCODE": "N", "CSTCODE": 14, "CSTEVALUATIONPERMISSION": "T", "CSTLASTVISITDATE": "2014-06-30 21: 44: 35.0", "CSTGENDER": "L", "CSTPASSWORD": "123745", "CSTEMAIL": "teste01@naver.com", "CSTBIRTHDAY": "2014-06-02 00: 00: 00.0", "CSTQNAPERMISSION": "T" },
                  { "recid": 22, "CSTNAME": "길동이", "CSTJOINDATE": "2014-06-30 21: 44: 50.0", "CSTID": "test02", "CSTPOSTCOUNT": 0, "CSTCP": "01012341234", "ZIPCODE": "GG000001", "LEVELNAME": "NORMAL", "LEVELCODE": "N", "CSTCODE": 15, "CSTEVALUATIONPERMISSION": "T", "CSTLASTVISITDATE": "2014-06-30 21: 44: 50.0", "CSTGENDER": "L", "CSTPASSWORD": "123745", "CSTEMAIL": "teste01@naver.com", "CSTBIRTHDAY": "2014-06-02 00: 00: 00.0", "CSTQNAPERMISSION": "T" },
                  { "recid": 23, "CSTNAME": "길동이", "CSTJOINDATE": "2014-06-30 21: 45: 11.0", "CSTID": "test02", "CSTPOSTCOUNT": 0, "CSTCP": "01012341234", "ZIPCODE": "GG000001", "LEVELNAME": "NORMAL", "LEVELCODE": "N", "CSTCODE": 16, "CSTEVALUATIONPERMISSION": "T", "CSTLASTVISITDATE": "2014-06-30 21: 45: 11.0", "CSTGENDER": "L", "CSTPASSWORD": "123745", "CSTEMAIL": "teste01@naver.com", "CSTBIRTHDAY": "2014-06-02 00: 00: 00.0", "CSTQNAPERMISSION": "T" },
                  { "recid": 10, "CSTNAME": "홍길동", "CSTJOINDATE": "2014-07-10 14: 20: 30.0", "CSTID": "text02", "CSTPOSTCOUNT": 0, "CSTEMAILAGREEMENT": "T", "CSTCP": "01012341234", "ZIPCODE": "SO332354", "LEVELNAME": "NORMAL", "LEVELCODE": "N", "CSTCODE": 25, "CSTEVALUATIONPERMISSION": "T", "CSTLASTVISITDATE": "2014-07-10 14: 20: 30.0", "CSTGENDER": "L", "CSTPASSWORD": "12345", "CSTEMAIL": "teste01@naver.com", "CSTBIRTHDAY": "2014-07-01 00: 00: 00.0", "CSTQNAPERMISSION": "T" }
                            
                            ],
                  show: {
                      toolbar : true,
                      footer : true,
                      lineNumbers : true,
                      selectColumn: true,
                      expandColumn: true
                  },
                  columns: [
                      { field: 'CSTID', caption: '아이디', size: '30%', resizable: true, sortable: true },
                      { field: 'CSTNAME', caption: '이름', size: '30%', resizable: true, sortable: true },
                      { field: 'LEVELCODE', caption: '회원등급', size: '40%', resizable: true, sortable: true },
                      { field: 'JOINDATE', caption: '가입일', size: '120px', resizable: true, sortable: true },
                  ],
                  searches: [
                      { type: 'text', field: 'CSTID', caption: '아이디' },
                      { type: 'text', field: 'CSTNAME', caption: '이름' },
                      { type: 'text', field: 'LEVELCODE', caption: '회원등급' }
                  ],
                  onExpand: function (event) {
                      $('#'+event.box_id).html('<div style="padding: 10px">'+event.recid+'번째 레코드에 관한 상세정보 공간입니다.</div>').animate({ 'height': 100 }, 100);
                  }
              });
          });*/