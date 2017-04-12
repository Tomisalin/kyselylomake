package fi.hh.ohtu.kysely.bean;

public class QuestionImpl implements QuestionClass {

	private int id;
	private String topic;
	private String question1;
	private String question2;
	private String question3;
	private String question4;
	private String question5;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getQuestion1() {
		return question1;
	}
	public void setQuestion1(String question1) {
		this.question1 = question1;
	}
	public String getQuestion2() {
		return question2;
	}
	public void setQuestion2(String question2) {
		this.question2 = question2;
	}
	public String getQuestion3() {
		return question3;
	}
	public void setQuestion3(String question3) {
		this.question3 = question3;
	}
	public String getQuestion4() {
		return question4;
	}
	public void setQuestion4(String question4) {
		this.question4 = question4;
	}
	public String getQuestion5() {
		return question5;
	}
	public void setQuestion5(String question5) {
		this.question5 = question5;
	}
	@Override
	public String toString() {
		return "QuestionImpl [id=" + id + ", topic=" + topic + ", question1="
				+ question1 + ", question2=" + question2 + ", question3="
				+ question3 + ", question4=" + question4 + ", question5="
				+ question5 + "]";
	}
	
	
}
