package fi.hh.ohtu.kysely.bean;

public class OptionImpl implements Option {
	
	private int option_id;
	private String type_name;
	private String optionchoice;
	
	public int getOption_id() {
		return option_id;
	}
	public void setOption_id(int option_id) {
		this.option_id = option_id;
	}
	
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	public String getOptionchoice() {
		return optionchoice;
	}
	public void setOptionchoice(String optionchoice) {
		this.optionchoice = optionchoice;
	}
	
	
	@Override
	public String toString() {
		return "OptionImpl [option_id=" + option_id + ", type_name="
				+ type_name + ", optionchoice=" + optionchoice + "]";
	}
	public OptionImpl(int option_id, String type_name, String optionchoice) {
		super();
		this.option_id = option_id;
		this.type_name = type_name;
		this.optionchoice = optionchoice;
	}	
}