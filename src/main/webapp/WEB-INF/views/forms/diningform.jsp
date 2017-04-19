<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@page session="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
	<div>
	
	<form:form method="post" modelAttribute ="answers">
	<c:forEach items="${questions}" var="questions">
	<p><c:out value="${questions.topic_name}" default="-----"/></p>
	<fieldset>
	<p><c:out value="${questions.question1}" default="-----"/></p>
	<form:label	path="answer1"></form:label><br/>
					<form:textarea path="answer1" rows="5" cols="30" />
	<p><c:out value="${questions.question2}" default="-----"/></p>
	<form:label	path="answer2"></form:label><br/>
	<form:radiobutton path="answer2" value="Yes"/>Yes
	<form:radiobutton path="answer2" value="No"/>No
	<form:radiobutton path="answer2" value="I don't know"/>I don't know
	<p><c:out value="${questions.question3}" default="-----"/></p>
	<form:label	path="answer3"></form:label><br/>
	<form:radiobutton path="answer3" value="Yes"/>Yes
	<form:radiobutton path="answer3" value="No"/>No
	<form:radiobutton path="answer3" value="I don't know"/>I don't know
	<p><c:out value="${questions.question4}" default="-----"/></p>
	<form:label	path="answer4"></form:label><br/>
	<form:radiobutton path="answer4" value="Yes"/>Yes
	<form:radiobutton path="answer4" value="No"/>No
	<p><c:out value="${questions.question5}" default="-----"/></p>
	<form:label	path="answer5"></form:label><br/>
	<form:radiobutton path="answer5" value="0"/>0
	<form:radiobutton path="answer5" value="1"/>1
	<form:radiobutton path="answer5" value="2"/>2
	<form:radiobutton path="answer5" value="3"/>3
	<form:radiobutton path="answer5" value="4"/>4
	<form:radiobutton path="answer5" value="5"/>5
	<form:radiobutton path="answer5" value="I don't know"/>I don't know


	<form:hidden path="question_id" value="${questions.id}" />
	<form:hidden path="topic_name" value="${questions.topic_name}" />
	<br><br><br>
	<button type="submit">Lähetä vastaukset!</button>
	</fieldset>
	</c:forEach>
	</form:form>
	
	</div>
	
	
		
			
		
				
			
				
		



</body>
</html>