<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<script type="text/javascript">
	function viewAjaxList(){
		$.ajax({
			type	: "POST",
			url		: "allMemberInfoJsonForm2.do",
			dataType: "json",
			data	: "",
			error: function(request,status,error){
		        alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);},
			success : function(result){
				$.each(result, function(key){
					var list = result[key];
					
					var content = "<table>";
					
					for(i=0; i<list.length; i++){
						content += "<tr>";
						content += "<td>" + list[i].CSTID + "</td>";
						content += "<td>" + list[i].CSTNAME + "</td>";
						content += "<td>" + list[i].LEVELNAME + "</td>";
						content += "<td>" + list[i].CSTJOINDATE + "</td>";
						content += "<td>" + list[i].CSTBIRTHDAY + "</td>";
						content += "<td>" + list[i].CSTCP + "</td>";
						content += "</tr>";
					}
					content += "<table>";
					
					$("#ajaxList").html(content);
				});
			}
		});
	}

</script>
<div id="ajaxList"></div>
<input type="button" value="리스트 갖고 오기" onclick="viewAjaxList()">