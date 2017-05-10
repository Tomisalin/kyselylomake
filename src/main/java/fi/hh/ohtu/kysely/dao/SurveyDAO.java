package fi.hh.ohtu.kysely.dao;


import fi.hh.ohtu.kysely.bean.Survey;

public interface SurveyDAO {
	
	public abstract Survey getSurvey(String topic_name);
	
}