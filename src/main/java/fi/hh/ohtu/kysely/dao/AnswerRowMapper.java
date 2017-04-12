package fi.hh.ohtu.kysely.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.hh.ohtu.kysely.bean.*;

public class AnswerRowMapper implements RowMapper<AnswerClass> {
	
	public AnswerClass mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		AnswerClass a = new AnswerImpl();
		
		a.setTopic(rs.getString("topic_name"));
		a.setAnswer1(rs.getString("answer1"));
		a.setAnswer2(rs.getString("answer2"));
		a.setAnswer3(rs.getString("answer3"));
		a.setAnswer4(rs.getString("answer4"));
		a.setAnswer5(rs.getString("answer5"));
		
		return a;
		
		
	}

}
