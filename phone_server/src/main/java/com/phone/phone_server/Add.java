package com.phone.phone_server;
import java.util.*;

import javax.swing.JFrame;

import com.phone.data.PhoneData;
import com.phone.phone_datamodel.entities.Features;
import com.phone.phone_datamodel.entities.Phone;
import com.phone.phone_datamodel.enums.BrandType;
import com.phone.phone_datamodel.enums.OSType;

public class Add {

	private Scanner sc;
	private List<Phone> data;
	private JFrame jfrme;
	
	public Add() {
		this.data = PhoneData.readFromList();
	}
	
	public void create()
	{
		sc = new Scanner(System.in);
		char ans='y';
		do
		{
			Features f1=new Features();
			Phone p=new Phone();
			for(OSType o:OSType.values())
			{
				System.out.println(o.getIntValue()+"."+o);
			}
			System.out.println("Enter OS Type");
			int osValue=sc.nextInt();
			OSType o1=OSType.getByIntValue(osValue);
			p.setOperatingSystem(o1);
			
			
			for(BrandType b:BrandType.values())
			{
				System.out.println(b.getIntValue()+"."+b);
			}
			System.out.println("Enter Brand");
			int brandValue=sc.nextInt();
			BrandType b1=BrandType.getByIntValue(brandValue);
			f1.setBrand(b1);

			
			System.out.println("Enter OS Version");
			String osVersion=sc.nextLine();
			System.out.println("Is Phone 4G ?");
			boolean fourG=sc.nextBoolean();
			System.out.println("Enter Internal Memory (in GB)");
			int internalMemory=sc.nextInt();
			f1.setFourG(fourG);
			f1.setInternalMemory(internalMemory);
			f1.setOsVersion(osVersion);
			p.setFeatures(f1);
			
			data.add(p);
			
			System.out.println("Do you want to add more Phones (y or n)");
			ans=sc.next().charAt(0);
			
		}while(ans=='y');	
	}

	
}

