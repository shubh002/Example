package com.phone.mock;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;






import junit.framework.Assert;

public class BeanTester {
	
	private static Random rand = new Random();
	private final Class<?> beanClass;
	private static final int DUMMY_INT = rand.nextInt();
	private static final long DUMMY_LONG = rand.nextLong();
	private static final String DUMMY_STRING = RandomStringUtils.randomAscii(10);
	private static final boolean DUMMY_BOOLEAN = rand.nextBoolean();
	private static final float DUMMY_FLOAT = rand.nextFloat();
	private static final double DUMMY_DOUBLE = rand.nextDouble();
	private static final short DUMMY_SHORT = (short) rand.nextInt();
	private static final char DUMMY_CHAR = (char) rand.nextInt();
	private static final byte DUMMY_BYTE= (byte) rand.nextInt();
	
	
	
	public BeanTester(Class<?> beanClass) {
		this.beanClass = beanClass;
	}
	
	private List<Field> fieldList = new ArrayList<Field>();
	
	public void testBean() throws Exception
	{
		Field fields[] = beanClass.getDeclaredFields();
		fieldList = Arrays.asList(fields);	
	
		for(Field field:fieldList)
		{
			testIndividualGetterAndSetter(beanClass,field.getName(),field.getType());	
		}
		
	}

	private void testIndividualGetterAndSetter(Class<?> beanClass,String fieldName,Type fieldType) throws Exception {
		
		String getterMethodName = null;
		String setterMethodName = null;
		
		Object instance = beanClass.newInstance();
 		
		if(fieldType.equals(boolean.class))
		{
			getterMethodName  = "is"+Character.toUpperCase(fieldName.charAt(0))+fieldName.substring(1);
			setterMethodName = "set"+Character.toUpperCase(fieldName.charAt(0))+fieldName.substring(1);
		}else
		{
			getterMethodName = "get"+Character.toUpperCase(fieldName.charAt(0))+fieldName.substring(1);
			setterMethodName = "set"+Character.toUpperCase(fieldName.charAt(0))+fieldName.substring(1);
		}
	
		System.out.println(getterMethodName+" "+setterMethodName);

		Method setterMethod = null;
		Method getterMethod = null;
		
		if(fieldType.equals(boolean.class))
		{
			setterMethod = beanClass.getDeclaredMethod(setterMethodName,boolean.class);
			setterMethod.invoke(instance, DUMMY_BOOLEAN);
			getterMethod = beanClass.getDeclaredMethod(getterMethodName,null);
			Assert.assertEquals(DUMMY_BOOLEAN,getterMethod.invoke(instance, null));
		}
		
		else if(fieldType.equals(int.class))
		{
			setterMethod = beanClass.getDeclaredMethod(setterMethodName, int.class);
			setterMethod.invoke(instance, DUMMY_INT);
			getterMethod = beanClass.getDeclaredMethod(getterMethodName, null);
			Assert.assertEquals(DUMMY_INT, getterMethod.invoke(instance, null));
		}
		
		else if(fieldType.equals(String.class))
		{
			setterMethod = beanClass.getDeclaredMethod(setterMethodName, String.class);
			setterMethod.invoke(instance, DUMMY_STRING);
			getterMethod = beanClass.getDeclaredMethod(getterMethodName, null);
			Assert.assertEquals(DUMMY_STRING, getterMethod.invoke(instance, null));
		}
		else if(fieldType.equals(long.class))
		{
			setterMethod = beanClass.getDeclaredMethod(setterMethodName, long.class);
			setterMethod.invoke(instance, DUMMY_LONG);
			getterMethod = beanClass.getDeclaredMethod(getterMethodName, null);
			Assert.assertEquals(DUMMY_LONG, getterMethod.invoke(instance, null));	
		}
		else if(fieldType.equals(float.class))
		{
			setterMethod = beanClass.getDeclaredMethod(setterMethodName, float.class);
			setterMethod.invoke(instance, DUMMY_FLOAT);
			getterMethod = beanClass.getDeclaredMethod(getterMethodName, null);
			Assert.assertEquals(DUMMY_FLOAT,getterMethod.invoke(instance, null));
		}
		else if(fieldType.equals(double.class))
		{
			setterMethod = beanClass.getDeclaredMethod(setterMethodName, double.class);
			setterMethod.invoke(instance, DUMMY_DOUBLE);
			getterMethod = beanClass.getDeclaredMethod(getterMethodName, null);
			Assert.assertEquals(DUMMY_DOUBLE, getterMethod.invoke(instance, null));
		}
		else if (fieldType.equals(short.class))
		{
			setterMethod = beanClass.getDeclaredMethod(setterMethodName, short.class);
			setterMethod.invoke(instance, DUMMY_SHORT);
			getterMethod = beanClass.getDeclaredMethod(getterMethodName, null);
			Assert.assertEquals(DUMMY_SHORT, getterMethod.invoke(instance, null));	
		}
		else if(fieldType.equals(char.class))
		{
			setterMethod = beanClass.getDeclaredMethod(setterMethodName, char.class);
			setterMethod.invoke(instance, DUMMY_CHAR);
			getterMethod = beanClass.getDeclaredMethod(getterMethodName, null);
			Assert.assertEquals(DUMMY_CHAR,getterMethod.invoke(instance, null));
		}
		else if(fieldType.equals(byte.class))
		{
			setterMethod = beanClass.getDeclaredMethod(setterMethodName, byte.class);
			setterMethod.invoke(instance, DUMMY_BYTE);
			getterMethod = beanClass.getDeclaredMethod(getterMethodName, null);
			Assert.assertEquals(DUMMY_BYTE, getterMethod.invoke(instance, null));
		}
		else if(fieldType instanceof Class && ((Class<?>)fieldType).isEnum())
		{	
			List enumConstants = Arrays.asList(((Class<?>) fieldType).getEnumConstants());
			setterMethod = beanClass.getDeclaredMethod(setterMethodName, (Class)fieldType);
			setterMethod.invoke(instance, enumConstants.get(0));
			getterMethod = beanClass.getDeclaredMethod(getterMethodName, null);
			Assert.assertEquals(enumConstants.get(0), getterMethod.invoke(instance, null));
			
		}
		
		//System.out.println(getterMethod.invoke(instance, null));
	
	}
		
	}
	
	
