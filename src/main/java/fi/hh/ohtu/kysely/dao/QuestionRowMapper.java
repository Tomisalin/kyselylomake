package fi.hh.ohtu.kysely.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.hh.ohtu.kysely.bean.*;

public class QuestionRowMapper implements RowMapper<QuestionClass> {
	
	public QuestionClass mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		QuestionClass q = new QuestionImpl();
		
		q.setTopic(rs.getString("topic_name"));
		q.setQuestion1(rs.getString("question1"));
		q.setQuestion2(rs.getString("question2"));
		q.setQuestion3(rs.getString("question3"));
		q.setQuestion4(rs.getString("question4"));
		q.setQuestion5(rs.getString("question5"));
		
		return q;
		
		
	}

}
