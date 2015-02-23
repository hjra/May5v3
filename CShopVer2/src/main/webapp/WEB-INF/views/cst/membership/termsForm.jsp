<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<div class="content">
<nav class="map">
	<a href="">MEMBERSHIP</a> > <a href="">JOIN</a>
</nav>
<div class="box01">
	<div>
		<a href="/CShop/"><img alt="logo" src="/CShop/resources/img/membership/logo.png" class="logo"></a>
		<f:form action="joinForm.do" method="post" commandName="cstEmailAgreement">
		<div id="checkboxDiv" class="joinList">
			<div>
				<label for="allAgreement">이용약관, 개인정보 수집 및 이용, 이벤트 메일 수신약관(선택)에 모두 동의합니다.
					<input type="checkbox" name="allAgreement" id="allAgreement">
				</label>
			</div>
			<div>
				<label for="serviceAgreementCheck">C# 이용약관 동의(필수)
					<input type="checkbox" name="agreement" id="serviceAgreementCheck">
				</label>
				<ul>
					<li>제 1 조(목적)</li>
					<li>이 약관은 C# 케이크 전문점(이하 “C#”)이 제공하는 서비스의 이용과 관련하여 회사와 회원과의 권리, 의무 및 책임사항, 기타 필요한 사항을 규정함을 목적으로 합니다.</li>
					<li>제 2 조(정의)</li>
				</ul>
			</div>
			<div>
				<label for="privacyAgreementCheck">개인정보 수집 및 이용에 대한 안내(필수)
					<input type="checkbox" name="agreement" id="privacyAgreementCheck">				
				</label>
				<ul>
					<li>정보통신망법 규정에 따라 C#에 회원가입 신청하시는 분께 수집하는 개인정보의 항목, 개인정보의 수집 및 이용목적, 개인정보의 보유 및 이용기간을 안내 드리오니...</li>
				</ul>
			</div>
			<div>
				<label for="cstEmailAgreementCheck">이벤트 E-mail 수신약관 동의(선택)
					<input type="checkbox" name="agreement" id="cstEmailAgreementCheck">
				</label>
				<input type="hidden" name="cstEmailAgreement" value="F">
				<ul>
					<li>제 1 조(목적)</li>
					<li>이 약관은 C# 케이크 전문점(이하 ‘C#’)이 제공하는 이벤트와 관련하여 C#과 회원과의 권리, 의무 및 책임...</li>
				</ul>
			</div>
		</div>
		</f:form>
		<div class="btn_area">
			<button type="button" name="btn_agree" id="btn_agree">AGREE</button>
			<button type="button" name="btn_cancel" id="btn_cancel">CANCEL</button>
		</div>
	</div>
</div>
</div>
<link href="/CShop/resources/css/member/temsForm.css" rel="stylesheet">
<script type="text/javascript">
/* checkbox 전체선택, 전체해제 */
$(document).ready(function(){
	var tbl = $('#checkboxDiv');
    
    // 테이블 헤더에 있는 checkbox 클릭시
    $(':checkbox:first', tbl).click(function(){
        // 클릭한 체크박스가 체크상태인지 체크해제상태인지 판단
        if( $(this).is(':checked') ){
            $(':checkbox', tbl).prop('checked', 'checked');
            $('input:hidden[name=cstEmailAgreement]').val('T');
        }
        else{
            $(':checkbox', tbl).removeProp('checked');
            $('input:hidden[name=cstEmailAgreement]').val('F');
        }

        // 모든 체크박스에 change 이벤트 발생시키기               
        $(':checkbox', tbl).trigger('change');
    });
     
    // 헤더에 있는 체크박스외 다른 체크박스 클릭시
    $(':checkbox:not(:first)', tbl).click(function(){
        var allCnt = $(':checkbox:not(:first)', tbl).length;
        var checkedCnt = $(':checkbox:not(:first)', tbl).filter(':checked').length;
         
        // 전체 체크박스 갯수와 현재 체크된 체크박스 갯수를 비교해서 헤더에 있는 체크박스 체크할지 말지 판단
        if( allCnt==checkedCnt ){
            $(':checkbox:first', tbl).prop('checked', 'checked');
        }
        else{
            $(':checkbox:first', tbl).removeProp('checked');
        }
    }).change(function(){
        if( $(this).is(':checked') ){
            // 체크박스의 부모 > 부모 니까 tr 이 되고 tr 에 selected 라는 class 를 추가한다.
            $(this).parent().parent().addClass('selected');
        }
        else{
            $(this).parent().parent().removeClass('selected');
        }
    });
    
    // cstEmailAgreement의 hidden value 변경하기
     $('input:checkbox[name=cstEmailAgreementCheck]').click(function(){
    	if($(this).is(':checked')){
    		$('input:hidden[name=cstEmailAgreement]').val('T');
    	}else{
    		$('input:hidden[name=cstEmailAgreement]').val('F');
    	}
    }); 
});
</script>