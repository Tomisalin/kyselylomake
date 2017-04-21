package fi.hh.ohtu.kysely.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fi.hh.ohtu.kysely.bean.Answer;
import fi.hh.ohtu.kysely.bean.AnswerImpl;
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
/*
	//QUESTIONS FROM DATABASE
	@RequestMapping(value="ruokailu", method=RequestMethod.GET)
	public String getDetails(Model model){
		List<Question> questions = dao.findAllQ();
		model.addAttribute("questions", questions);
		return "forms/diningform";		
	}
	*/
	//CREATING FORM
	@RequestMapping(value="ruokailu", method=RequestMethod.GET)
	public String getCreateForm(Model model) {
		Answer emptyAnswer = new AnswerImpl();
		List<Question> questions = dao.findAllQ();
		model.addAttribute("questions", questions);
		model.addAttribute("answers", emptyAnswer);
		return "forms/diningform";
	}
	
	//SAVING ANSWERS
	@RequestMapping(value="ruokailu", method=RequestMethod.POST)
	public String create( @ModelAttribute(value="answers") AnswerImpl answers) {
		dao.savea(answers);
		return "thanksman";
	}
	
	@RequestMapping(value="ruokailu.json")
	public @ResponseBody List<Question> getQuestions() {
	
		List<Question> questions = dao.findAllQ();
	
		return questions;
	}
	
	@RequestMapping(value="ruokailua.json")
	public @ResponseBody List<Answer> getAnswers() {
	
		List<Answer> answers = dao.findAllA();
	
		return answers;
	}
	
	

}