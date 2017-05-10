package fi.hh.ohtu.kysely.bean;

import java.util.ArrayList;

public class SurveyImpl implements Survey {
	
	private int survey_id;
	private String survey_name;
	private String topic_name;
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
	public String getTopic_name() {
		return topic_name;
	}
	public void setTopic_name(String topic_name) {
		this.topic_name = topic_name;
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
				+ survey_name + ", topic_name=" + topic_name + ", questions="
				+ questions + "]";
	}
	public SurveyImpl(int survey_id, String survey_name, String topic_name) {
		super();
		this.survey_id = survey_id;
		this.survey_name = survey_name;
		this.topic_name = topic_name;
	}
	public SurveyImpl() {
		super();
	}
}