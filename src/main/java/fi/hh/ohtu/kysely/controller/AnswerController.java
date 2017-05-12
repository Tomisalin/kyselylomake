package fi.hh.ohtu.kysely.controller;


import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.hh.ohtu.kysely.bean.Answer;
import fi.hh.ohtu.kysely.bean.AnswerImpl;
import fi.hh.ohtu.kysely.bean.AnswerWrapper;
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
	
	@RequestMapping(value="vastaus", method=RequestMethod.POST, consumes="application/json")
	public List<String> saveAnswer( @RequestBody AnswerWrapper wrapper) {
		List<String> response = new ArrayList<String>();
		for (Answer answer : wrapper.getAnswers()){
			dao.saveAnswer(answer);
		}
		return response;
	}
}