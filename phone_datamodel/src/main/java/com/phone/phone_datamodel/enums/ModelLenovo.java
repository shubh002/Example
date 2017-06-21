package com.phone.phone_datamodel.enums;

public enum ModelLenovo {

	K6POWER(1,"Lenovo K6 Power"),
	Z2PLUS(2,"Lenovo Z2 Plus"),
	K6NOTE(3,"Lenovo K6 Note"),
	A6600PLUS(4,"Lenovo A6600 Plus");
	private int intValue;
	private String displayString;
	private ModelLenovo(int intValue,String displayString)
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
