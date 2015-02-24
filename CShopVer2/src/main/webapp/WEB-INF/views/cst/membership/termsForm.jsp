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
		<div id="checkboxDiv" class="termsList">
			<div>
				<label for="allAgreement">이용약관, 개인정보 수집 및 이용, 이벤트 메일 수신약관(선택)에 모두 동의합니다.
					<input type="checkbox" name="allAgreement" id="allAgreement">
				</label>
			</div>
			<div>
				<label for="serviceAgreementCheck">C# 이용약관 동의(필수)
					<input type="checkbox" name="serviceAgreementCheck" id="serviceAgreementCheck">
				</label>
				<ul>
					<li>제 1 조(목적)</li>
					<li>이 약관은 C# 케이크 전문점(이하 “C#”)이 제공하는 서비스의 이용과 관련하여 회사와 회원과의 권리, 의무 및 책임사항, 기타 필요한 사항을 규정함을 목적으로 합니다.</li>
					<li>제 2 조(정의)</li>
				</ul>
			</div>
			<div>
				<label for="privacyAgreementCheck">개인정보 수집 및 이용에 대한 안내(필수)
					<input type="checkbox" name="privacyAgreementCheck" id="privacyAgreementCheck">
				</label>
				<ul>
					<li>정보통신망법 규정에 따라 C#에 회원가입 신청하시는 분께 수집하는 개인정보의 항목, 개인정보의 수집 및 이용목적, 개인정보의 보유 및 이용기간을 안내 드리오니...</li>
				</ul>
			</div>
			<div>
				<label for="cstEmailAgreementCheck">이벤트 E-mail 수신약관 동의(선택)
					<input type="checkbox" name="cstEmailAgreementCheck" id="cstEmailAgreementCheck">
				</label>
				<input type="hidden" name="cstEmailAgreement" id="cstEmailAgreement" value="F">
				<ul>
					<li>제 1 조(목적)</li>
					<li>이 약관은 C# 케이크 전문점(이하 ‘C#’)이 제공하는 이벤트와 관련하여 C#과 회원과의 권리, 의무 및 책임...</li>
				</ul>
			</div>
			<div class="checkbox_valid">필수 선택사항에 모두 동의해주세요.
			</div>
		</div>
		<div class="btn_area">
			<input type="submit" class="btn_agree" value="AGREE" onclick="return init.checkboxValid();">
			<input type="button" class="btn_cancel" onclick="location.href='homeImage.do'" value="CANCEL">
		</div>
		</f:form>
	</div>
</div>
</div>
<link href="resources/css/member/join.css" rel="stylesheet">
<script src="resources/script/member/checkEvent.js"></script>
<script type="text/javascript">
</script>