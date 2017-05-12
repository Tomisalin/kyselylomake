package fi.hh.ohtu.kysely.bean;

public class AnswerImpl implements Answer {
	
	private int answer_id;
	private int question_id;
	private int option_id;
	private String answer_text;
	private String optionchoice;
	
	public int getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public int getOption_id() {
		return option_id;
	}
	public void setOption_id(int option_id) {
		this.option_id = option_id;
	}
	public String getAnswer_text() {
		return answer_text;
	}
	public void setAnswer_text(String answer_text) {
		this.answer_text = answer_text;
	}
	
	public String getOptionchoice() {
		return optionchoice;
	}
	public void setOptionchoice(String optionchoice) {
		this.optionchoice = optionchoice;
	}
	@Override
	public String toString() {
		return "AnswerImpl [answer_id=" + answer_id + ", question_id="
				+ question_id + ", option_id=" + option_id + ", answer_text="
				+ answer_text + ", optionchoice=" + optionchoice + "]";
	}
	public AnswerImpl(int answer_id, int question_id, int option_id,
			String answer_text, String optionchoice) {
		super();
		this.answer_id = answer_id;
		this.question_id = question_id;
		this.option_id = option_id;
		this.answer_text = answer_text;
		this.optionchoice = optionchoice;
	}
	
	public AnswerImpl() {
	super();
	}
}