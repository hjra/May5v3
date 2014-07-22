<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="true" %>
	<style type="text/css">
    body{
        line-height:2em;        
        font-family:"맑은 고딕";
}
    ul, li{ 
        list-style:none;
        text-align:center;
        padding:0;
        margin:0;
}

    #mainWrapper{
        width: 800px;
        margin: 0 auto; /*가운데 정렬*/
    }

    #mainWrapper > ul > li:first-child {
        text-align: center;
        font-size:14pt;
        height:40px;
        vertical-align:middle;
        line-height:30px;
}

    #ulTable {margin-top:10px;}
    

    #ulTable > li:first-child > ul > li {
        background-color:#c9c9c9;
        font-weight:bold;
        text-align:center;
}

    #ulTable > li > ul {
        clear:both;
        padding:0px auto;
        position:relative;
        min-width:40px;
}
    #ulTable > li > ul > li { 
        float:left;
        font-size:10pt;
        border-bottom:1px solid silver;
        vertical-align:baseline;
}    

    #ulTable > li > ul > li:first-child               {width:10%;} /*No 열 크기*/
    #ulTable > li > ul > li:first-child +li           {width:45%;} /*제목 열 크기*/
    #ulTable > li > ul > li:first-child +li+li        {width:20%;} /*작성일 열 크기*/
    #ulTable > li > ul > li:first-child +li+li+li     {width:15%;} /*작성자 열 크기*/
    #ulTable > li > ul > li:first-child +li+li+li+li  {width:10%;} /*조회수 열 크기*/

    #divPaging {
          clear:both; 
        margin:0 auto; 
        width:220px; 
        height:50px;
}

    #divPaging > div {
        float:left;
        width: 30px;
        margin:0 auto;
        text-align:center;
}

    #liSearchOption {clear:both;}
    #liSearchOption > div {
        margin:0 auto; 
        margin-top: 30px; 
        width:auto; 
        height:100px; 

}

    .left {
        text-align : left;
}

    .redBtn2{margin-left: 360px;}     

</style>
	
	
	
	<div id="mainWrapper">

        <ul>
            <!-- 게시판 제목 -->
            <li><h2>C# QnA 게시판 </h2></li><br></br>

            <!-- 게시판 목록  -->
            <li>
                <ul id ="ulTable">
                    <li>
                        <ul>
                            <li>No</li>
                            <li>제목</li>
                            <li>작성일</li>
                            <li>작성자</li>
                        </ul>
                    </li>
                    
                    
                    
                    <!-- 게시물이 출력될 영역 -->
                    
                    
                    
                    <c:forEach items="${qnaList2}" var="board" >
                  
                    <li>
                        <ul>
                            <li>${board.boardCode}</li>
                            
                            <li class="left">
                            <f:form action="boardCheck.do" method="post" commandName="qnA">
							<input type="submit" name="boardTitle" value="${board.boardTitle}">
								<input type="hidden" name="boardCode" value="${board.boardCode}">
								<input type="hidden" name="postPassword" value="${board.postPassword}">
								<input type="hidden" name="cstCode" value="${board.cstCode}">
								<input type="hidden" name="qnaReply" value="${board.qnaReply}">
								<input type="hidden" name="boardDate" value="${board.boardDate}">
								<input type="hidden" name="replyCount" value="${board.replyCount}">
								<input type="hidden" name="replyCode" value="${board.replyCode}">
						<!-- 윗 부분이 없다면 전달 받은 변수들이 다시 컨트롤러로 가지 못하게 된다 위의 구문들이 변수를 가지고
						있다가 다시 컨트롤러로 변수를 전달해주는 그릇 역활을 하게 한다. -->
						<!-- 보드의 제목을 클릭하게 되면 히든 타입으로 글번호가  보드체크를 따라 
						컨트롤로 간다 -->
						</f:form>	
                            
                            </li>
                            
                            	<li>${board.boardDate}</li>
                            	<li>${board.cstId}</li>
                        </ul>
                  			</li>
				</c:forEach> 
                                                           
                </ul>
            </li>
            <tr></tr>
            <tr>
				<td></td>
				<td><input type="hidden" name="cstId" value="${board.cstId}">
				
				
				<td></td>
				<td align="left">
				<td></td>
					
			</tr>
            
         
            
            
            
            
		<!--게시판 페이징 영역 -->
            <li>
                <div id="divPaging">
                    <div>◀</div>
                       <div><b>1</b></div>
                   	   <div>▶</div>
                   	            <input type="button" onclick="document.location='boardWriteForm.do'" value="글쓰기" class="redBtn2">
                </div>
            </li>
      

            <!-- 검색 폼 영역 -->
            
            <li id='liSearchOption'>
                <div>
                    <select id='selSearchOption' >
                       
                        <option value='T'>제목</option>
                        <option value='C'>내용</option>
                    </select>
                    <input id='txtKeyWord' />
                    <input type='button' value='검색'/>
                </div>
                </li>

        </ul>
    </div>
	 