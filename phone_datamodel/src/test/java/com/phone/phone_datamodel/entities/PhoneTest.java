package com.phone.phone_datamodel.entities;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phone.mock.BeanTester;


@Test
public class PhoneTest {

	private BeanTester beanTester;
	
	public void testBean()
	{
		beanTester = new BeanTester(TestBean.class);
		try {
			beanTester.testBean();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
