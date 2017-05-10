package fi.hh.ohtu.kysely.bean;

import java.util.ArrayList;

public class QuestionImpl implements Question {
	
	private int question_id;
	private int survey_id;
	private String type_name;
	private String question;
	private ArrayList<Option> options= new ArrayList<Option>();
	
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public int getSurvey_id() {
		return survey_id;
	}
	public void setSurvey_id(int survey_id) {
		this.survey_id = survey_id;
	}
	
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public ArrayList<Option> getOptions() {
		return options;
	}
	public void setOptions(ArrayList<Option> options) {
		this.options = options;
	}
	
	//LISÄÄ ADD METODI, JOLLA LISÄTÄÄN VAIHTOEHTOJA
	public void add(Option option) {
		if (option != null) {
		this.options.add(option);
	}
	}
	
	public QuestionImpl(int question_id, int survey_id, String type_name,
			String question) {
		super();
		this.question_id = question_id;
		this.survey_id = survey_id;
		this.type_name = type_name;
		this.question = question;
	}
	
	@Override
	public String toString() {
		return "QuestionImpl [question_id=" + question_id + ", survey_id="
				+ survey_id + ", type_name=" + type_name + ", question="
				+ question + ", options=" + options + "]";
	}
	public QuestionImpl() {
		super();
	}
}