package fi.hh.ohtu.kysely.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fi.hh.ohtu.kysely.bean.QuestionClass;
import fi.hh.ohtu.kysely.dao.QuestionDAO;

@Controller
public class QuestionController {
	@Inject
	QuestionDAO dao;
	
	@RequestMapping(value="diningform", method=RequestMethod.GET)
	public String getDetails(Model model){
		List<QuestionClass> questions = dao.findAllQ();
		model.addAttribute("questions", questions);
		return "forms/diningform";		
	}
}