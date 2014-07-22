<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="true"%>

<script type="text/javascript">
	function updateGo() {

		document.getElementById("GoSelect").action = "mngUpdateForm.do";
		document.getElementById("GoSelect").submit();
	}

	function deleteGo() {
		
		
		
		document.getElementById("GoSelect").action = "boardDelete.do";
		document.getElementById("GoSelect").submit();
	}
</script>



 										

		<h1 align="center">게시글 확인</h1>
		<font size="2">
		
			
		
		<center>
			<table border="1" width = "600">
					
				<tr>
					<td>제&nbsp;&nbsp;&nbsp;목</td>
					<td> ${qnaContent.boardTitle}</td>
					
				</tr>
				<tr>
					<td>작성자</td>
					<td>${qnaContent.cstId}</td>
				</tr>
				<tr>
					
					<td align="center">글내용</td>
					 <td> <textarea name="content" id="content" rows="13" cols="40" style="width:500px;">${qnaContent.postContents}</textarea> </td>
				</tr>
				
				<tr>
					<td></td>
					<td>
				</tr>
				<tr>
					<center>
					<td></td>
					
					<td>
					<center>
								<form id="GoSelect" method="post">
									<input type="hidden" name="boardCode" value="${qnaContent.boardCode}" class="redBtn"> 
									<input type="button" id="update" onclick="updateGo()" value="수정" class="redBtn" />
									<input type="button" id="delete" onclick="deleteGo()" value="삭제" class="redBtn" />
									<input type="button" value="뒤로" onclick="history.back()"/>
																	
								</form>
					</center>	
						</td>		
					</center>
						
				</tr>
				
			</table>
			</center>
		</font>
		
	
		

	
	<!-- 여기서부터는 리플입니다. -->
	
	
<form action="mngreplyProc.do" method="post">


<%-- <input type="hidden" name="cstCode" value="${reply}"> --%>
	<%
		int i = 0;
	%>
	<table class="table table-bordered">
		<tr>
			<td colspan="7">평점 및 댓글</td>
		</tr>
		<tr>
			<td width="66px">번호</td>
				
			
			
			<td>
			<input type="text" id="qnaReply" name="qnaReply" maxlength="300" style="width: 500px"
				placeholder="의견을 140자 이내로 적어주세요"></td>
			
			<td><%-- ${reply.cstId} --%></td>
			
			<td align="center">
			<input type="hidden" name="boardCode" value="${boardCode}">
			<%-- <input type="hidden" name="cstCode" value="${sessionScope.cstLogin.cstCode}"> --%>
			<input type="submit" id="ok" value="등록" ></td>
			
		</tr>
	
		<c:forEach var="boardReplys" items="${boardReply}" varStatus="status">
			
			<tr height="35px">
				<td align="center">${status.count}</td>
				<td>${boardReplys.qnaReply}</td>		
				<!-- 고객이 댓글을 달면 그대로 표시가 되지만 관리자가 댓글을 달면 아이디에 상관없이 관리자라고 출력된다. -->
				<td>${boardReplys.cstId== "noMember" ? "관리자" : boardReplys.cstId}</td>
					
				<td align="center">
				<fmt:formatDate value="${boardReplys.replyDate }" pattern="yyyy-MM-dd" />
				</td>
			
			 <c:choose>
				<c:when test="${sessionScope.cstLogin.cstCode == reply.cstCode}">
				<td align="center">
				
				</td>
				</c:when>
				<c:otherwise>
				<td><a href="evaluationDelete.do?evaluationIndex=${reply.boardCode}&itemId=${reply.boardCode}">X</a></td>
				</c:otherwise>
			</c:choose>
			</tr>
			

		</c:forEach>
	</table>
			




</form>
