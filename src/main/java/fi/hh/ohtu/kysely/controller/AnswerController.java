package fi.hh.ohtu.kysely.controller;


import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fi.hh.ohtu.kysely.bean.Answer;
import fi.hh.ohtu.kysely.bean.AnswerImpl;
import fi.hh.ohtu.kysely.dao.AnswerDAO;

@Controller
@RequestMapping (value="/vastaukset")
public class AnswerController {
	
	@Inject
	private AnswerDAO dao;
	
	public AnswerDAO getDAO(){
		return dao;
	}
	
	public void setDao(AnswerDAO dao) {
		this.dao = dao;
	}

	/*@RequestMapping(value="vastaus", method = RequestMethod.POST)
	public Answer saveAnswer(@RequestBody Answer a) {
	
		Answer answer = dao.saveAnswer(a);
	
		return answer;
	}*/
	
	@RequestMapping(value="vastaus", method=RequestMethod.POST)
	public String create( @ModelAttribute(value="answer") AnswerImpl answer) {
		dao.saveAnswer(answer);
		return "kysely/lomake";
	}
	

}