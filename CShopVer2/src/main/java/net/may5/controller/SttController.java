package net.may5.controller;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

import net.may5.service.SttService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SttController {
	
	@Autowired
	private SttService sttService;
	
	/* 일일현황 */
	@RequestMapping(value="dailyReport.do")
	public String dailyReport(Model model, Date orderDate){
		model.addAttribute("getCakeCount", sttService.getCakeCount());
		model.addAttribute("getOrderCount", sttService.getOrderCount());
		int getCustomerCount=sttService.getCustomerCount();
		int getDCustomerCount=sttService.getDCustomerCount();
		int getCustomerResCount=getCustomerCount-getDCustomerCount;
		model.addAttribute("getCustomerResCount", getCustomerResCount);
		model.addAttribute("getDailyCountForMenu", sttService.getDailyCountForMenu());
		return "mng/statistics/dailyReport";
	}
	/* 판매분석 */
	@RequestMapping(value="orderReport.do")
	public String orderReport(Model model, String orderDate){
		if (orderDate == null) {
			String today = (new SimpleDateFormat("YYYY-MM-dd", Locale.KOREA))
					.format(new Date()).substring(0, 10);
			System.out.println("today :: " + today);
		}else{
			model.addAttribute("paramDate", orderDate);
	    	model.addAttribute("orderCountPerHour", sttService.orderCountPerHour(orderDate));
			System.out.println("오더카운트퍼아우어::"+sttService.orderCountPerHour(orderDate));
		}	
		return "mng/statistics/orderReport";
	}

	/* 메뉴분석 */
	@RequestMapping(value="menuReport.do")
	public String rsvReport(Model model){
		return "mng/statistics/menuReport";
	}
	/* 매출분석 */
	@RequestMapping(value="salesReport.do")
	public String salesReport(Model model){
		return "mng/statistics/salesReport";
	}
	/* 고객분석 */
	@RequestMapping(value="memberReport.do")
	public String memberReport(Model model){
		return "mng/statistics/memberReport";
	}
	
	// 날짜선택 - 특정날짜를 선택!
    @RequestMapping(value="sttDatePicker.do")
    public String datePicker(Date thisDay2, Model model){
    	System.out.println("데이트 피커쩜 두 :: 선택하신 날짜는 :: "+thisDay2);
//    	model.addAttribute("orderCountPerHour", sttService.orderCountPerHour(thisDay));
//    	System.out.println(sttService.orderCountPerHour(thisDay));
		model.addAttribute("thisDay", thisDay2);
    	return "mng/menuMng/orderReport";
    }
	
	
}
