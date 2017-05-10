package fi.hh.ohtu.kysely.bean;

public interface Option {
		
	public abstract int getOption_id();
	public abstract void setOption_id(int option_id);
	
	public abstract String getType_name();
	public abstract void setType_name(String type_name);
	
	public abstract String getOptionchoice();
	public abstract void setOptionchoice(String optionchoice);
}
