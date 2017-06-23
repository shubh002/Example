package com.phone.data;

import java.util.ArrayList;
import java.util.List;

import com.phone.phone_datamodel.entities.Phone;

public class PhoneData{

	
	private static List<Phone> data = new ArrayList<Phone>();
	
	
	public static void  addToList(Phone phone){
		data.add(phone);
	}
	
	public static void  removeFromList(Phone phone){
		data.remove(phone);
	}

	public static void  updateList(Phone existingPhone,Phone newPhone){
		if(data.contains(existingPhone))
		{
			data.remove(existingPhone);
			data.add(newPhone);
		}
	}

	public static List<Phone> readFromList(){
		return data;
	}
	
	public void clearData()
	{
		data.removeAll(data);
	}
	
	
	
	
}
