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

import fi.hh.ohtu.kysely.bean.Answer;
import fi.hh.ohtu.kysely.bean.Question;
import fi.hh.ohtu.kysely.bean.Option;
import fi.hh.ohtu.kysely.dao.QuestionDAO;

@Repository
public class QuestionDAOSpringJdbcImpl implements QuestionDAO {

	@Inject
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void saveq(Question q) {
		final String sql = "insert into question(survey_id, type_name, question) values(?,?,?)";
		
		final int survey_id = q.getSurvey_id();
		final String type_name = q.getType_name();
		final String question = q.getQuestion();
	
		
		KeyHolder idHolder = new GeneratedKeyHolder();
		
		jdbcTemplate.update(
				new PreparedStatementCreator() {
	    	        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
	    	            PreparedStatement ps = connection.prepareStatement(sql, new String[] {"question_id"});
	    	            ps.setInt(1, survey_id);
	    	            ps.setString(2, type_name);
	    	            ps.setString(3, question);
	    	      
	    	           ;
	    	            return ps;
	    	        }
	    	    }, idHolder);
	    
	
	    q.setQuestion_id(idHolder.getKey().intValue());
		
	}

	public void savea(Answer a) {
		final String sql = "insert into answers(topic_name, question_id, answer1, answer2, answer3, answer4, answer5) values(?,?,?,?,?,?,?)";
		
		final String topic_name = a.getTopic_name();
		final int question_id = a.getQuestion_id();
		final String answer1 = a.getAnswer1();
		final String answer2 = a.getAnswer2();
		final String answer3 = a.getAnswer3();
		final String answer4 = a.getAnswer4();
		final String answer5 = a.getAnswer5();
		
		KeyHolder idHolder = new GeneratedKeyHolder();
		
		jdbcTemplate.update(
				new PreparedStatementCreator() {
	    	        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
	    	            PreparedStatement ps = connection.prepareStatement(sql, new String[] {"answer_id"});
	    	            ps.setString(1, topic_name);
	    	            ps.setInt(2, question_id);
	    	            ps.setString(3, answer1);
	    	            ps.setString(4, answer2);
	    	            ps.setString(5, answer3);
	    	            ps.setString(6, answer4);
	    	            ps.setString(7, answer5);
	    	           ;
	    	            return ps;
	    	        }
	    	    }, idHolder);
	    
	
	    a.setId(idHolder.getKey().intValue());
	}

		
	

	public List<Question> findAllQ() {
		String sql = "SELECT * FROM question";
		RowMapper<Question> mapper = new QuestionRowMapper();
		List<Question> questions = jdbcTemplate.query(sql, mapper);

		return questions;
	}
	
	public List<Option> findAllO() {
		/*String sql = "SELECT * FROM option_choice";
		RowMapper<Option> mapper = new QuestionRowMapper();
		List<Option> options = jdbcTemplate.query(sql, mapper);
		 */
		return null;
	}

	public List<Answer> findAllA() {
		String sql = "select topic_name, question_id, answer1, answer2, answer3, answer4, answer5 from answers";
		RowMapper<Answer> mapper = new AnswerRowMapper();
		List<Answer> answers = jdbcTemplate.query(sql, mapper);

		return answers;
		
	}
}
