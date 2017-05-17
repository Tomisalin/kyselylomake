<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form modelAttribute="survey" method="post">
		  	<fieldset>		
				<legend>Kyselyn aihe ja nimi</legend>
				<p>
					<form:label	path="topic_name">Kyselyn aihe:</form:label><br/>
					<form:input path="topic_name" />		
				</p>
				<p>	
					<form:label path="survey_name">Kyselyn nimi:</form:label><br/>
					<form:input path="survey_name" />
				</p>
				<p>	
					<button type="submit">Lisää</button>
				</p>
			</fieldset>
		</form:form>
		
		

</body>
</html>