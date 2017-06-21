package com.phone.phone_datamodel.entities;

import com.phone.phone_datamodel.enums.OSType;

public class TestBean {

	private int id;
	private String name;
	private boolean dev;
	private OSType osType; 
	
    public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public boolean isDev() {
		return dev;
	}

	public void setDev(boolean dev) {
		this.dev = dev;
	}

	public OSType getOsType() {
		return osType;
	}

	public void setOsType(OSType osType) {
		this.osType = osType;
	}
	
	
}
