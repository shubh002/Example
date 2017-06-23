package com.phone.phone_datamodel.entities;

import com.phone.phone_datamodel.enums.OSType;

public class Phone implements IPhone {

	private int id;
	
	private OSType operatingSystem;

	private Features features;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public OSType getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(OSType operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public Features getFeatures() {
		return features;
	}

	public void setFeatures(Features features) {
		this.features = features;
	}

	@Override
	public String toString() {
		return "id: "+getId()+"OStype: "+getOperatingSystem().getDisplayString();
	}
}
