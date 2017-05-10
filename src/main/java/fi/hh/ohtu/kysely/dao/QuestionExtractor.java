package fi.hh.ohtu.kysely.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import fi.hh.ohtu.kysely.bean.Option;
import fi.hh.ohtu.kysely.bean.OptionImpl;
import fi.hh.ohtu.kysely.bean.Question;
import fi.hh.ohtu.kysely.bean.QuestionImpl;

public class QuestionExtractor implements ResultSetExtractor<List<Question>> {

	
	public List<Question> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<Question> questions = new ArrayList<Question>();
		Question question = null;
		int previd = 0;
		String typename = ""; 
		while (rs.next()){
			Integer currentid= rs.getInt("question_id");
			if(currentid != previd  ) {
				
				question = new QuestionImpl(rs.getInt("question_id"), rs.getInt("survey_id"), rs.getString("type_name"),rs.getString("question"));
				questions.add(question);
				previd = currentid;
			}
			typename = rs.getString("type_name");
			if(typename.equals("yesno")){
			Option option = new OptionImpl(rs.getInt("option_id"), rs.getString("type_name"),rs.getString("optionchoice"));
			question.add(option);
			}
		}
		return questions;
	}
}
