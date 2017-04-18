package fi.hh.ohtu.kysely.bean;

public interface Answer {

	
		public abstract int getId();
		public abstract void setId(int id);
		
		public abstract String getTopic_name();
		public abstract void setTopic_name(String topic_name);
		
		public abstract int getQuestion_id();
		public abstract void setQuestion_id(int question_id);
		
		public abstract String getAnswer1();
		public abstract void setAnswer1(String answer1);
		
		public abstract String getAnswer2();
		public abstract void setAnswer2(String answer2);
		
		public abstract String getAnswer3();
		public abstract void setAnswer3(String answer3);
		
		public abstract String getAnswer4();
		public abstract void setAnswer4(String answer4);
		
		public abstract String getAnswer5();
		public abstract void setAnswer5(String answer5);
		
}
