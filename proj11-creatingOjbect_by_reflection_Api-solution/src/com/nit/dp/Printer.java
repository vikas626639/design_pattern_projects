package com.nit.dp;

import java.lang.reflect.Constructor;

public class Printer {
	static {
		System.out.println("Printer class has been loaded");
	}
	//using lazy instantition
	private static Printer instence;
	private static boolean flag=false;

	private Printer() throws Exception {
		if(flag==true) {
			throw new InstantiationException("object already created");
		}
		flag=true;
		System.out.println("0 param constructor");
	}

	//static factory method
	public static Printer getInstance() throws Exception {
		if(instence==null) {					//first null check
			synchronized (Printer.class) {
				if(instence==null) {			//double null check
					instence =new Printer();
				}
			}
		}
		return instence;
	}

	public static Printer reflection() {
		Class c=null;
		Constructor con[];
		try {
			//load the class
			c=Class.forName("com.nit.dp.Printer");
			//get all the constructor
			con=c.getDeclaredConstructors();
			con[0].setAccessible(true);
			//creting object of this construor using new instance metod 
			instence=(Printer) con[0].newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return instence;
	}

	public static void display(Object obj) {
		System.out.println("hashcode is="+obj.hashCode());
		}

	public void printDate(String data) {
		System.out.println("user given data is ="+data);
	}
}