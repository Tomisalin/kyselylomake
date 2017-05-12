package fi.hh.ohtu.kysely.dao;

import java.util.List;

import fi.hh.ohtu.kysely.bean.Answer;

public interface AnswerDAO {
	
	public abstract Answer saveAnswer(Answer a);
	//public void saveAnswers(List<Answer> answers);

}