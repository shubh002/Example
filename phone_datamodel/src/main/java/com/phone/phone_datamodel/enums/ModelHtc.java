package com.phone.phone_datamodel.enums;

public enum ModelHtc {

	NONE(1,"None"),
	UULTRA(2,"HTC U Ultra"),
	DESIRE10PRO(3,"HTC Desire 10 Pro"),
	DESIRE828(4,"HTC Desire 828");
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
