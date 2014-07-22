<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
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
  
 
<h1>URL QRCode 생성하기 - 미니</h1>  
<%  
    if (nCheck == 1) {  
        String qrcode = request.getContextPath() + "/resources/qrcodeimages/" + savedFileName + ".png";  
        out.print("<img src='" + qrcode + "'/><p/>");  
    }  
    else {  
        out.print("잘못된 URL 입니다.<p/>");  
    }  
%>  

<input type="button" onclick="javascript:history.back(-1)" value="다시입력"/> 
 
