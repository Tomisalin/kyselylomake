package fi.hh.ohtu.kysely.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.hh.ohtu.kysely.bean.Question;
import fi.hh.ohtu.kysely.bean.QuestionImpl;
import fi.hh.ohtu.kysely.bean.Survey;
import fi.hh.ohtu.kysely.bean.SurveyImpl;
import fi.hh.ohtu.kysely.dao.AnswerDAO;
import fi.hh.ohtu.kysely.dao.SurveyDAO;


@Controller
@RequestMapping (value="/kysely")
public class CreateSurveyController {
	
	@Inject
	private SurveyDAO dao;
	
	public SurveyDAO getDAO(){
		return dao;
	}
	
	public void setDao(SurveyDAO dao) {
		this.dao = dao;
	}
	//FORMIN TEKEMINEN
		@RequestMapping(value="uusi", method=RequestMethod.GET)
		public String getCreateForm(Model model) {
			Survey tyhjaSurvey = new SurveyImpl();
		
			model.addAttribute("survey", tyhjaSurvey);
			return "createForm";
		}
		
		//FORMIN TIETOJEN VASTAANOTTO
		@RequestMapping(value="uusi", method=RequestMethod.POST)
		public String create(@ModelAttribute(value="survey")SurveyImpl survey) {
				dao.saveSurvey(survey);
				return "redirect:/kysely/" + survey.getSurvey_id();
			}
		
		//HENKILÖN TIETOJEN NÄYTTÄMINEN
		@RequestMapping(value="{survey_id}", method=RequestMethod.GET)
		public String getView(@PathVariable Integer survey_id, Model model) {
			Survey survey = dao.findSurvey(survey_id);
			Question tyhjaQuestion = new QuestionImpl();
			model.addAttribute("survey", survey);
			model.addAttribute("question", tyhjaQuestion);
			return "addQuestions";
			
		}
		
		//FORMIN TIETOJEN VASTAANOTTO
		@RequestMapping(value="{survey_id}", method=RequestMethod.POST)
		public String createQuestion(@ModelAttribute(value="question")QuestionImpl question) {
				dao.saveQuestion(question);
				return "addQuestions";
			}
		
	
	
	
	
}