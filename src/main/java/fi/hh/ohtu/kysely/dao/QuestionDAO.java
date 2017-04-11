package fi.hh.ohtu.kysely.dao;

import fi.hh.ohtu.kysely.bean.*;
import java.util.List;

public interface QuestionDAO {

	public abstract void saveq(Question question);
	public abstract void savea(Answer answer);
	
	public abstract List<Question> findAllQ();
	public abstract List<Answer> findAllA();
	
	//public abstract Question find(int question_id);
	//public abstract Answer find(int answer_id);
	
}
