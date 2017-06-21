package com.phone.phone_datamodel.enums;

public enum ModelSamsung {
	
		GALAXYS8(1,"Samsung Galaxy S8"),
		GALAXYJ5(2,"Samsung Galaxy J5"),
		A7(3,"Samsung A7"),
		A5(4,"Samsung A5"),
		GALAXYS7(5,"Samsung Galaxy S7"),
		NOTE5(6,"Samsung NOTE 5");
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


