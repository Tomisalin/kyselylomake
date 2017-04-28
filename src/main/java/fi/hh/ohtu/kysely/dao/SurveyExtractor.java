package fi.hh.ohtu.kysely.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import fi.hh.ohtu.kysely.bean.Question;
import fi.hh.ohtu.kysely.bean.Survey;

private class SurveyExtractor implements ResultSetExtractor {
	
	public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
		Map<Integer, Survey> map = new HashMap<Integer, Survey>();
		Survey survey=null;
		while (rs.next()){
			Integer id= rs.getInt("survey_id");
			survey= map.get(id);
			if(survey == null) {
				String surveyname = rs.getString("survey_name");
				survey = new Survey(id, surveyname);
				map.put(id,  survey);
			}
			Question question= new Question(rs.getString("question"));
			survey.add(question);
		}
		return new ArrayList<Survey>(map.values());
	}
	

}
