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
	
INSERT INTO topic
	(topic_name)
VALUES
	('Oma palaute');

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
	
INSERT INTO survey 
	(survey_id, survey_name , topic_name)
VALUES
	(4,'Anna oma palaute','Oma palaute');	

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
VALUES (8, 'onetofive',5);

INSERT INTO option_choice
	(option_id, type_name, optionchoice)
VALUES (9, 'frequency', 'Usein');

INSERT INTO option_choice
	(option_id, type_name, optionchoice)
VALUES (10, 'frequency', 'Joskus');

INSERT INTO option_choice
	(option_id, type_name, optionchoice)
VALUES (11, 'frequency', 'Harvoin');

INSERT INTO option_choice
	(option_id, type_name, optionchoice)
VALUES (12, 'frequency', 'En ole käynyt');



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


INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (13, 2, 'yesno', 'Oletko tyytyväinen tutkintovalintaasi?');

INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (14, 2, 'yesno', 'Oletko saanut tarpeeksi tietoa profiiliopinnoistasi?');

INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (15, 2, 'yesno', 'Oletko saanut tarpeeksi tietoa valinnaisista kursseista?');

INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (16, 2, 'yesno', 'Onko opiskelutahti mielestäsi sopiva aikautaulussa valmistumiseen?');

INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (17, 2, 'yesno', 'Antavatko opinnot mielestäsi riittävät valmiudet työelämään?');

INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (18, 2, 'textbox', 'Haluatko antaa palautetta ylläoleviin kysymyksiin liittyen:');

INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (19, 2, 'yesno', 'Ovatko nämä aiheet tuttuja sinulle: Opinnäytetyö, harjoittelu ja vaihto?');

INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (20, 2, 'yesno', 'Saatko näistä tarpeeksi tietoa?');

INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (21, 2, 'textbox', 'Haluaisitko jostakin ylläolevista lisätietoa/ mietityttääkö jokin näistä?');

INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (22, 2, 'yesno', 'Onko opiskelumateriaali helposti saatavilla ja ajan tasalla?');

INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (23, 2, 'yesno', 'Ovatko opiskelumenetelmät monipuolisia? ( Esseet, tehtävät, ryhmätyöt jne.)');

INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (24, 2, 'yesno', 'Saatko yhteyden opettajiin helposti?');

INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (25, 2, 'yesno', 'Tulevatko arvosanat ajallaan?');

INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (26, 2, 'yesno', 'Koetko oppivasi tunneilla ja tehtävien kautta?');

INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (27, 2, 'onetofive', 'Arvioi opiskeluihin liittyvät sivut asteikolla 1-5: Mynet, WinhaWille, Moodle');

INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (28,3, 'yesno', 'Oletko tietoinen opiskelijaeduista ja opiskelijakortin hankkimisesta?');

INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (29, 3, 'yesno', 'Tiedätkö mitä edunvalvonta sisältää ja kuka sitä hoitaa?');

INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (30,3, 'textbox', 'Koetko edustajiston ajavan opiskelijoiden etua?');

INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (31, 3, 'yesno', 'Jos olet lähettänyt jäsenaloitteen, onko siihen vastattu?');

INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (32, 3, 'textbox', 'Oletko tietoinen: kerhoista, liikuntaryhmistä ja kirjastosta?');

INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (33, 3, 'frequency', 'Valitse sopivin vaihtoehto, kuinka usein/ oletko käynyt: Oman ainejärjestön tapahtumissa');

INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (34, 3, 'frequency', 'Muiden ainejärjestöjen tai koulujen tapahtumissa');

INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (35, 3, 'frequency', 'Tunnet kuuluvasi "porukkaan');

INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (36, 3, 'frequency', 'Löydän tietoa tapahtumista helposti');

INSERT INTO question
	(question_id, survey_id, type_name, question)
VALUES (37, 4, 'textbox', 'Haluatko jättää jotakin muuta palautetta? Kirjoita tänne viestisi!');

