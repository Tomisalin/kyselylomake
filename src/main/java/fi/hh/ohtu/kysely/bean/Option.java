package fi.hh.ohtu.kysely.bean;

public interface Option {
		
	public abstract int getOption_id();
	public abstract void setOption_id(int option_id);
	
	public abstract int getQuestion_id();
	public abstract void setQuestion_id(int question_id);
	
	public abstract String getOptionchoice();
	public abstract void setOptionchoice(String optionchoice);
}
