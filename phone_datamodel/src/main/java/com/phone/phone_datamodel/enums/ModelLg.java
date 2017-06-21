package com.phone.phone_datamodel.enums;

public enum ModelLg {

	G6(1,"LG G6"),
	STYLUS3(2,"LG Stylus 3"),
	K10(3,"LG K 10"),
	STYLUS2(4,"LG Stylus 2");
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
