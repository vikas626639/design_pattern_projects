package com.nit.test;

import com.nit.dp.Printer;

public class Test {

	public static void main(String[] args) throws Exception {
		Printer p1=null,p2=null,p3=null;
		p1=Printer.getInstance();
		System.out.println("***calling p1 object***");
		Printer.display(p1);
		System.out.println();
		
		System.out.println(" calling p2 object");
		p2=Printer.getInstance();
		Printer.display(p2);
		System.out.println();
		System.out.println("p1==p2?"+(p1==p2));
		System.out.println();
		
		p3=Printer.reflection();
		Printer.display(p3);
		System.out.println("p1==p2?="+(p1==p3));

	}

}
