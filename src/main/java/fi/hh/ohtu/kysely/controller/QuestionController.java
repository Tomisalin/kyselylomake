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
	QuestionDAO dao;

	
	@RequestMapping(value="ruokailu", method=RequestMethod.GET)
	public String getDetails(Model model){
		List<Question> questions = dao.findAllQ();
		model.addAttribute("questions", questions);
		return "forms/diningform";		
	}
	
	@RequestMapping(value="ruokailu", method=RequestMethod.GET, params="topic_name")
	public String getCreateForm(Model model) {
		Answer emptyAnswer = new AnswerImpl();
		emptyAnswer.setTopic_name("Dining");
		
		model.addAttribute("answers", emptyAnswer);
		return "forms/diningform";
	}
	
	@RequestMapping(value="ruokailu", method=RequestMethod.POST)
	public String create( @ModelAttribute("answers") AnswerImpl answers) {
		dao.savea(answers);
		return "forms/diningform";
	}
}