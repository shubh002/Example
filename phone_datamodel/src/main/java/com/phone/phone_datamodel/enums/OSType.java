package com.phone.phone_datamodel.enums;

public enum OSType {

	ANDROID(1,"Android"),
	IOS(2,"IOS"),
	WINDOWS(3,"Windows");
	
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
	
	public String getDisplayString()
	{
		return this.displayString;
	}
	
	public static OSType getByIntValue(int intValue)
	{
		return OSType.values()[intValue-1];
	}
	
	
}
