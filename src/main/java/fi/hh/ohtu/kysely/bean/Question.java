package fi.hh.ohtu.kysely.bean;

public interface Question {

	public abstract int getQuestion_id();
	public abstract void setQuestion_id(int question_id);
	
	public abstract int getSurvey_id();
	public abstract void setSurvey_id(int survey_id);

	public abstract String getType_name();
	public abstract void setType_name(String type_name);
	
	public abstract String getQuestion();
	public abstract void setQuestion(String question);
	
	public abstract void add(Option option); 
}