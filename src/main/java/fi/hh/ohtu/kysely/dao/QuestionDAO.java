package fi.hh.ohtu.kysely.dao;

import fi.hh.ohtu.kysely.bean.QuestionClass;
import fi.hh.ohtu.kysely.bean.AnswerClass;
import java.util.List;

public interface QuestionDAO {

	public abstract void saveq(QuestionClass q);
	public abstract void savea(AnswerClass a);
	
	public abstract List<QuestionClass> findAllQ();
	public abstract List<AnswerClass> findAllA();
	
	//public abstract Question find(int question_id);
	//public abstract Answer find(int answer_id);
	
}
