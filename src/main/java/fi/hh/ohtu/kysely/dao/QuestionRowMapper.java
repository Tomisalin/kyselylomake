package fi.hh.ohtu.kysely.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.hh.ohtu.kysely.bean.*;

public class QuestionRowMapper implements RowMapper<Question> {
	
	public Question mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Question q = new QuestionImpl();
		q.setQuestion_id(rs.getInt("question_id"));
		q.setSurvey_id(rs.getInt("survey_id"));
		q.setType_name(rs.getString("type_name"));
		q.setQuestion(rs.getString("question"));
		return q;	
	}
}