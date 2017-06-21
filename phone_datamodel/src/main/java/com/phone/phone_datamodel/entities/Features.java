package com.phone.phone_datamodel.entities;

import com.phone.phone_datamodel.enums.BrandType;

public class Features implements IFeatures{

	private String osVersion;
	private boolean fourG;
	private int internalMemory;
	private BrandType brand;
	/*
	private float screenSize;
	private int battery;
	private String cpu;
	private float cpuSpeed;
	private String gpu;
	private float gpuSpeed;
	private int ram;
	private boolean isExpandable;
	*/
	public String getOsVersion() {
		return osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	public boolean isFourG() {
		return fourG;
	}
	public void setFourG(boolean fourG) {
		this.fourG = fourG;
	}
	public int getInternalMemory() {
		return internalMemory;
	}
	public void setInternalMemory(int internalMemory) {
		this.internalMemory = internalMemory;
	}
	public BrandType getBrand() {
		return brand;
	}

	public void setBrand(BrandType brand) {
		this.brand = brand;
	}
	/*
	public float getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public boolean getIsExpandable() {
		return isExpandable;
	}
	public void setIsExpandable(boolean isExpandable) {
		this.isExpandable = isExpandable;
	}
	
	public float getCpuSpeed() {
		return cpuSpeed;
	}
	public void setCpuSpeed(float cpuSpeed) {
		this.cpuSpeed = cpuSpeed;
	}
	public float getGpuSpeed() {
		return gpuSpeed;
	}
	public void setGpuSpeed(float gpuSpeed) {
		this.gpuSpeed = gpuSpeed;
	}*/
	
	
	
}
