package com.phone.phone_datamodel.enums;

public enum ModelApple {

	IPHONE7(1,"iPhone 7"),
	IPHONE6S(2,"iPhone 6s"),
	IPHONE6(3,"iPhone 6"),
	IPHONE5s(4,"iphone5s");
	private int intValue;
	private String displayString;
	private ModelApple(int intValue,String displayString)
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
