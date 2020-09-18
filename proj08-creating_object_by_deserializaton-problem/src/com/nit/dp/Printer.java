package com.nit.dp;

import java.io.Serializable;

public class Printer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	
	public void printDate(String data) {
		System.out.println("user given data is ="+data);
	}
}
