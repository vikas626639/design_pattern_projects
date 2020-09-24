package com.nit.test;

import com.nit.dp.Printer;

public class PrinterTest {
	public static void main(String[] args) {
		Printer p=null,p1=null;
		//not possoible to create object outside the class
		p=Printer.getInstance();
		p1=Printer.getInstance();
		System.out.println("hashcode of p = "+p.hashCode());
		System.out.println("hashcode of p1= "+p1.hashCode());
		System.out.println("p==p1?-->"+(p==p1));
		System.out.println("============");
		p.printDate("vikas yadav");
	}
}
