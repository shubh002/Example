package com.phone.phone_server;

import java.util.*;

import com.phone.phone_datamodel.entities.Phone;

public class Display {

	public void read()
	{
		Add a1=new Add();
		List<Phone> l1=a1.getList(); 
		System.out.println(l1);
	}
}
