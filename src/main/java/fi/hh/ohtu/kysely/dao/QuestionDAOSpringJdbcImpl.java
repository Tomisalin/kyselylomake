package fi.hh.ohtu.kysely.dao;


import java.util.List;
import javax.inject.Inject;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import fi.hh.ohtu.kysely.bean.Question;
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

	public List<Question> findAllQ() {
		String sql = "SELECT  * FROM survey LEFT OUTER JOIN question USING (survey_id) LEFT OUTER JOIN option_choice USING (type_name)";
		RowMapper<Question> mapper = new QuestionRowMapper();
		List<Question> questions = jdbcTemplate.query(sql, mapper);

		return questions;
	}
	
	public List<Question> allQuestions(){
		String sql = "SELECT  * FROM survey LEFT OUTER JOIN question USING (survey_id) LEFT OUTER JOIN option_choice USING (type_name)";

		return jdbcTemplate.query(sql, new QuestionExtractor());
	}
}