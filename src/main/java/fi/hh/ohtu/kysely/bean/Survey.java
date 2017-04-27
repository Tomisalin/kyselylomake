package fi.hh.ohtu.kysely.bean;

public interface Survey {
	
	public abstract int getSurvey_id();
	public abstract void setSurvey_id(int survey_id);
	
	public abstract String getSurvey_name();
	public abstract void setSurvey_name(String survey_name);
	
	public abstract int getTopic_id();
	public abstract void setTopic_id(int topic_id);
	
	
}
