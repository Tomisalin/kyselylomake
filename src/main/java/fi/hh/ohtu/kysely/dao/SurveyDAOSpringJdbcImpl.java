package fi.hh.ohtu.kysely.dao;

import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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

	public List<Survey> allSurveys() {
		String sql = "SELECT  * FROM survey LEFT OUTER JOIN question USING (survey_id) LEFT OUTER JOIN option_choice USING (question_id)";
		SurveyExtractor extractor = new SurveyExtractor();
		List<Survey> surveys = jdbcTemplate.query(sql, extractor);

		return surveys;
	}

}
