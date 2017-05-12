<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>School forms</title>
</head>
<body>
<h1>Kysely info</h1>


<select  name="aiheet">
<c:forEach items="${topic}" var ="topic">
<option value="${topic}">
</option>
</c:forEach>
</select>
<br>

<select  name="kysely">
<c:forEach items="${survey}" var="survey">
<option value ="${survey.name}">
</option>
</c:forEach>
</select>
<br>

<select  name="kysymys">
<c:forEach items="${question}" var="question">
<option value="${question.question}">
</option>
</c:forEach>
</select>

<br>
<a href="vastaukset/vastauslista" >Kaikki vastaukset</a>


<h2>Kyselyiden haku JSON GET</h2>
<b>http://proto317.haaga-helia.fi:8080/kysely/kysymykset/?</b>
<p> ? tuossa linkissä on topic_name eli esim. Ruokailu, Ainejärjestöt jne. </p>


<div style="word-wrap: break-word; white-space: -moz-pre-wrap; white-space: pre-wrap; ">
{
  "survey_id": 1,
  "survey_name": "Ruokailu toukokuussa 2017",
  "topic_name": "Ruokailu",
  "questions": [
    {
      "question_id": 1,
      "survey_id": 1,
      "type_name": "Textbox",
      "question": "Arvioi viikon ruoat omin sanoin",
      "options": []
    },
    {
      "question_id": 2,
      "survey_id": 1,
      "type_name": "Multichoice",
      "question": "Oliko ruoka hyvää tänään?",
      "options": [
        {
          "option_id": 1,
          "question_id": 2,
          "optionchoice": "Kyllä"
        },
        {
          "option_id": 2,
          "question_id": 2,
          "optionchoice": "Ei"
        }
      ]
    },
    {
      "question_id": 3,
      "survey_id": 1,
      "type_name": "Multichoice",
      "question": "Arvioi tiistain ruoka (1-5)",
      "options": [
        {
          "option_id": 3,
          "question_id": 3,
          "optionchoice": "1"
        },
        {
          "option_id": 4,
          "question_id": 3,
          "optionchoice": "2"
        },
        {
          "option_id": 5,
          "question_id": 3,
          "optionchoice": "3"
        },
        {
          "option_id": 6,
          "question_id": 3,
          "optionchoice": "4"
        },
        {
          "option_id": 7,
          "question_id": 3,
          "optionchoice": "5"
        }
      ]
    }
  ]
}
</div>

<h2>Vastausten haku JSON POST - esimerkit multichoicelle ja tekstivastaukselle</h2>
<b>http://proto317.haaga-helia.fi:8080/kysely/vastaukset/vastaus</b>
<p>Huom: Tällä toteutuksella saa toistaiseksi lähetettyä vain yhden vastauksen kerrallaan.</p>

<div style="word-wrap: break-word; white-space: -moz-pre-wrap; white-space: pre-wrap; ">
{
"answer_id": ?, <--- Laita tähän eri numeroita kunnes ei tule erroria
"option_id": 2,
"answer_text": "",
"question_id" : 2
}

{
"answer_id": ?, <--- Laita tähän eri numeroita kunnes ei tule erroria
"option_id": 8,     (tällä hetkellä tietokannassa option_id: 8 tarkoittaa "ei vaihtoehtoja")
"answer_text": "Ruoka oli erinomaista",
"question_id" : 1
}
</div>

</body>
</html>