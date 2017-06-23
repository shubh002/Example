package com.phone.phone_datamodel.enums;

public enum ModelLg {

	NONE(1,"None"),
	G6(2,"LG G6"),
	STYLUS3(3,"LG Stylus 3"),
	K10(4,"LG K 10"),
	STYLUS2(5,"LG Stylus 2");
	private int intValue;
	private String displayString;
	private ModelLg(int intValue,String displayString)
	{
		this.intValue=intValue;
		this.displayString=displayString;
	}
	public int getIntValue()
	{
		return intValue;
	}
	public String getDisplayString()
	{
		return displayString;
	}
}
