package fi.hh.ohtu.kysely.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import fi.hh.ohtu.kysely.bean.Option;
import fi.hh.ohtu.kysely.bean.OptionImpl;
import fi.hh.ohtu.kysely.bean.Question;
import fi.hh.ohtu.kysely.bean.QuestionImpl;
import fi.hh.ohtu.kysely.bean.Survey;
import fi.hh.ohtu.kysely.bean.SurveyImpl;

public class SurveyExtractor implements ResultSetExtractor<Survey> {

	public Survey extractData(ResultSet rs) throws SQLException,
			DataAccessException {
		Survey survey = null;
		Question question = null;
		int surveyPrevId = 0;
		int surveyCurrentId = 0;
		int questionCurrentId = 0;
		int questionPrevId = 0;
		String typename = "";
		while (rs.next()) {
			surveyCurrentId = rs.getInt("survey_id");
			if (surveyCurrentId != surveyPrevId) {
				survey = new SurveyImpl(rs.getInt("survey_id"),
						rs.getString("survey_name"), rs.getString("topic_name"));
				surveyPrevId = surveyCurrentId;
			}
			questionCurrentId = rs.getInt("question_id");
			if (questionCurrentId != questionPrevId) {
				question = new QuestionImpl(rs.getInt("question_id"),
						rs.getInt("survey_id"), rs.getString("type_name"),
						rs.getString("question"));
				questionPrevId = questionCurrentId;
				survey.add(question);
			}
			typename = rs.getString("type_name");
			if (!typename.equals("textbox")) {
				Option option = new OptionImpl(rs.getInt("option_id"),
						rs.getString("type_name"),
						rs.getString("optionchoice"));
				question.add(option);
			}
		}
		return survey;
	}
}
