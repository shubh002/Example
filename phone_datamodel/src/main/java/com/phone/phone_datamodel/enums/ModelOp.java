package com.phone.phone_datamodel.enums;

public enum ModelOp {
	OP5(1,"Oneplus 5"),
	OP3T(2,"Oneplus 3T"),
	OP3(3,"Oneplus 3"),
	OP2(2,"Oneplus 2");
	private int intValue;
	private String displayString;
	private ModelOp(int intValue,String displayString)
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
