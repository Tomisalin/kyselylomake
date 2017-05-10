INSERT INTO topic
	(topic_name)
VALUES 
	('Ruokailu');
	
INSERT INTO topic
	(topic_name)
VALUES
	('Ainejärjestö');

INSERT INTO survey 
	(survey_id, survey_name , topic_name)
VALUES
	(1,'Ruokailu toukokuussa 2017','Ruokailu');
	
INSERT INTO survey 
	(survey_id, survey_name , topic_name)
VALUES
	(2,'Ainejärjestö esimerkki kysely','Ainejärjestö');

INSERT INTO question_type
	(type_name)
VALUES ('multichoice');

INSERT INTO question_type
	(type_name)
VALUES ('textbox');

INSERT INTO question_type
	(type_name)
VALUES ('yesno');

INSERT INTO question_type
	(type_name)
VALUES ('onetofive');



INSERT INTO question 
	(question_id, survey_id, type_name, question)
VALUES (1,1, 'Textbox', 'Arvioi viikon ruoat omin sanoin');

INSERT INTO question 
	(question_id, survey_id, type_name, question)
VALUES (2,1, 'yesno', 'Oliko ruoka hyvää tänään?');

INSERT INTO question 
	(question_id, survey_id, type_name, question)
VALUES (3,1, 'onetofive', 'Arvioi tiistain ruoka (1-5)');

INSERT INTO question 
	(question_id, survey_id, type_name, question)
VALUES (4,2, 'yesno', 'Tekevätkö ainejärjestöt hyvää työtä?');




INSERT INTO option_choice
	(option_id, type_name, optionchoice)
VALUES (1,'yesno','Kyllä');

INSERT INTO option_choice
	(option_id, type_name, optionchoice)
VALUES (2, 'yesno','Ei');

INSERT INTO option_choice
	(option_id, type_name, optionchoice)
VALUES (3, 'onetofive',1);

INSERT INTO option_choice
	(option_id, type_name, optionchoice)
VALUES (4, 'onetofive',2);

INSERT INTO option_choice
	(option_id, type_name, optionchoice)
VALUES (5, 'onetofive',3);

INSERT INTO option_choice
	(option_id, type_name, optionchoice)
VALUES (6, 'onetofive',4);


INSERT INTO option_choice
	(option_id, type_name, optionchoice)
VALUES (7, 'onetofive',5);

