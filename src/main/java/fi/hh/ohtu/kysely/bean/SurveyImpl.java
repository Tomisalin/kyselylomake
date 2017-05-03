package fi.hh.ohtu.kysely.bean;

import java.util.ArrayList;

public class SurveyImpl implements Survey {
	
	private int survey_id;
	private String survey_name;
	private int topic_id;
	private ArrayList<Question> questions= new ArrayList<Question>();
	
	
	public int getSurvey_id() {
		return survey_id;
	}
	public void setSurvey_id(int survey_id) {
		this.survey_id = survey_id;
	}
	public String getSurvey_name() {
		return survey_name;
	}
	public void setSurvey_name(String survey_name) {
		this.survey_name = survey_name;
	}
	public int getTopic_id() {
		return topic_id;
	}
	public void setTopic_id(int topic_id) {
		this.topic_id = topic_id;
	}
	
	public ArrayList<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}
	
	//LISÄÄ ADD METODI, JOLLA LISÄTÄÄN KYSYMYKSIÄ
	public void add(Question question) {
		if (question != null) {
		this.questions.add(question);
	}
	}
	@Override
	public String toString() {
		return "SurveyImpl [survey_id=" + survey_id + ", survey_name="
				+ survey_name + ", topic_id=" + topic_id + ", questions="
				+ questions + "]";
	}
	public SurveyImpl(int survey_id, String survey_name, int topic_id) {
		super();
		this.survey_id = survey_id;
		this.survey_name = survey_name;
		this.topic_id = topic_id;
	}
	public SurveyImpl() {
		super();
	}
	
	
	
	
	
	
	
	
	
	
}
