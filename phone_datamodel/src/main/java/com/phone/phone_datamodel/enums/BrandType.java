package com.phone.phone_datamodel.enums;

public enum BrandType {
	
		SAMSUNG(1,"Samsung"),
		APPLE(2,"Apple"),
		HTC(3,"HTC"),
		LG(4,"LG"),
		LENOVO(5,"Lenovo"),
		OP(6,"Oneplus");
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
