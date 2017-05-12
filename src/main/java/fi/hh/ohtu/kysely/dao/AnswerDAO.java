package fi.hh.ohtu.kysely.dao;

import java.util.ArrayList;

import fi.hh.ohtu.kysely.bean.Answer;
import fi.hh.ohtu.kysely.bean.AnswerImpl;

public interface AnswerDAO {
	
	public abstract Answer saveAnswer(Answer a);
	public void saveAnswers(ArrayList<AnswerImpl> answers);

}