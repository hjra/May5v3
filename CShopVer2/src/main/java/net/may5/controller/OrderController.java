package net.may5.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.may5.dto.Orders;
import net.may5.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;


@Controller
@SessionAttributes("cstLogin")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	/** 고객페이지 ↓ */
	/* 예약주문 */
	@RequestMapping("advanceOrder.do")
	public String advanceOrder(Model model){
		return "cst/order/advanceOrder";
	}
	
	/* 주문상세 */
	@RequestMapping("orderDetail.do")
	public String orderDetail(HttpServletRequest request, Model model,
			String cstLogin, String cstId, @RequestParam String itemId) {
		HttpSession session = request.getSession();
		session.getAttribute(cstLogin);
		model.addAttribute("optionPrice", orderService.getOptionPrice());
		System.out.println("itemId: "+itemId);
		model.addAttribute("itemId", itemId);
		return "cst/order/orderDetail";
	}
	
	/* 수취정보*/
	@RequestMapping(value="orderReceiverInfo.do", method=RequestMethod.POST)
	public String orderReceiverInfo( Model model, Orders orders, String cstId ){
		model.addAttribute("orders", orders);
		System.err.println("orders에서 담겨넘어온 내용 : "+orders);
		model.addAttribute("optionPrice", orderService.getOptionPrice());
		model.addAttribute("cstExistingInfo",orderService.getCstExistingInfo(cstId));
		return "cst/order/orderReceiverInfo";
	}
	
	/*QR코드 테스트*/
	/*@RequestMapping("orderTemp.do")
	public String orderDetail( Model model,  String cstId){
		Orders orders = new Orders();
		model.addAttribute("orders", orders);
		model.addAttribute("cstExistingInfo",orderService.getCstExistingInfo(cstId));
		return "cst/order/orderTemp";
	}
	
	@RequestMapping("qrcode.do")
	public String qrcode(){
		return "cst/order/qrcode";
	}*/
	
	/* 기존정보사용*/
	@RequestMapping("cstExistingInfo.do")
	public String cstExistingInfo( Model model ){
		return "cst/order/orderReceiverInfo";
	}
	
	/* 결제수단정보 */
	@RequestMapping("advanceOrderPayment.do")
	public String advanceOrderPayment( Model model, Orders orders, String cstId, String dlvwarn ){
		System.err.println("advanceOrderPayment.do");
		System.err.println(cstId);
		model.addAttribute("orders", orders);
		System.err.println("orders에서 담겨넘어온 내용 : "+orders);
		model.addAttribute("payKind", orderService.getPayKind());
		model.addAttribute("cardSection", orderService.getCardSection());
		model.addAttribute("cashReceiptRequestInfoSave", orderService.getCashReceiptRequestInfoSave());
		model.addAttribute("optionPrice", orderService.getOptionPrice());
		model.addAttribute("deduction", orderService.getDeduction());
		model.addAttribute("cardKind",orderService.getCardKind());
		model.addAttribute("installment", orderService.getInstallment());
		model.addAttribute("cashReceiptRequestWay", orderService.getCashReceiptRequestWay());
		model.addAttribute("dlvwarn", dlvwarn);
		
		
		return "cst/order/advanceOrderPayment";
	}
	
	/*결제*/
	@RequestMapping("payment.do")
	public String payment( Model model, Orders orders, String cstId, String dlvwarn ){
		System.err.println("payment.do");
		model.addAttribute("orders", orders);
		System.out.println();
		System.err.println("orders에서 담겨넘어온 내용 : "+orders);
		System.out.println();
	
		
		model.addAttribute("payKind", orderService.getPayKind());
		
		model.addAttribute("cardSection", orderService.getCardSection());
		
		model.addAttribute("cashReceiptRequestInfoSave", orderService.getCashReceiptRequestInfoSave());
		
		model.addAttribute("deduction", orderService.getDeduction());
		
		model.addAttribute("cardKind",orderService.getCardKind());
		
		model.addAttribute("installment", orderService.getInstallment());
		
		model.addAttribute("cashReceiptRequestWay", orderService.getCashReceiptRequestWay());
		
		model.addAttribute("dlvwarn", dlvwarn);
		
		model.addAttribute("telecoms", orderService.getTelecom());
		
		model.addAttribute("itemId", orderService.getItemList());
		
		model.addAttribute("optionPrice", orderService.getOptionPrice());
		
		return "cst/order/payment";
	}
	
	/*결제완료*/
	@RequestMapping("paymentOk.do")
	public String paymentOk( Model model, Orders orders, String cstId, String dlvwarn ){
		System.err.println("paymentOk.do");
		model.addAttribute("orders", orders);
		System.out.println();
		System.err.println("orders에서 담겨넘어온 내용 : "+orders);
		System.out.println();
	
		
		model.addAttribute("payKind", orderService.getPayKind());
		
		model.addAttribute("cardSection", orderService.getCardSection());
		
		model.addAttribute("cashReceiptRequestInfoSave", orderService.getCashReceiptRequestInfoSave());
		
		model.addAttribute("deduction", orderService.getDeduction());
		
		model.addAttribute("cardKind",orderService.getCardKind());
		
		model.addAttribute("installment", orderService.getInstallment());
		
		model.addAttribute("cashReceiptRequestWay", orderService.getCashReceiptRequestWay());
		
		model.addAttribute("dlvwarn", dlvwarn);
		
		model.addAttribute("telecoms", orderService.getTelecom());
		
		model.addAttribute("itemId", orderService.getItemList());
		
		model.addAttribute("optionPrice", orderService.getOptionPrice());
		
		return "cst/order/paymentOk";
	}
	
	/* 카드(QR)옵션
	@RequestMapping("optionCard.do")
	public String getOptionCard( Model model, int optionCode){
		
		return "redirect:/advanceOrder.do";
	}*/
	
	
	/*주문내역*/
	@RequestMapping("orderList.do")
	public ModelAndView orderList() {
		ModelAndView model = new ModelAndView();
		model.setViewName("cst/order/orderList");
		List<Orders> orderlist = orderService.getOrderList();
		model.addObject("orderlist", orderlist);
		return model;
	}
	
	@RequestMapping(value = "orderlistSearch.do", method = RequestMethod.POST)
	public String orderCategory(Model model, @RequestParam String searchOrder,
			HttpServletRequest request) {
		
		String ocategory = request.getParameter("ocategory");
		// String searchText = request.getParameter("searchOrder");
		System.out.println("ocategory: " + ocategory);
		System.out.println("searchOrder: " + searchOrder);
		List<Orders> orders = null;
		/* String temp=null; */
		if (ocategory.equals("orderDate")) {
			orders = orderService.getorderDateSearch(searchOrder);
		} else if (ocategory.equals("orderNumber")) {
			orders = orderService.getOrderlNumberSearch(
					searchOrder.substring(0, 8), 
					searchOrder.substring(8, 10),
					searchOrder.substring(10, 15));
		} else if (ocategory.equals("itemName")) {
			orders = orderService.getitemNameSearch(searchOrder);
		} else {
			System.out.println("오류");
		}
		model.addAttribute("orderlist", orders);
		return "cst/order/orderList";
	}
	
	/*주문검색*/
	@RequestMapping("orderSearch.do")
	public ModelAndView orderSearch() {
		ModelAndView model = new ModelAndView();
		model.setViewName("/cst/order/orderSearch");
		return model;
	}
	
	
	/** 관리자페이지↓ */
	/* 주문정보화면으로 이동 */
	@RequestMapping("orderListMng.do")
	public ModelAndView getOptionPrice(){
		ModelAndView model = new ModelAndView();
		model.setViewName("mng/orderInfoMng/orderListMng");
		model.addObject("orderListMng",orderService.getOrderListMng());
		return model;
	}
	
	@RequestMapping("orderInfoJson.do")
	public @ResponseBody Map<?,?> orderListMngJson(ModelMap model){
		model.put("orders", orderService.getOrderListMng());
		System.out.println("orderListMngJson 실행 결과: "+model);
		return model;
	}
	
	
	
	/* 알리미리스트메인뷰 */
	@RequestMapping("dlvNotice.do")
	public ModelAndView alimiList() {
		ModelAndView model = new ModelAndView();
		model.setViewName("mng/deliveryMng/dlvNotice");
		List<Orders> alimilist = orderService.getAlimiList();
		model.addObject("alimilist", alimilist);
		return model;
	}
	
	
	/* 알리미리스트검색 */
	@RequestMapping(value = "levelCodeSearch.do", method = RequestMethod.POST)
	public String alimiCategory(Model model, @RequestParam String searchText,
			HttpServletRequest request) {

		String dcategory = request.getParameter("dcategory");
		// String searchText = request.getParameter("searchText");
		System.out.println("dcategory: " + dcategory);
		System.out.println("searchText: " + searchText);
		List<Orders> orders = null;
		/* String temp=null; */
		if (dcategory.equals("levelCode")) {
			orders = orderService.getLevelCodeSearch(searchText);
		} else if (dcategory.equals("orderNumber")) {
			orders = orderService.getOrderNumberSearch(
					searchText.substring(0, 8), 
					searchText.substring(8, 10),
					searchText.substring(10, 15));
		} else if (dcategory.equals("cstId")) {
			orders = orderService.getCstIdSearch(searchText);
		} else {
			System.out.println("오류");
		}
		model.addAttribute("alimilist", orders);
		return "mng/deliveryMng/dlvNotice";
	}
	
	
	/* 메세지작업  */
	
	@RequestMapping(value = "alimimessage.do", method=RequestMethod.POST)
	public String updateAlimimessage(Model model, Orders orders) {
		orderService.setNoticeComment(orders);	// update 구문
		// email sender를 넣어줘야 함.

		List<Orders> alimilist = orderService.getAlimiList(); // 조회해서 List로 담아주는 것
		model.addAttribute("alimilist", alimilist);	// List를 dlvNotice.do로 보내주는 것
		return "dlvNotic.do";

	}
	
	
	
	/*선물옵션*/
	@RequestMapping("dlvPresent.do")
	public ModelAndView presentList() {
		ModelAndView model = new ModelAndView();
		model.setViewName("mng/deliveryMng/dlvPresent");
		List<Orders> presentlist = orderService.getPriceList();
		model.addObject("presentlist", presentlist);
		return model;
	}
	
	
	/* 선물옵션검색 */
	@RequestMapping(value = "levelCodePresent.do", method = RequestMethod.POST)
	public String presentCategory(Model model, @RequestParam String searchText,
			HttpServletRequest request) {

		String dcategory = request.getParameter("dcategory");
		// String searchText = request.getParameter("searchText");
		System.out.println("dcategory: " + dcategory);
		System.out.println("searchText: " + searchText);
		List<Orders> orders = null;
		/* String temp=null; */
		if (dcategory.equals("levelCode")) {
			orders = orderService.getLevelCodepresent(searchText);
		} else if (dcategory.equals("orderNumber")) {
			orders = orderService.getOrderNumberpresent(
					searchText.substring(0, 8), 
					searchText.substring(8, 10),
					searchText.substring(10, 15));
		} else if (dcategory.equals("cstId")) {
			orders = orderService.getCstIdpresent(searchText);
		} else {
			System.out.println("오류");
		}
		model.addAttribute("presentlist", orders);
		return "mng/deliveryMng/dlvPresent";
	}
	

}

