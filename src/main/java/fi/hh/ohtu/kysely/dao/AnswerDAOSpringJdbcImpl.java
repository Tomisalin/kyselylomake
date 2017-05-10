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
		final String sql = "insert into answer (answer_id, option_id ,answer_text, question_id) values(?,?,?,?)";

		final int answer_id = a.getAnswer_id();
		final int option_id = a.getOption_id();
		final String answer_text = a.getAnswer_text();
		final int question_id= a.getQuestion_id();
		
		KeyHolder idHolder = new GeneratedKeyHolder();
		
		jdbcTemplate.update(
				new PreparedStatementCreator() {
	    	        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
	    	            PreparedStatement ps = connection.prepareStatement(sql);
	    	            
	    	            ps.setInt(1, answer_id);
	    	            ps.setInt(2, option_id);
	    	            ps.setString(3, answer_text);
	    	            ps.setInt(4, question_id);
	    	         
	    	           ;
	    	            return ps;
	    	        }
	    	    }, idHolder);
	
	    a.setAnswer_id(idHolder.getKey().intValue());

		return a;
	}
}
