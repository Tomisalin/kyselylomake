package fi.hh.ohtu.kysely.bean;

public class OptionImpl implements Option {
	
	private int option_id;
	private int question_id;
	private String optionchoice;
	
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
	public String getOptionchoice() {
		return optionchoice;
	}
	public void setOptionchoice(String optionchoice) {
		this.optionchoice = optionchoice;
	}
	
	@Override
	public String toString() {
		return "OptionImpl [option_id=" + option_id + ", question_id="
				+ question_id + ", optionchoice=" + optionchoice + "]";
	}
	
	
	
}
