<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<script src="http://code.highcharts.com/highcharts.js"></script>
<script src="http://code.highcharts.com/modules/exporting.js"></script>
<script>
$(function () {
        $('#container').highcharts({
            chart: {
                type: 'area'
            },
            title: {
                text: '회원수 차트'
            },
            subtitle: {
                text:'' 
            },
            xAxis: {
                categories: ['1월', '2월', '3월', '4월', '5월', '6월', '7월'],
                tickmarkPlacement: 'on',
                title: {
                    enabled: false
                }
            },
            yAxis: {
                title: {
                    text: '100'
                },
                labels: {
                    formatter: function() {
                        return this.value / 1000;
                    }
                }
            },
            tooltip: {
                shared: true,
                valueSuffix: ' 명'
            },
            plotOptions: {
                area: {
                    stacking: 'normal',
                    lineColor: '#666666',
                    lineWidth: 1,
                    marker: {
                        lineWidth: 1,
                        lineColor: '#666666'
                    }
                }
            },
            series: [{
                name: '판매건수',
                data: [502, 675, 809, 947, 1402, 1534, 1768]
            }, {
                name: '회원 구매건수',
                data: [106, 107, 111, 133, 221, 767, 866]
            }, {
                name: '비회원 구매건수',
                data: [163, 203, 276, 408, 547, 729, 628]
            }, {
                name: '회원수',
                data: [18, 31, 54, 156, 339, 818, 1201]
            }]
        });
    });
    
</script>
<div id="container" style="min-width: 310px; height: 400px; margin: 0 auto"></div>