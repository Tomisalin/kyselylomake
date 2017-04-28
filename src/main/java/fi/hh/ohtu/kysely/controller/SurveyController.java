package fi.hh.ohtu.kysely.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import fi.hh.ohtu.kysely.bean.Survey;
import fi.hh.ohtu.kysely.dao.SurveyDAO;

@Controller
@RequestMapping (value="/kysymykset")
public class SurveyController {
	@Inject
	private SurveyDAO dao;
	
	public SurveyDAO getDAO(){
		return dao;
	}
	
	public void setDao(SurveyDAO dao) {
		this.dao = dao;
	}

	@RequestMapping(value="kysely.json")
	public @ResponseBody List<Survey> getSurveys() {
	
		List<Survey> surveys = dao.allSurveys();
	
		return surveys;
	}
}
