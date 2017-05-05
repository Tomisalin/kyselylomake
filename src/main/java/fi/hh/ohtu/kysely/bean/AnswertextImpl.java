package fi.hh.ohtu.kysely.bean;

public class AnswertextImpl extends AnswerImpl {

	private String answer_text;
	private int question_id;
	public String getAnswer_text() {
		return answer_text;
	}
	public void setAnswer_text(String answer_text) {
		this.answer_text = answer_text;
	}
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	@Override
	public String toString() {
		return "AnswertextImpl [answer_text=" + answer_text + ", question_id="
				+ question_id + "]";
	}
	public AnswertextImpl(int answer_id, int question_id, int option_id,
			String answer_text, String answer_text2, int question_id2) {
		super(answer_id, question_id, option_id, answer_text);
		answer_text = answer_text2;
		question_id = question_id2;
	}
	public AnswertextImpl(int answer_id, int question_id, int option_id,
			String answer_text) {
		super(answer_id, question_id, option_id, answer_text);
	}
}