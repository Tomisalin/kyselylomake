package fi.hh.ohtu.kysely.dao;

import fi.hh.ohtu.kysely.bean.Question;
import fi.hh.ohtu.kysely.bean.Answer;
import fi.hh.ohtu.kysely.bean.Option;
import java.util.List;

public interface QuestionDAO {

	public abstract void saveq(Question q);
	public abstract void savea(Answer a);
	
	public abstract List<Question> findAllQ();
	public abstract List<Answer> findAllA();
	public abstract List<Option> findAllO();
	
	//public abstract Question find(int question_id);
	//public abstract Answer find(int answer_id);
	
}
