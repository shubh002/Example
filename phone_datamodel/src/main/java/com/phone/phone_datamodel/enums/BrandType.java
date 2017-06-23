package com.phone.phone_datamodel.enums;

public enum BrandType {
	
		NONE(1,"None"),
		APPLE(2,"Apple"),
		SAMSUNG(3,"Samsung"),
		HTC(4,"HTC"),
		LG(5,"LG"),
		LENOVO(6,"Lenovo"),
		ONEPLUS(7,"Oneplus");
	    private int intValue;
		private String displayString;
		
		private BrandType(int intValue, String displayString)
		{
			this.intValue=intValue;
			this.displayString=displayString;
		}
		
		public int getIntValue()
		{
			return this.intValue;
		}
		
		public String getDisplayString()
		{
			return this.displayString;
		}
		
		public static BrandType getByIntValue(int intValue)
		{
			return BrandType.values()[intValue-1];
		}
		

}
