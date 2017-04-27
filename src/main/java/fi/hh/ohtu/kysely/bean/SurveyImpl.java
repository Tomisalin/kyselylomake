package fi.hh.ohtu.kysely.bean;

public class SurveyImpl implements Survey {
	
	private int survey_id;
	private String survey_name;
	private int topic_id;
	
	
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
	
	@Override
	public String toString() {
		return "SurveyImpl [survey_id=" + survey_id + ", survey_name="
				+ survey_name + ", topic_id=" + topic_id + "]";
	}
	
	
	
	
	
}
