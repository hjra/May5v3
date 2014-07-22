<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>    
<%@ page session="true" %>
<html>
  <head>
	<SCRIPT language="javascript">        
	function check(){ 

  with(document.boardWriteForm){
   
  
  if(boardTitle.value.length == 0){                  
   alert("제목을 입력해 주세요!!");                       
   boardTitle.focus();                           
   return false;                             
  }                                                                                                
  if(postContents.value.length == 0){                    
   alert("내용을 입력해주세요!!");                   
   postContents.focus();                         
   return false;                           
  }
  if(postPassword.value.length !=4){              
  alert("비밀번호를 숫자 4글자로 입력해 주세요!!");              
  postPassword.focus();                            
	return false;                               
  }                              
 return  true;                	       
 }                                 
}                                           
</SCRIPT>    
                                
</HEAD>                                       
<BODY>                                        
<P>                  
                         
<FORM name="boardWriteForm" method="post" action="writeProc.do"  onsubmit="return check()">    
<CENTER>                                      
<table width="600"cellspacing="0" cellpadding="2">           
 <tr>                                        
  <td colspan="2" bgcolor="#1F4F8F" height="1"></td>  
 </tr>                                        
 <tr>                                        
  <td colspan="2" bgcolor="#DFEDFF" height="20" class="notice">&nbsp;&nbsp;<font size="2"><center>게시판 새글 쓰기</center></font></td> 
 </tr>                                       
 <tr>                                       
  <td colspan="2" bgcolor="#1F4F8F" height="1"></td>   
 </tr>                                                                                                              
 <tr>                                        
  <td width="124" align="center"  bgcolor="#f4f4f4">제 목</td>   
  <td width="494" style="padding:0 0 0 10" height="25">
  	<input type="text" name="boardTitle" size="60" maxlength="60" class="input_style2"></td>                                      
 </tr>                                        
 <tr>                             
  <td width="124" height="162" align="center" valign="top" bgcolor="#f4f4f4" style="padding-top:7px;">내 용</td>
  <td width="494" valign="top"  style="padding:5 0 5 10">    
   <textarea cols="65" rows="10" name="postContents" maxlength="2000" class="textarea_style1"></textarea>     
  </td>                                     
 </tr>                                        
 <tr>                                        
  <td width="124" align="center"  bgcolor="#f4f4f4">암 호</td>  
  <td width="494" style="padding:0 0 0 10" height="25">                   
   <input type=password name="postPassword" class="style1"><br>비밀번호를 입력해주세요.(숫자4글자)
  </td>                                       
 </tr>                                       
 <tr>                                       
  <td colspan="2" height="1" class='button'></td>                                  
 </tr>                                       
 <tr>              
  <td colspan="2" height="1" bgcolor="#1F4F8F"></td>     
 </tr>                                      
 <tr>                                         
  <td colspan="2" height="10"></td>                                    
 </tr>                                          
 <tr>                                          
  <td colspan="2" align="right">                    
   <table width="100%" border="0" cellpadding="0" cellspacing="0">                      
    <tr>                     
     <td width="28%">&nbsp;</td>               
     <td width="51%">&nbsp;</td>               
   
  
  <td>
     <input type="submit"  value="등록하기" class="redBtn"></td>    
     <td width="12%"><input type="button" onClick="document.location='board.do'" value = 취소></td>    
    </tr>
    
   </table>
  </td>
 </tr>
</table>                                       
</CENTER>                                            
</FORM> 
</BODY>
<br></br>
<br></br>
</html>
