package com.nit.reflectionTest;

import java.lang.reflect.Constructor;

public class Singleton_by_reflection {
	
	public static Object doReflection() {
		Object obj=null;
		Class clazz=null;
		Constructor []con=null;
		try {
			//load the class
			clazz=Class.forName("com.nit.dp.Singleton");
			//call all the constructor
			con=clazz.getDeclaredConstructors();
			//set scceble constructor
			con[0].setAccessible(true);
			//create the object
			obj=con[0].newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("object can not be created using reflection api..............");
		}
		return obj;
	}

}
