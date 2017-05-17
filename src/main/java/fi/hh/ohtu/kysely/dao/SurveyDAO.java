package fi.hh.ohtu.kysely.dao;


import fi.hh.ohtu.kysely.bean.Question;
import fi.hh.ohtu.kysely.bean.Survey;


public interface SurveyDAO {
	
	public abstract Survey getSurvey(String topic_name);
	public abstract void saveSurvey(Survey s);
	public abstract Survey findSurvey(int topic_id);
	public abstract void saveQuestion(Question q);

}