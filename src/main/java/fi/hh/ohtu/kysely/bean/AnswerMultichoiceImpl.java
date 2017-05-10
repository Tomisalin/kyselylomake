package fi.hh.ohtu.kysely.bean;

public class AnswerMultichoiceImpl extends AnswerImpl {
	
	private int option_id;
	private int question_id;
	
	
	public int getOption_id() {
		return option_id;
	}
	public void setOption_id(int option_id) {
		this.option_id = option_id;
	}
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	@Override
	public String toString() {
		return "AnswerMultichoiceImpl [option_id=" + option_id
				+ ", question_id=" + question_id + "]";
	}
	public AnswerMultichoiceImpl(int answer_id, int question_id, int option_id,
			String answer_text, int option_id2, int question_id2) {
		super(answer_id, question_id, option_id, answer_text);
		option_id = option_id2;
		question_id = question_id2;
	}
	public AnswerMultichoiceImpl(int answer_id, int question_id, int option_id,
			String answer_text) {
		super(answer_id, question_id, option_id, answer_text);
	}
}