<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
<div>
	
	<c:forEach items="${questions}" var="questions">
	<p><c:out value="${questions.topic_name}" default="-----"/></p>
	<p><c:out value="${questions.question1}" default="-----"/></p>
	<p><c:out value="${questions.question2}" default="-----"/></p>
	<p><c:out value="${questions.question3}" default="-----"/></p>
	<p><c:out value="${questions.question4}" default="-----"/></p>	
	<p><c:out value="${questions.question5}" default="-----"/></p>
	</c:forEach>
	</div>
	
	
		
			
		
				
			
				
		



</body>
</html>