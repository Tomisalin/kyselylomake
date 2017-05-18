package fi.hh.ohtu.kysely.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.inject.Inject;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;







import fi.hh.ohtu.kysely.bean.Question;
import fi.hh.ohtu.kysely.bean.Survey;


@Repository
public class SurveyDAOSpringJdbcImpl implements SurveyDAO {

	@Inject
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public Survey getSurvey(String topic_name) {
		String sql = "SELECT * FROM survey LEFT OUTER JOIN question USING (survey_id) LEFT OUTER JOIN question_type USING (type_name) LEFT OUTER JOIN  option_choice USING (type_name) WHERE survey_id IN (SELECT MAX (survey_id) as survey_id FROM survey where topic_name=? GROUP BY topic_name)";
		Object [] args = new Object[] {topic_name};
		return jdbcTemplate.query(sql,args, new SurveyExtractor());
	}
	
	public void saveSurvey(Survey s) {
		final String sql = "INSERT into survey (topic_name, survey_name) values(?,?)";
		
		final String topic = s.getTopic_name();
		final String name = s.getSurvey_name();
		
		KeyHolder idHolder = new GeneratedKeyHolder();
		
		jdbcTemplate.update(
	    	    new PreparedStatementCreator() {
	    	        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
	    	            PreparedStatement ps = connection.prepareStatement(sql, new String[] { "id" });
	    	            ps.setString(1, topic);
	    	            ps.setString(2, name);
	    	           
	    	            return ps;
	    	        }
	    	    }, idHolder);
	    
		s.setSurvey_id(idHolder.getKey().intValue());	
		
	}
	
	public Survey findSurvey(int survey_id) {
		String sql = "select topic_name, survey_name, survey_id from survey where survey_id = ?";
		Object[] parametrit = new Object[] { survey_id };
		RowMapper<Survey> mapper = new SurveyRowMapper();

		Survey s = null;
		try {
			s = jdbcTemplate.queryForObject(sql, parametrit, mapper);
		} catch (IncorrectResultSizeDataAccessException e) {
		
		}
		return s;

	}
	
	public void saveQuestion(Question q) {
		final String sql = "INSERT into question (survey_id, type_name, question) values(?,?,?)";
		
		final int survey_id = q.getSurvey_id();
		final String type_name = q.getType_name();
		final String question = q.getQuestion();
		
	
		
		jdbcTemplate.update(
	    	    new PreparedStatementCreator() {
	    	        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
	    	            PreparedStatement ps = connection.prepareStatement(sql);
	    	            ps.setInt(1, survey_id);
	    	            ps.setString(2, type_name);
	    	            ps.setString(3, question);
	    	           
	    	            return ps;
	    	        }
	    	    });
	    

		
	}
	
}
	
	
	
	

				
				
		
