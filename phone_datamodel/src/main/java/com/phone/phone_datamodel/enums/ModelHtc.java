package com.phone.phone_datamodel.enums;

public enum ModelHtc {

	UULTRA(1,"HTC U Ultra"),
	DESIRE10PRO(2,"HTC Desire 10 Pro"),
	DESIRE828(3,"HTC Desire 828");
	private int intValue;
	private String displayString;
	private ModelHtc(int intValue,String displayString)
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
