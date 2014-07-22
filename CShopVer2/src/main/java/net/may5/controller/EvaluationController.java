package net.may5.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.may5.dto.Customer;
import net.may5.dto.Evaluation;
import net.may5.service.EvaluationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EvaluationController {

	@Autowired
	EvaluationService evaluationService;
	
	@RequestMapping(value = "commentProc.do", method=RequestMethod.POST)
	public String commentProc(Evaluation evaluation,
			String itemId, String grade, String evaluationContents, String cstLogin,
			HttpServletRequest request, HttpSession session, int cstCode) {
		
		System.out.println("insertEvaluationItemId "+itemId);
		session = request.getSession();
		session.getAttribute(cstLogin);
		try {
			if(grade == null);
		} catch (Exception e) {
			System.out.println("점수를 입력해주세요");
			return "redirect:/menuInfo.do?itemId="+itemId;
		}
		System.out.println("Grade::"+grade);
		evaluation.setCstCode(cstCode);
		evaluation.setEvaluationContents(evaluationContents);
		evaluation.setItemId(itemId);
		evaluation.setGrade(Integer.parseInt(grade));
		
		evaluationService.setEvaluation(evaluation);
		
		System.out.println("insertComplete => "+evaluationContents.toString());
		
		System.out.println("redirect:/cst/menu/menuInfo.do?itemId="+itemId);
		
		return "redirect:/menuInfo.do?itemId="+itemId;

	}
	
	@RequestMapping(value = "evaluationDelete.do", method=RequestMethod.GET)
	public String delete(Model model, int evaluationIndex, String itemId, String cstLogin,
			HttpServletRequest request, HttpSession session) {
		model.addAttribute("evaluationIndex", evaluationIndex);
		System.out.println(evaluationIndex+"<=인덱스    "+itemId+"<=아이디");
		evaluationService.delEvaluation(evaluationIndex);
		
		session = request.getSession();
		session.getAttribute(cstLogin);
		System.out.println("cstLogin"+cstLogin);
		return "redirect:/menuInfo.do?itemId="+itemId;
	}
	
	
}
