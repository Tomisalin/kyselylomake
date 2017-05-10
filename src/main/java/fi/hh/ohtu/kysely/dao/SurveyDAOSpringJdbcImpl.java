package fi.hh.ohtu.kysely.dao;



import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;


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

	public Survey getSurvey() {
		String sql = "SELECT * FROM survey LEFT OUTER JOIN question USING (survey_id) LEFT OUTER JOIN option_choice USING (type_name)";
		return jdbcTemplate.query(sql, new SurveyExtractor());
	}

}
