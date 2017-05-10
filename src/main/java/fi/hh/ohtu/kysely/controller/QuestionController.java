package fi.hh.ohtu.kysely.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import fi.hh.ohtu.kysely.bean.Question;
import fi.hh.ohtu.kysely.dao.QuestionDAO;

@Controller
@RequestMapping (value="/lomake")
public class QuestionController {
	@Inject
	private QuestionDAO dao;
	
	public QuestionDAO getDAO(){
		return dao;
	}
	
	public void setDao(QuestionDAO dao) {
		this.dao = dao;
	}

	@RequestMapping(value="ruokailu.json")
	public @ResponseBody List<Question> getQuestions() {
	
		List<Question> questions = dao.allQuestions();
	
		return questions;
	}
}