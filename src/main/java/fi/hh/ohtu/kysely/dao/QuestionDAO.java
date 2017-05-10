package fi.hh.ohtu.kysely.dao;

import fi.hh.ohtu.kysely.bean.Question;

import java.util.List;

public interface QuestionDAO {

	public abstract List<Question> findAllQ();
	public abstract List<Question> allQuestions();	
}