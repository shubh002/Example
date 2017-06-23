package com.phone.phone_datamodel.enums;

public enum ModelSamsung {
	
		NONE(1,"None"),
		GALAXYS8(2,"Samsung Galaxy S8"),
		GALAXYJ5(3,"Samsung Galaxy J5"),
		A7(4,"Samsung A7"),
		A5(5,"Samsung A5"),
		GALAXYS7(6,"Samsung Galaxy S7");	
		private int intValue;
		private String displayString;

		private ModelSamsung(int intValue,String displayString)
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


