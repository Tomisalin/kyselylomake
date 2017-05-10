INSERT INTO topic
	(topic_name)
VALUES 
	('Kampus');
	
INSERT INTO topic
	(topic_name)
VALUES
	('Koulutus');
	
INSERT INTO topic
	(topic_name)
VALUES
	('Opiskelijaelämä');

INSERT INTO survey 
	(survey_id, survey_name , topic_name)
VALUES
	(1,'Kampus kysely 2017','Kampus');
	
INSERT INTO survey 
	(survey_id, survey_name , topic_name)
VALUES
	(2,'Koulutus kysely 2017','Koulutus');

INSERT INTO survey 
	(survey_id, survey_name , topic_name)
VALUES
	(3,'Opiskelija kysely 2017','Opiskelijaelämä');

INSERT INTO question_type
	(type_name)
VALUES ('textbox');

INSERT INTO question_type
	(type_name)
VALUES ('yesno');

INSERT INTO question_type
	(type_name)
VALUES ('onetofive');

INSERT INTO question_type
	(type_name)
VALUES ('frequency');


INSERT INTO question 
	(question_id, survey_id, type_name, question)
VALUES (1,1, 'yesno', 'Oletko tietoinen kouluterveydenhoitoon kuuluvista ihmisistä? ( Koulupsykologi, Terveydenhuolto, Pappi, Kuraattori)');

INSERT INTO question 
	(question_id, survey_id, type_name, question)
VALUES (2,1, 'yesno', 'Pitäisikö näistä antaa lisätietoja opiskelijoille?');

INSERT INTO question 
	(question_id, survey_id, type_name, question)
VALUES (3,1, 'yesno', 'Oletko käyttänäyt Helga Kitchen:ä?');

INSERT INTO question 
	(question_id, survey_id, type_name, question)
VALUES (4,1, 'yesno', 'Olivatko tilat siistit?');

INSERT INTO question 
	(question_id, survey_id, type_name, question)
VALUES (5,1, 'textbox', 'Miten parantaisit tiloja?');

INSERT INTO question 
	(question_id, survey_id, type_name, question)
VALUES (6,1, 'yesno', 'Ovatko yleiset tilat mielestäsi viihtyisät?');

INSERT INTO question 
	(question_id, survey_id, type_name, question)
VALUES (7,1, 'yesno', 'Onko yleisissä tiloissa tarpeeksi istumatilaa?');

INSERT INTO question 
	(question_id, survey_id, type_name, question)
VALUES (8,1, 'yesno', 'Toimivatko yleiset tietokoneet mielestäsi hyvin?');

INSERT INTO question 
	(question_id, survey_id, type_name, question)
VALUES (9,1, 'yesno', 'Oletko tyytyväinen opettajiin ja opetukseen?');

INSERT INTO question 
	(question_id, survey_id, type_name, question)
VALUES (10,1, 'yesno', 'Oletko ollut yhteydessä opoon liittyen opintoihisi?');

INSERT INTO question 
	(question_id, survey_id, type_name, question)
VALUES (11,1, 'yesno', 'Oletko tyytyväinen muuhun henkilökuntaan? ( Siistijä, aulatyöntekijä, IT- tuki jne.)');

INSERT INTO question 
	(question_id, survey_id, type_name, question)
VALUES (12,1, 'textbox', 'Toiveita tai palautetta henkilökuntaa koskien:');







INSERT INTO option_choice
	(option_id, type_name, optionchoice)
VALUES (1,'textbox','Ei vaihtoehtoja');

INSERT INTO option_choice
	(option_id, type_name, optionchoice)
VALUES (2, 'yesno','Kyllä');

INSERT INTO option_choice
	(option_id, type_name, optionchoice)
VALUES (3, 'yesno','Ei');

INSERT INTO option_choice
	(option_id, type_name, optionchoice)
VALUES (4, 'onetofive',1);

INSERT INTO option_choice
	(option_id, type_name, optionchoice)
VALUES (5, 'onetofive',2);

INSERT INTO option_choice
	(option_id, type_name, optionchoice)
VALUES (6, 'onetofive',3);

INSERT INTO option_choice
	(option_id, type_name, optionchoice)
VALUES (7, 'onetofive',4);

INSERT INTO option_choice
	(option_id, type_name, optionchoice)
VALUES (8, 'frequency', 'Usein');

INSERT INTO option_choice
	(option_id, type_name, optionchoice)
VALUES (9, 'frequency', 'Joskus');

INSERT INTO option_choice
	(option_id, type_name, optionchoice)
VALUES (10, 'frequency', 'Harvoin');

INSERT INTO option_choice
	(option_id, type_name, optionchoice)
VALUES (11, 'frequency', 'En ole käynyt');








