package com.nit.reflectionTest;

import java.lang.reflect.Constructor;

import com.nit.dp.Printer;

public class Reflection {
	
	public static Printer loadClass() {
		    Class loadclass=null; 
		    Constructor [] c=null;
		    Printer p=null;
 		try {
 			loadclass=Class.forName("com.nit.dp.Printer");
 			//callling constructor
 			c=loadclass.getDeclaredConstructors();
 			c[0].setAccessible(true);
 			p=(Printer) c[0].newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}

}
