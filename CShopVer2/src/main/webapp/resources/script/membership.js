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
