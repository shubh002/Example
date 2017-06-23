package com.phone.phone_server;

import java.util.*;

import com.phone.data.PhoneData;
import com.phone.phone_datamodel.entities.Phone;

public class Display {

	private List<Phone> data;
	
	public Display() {
		this.data = PhoneData.readFromList();
	}
	
	public void read()
	{
		
	}
}