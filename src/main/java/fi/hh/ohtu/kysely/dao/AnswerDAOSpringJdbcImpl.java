package fi.hh.ohtu.kysely.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import fi.hh.ohtu.kysely.bean.Answer;
@Repository
public class AnswerDAOSpringJdbcImpl implements AnswerDAO {
	

	@Inject
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	public Answer saveAnswer(Answer a) {
		final String sql = "insert into answer(question_id, option_id, answer_text) values(?,?,?)";
		
		
		final int question_id = a.getQuestion_id();
		final int option_id = a.getOption_id();
		final String answer_text = a.getAnswer_text();

		
		KeyHolder idHolder = new GeneratedKeyHolder();
		
		jdbcTemplate.update(
				new PreparedStatementCreator() {
	    	        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
	    	            PreparedStatement ps = connection.prepareStatement(sql, new String[] {"answer_id"});
	    	            
	    	            ps.setInt(1, question_id);
	    	            ps.setInt(2, option_id);
	    	            ps.setString(3, answer_text);
	    	         
	    	           ;
	    	            return ps;
	    	        }
	    	    }, idHolder);
	    
	
	    a.setAnswer_id(idHolder.getKey().intValue());
		return a;
	}
}
