INSERT INTO topic
	(topic_id,topic_name)
VALUES 
	(1,'Ruokailu');

INSERT INTO survey 
	(survey_id, survey_name , topic_id)
VALUES
	(1,'Ruokailu toukokuussa 2017',1);

INSERT INTO question_type
	(type_name)
VALUES ('Multichoice');

INSERT INTO question_type
	(type_name)
VALUES ('Textbox');



INSERT INTO question 
	(question_id, survey_id, type_name, question)
VALUES (1,1, 'Textbox', 'Arvioi viikon ruoat omin sanoin');

INSERT INTO question 
	(question_id, survey_id, type_name, question)
VALUES (2,1, 'Multichoice', 'Oliko ruoka hyv‰‰ t‰n‰‰n?');

INSERT INTO question 
	(question_id, survey_id, type_name, question)
VALUES (3,1, 'Multichoice', 'Arvioi tiistain ruoka (1-5)');




INSERT INTO option_choice
	(option_id, question_id, optionchoice)
VALUES (1, 2,'Kyll‰');

INSERT INTO option_choice
	(option_id, question_id, optionchoice)
VALUES (2, 2,'Ei');

INSERT INTO option_choice
	(option_id, question_id, optionchoice)
VALUES (3, 3,1);

INSERT INTO option_choice
	(option_id, question_id, optionchoice)
VALUES (4, 3,2);

INSERT INTO option_choice
	(option_id, question_id, optionchoice)
VALUES (5, 3,3);

INSERT INTO option_choice
	(option_id, question_id, optionchoice)
VALUES (6, 3,4);


INSERT INTO option_choice
	(option_id, question_id, optionchoice)
VALUES (7, 3,5);

