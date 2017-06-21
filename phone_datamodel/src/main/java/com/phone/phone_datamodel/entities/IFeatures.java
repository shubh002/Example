package com.phone.phone_datamodel.entities;

import com.phone.phone_datamodel.enums.BrandType;

public interface IFeatures 
{

	public String getOsVersion();
	public void setOsVersion(String osVersion);
	public boolean isFourG();
	public void setFourG(boolean fourG);
	public int getInternalMemory();
	public void setInternalMemory(int internalMemory);
	public BrandType getBrand();
	public void setBrand(BrandType brand);
}
