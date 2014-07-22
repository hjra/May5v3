/*주문자동의ChechBox*/
$(document).ready(function(){
	$('#allAgreement').click(function(){
		if($("#allAgreement").is(":checked")){
			$('input:checkbox[id^=agreement]:not(checked)').prop("checked", true);
		} else{
			$('input:checkbox[id^=agreement]:checked').prop("checked", false);
		}
	});
	
	$('#allAgreement1').click(function(){
		if($("#allAgreement1").is(":checked")){
			$('input:checkbox[id^=agreement1]:not(checked)').prop("checked", true);
		} else{
			$('input:checkbox[id^=agreement1]:checked').prop("checked", false);
		}
	});
	
	$('#allAgreement2').click(function(){
		if($("#allAgreement2").is(":checked")){
			$('input:checkbox[id^=agreement2]:not(checked)').prop("checked", true);
		} else{
			$('input:checkbox[id^=agreement2]:checked').prop("checked", false);
		}
	});
	
	$('#allAgreement3').click(function(){
		if($("#allAgreement3").is(":checked")){
			$('input:checkbox[id^=agreement3]:not(checked)').prop("checked", true);
		} else{
			$('input:checkbox[id^=agreement3]:checked').prop("checked", false);
		}
	});
/*주문자동의ChechBox끝*/
	
/*현금영수증수단*/
	$('#selectBoxValue').click(function(){
		$('#inputSelect').empty();
		if($('#selectBoxValue').val() == "0"){
			var input = '<input type="text" val="" placeholder="휴대폰번호를 입력하세요.">';
			$('#inputSelect').append(input);	
		}else if($('#selectBoxValue').val() == "1"){
			var input = '<input type="text" val="" placeholder="현금영수증카드번호를 입력하세요.">';
			$('#inputSelect').append(input);
		}else{
			var input = '<input type="text" val="" placeholder="주민등록번호를 입력하세요.">';
			$('#inputSelect').append(input);	
		}
		
	});
	
	$('#selectBoxValue1').click(function(){
		$('#inputSelect1').empty();
		if($('#selectBoxValue1').val() == "0"){
			var input = '<input type="text" val="" placeholder="휴대폰번호를 입력하세요.">';
			$('#inputSelect1').append(input);	
		}else if($('#selectBoxValue1').val() == "1"){
			var input = '<input type="text" val="" placeholder="현금영수증카드번호를 입력하세요.">';
			$('#inputSelect1').append(input);
		}else{
			var input = '<input type="text" val="" placeholder="사업자등록번호를 입력하세요.">';
			$('#inputSelect1').append(input);	
		}
		
	});
	
});
/*현금영수증수단끝*/



/*결제방법선택*/
	//라디오 버튼 value 값 조건 비교

// 일반결제
function div_OnOff(v, id) {
	if (v == "1") { // 신용카드
		document.getElementById("2").style.display = "none"; // 숨김
		document.getElementById("3").style.display = "none"; // 숨김
		document.getElementById("1").style.display = ""; // 보여줌
	} else if (v == "2") { // 계좌이체
		document.getElementById("1").style.display = "none"; // 숨김
		document.getElementById("3").style.display = "none"; // 숨김
		document.getElementById("2").style.display = ""; // 보여줌
	} else { // 휴대폰 소액결제
		document.getElementById("1").style.display = "none"; // 숨김
		document.getElementById("2").style.display = "none"; // 숨김
		document.getElementById("3").style.display = ""; // 보여줌
	}
}

// 카드구분
function div_OnOff2(v2, id) {
	if (v2 == "개인카드") { // 개인카드
		document.getElementById("법인카드").style.display = "none"; // 숨김
		document.getElementById("개인카드").style.display = ""; // 보여줌
	} else { // 법인카드
		document.getElementById("개인카드").style.display = "none"; // 숨김
		document.getElementById("법인카드").style.display = ""; // 보여줌
	}
}

function div_OnOff3(v3, id) {
	if (v3 == "신청 및 저장") { // 현금영수증 신청 및 저장
		document.getElementById("신청").style.display = "none"; // 숨김
		document.getElementById("해당사항 없음").style.display = "none"; // 숨김
		document.getElementById("신청 및 저장").style.display = ""; // 보여줌
	} else if(v3 == "신청"){ // 현금영수증 신청
		document.getElementById("신청 및 저장").style.display = "none"; // 숨김
		document.getElementById("해당사항 없음").style.display = "none"; // 숨김
		document.getElementById("신청").style.display = ""; // 보여줌
	} else { // 해당사항 없음
		document.getElementById("신청 및 저장").style.display = "none"; // 숨김
		document.getElementById("신청").style.display = "none"; // 숨김
		document.getElementById("해당사항 없음").style.display = ""; // 보여줌
	}
}

function div_OnOff4(v4, id) {
	if (v4 == "개인소득공제용") { // 개인소득공제용
		document.getElementById("사업자증빙용").style.display = "none"; // 숨김
		document.getElementById("개인소득공제용").style.display = ""; // 보여줌
	} else { // 사업자증빙용
		document.getElementById("개인소득공제용").style.display = "none"; // 숨김
		document.getElementById("사업자증빙용").style.display = ""; // 보여줌
	}
}
/*결제방법선택끝*/


function div_OnOff5(v5, id) {
	if (v5 == "dy") { // 배송
		document.getElementById("dn").style.display = "none"; // 숨김
		document.getElementById("dy").style.display = ""; // 보여줌
	} else { // 직접수령
		document.getElementById("dy").style.display = "none"; // 숨김
		document.getElementById("dn").style.display = ""; // 보여줌
	}
}


/*주소찾기(도로명주소)*/
$(document).ready(function() {
	
	//ADDRESS 텍스트 클릭 시 초기화
	$('#scZipText').dblclick(function(){
		$('input:text[id=scZipText]').val('');
	});
	
	//우편정보 가져오기
	$('#scZipBtn').click(function() {

		if ($('#scZipText').val() == '') {
			$('#scZipCheck').html("<font color=red size='2px' style='font-weight:bold'> 도로명 주소를 입력해 주세요. </font>");
		} else {
			$.ajax({
				chche : false,
				async : false,
				type : 'POST',
				url : 'searchZipInfoList.do',
				data : 'zipKeyword=' + $('#scZipText').val(),
				dataType : 'json',
				error : function() {
					alert("Error");
				},
				success : function(json) {
				
					if(json.zip.length == 0){
						
						$('#zipInfoDiv').html("").hide();
						$('#scZipCheck').html("<font color=red size='2px' style='font-weight:bold'> 도로명 주소가 없습니다</font>");
	
					}else{
						
						$('#zipInfoDiv').html("").show();
						$('#scZipCheck').html("").hide();
						for(var idx=0; idx<json.zip.length; idx++){
							var zipCodej = json.zip[idx].zipCode;
							var zipKeywordj = json.zip[idx].zipKeyword;
							var dongj = json.zip[idx].dong;
							var jibunNum1j = json.zip[idx].jibunNum1;
							var jibunNum2j = json.zip[idx].jibunNum2;
							//var zipcodeX = '<input type="hidden" id="zipcodeX" name="zipcode" value="'+zipCodej+'">';
							$('#zipInfoDiv').append('<a><input type="hidden" id="zipCode" name="zipCode" value="'+zipCodej+'">'
									+ zipKeywordj + " (" + dongj + jibunNum1j + "-" + jibunNum2j + ")" +'</a><br/>');
							//$('#zipInfoDiv').append(zipcodeX);
						};
							
							
						$('#zipInfoDiv').click(function(e){
							
						//	alert($(e.target).html());
						//	alert($('#zipCodeh').attr("value"));
							$('#zipCodeDiv').html("");
							$('input:text[id=scZipText]').val($(e.target).text());
							$('#zipCodeDiv').append($(e.target).html()).hide();	
							$('#zipInfoDiv').html("").hide();
							
						});
					}
				}
			});
		}
	});
	function nothing() {
			return;
	}
});