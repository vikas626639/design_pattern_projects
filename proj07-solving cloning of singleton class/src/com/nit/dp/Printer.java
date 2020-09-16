package com.nit.dp;

import com.nit.interface1.CloningPrinter;

public class Printer implements CloningPrinter {
	static {
		System.out.println("Printer class has been loaded");
	}
	
	//using lazy instantition
	private static Printer instence;

	private Printer() {
		System.out.println("0 param constructor");
	}
	
	//static factory method
	public static Printer getInstance() {
		if(instence==null) {					//first null check
			synchronized (Printer.class) {
				if(instence==null) {			//double null check
					instence =new Printer();
				}
			}
		}
		return instence;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("clone method ");
		return instence;
	}

	public void printDate(String data) {
		System.out.println("user given data is ="+data);
	}
}
/*
 * we can solve the cloning of object by return this os object refrence
 */