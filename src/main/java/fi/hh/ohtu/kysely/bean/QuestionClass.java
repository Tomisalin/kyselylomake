package fi.hh.ohtu.kysely.bean;

public interface QuestionClass {

	public abstract int getId();
	public abstract void setId(int id);
	
	public abstract String getTopic();
	public abstract void setTopic(String topic);
	
	public abstract String getQuestion1();
	public abstract void setQuestion1(String question1);
	
	public abstract String getQuestion2();
	public abstract void setQuestion2(String question2);
	
	public abstract String getQuestion3();
	public abstract void setQuestion3(String question3);
	
	public abstract String getQuestion4();
	public abstract void setQuestion4(String question4);
	
	public abstract String getQuestion5();
	public abstract void setQuestion5(String question5);
}
