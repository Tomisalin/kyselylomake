package fi.hh.ohtu.kysely.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import FootSec.bean.Match;
import FootSec.dao.MatchRowMapper;
import fi.hh.ohtu.kysely.bean.*;

@Repository
public class QuestionDAOSpringJdbcImpl implements QuestionDAO {

	@Inject
	private JdbcTemplate jdbcTemplate;
	
	public List<Question> findALLQ(){
		String sql = "select topic_name, question1, question2, question3, question4, question5 from questions";
		RowMapper<Question> mapper = new QuestionRowMapper();
		List<Question> questions = jdbcTemplate.query(sql, mapper);

		return questions;
	}
	
	public List<Answer> findALLA(){
		
		String sql = "select topic_name, answer1, answer2, answer3, answer4, answer5 from answer";
		RowMapper<Answer> mapper = new AnswerRowMapper();
		List<Answer> answers = jdbcTemplate.query(sql, mapper);

		return answers;
		
	}
	
	public void save(Question q){
		final String sql = "insert into questions(topic_name, question1, question2, question3, question4, question5) values(?,?,?,?,?,?)";
		
		final String topic = q.getTopic();
		final String question1 = q.getQuestion1();
		final String question2 = q.getQuestion2();
		final String question3 = q.getQuestion3();
		final String question4 = q.getQuestion4();
		final String question5 = q.getQuestion5();
		
		KeyHolder idHolder = new GeneratedKeyHolder();
		
		jdbcTemplate.update(
				new PreparedStatementCreator() {
	    	        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
	    	            PreparedStatement ps = connection.prepareStatement(sql, new String[] {"question_id"});
	    	            ps.setString(1, topic);
	    	            ps.setString(2, question1);
	    	            ps.setString(3, question2);
	    	            ps.setString(4, question3);
	    	            ps.setString(5, question4);
	    	            ps.setString(6, question5);
	    	           ;
	    	            return ps;
	    	        }
	    	    }, idHolder);
	    
	
	    q.setId(idHolder.getKey().intValue());
				
				
				
				)
	}
	public void save(Answer a){
	final String sql = "insert into answer(topic_name, answer1, answer2, answer3, answer4, answer5) values(?,?,?,?,?,?)";
		
		final String topic = a.getTopic();
		final String answer1 = a.getAnswer();
		final String answer2 = a.getAnswer2();
		final String answer3 = a.getAnswer3();
		final String answer4 = a.getAnswer4();
		final String answer5 = a.getAnswer5();
		
		KeyHolder idHolder = new GeneratedKeyHolder();
		
		jdbcTemplate.update(
				new PreparedStatementCreator() {
	    	        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
	    	            PreparedStatement ps = connection.prepareStatement(sql, new String[] {"answer_id"});
	    	            ps.setString(1, topic);
	    	            ps.setString(2, answer1);
	    	            ps.setString(3, answer2);
	    	            ps.setString(4, answer3);
	    	            ps.setString(5, answer4);
	    	            ps.setString(6, answer5);
	    	           ;
	    	            return ps;
	    	        }
	    	    }, idHolder);
	    
	
	    a.setId(idHolder.getKey().intValue());
	}
	
	
	
}
