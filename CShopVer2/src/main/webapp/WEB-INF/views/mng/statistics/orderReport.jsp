<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src="http://code.highcharts.com/highcharts.js"></script>
<script src="http://code.highcharts.com/modules/exporting.js"></script>
<script src="http://code.highcharts.com/modules/heatmap.js"></script>
<script>
$(document)
.on("click","#datePicker", function(){
	location.href="sttDatePicker.do";
})
.on("click","#stockToZero",function(){
	location.href="stockToZero.do";
});
 
</script>

<!-- 날짜선택, 마감작업 둘다 작동하도록    => itemController 에서 처리? 
1. 특정 날짜 선택하면, 상품재고 목록이 나타나도록
2. 마감버튼 클릭하면 상품재고가 0이 되도록-->

<%-- 시간별 판매수량 :: 
${orderCountPerHour} --%>
<br><Br>
<div id="perHourChartData" class="template">
	<ul>
		<c:forEach var="a" items="${orderCountPerHour}">
		<li name="${a.a}">${a.b}</li>
		</c:forEach>
	</ul>
</div>

<form method="get">
	<div class="row-fluid text-right">
		<span>선택된날짜</span>
		<input type="text" name="orderDate" placeholder="날짜를 선택해주세요" class="date-picker" id="thisDay" value="${paramDate}" />
		<input type="submit" value="검색" />
		<!-- <button id="stockToZero" class="btn btn-primary">마감</button> -->
	</div>
</form>

<script>
var axisx = [];
var axisy = [];
// 0 시작시간 25 끝시간(-1)
for(var i=0,l=25;i<l;i++){
	axisx.push(i);
	axisy.push(0);
}
$("#perHourChartData li").each(function(){
	axisy[parseInt( $(this).attr("name") )] = parseInt($(this).text()); 
});
//

$(function () {
    $('#container1').highcharts({
        chart: {
            type: 'line'
        },
        title: {
            text: '오늘의 시간별 판매수량'
        },
        subtitle: {
            text: ' C# :: Cake Shop'
        },
        xAxis: {
            categories:axisx
        },
        yAxis: {
            title: {
                text: '개'
            }
        },
        plotOptions: {
            line: {
                dataLabels: {
                    enabled: true
                },
                enableMouseTracking: false
            }
        },
        series: [{
            name: 'Today',
            data: axisy
        }/* , {
            name: 'Average',
            data: [3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8]
        } */]
    });
});



$(function () {

    $('#container3').highcharts({
        
        chart: {
            type: 'heatmap',
            marginTop: 40,
            marginBottom: 40
        },


        title: {
            text: '이달의 판매수량'
        },

        xAxis: {
            categories: ['월요일', '화요일', '수요일', '목요일', '금요일', '토요일', '일요일']
        },

        yAxis: {
            categories: ['5주', '4주', '3주', '2주', '1주'],
            title: null
        },

        colorAxis: {
            min: 0,
            minColor: '#FFFFFF',
            maxColor: Highcharts.getOptions().colors[0]
        },

        legend: {
            align: 'right',
            layout: 'vertical',
            margin: 0,
            verticalAlign: 'top',
            y: 25,
            symbolHeight: 320
        },

        tooltip: {
            formatter: function () {
                return '<b>' + this.series.xAxis.categories[this.point.x] + '</b> sold <br><b>' +
                    this.point.value + '</b> items on <br><b>' + this.series.yAxis.categories[this.point.y] + '</b>';
            }
        },

        series: [{
            name: 'Sales per employee',
            borderWidth: 1,
            data: [[0,0,10],[0,1,19],[0,2,8],[0,3,24],[0,4,67],[1,0,92],[1,1,58],[1,2,78],[1,3,117],[1,4,48],[2,0,35],[2,1,15],[2,2,123],[2,3,64],[2,4,52],[3,0,72],[3,1,132],[3,2,114],[3,3,19],[3,4,16],[4,0,38],[4,1,5],[4,2,8],[4,3,117],[4,4,115],[5,0,88],[5,1,32],[5,2,12],[5,3,6],[5,4,120],[6,0,13],[6,1,44],[6,2,88],[6,3,98],[6,4,96]],
            dataLabels: {
                enabled: true,
                color: 'black',
                style: {
                    textShadow: 'none',
                    HcTextStroke: null
                }
            }
        }]

    });
});
    
</script>
<br><br><br><br>

<div id="container1" style="min-width: 310px; height: 400px; margin: 0 auto"></div>

<br><br><br><br>


<div id="container3" style="height: 400px; min-width: 310px; max-width: 800px; margin: 0 auto"></div>