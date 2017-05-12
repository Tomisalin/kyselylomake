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
	
	@RequestMapping(value="vastaus", method=RequestMethod.POST)
	public ResponseEntity<Answer> createAnswer( @RequestBody AnswerImpl answer) {
		dao.saveAnswer(answer);
		return new ResponseEntity<Answer>(answer, HttpStatus.OK);
	}
	
	@RequestMapping(value="vastaukset", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<ArrayList<AnswerImpl>> createAnswer( @RequestBody ArrayList<AnswerImpl> answers) {
		//List<Answer> answers2 = answers;
		dao.saveAnswers(answers);
		return new ResponseEntity<ArrayList<AnswerImpl>>(answers, HttpStatus.OK);
	}
	
}