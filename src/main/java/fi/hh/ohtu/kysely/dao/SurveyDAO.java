package fi.hh.ohtu.kysely.dao;

import java.util.List;

import fi.hh.ohtu.kysely.bean.*;

public interface SurveyDAO {
	
	public abstract List<Survey> allSurveys();
	
}
