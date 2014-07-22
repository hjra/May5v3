package net.may5.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.may5.dto.Evaluation;
import net.may5.dto.Item;
import net.may5.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;

	/** 고객페이지↓ */
	/* 메뉴리스트로 이동 */
	@RequestMapping(value = "menuList.do")
	public String menuList(Model model) {

		List<Item> list = itemService.getItemList();

		List<List> collection = new ArrayList<List>();
		collection.add(new ArrayList<Item>());
		collection.add(new ArrayList<Item>());
		collection.add(new ArrayList<Item>());
		collection.add(new ArrayList<Item>());
		//
		for (int i = 0, n = list.size(); i < n; i++) {
			Item item = list.get(i);
			// 찾아보는 아이템의 호수를 찾아보앗어
			switch (item.getItemId().substring(0, 1)) {
			case "S":
				collection.get(0).add(item);
				break;
			case "M":
				collection.get(1).add(item);
				break;
			case "L":
				collection.get(2).add(item);
				break;
			default:
				collection.get(3).add(item);
				break;
			}
		}
		System.out.println("collection =>" + collection);
		model.addAttribute("collection", collection);
		return "cst/menu/menuList";
	}

	/* 메뉴상세정보로 이동 */
	@RequestMapping(value = "menuInfo.do", method = RequestMethod.GET)
	public ModelAndView menuInfo(HttpServletRequest request, String itemId,
			String page, String cstLogin) {
		ModelAndView view = new ModelAndView("cst/menu/menuInfoCommonView");
		view.addObject("pageAction", "view");

		HttpSession session = request.getSession();
		session.getAttribute(cstLogin);
		System.out.println("고객님 아이디는? 메뉴인포.두::" + cstLogin);

		if (itemId == null) {
			session.getAttribute(itemId);
			System.out.println("세션에서 가지고 온 아이템 아이디::" + itemId);
		} else {
			session.setAttribute("itemId", itemId);
			System.out.println("session set itemId::" + itemId);
			Item anItem = itemService.getAnItem(itemId);
			String anId = anItem.getItemId();
			view.addObject("itemId", anId);
			view.addObject("itemName", anItem.getItemName());
			view.addObject("itemCalorie", anItem.getItemCalorie());
			view.addObject("itemInfo", anItem.getItemInfo());
			view.addObject("itemImg1", anItem.getItemImg1());
			view.addObject("itemImg2", anItem.getItemImg2());
			view.addObject("itemImg3", anItem.getItemImg3());
			view.addObject("itemImg4", anItem.getItemImg4());
			view.addObject("sticker", anItem.getSticker());
			view.addObject("price", anItem.getPrice());

			switch (anId.substring(0, 1).toUpperCase()) {
			case "S":
				view.addObject("item_size", "소형");
				break;
			case "M":
				view.addObject("item_size", "중형");
				break;
			case "L":
				view.addObject("item_size", "대형");
				break;
			case "X":
				view.addObject("item_size", "특별사이즈");
				break;
			}
			switch (anId.substring(1, 2)) {
			case "1":
				view.addObject("item_cream", "생크림");
				break;
			case "2":
				view.addObject("item_cream", "초코크림");
				break;
			}
			switch (anId.substring(2, 3).toUpperCase()) {
			case "S":
				view.addObject("item_fruit1", "딸기");
				break;
			case "B":
				view.addObject("item_fruit1", "바나나");
				break;
			case "G":
				view.addObject("item_fruit1", "포도");
				break;
			}
			switch (anId.substring(3, 4).toUpperCase()) {
			case "S":
				view.addObject("item_fruit2", "딸기");
				break;
			case "B":
				view.addObject("item_fruit2", "바나나");
				break;
			case "G":
				view.addObject("item_fruit2", "포도");
				break;
			}
			switch (anId.substring(4, 5).toUpperCase()) {
			case "S":
				view.addObject("item_fruit3", "딸기");
				break;
			case "B":
				view.addObject("item_fruit3", "바나나");
				break;
			case "G":
				view.addObject("item_fruit3", "포도");
				break;
			}

			System.out.println("anItem::" + view.getModelMap());
		}

		// 시작
		int ipage = page == null ? 1 : Integer.parseInt(page);
		int limit = 10;

		// 총 리스트 수
		int listcount = itemService.getListCount();
		System.out.println("count는 " + listcount);

		// 한 아이템 당 리스트 수
		int anItemListCount = itemService.getAnItemListCount(itemId);
		System.out.println(anItemListCount);

		// 게시글 리스트
		System.out.println("itemContorller:" + itemId);

		List<Evaluation> evaluationList = itemService.getEvaluationList(itemId,
				ipage, limit);

		System.out.println(itemId);
		System.out.println(evaluationList.toString());

		// 총 페이지 수
		// 0.95를 더해서 올림 처리
		int maxpage = (int) ((double) anItemListCount / limit + 0.95);
		// 현재 페이지에 보여줄 시작 페이지 수(1, 11, 21 등...)
		int startpage = (((int) ((double) ipage / 10 + 0.9)) - 1) * 10 + 1;
		// 현재 페이지에 보여줄 마지막 페이지 수(10, 20, 30 등...)
		int endpage = startpage + 10 - 1;

		if (endpage > maxpage)
			endpage = maxpage;

		// return

		view.addObject("page", ipage); // 현재 페이지 수
		view.addObject("maxpage", maxpage); // 최대 페이지 수
		view.addObject("startpage", startpage); // 현재 페이지에 표시할 첫 페이지 수
		view.addObject("endpage", endpage); // 현재 페이지에 표시할 끝 페이지 수
		view.addObject("listcount", listcount); // 모든 아이템의 총 글 수
		view.addObject("anItemListCount", anItemListCount); // 한 아이템 당 글 수
		view.addObject("evaluationList", evaluationList); // 게시글 리스트

		return view;
	}

	/** 관리자페이지↓ */
	/* 상품관리로 이동 */
	@RequestMapping(value = "menuListMng.do")
	public String menuListMng(Model model) {
		List<Item> list = itemService.getItemList();

		List<List> collection = new ArrayList<List>();
		collection.add(new ArrayList<Item>());
		collection.add(new ArrayList<Item>());
		collection.add(new ArrayList<Item>());
		collection.add(new ArrayList<Item>());
		//
		for (int i = 0, n = list.size(); i < n; i++) {
			Item item = list.get(i);
			// 찾아보는 아이템의 호수를 찾아보앗어
			switch (item.getItemId().substring(0, 1)) {
			case "S":
				collection.get(0).add(item);
				break;
			case "M":
				collection.get(1).add(item);
				break;
			case "L":
				collection.get(2).add(item);
				break;
			default:
				collection.get(3).add(item);
				break;
			}
		}
		System.out.println("collection =>" + collection);
		model.addAttribute("collection", collection);
		// model.addAttribute("itemList", );

		return "mng/menuMng/menuListMng";
	}

	@RequestMapping(value = "menuInsertMng.do")
	public ModelAndView menuInsertMng() {
		ModelAndView view = new ModelAndView("cst/menu/menuInfoCommonView");
		view.addObject("pageAction", "insert");

		return view;

	}

	@RequestMapping(value = "menuModifyMng.do")
	public ModelAndView menuModifyMng(String itemId) {
		ModelAndView view = new ModelAndView("cst/menu/menuInfoCommonView");
		view.addObject("pageAction", "modify");

		Item anItem = itemService.getAnItem(itemId);
		System.out.println("modify item" + anItem);
		String anId = anItem.getItemId();
		view.addObject("itemId", anId);
		view.addObject("itemName", anItem.getItemName());
		view.addObject("itemCalorie", anItem.getItemCalorie());
		view.addObject("itemInfo", anItem.getItemInfo());
		view.addObject("itemImg1", anItem.getItemImg1());
		view.addObject("itemImg2", anItem.getItemImg2());
		view.addObject("itemImg3", anItem.getItemImg3());
		view.addObject("itemImg4", anItem.getItemImg4());
		view.addObject("sticker", anItem.getSticker());
		view.addObject("price", anItem.getPrice());

		switch (anId.substring(0, 1).toUpperCase()) {
		case "S":
			view.addObject("item_size", "소형");
			break;
		case "M":
			view.addObject("item_size", "중형");
			break;
		case "L":
			view.addObject("item_size", "대형");
			break;
		case "X":
			view.addObject("item_size", "특별사이즈");
			break;
		}
		switch (anId.substring(1, 2)) {
		case "1":
			view.addObject("item_cream", "생크림");
			break;
		case "2":
			view.addObject("item_cream", "초코크림");
			break;
		}
		switch (anId.substring(2, 3).toUpperCase()) {
		case "S":
			view.addObject("item_fruit1", "딸기");
			break;
		case "B":
			view.addObject("item_fruit1", "바나나");
			break;
		case "G":
			view.addObject("item_fruit1", "포도");
			break;
		}
		switch (anId.substring(3, 4).toUpperCase()) {
		case "S":
			view.addObject("item_fruit2", "딸기");
			break;
		case "B":
			view.addObject("item_fruit2", "바나나");
			break;
		case "G":
			view.addObject("item_fruit2", "포도");
			break;
		}
		switch (anId.substring(4, 5).toUpperCase()) {
		case "S":
			view.addObject("item_fruit3", "딸기");
			break;
		case "B":
			view.addObject("item_fruit3", "바나나");
			break;
		case "G":
			view.addObject("item_fruit3", "포도");
			break;
		}

		return view;
	}

	@RequestMapping(value = "/itemInsertProc.do", method = RequestMethod.POST)
	public String itemInsertProc(@RequestParam Map<String, String> param,
			HttpServletRequest request, Model model) {

		// insert map
		Map<String, String> insertParam = new HashMap<String, String>();

		// id generator
		String idValue = "";
		String idArray[] = { "", "", "", "", "" };

		for (Entry<String, MultipartFile> entry : ((MultipartHttpServletRequest) request)
				.getFileMap().entrySet()) {
			String key = entry.getKey();
			MultipartFile uploadFile = entry.getValue();

			// file이 첨부되어있는경우 작동
			if (uploadFile.getSize() > 0) {
				// 파일 저장
				String resourcePath = "/resources/newImage";
				String fileName = uploadFile.getOriginalFilename();
				String uriPath = request.getSession().getServletContext()
						.getContextPath()
						+ resourcePath + "/" + fileName;
				String filePath = request.getSession().getServletContext()
						.getRealPath(resourcePath)
						+ "/" + fileName;
				// 실제저장
				try {
					File file = new File(filePath);
					uploadFile.transferTo(file);
				} catch (IOException e) {
					e.printStackTrace();
				}
				// 파라메터 값
				insertParam.put(key, uriPath);
				// System.out.println("save=>file:/"+filePath);
				// System.out.println("uri =>/"+uriPath);
			} else {
				insertParam.put(key, "");
			}
		}

		// 폼 내용 불러오기
		for (Entry<String, String> entry : param.entrySet()) {
			// parameter key value
			String key = entry.getKey();
			String value = entry.getValue();

			// System.out.println("evaluate => "+key+"  =>  "+value);

			if (key.indexOf("item_") == 0) {
				// id와 관련된 값
				switch (key.substring(5)) {
				case "size":
					idArray[0] = value.toUpperCase();
					break;
				case "cream":
					idArray[1] = value.toUpperCase();
					break;
				case "fruit1":
					idArray[2] = value.toUpperCase();
					break;
				case "fruit2":
					idArray[3] = value.toUpperCase();
					break;
				case "fruit3":
					idArray[4] = value.toUpperCase();
					break;
				}
			} else {
				// 그냥 파라메터들
				insertParam.put(key, value);
			}
		}

		// id도 만듬
		for (int i = 0; i < 5; i++) {
			idValue += idArray[i];
		}
		insertParam.put("ITEMID", idValue);

		// IMG1
		insertParam.put("ITEMIMG1", "");

		// 들여보낼 폼 이름 확인
		System.out.println("insert params result");
		System.out.println(insertParam);

		itemService.setNewItem(insertParam);
		// model.addAttribute("setNewItem", );

		return "redirect:menuListMng.do";
	}

	@RequestMapping(value = "/itemModifyProc.do", method = RequestMethod.POST)
	public String itemModifyProc(@RequestParam Map<String, String> param,
			String itemId, HttpServletRequest request, Model model) {

		// insert map
		Map<String, String> insertParam = new HashMap<String, String>();
		model.addAttribute("itemId", itemId);
		System.out.println("모델에서 가지고 온 아이템 아이디::" + itemId);
		insertParam.put("itemId", itemId);

		for (Entry<String, MultipartFile> entry : ((MultipartHttpServletRequest) request)
				.getFileMap().entrySet()) {
			String key = entry.getKey();
			MultipartFile uploadFile = entry.getValue();

			// file이 첨부되어있는경우 작동
			if (uploadFile.getSize() > 0) {
				// 파일 저장
				String resourcePath = "/resources/newImage";
				String fileName = uploadFile.getOriginalFilename();
				String uriPath = request.getSession().getServletContext()
						.getContextPath()
						+ resourcePath + "/" + fileName;
				String filePath = request.getSession().getServletContext()
						.getRealPath(resourcePath)
						+ "/" + fileName;
				// 실제저장
				try {
					File file = new File(filePath);
					uploadFile.transferTo(file);
				} catch (IOException e) {
					e.printStackTrace();
				}
				// 파라메터 값
				insertParam.put(key, uriPath);
				// System.out.println("save=>file:/"+filePath);
				// System.out.println("uri =>/"+uriPath);
			} else {
				insertParam.put(key, "");
			}
		}

		// 폼 내용 불러오기
		for (Entry<String, String> entry : param.entrySet()) {
			// parameter key value
			String key = entry.getKey();
			String value = entry.getValue();

			// System.out.println("evaluate => "+key+"  =>  "+value);

			// 그냥 파라메터들
			insertParam.put(key, value);

		}

		// IMG1
		insertParam.put("ITEMIMG1", "");

		// 들여보낼 폼 이름 확인
		System.out.println("insert params result");
		System.out.println(insertParam);

		itemService.modifyItem(insertParam);
		// model.addAttribute("setNewItem", );

		return "redirect:menuListMng.do";
	}

	@RequestMapping(value = "menuItemDelete.do", method = RequestMethod.POST)
	public String menuItemDelete(HttpServletRequest request) {

		Map<String, String[]> requestParams = request.getParameterMap();

		for (Map.Entry<String, String[]> entry : requestParams.entrySet()) {
			String key = entry.getKey(); // parameter name
			String[] values = entry.getValue(); // parameter values as array of
												// String

			if (key.equals("deleteItem")) {
				for (int i = 0; i < values.length; i++) {
					String deleteItemId = values[i];
					System.out.println("삭제대상 => " + deleteItemId);
					// ItemService.deleteItem(deleteItemId);
				}
			}
		}

		return "redirect:/menuListMng.do";
	}

	// 검색하기위한 두
	@RequestMapping(value = "menuStockMng.do")
	public String menuStockMng(Model model, String orderDate) {
		if (orderDate == null) {
			// 파라메터를 존재하지 않으면 오늘날짜 텍스트를 구해옵니다.
			String today = (new SimpleDateFormat("YYYY-MM-dd", Locale.KOREA))
					.format(new Date()).substring(0, 10);
			System.out.println("today ::" + today);
			// model.addAttribute("orderList", itemService.getOrderList(today));
			// model.addAttribute("paramDate", today);
			// model.addAttribute("orderCount",
			// itemService.getOrderListDailyCount(todayDate));
			// model.addAttribute("getOrderListSameItemId",
			// itemService.getOrderListCountSameItemId(today));
			// System.out.println("오늘 같은 카운트 아이템:: "+
			// itemService.getOrderListCountSameItemId(today));

		} else {
			System.out.println("selectDate => " + orderDate);

			model.addAttribute("orderList", itemService.getOrderList(orderDate));
			// model.addAttribute("orderCount",
			// itemService.getOrderListCount(orderDate));
			// model.addAttribute("getOrderListSameItemId",
			// itemService.getOrderListCountSameItemId(orderDate));
		}

		model.addAttribute("paramDate", (orderDate == null ? "" : orderDate));

		System.out.println("메뉴스탁엠엔쥐컨트롤러");
		System.out.println(itemService.getOrderListCountSameItemId());
		return "mng/menuMng/menuStockMng";
	}

	// 마감을 하기위한 두

	// 날짜선택 - 특정날짜를 선택!
	@RequestMapping(value = "datePicker.do")
	public String datePicker(Date thisDay, Model model) {

		System.out.println("선택하신 날짜는 :: " + thisDay);
		model.addAttribute("thisDay", thisDay);
		return "mng/menuMng/menuStockMng";
	}

	// 마감작업 - 재고를 0으로
	@RequestMapping(value = "stockToZero.do")
	public String stockToZero() {
		System.out.println("재고가 모두 0이 되었습니다.");

		return "mng/menuMng/menuStockMng";
	}

}
