package com.phone.phone_datamodel.enums;

public enum OSType {

	NONE(1,"None"),
	IOS(2,"IOS"),
	ANDROID(3,"Android");
	
	private int intValue;
	
	private String displayString;
	
	private OSType(int intValue,String displayString) {
		this.intValue = intValue;
		this.displayString = displayString;
	}

	public int getIntValue()
	{
		return this.intValue;
	}
	
	public void setIntValue(int intValue)
	{
		this.intValue=intValue;
	}
	
	public String getDisplayString()
	{
		return this.displayString;
	}
	
	public void setDisplayString(String displayString)
	{
		this.displayString=displayString;
	}
	
	public static OSType getByIntValue(int intValue)
	{
		return OSType.values()[intValue-1];
	}
	
	
}
