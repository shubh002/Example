package com.phone.phone_datamodel.enums;

public enum ModelOneplus {

	NONE(1,"None"),
	ONEPLUS5(2,"Oneplus 5"),
	ONEPLUS3T(3,"Oneplus 3T"),
	ONEPLUS3(4,"Oneplus 3"),
	ONEPLUS2(5,"Oneplus 2");
	private int intValue;
	private String displayString;
	private ModelOneplus(int intValue,String displayString)
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
