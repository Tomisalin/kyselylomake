package fi.hh.ohtu.kysely.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.hh.ohtu.kysely.bean.Answer;
import fi.hh.ohtu.kysely.bean.AnswerImpl;
import fi.hh.ohtu.kysely.bean.Survey;
import fi.hh.ohtu.kysely.bean.SurveyImpl;

public class SurveyRowMapper implements RowMapper<Survey> {
	
	public Survey mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Survey s = new SurveyImpl();
		
		s.setSurvey_id(rs.getInt("survey_id"));
		s.setTopic_name(rs.getString("topic_name"));
		s.setSurvey_name(rs.getString("survey_name"));
		return s;
	
	}
}