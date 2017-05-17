<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
		Kyselyn tiedot
	</h1>
	<p><c:out value="${survey.survey_id}" default="-----"/></p>
	<p><c:out value="${survey.topic_name}" default="-----"/></p>
	<p><c:out value="${survey.survey_name}" default="-----"/></p>
	
	<form:form modelAttribute="question" method="post">
		  	<fieldset>		
				<legend>Kysymyksen lisääminen</legend>
				<p>
					<form:label	path="survey_id">Kyselyn tunnus:</form:label><br/>
					<form:input path="survey_id" />		
				</p>
				<p>	
					<form:label path="type_name">Kysymyksen tyyppi (frequency, onetofive, textbox, yesno):</form:label><br/>
					<form:input path="type_name" />
				</p>
					<p>	
					<form:label path="question">Kysymys:</form:label><br/>
					<form:input path="question" />
				</p>
				<p>	
					<button type="submit">Lisää</button>
				</p>
			</fieldset>
		</form:form>

</body>
</html>