<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
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
<div class="useroption">
<div class="useroptiona">
<div class="useroptionb">
<div class="optiona">회원가입 동의</div>
			<div class="abn"></div>
			<div class="aba"></div> 
			<div class="abs"></div>
			<div class="abc"></div>
	<div>
	<f:form action="joinForm.do" method="post" commandName="cstEmailAgreement">
		<div id="checkboxDiv">
			<div>
				이용약관, 개인정보 수집 및 이용,
				이벤트 메일 수신약관(선택)에 모두 동의합니다.
				<input id="allAgreement" type="checkbox" >
			</div>
			<div>
				이용약관 동의(필수)<input name="serviceAgreementCheck" type="checkbox" id="agreement">
			</div>
			<div>
				개인정보 수집 및 이용에 대한 안내(필수)<input name="privacyAgreementCheck" type="checkbox" id="agreement">
			</div>
			<div>
				이벤트 E-mail 수신약관 동의(선택)<input name="cstEmailAgreementCheck" type="checkbox" id="agreement">
				<input name="cstEmailAgreement" type="hidden" value="F">
			</div>
		</div>
		<input type="submit" value="AGREE" class="ased" style="font-weight:bold" >
	</f:form>
	<div class="asdd"><a href="homeImage.do" class="aseda" style="font-weight:bold">CANCEL</a></div>
	</div>
</div>
</div>
</div>