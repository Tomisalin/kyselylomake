package fi.hh.ohtu.kysely.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

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

	public void saveAnswers(List<Answer> answers) {
		final String sql = "insert into answer (answer_id, option_id ,answer_text, question_id) values(?,?,?,?)";

		int answer_id = 0;
		int option_id = 0;
		String answer_text = null;
		int question_id = 0;
		
		
		for (int i = 0; i < answers.size(); i++) {
			
			Answer a = null;
			//haetaan listasta yksi vastaus "a"
			answer_id = a .getAnswer_id();
			option_id = a.getOption_id();
			answer_text = a.getAnswer_text();
			question_id = a.getQuestion_id();

			Object[] args = new Object[] { answer_id, option_id, answer_text,
					question_id };

			jdbcTemplate.update(sql, args);
		}

	}

	public Answer saveAnswer(Answer a) {

		final String sql = "insert into answer (answer_id, option_id ,answer_text, question_id) values(?,?,?,?)";

		final int answer_id = a.getAnswer_id();
		final int option_id = a.getOption_id();
		final String answer_text = a.getAnswer_text();
		final int question_id = a.getQuestion_id();

		KeyHolder idHolder = new GeneratedKeyHolder();

		jdbcTemplate.update(new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(
					Connection connection) throws SQLException {
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
