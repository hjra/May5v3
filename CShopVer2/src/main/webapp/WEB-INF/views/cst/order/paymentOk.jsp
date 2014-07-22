<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="true"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@ page import="java.io.File, java.util.UUID" %>  
<%@ page import="java.awt.image.BufferedImage, javax.imageio.ImageIO" %>  
<%@ page import="com.google.zxing.qrcode.QRCodeWriter, com.google.zxing.common.BitMatrix, com.google.zxing.BarcodeFormat, com.google.zxing.client.j2se.MatrixToImageWriter" %>  
<%  
    String url = request.getParameter("url");  
    int nCheck = 1;  
    String savedFileName = "";  
  
    // url 확인  
    if (url == null || url.equals("") || !url.startsWith("http")) {  
        nCheck = 0;  
    }  
    else {  
        // 파일 설정  
        File path = new File(application.getRealPath("/") + "resources/img/");  
        savedFileName = UUID.randomUUID().toString().replace("-", "");  
        if (!path.exists()) path.mkdirs();  
          
        // QRCode 생성  
        QRCodeWriter writer = new QRCodeWriter();  
        BitMatrix qrCode = writer.encode(url, BarcodeFormat.QR_CODE, 200, 200);  
          
        BufferedImage qrImage = MatrixToImageWriter.toBufferedImage(qrCode);  
          
        ImageIO.write(qrImage, "PNG", new File(path, savedFileName+".png"));  
    }  
%>  


<div class="useroption">
<div class="useroptiona">
<div class="useroptionb">
<div class="optiona">ADVANCE ORDER</div>
			<div class="abn"></div>
			<div class="aba"></div>  
			<div class="abs">*는 필수입력 항목입니다</div>
			<div class="abc">완료</div>
<h1>결제완료</h1>

<f:form action="homeImage.do" method="post">
<fieldset>
<div>
	<span class=""><label for="">결제수단</label></span>
	<span>
		<c:forEach var="payKind" items="${payKind }">
			<c:if test="${payKind.payCode == orders.payCode }">
				<input type="text" name="payType" value="${payKind.payType }">
			</c:if>
		</c:forEach>
	</span>
</div>
<div>
	<span class=""><label for="">상품명</label></span>
	<span><input type="text" name="itemId" value="${orders.itemName }"></span>
</div>
<div>
	<span class=""><label for="">추가옵션</label></span>
	<span>
		<c:forEach var="optionPrice" items="${optionPrice }">
			<c:if test="${optionPrice.optionCode == orders.optionCode }">
				<input type="text" name="optionType" value="${optionPrice.optionType }">
			</c:if>
		</c:forEach>
	</span>
</div>
<c:choose>
<c:when test="${orders.optionCode == 0 }">
</c:when>
<c:otherwise>
<div>
	<span class=""><label for="">카드문구</label></span>
	<span><input type="text" value="${orders.cardMessage }"></span>
</div>
</c:otherwise>
</c:choose>
<c:choose>
<c:when test="${orders.dlvinfoyn == 'dy' }">
<div>
	<span class=""><label for="">수령인</label></span>
	<span><input type="text" value="${orders.receiverName }"></span>
</div>
<div>
	<span class=""><label for="">수령인 전화번호</label></span>
	<span><input type="text" value="${orders.receiverCP }"></span>
</div>
<div>
	<span class=""><label for="">수령인 이메일</label></span>
	<span><input type="text" value="${orders.receiverEmail }"></span>
</div>
	<span><label for="dlvwarn">배송시 주의사항</label></span>
	<span><input type="text" value="${orders.dlvwarn }"/></span>
</c:when>
</c:choose>
<div>
	<span class=""><label for="">총 결제금액</label></span>
	<span><input type="text" name="totalPrice" value="${orders.totalPrice }"></span>
</div>
<c:choose>
<c:when test="${orders.optionCode == 3 }">
<div>
	<span class=""><label for="">QR코드</label></span>
	<span>
		<%  
   		 if (nCheck == 1) {  
       		 String qrcode = request.getContextPath() + "/resources/img/" + savedFileName + ".png";  
       		 out.print("<img src='" + qrcode + "'/><p/>");  
  		 }  
   		 else {  
      		  out.print("잘못된 URL 입니다.<p/>");  
   		 }  
		%>  
	</span>
</div>
</c:when>
<c:when test="${orders.optionCode == 5 }">
<div>
	<span class=""><label for="">QR코드</label></span>
	<span>
		<%  
   		 if (nCheck == 1) {  
       		 String qrcode = request.getContextPath() + "/resources/img/" + savedFileName + ".png";  
       		 out.print("<img src='" + qrcode + "'/><p/>");  
  		 }  
   		 else {  
      		  out.print("잘못된 URL 입니다.<p/>");  
   		 }  
		%>  
	</span>
</div>	
</c:when>
<c:otherwise>
</c:otherwise>
</c:choose>

<br> 
	<input type="submit" value="주문결제완료">
	결제 시스템은 돈 주고 사서 쓰세요..
</fieldset>
</f:form>
</div>
</div>
</div>