package fi.hh.ohtu.kysely.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.hh.ohtu.kysely.bean.*;

public class AnswerRowMapper implements RowMapper<Answer> {
	
	public Answer mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Answer a = new AnswerImpl();
		
		a.setAnswer_id(rs.getInt("answer_id"));
		a.setQuestion_id(rs.getInt("question_id"));
		a.setOption_id(rs.getInt("option_id"));
		a.setAnswer_text(rs.getString("answer_text"));
		a.setOptionchoice(rs.getString("optionchoice"));
		return a;
	
	}
}