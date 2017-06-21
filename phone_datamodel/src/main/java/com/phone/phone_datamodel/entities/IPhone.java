package com.phone.phone_datamodel.entities;

import com.phone.phone_datamodel.enums.OSType;

public interface IPhone {
	
	public OSType getOperatingSystem();
	public void setOperatingSystem(OSType operatingSystem);
	public Features getFeatures();
	public void setFeatures(Features features);

}
