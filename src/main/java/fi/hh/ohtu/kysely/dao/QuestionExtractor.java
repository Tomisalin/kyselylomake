package fi.hh.ohtu.kysely.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import fi.hh.ohtu.kysely.bean.Option;
import fi.hh.ohtu.kysely.bean.OptionImpl;
import fi.hh.ohtu.kysely.bean.Question;
import fi.hh.ohtu.kysely.bean.QuestionImpl;

public class QuestionExtractor implements ResultSetExtractor {

	
	public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
		ArrayList<Question> questions = new ArrayList<Question>();
		Question question = null;
		int previd = 0;
		String typename = ""; 
		while (rs.next()){
			Integer currentid= rs.getInt("question_id");
			if(currentid != previd  ) {
				
				question = new QuestionImpl(rs.getInt("question_id"), rs.getInt("survey_id"), rs.getString("type_name"),rs.getString("question"));
				questions.add(question);
			}
			typename = rs.getString("type_name");
			if(typename.equals("Multichoice")){
			Option option = new OptionImpl(rs.getInt("option_id"), rs.getInt("question_id"),rs.getString("optionchoice"));
			question.add(option);
			}
		}
		return question;
	}
}
