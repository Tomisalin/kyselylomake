package fi.hh.ohtu.kysely.bean;

public interface Answer {
	
		public abstract int getAnswer_id();
		public abstract void setAnswer_id(int answer_id);
		
		public abstract int getOption_id();
		public abstract void setOption_id(int option_id);
		
		public abstract int getQuestion_id();
		public abstract void setQuestion_id(int question_id);
		
		public abstract String getAnswer_text();
		public abstract void setAnswer_text(String answer_text);
		
		public abstract String getOptionchoice();
		public abstract void setOptionchoice(String optionchoice);
}