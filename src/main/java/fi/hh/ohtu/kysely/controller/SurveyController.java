package fi.hh.ohtu.kysely.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@RequestMapping(value="/{topic_name}", method=RequestMethod.GET)
	@ResponseBody
	public Survey getSurvey(@PathVariable("topic_name") String topic_name) {
		Survey survey = dao.getSurvey(topic_name);
		return survey;
	}
}