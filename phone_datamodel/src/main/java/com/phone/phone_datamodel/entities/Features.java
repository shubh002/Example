package com.phone.phone_datamodel.entities;

import com.phone.phone_datamodel.enums.BrandType;
import com.phone.phone_datamodel.enums.ModelApple;
import com.phone.phone_datamodel.enums.ModelHtc;
import com.phone.phone_datamodel.enums.ModelLenovo;
import com.phone.phone_datamodel.enums.ModelLg;
import com.phone.phone_datamodel.enums.ModelOneplus;
import com.phone.phone_datamodel.enums.ModelSamsung;

public class Features implements IFeatures{

	private String osVersion;
	private boolean fourG;
	private int internalMemory;
	private BrandType brand;
	private ModelSamsung modelSamsung;
	private ModelApple modelApple;
	private ModelHtc modelHtc;
	private ModelLg modelLg;
	private ModelLenovo modelLenovo;
	private ModelOneplus modelOneplus;
	private int battery;
	private int ram;
	private String cpu;
	private String gpu;
	/*
	private float screenSize;
	
	private float cpuSpeed;
	
	private float gpuSpeed;
	
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
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public ModelSamsung getModelSamsung() {
		return modelSamsung;
	}
	public void setModelSamsung(ModelSamsung modelSamsung) {
		this.modelSamsung = modelSamsung;
	}
	public ModelApple getModelApple() {
		return modelApple;
	}
	public void setModelApple(ModelApple modelApple) {
		this.modelApple = modelApple;
	}
	public ModelHtc getModelHtc() {
		return modelHtc;
	}
	public void setModelHtc(ModelHtc modelHtc) {
		this.modelHtc = modelHtc;
	}
	public ModelLg getModelLg() {
		return modelLg;
	}
	public void setModelLg(ModelLg modelLg) {
		this.modelLg = modelLg;
	}
	public ModelLenovo getModelLenovo() {
		return modelLenovo;
	}
	public void setModelLenovo(ModelLenovo modelLenovo) {
		this.modelLenovo = modelLenovo;
	}
	public ModelOneplus getModelOneplus() {
		return modelOneplus;
	}
	public void setModelOneplus(ModelOneplus modelOneplus) {
		this.modelOneplus = modelOneplus;
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
	
	
	/*
	public float getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
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
