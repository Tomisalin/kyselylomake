<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${answers}" var ="answer">
<p>Vastaus id: <c:out value="${answer.answer_id}"></c:out></p>
<p>Kysymys id: <c:out value="${answer.question_id}"></c:out></p>
<p>Vastaus teksti: <c:out value="${answer.answer_text}"></c:out></p>
<p>Vastaus id: <c:out value="${answer.option_id}"></c:out></p>
<p>Vastaus valinta: <c:out value="${answer.optionchoice}"></c:out></p>
<p>--------------------------------------------------------------</p>
</c:forEach>
</body>
</html>
