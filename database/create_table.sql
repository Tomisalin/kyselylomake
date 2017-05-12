CREATE TABLE topic (
topic_name 	VARCHAR(255) NOT NULL PRIMARY KEY
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE survey (
survey_id 	INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
survey_name 	VARCHAR (255),
topic_name 	VARCHAR(255) NOT NULL,
FOREIGN KEY (topic_name) REFERENCES topic (topic_name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE question_type (
type_name 	VARCHAR(255) NOT NULL PRIMARY KEY
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE question (
question_id 	INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
survey_id 	INT NOT NULL,
type_name 	VARCHAR (255) NOT NULL,
question 	VARCHAR(255) NOT NULL,
FOREIGN KEY (survey_id) REFERENCES survey (survey_id),
FOREIGN KEY (type_name) REFERENCES question_type (type_name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE option_choice (
option_id 		INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
type_name 		VARCHAR(255) NOT NULL,
optionchoice 	VARCHAR(255),
FOREIGN KEY (type_name) REFERENCES question_type (type_name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE answer (
answer_id 		INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
answer_text 	VARCHAR(255),
option_id	 	INT,
question_id 	INT NOT NULL,
optionchoice    VARCHAR(255),
FOREIGN KEY   (option_id) REFERENCES option_choice (option_id),
FOREIGN KEY (question_id) REFERENCES question (question_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE answer, option_choice, question, question_type, survey, topic;


CREATE TABLE user (
  user_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(255) NOT NULL UNIQUE,
  password_encrypted VARCHAR(255) NOT NULL,
  enabled TINYINT NOT NULL,
  firstname VARCHAR(255) default NULL,
  lastname VARCHAR(255) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE authority (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  role VARCHAR(255) NOT NULL UNIQUE
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
CREATE TABLE user_authority (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  user_id INT NOT NULL,
  authority_id INT NOT NULL,
  FOREIGN KEY (user_id) REFERENCES user(user_id) ON DELETE NO ACTION ON UPDATE NO ACTION,
  FOREIGN KEY (authority_id) REFERENCES authority(id) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE  user_authority, user, authority;

SELECT * FROM answer;
SELECT * FROM answer_multichoice;
SELECT * FROM answer_text;
SELECT * FROM option_choice;
SELECT * FROM question;
SELECT * FROM question_type;
SELECT * FROM survey;
SELECT * FROM topic;