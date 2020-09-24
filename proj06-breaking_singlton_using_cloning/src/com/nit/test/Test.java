package com.nit.test;

import com.nit.dp.Printer;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Printer p1=null, p2=null, p3=null;
	p1=Printer.getInstance();
	p2=Printer.getInstance();
	System.out.println("hashcode of p1= "+p1.hashCode());
	System.out.println("hashcode of p2= "+p2.hashCode());
	System.out.println("hashcode of p2= "+p2.hashCode());
	System.out.println("p1==p2-->"+(p1==p2));
	p3=(Printer) Printer.getInstance().clone();
	System.out.println("hashcode of p3= "+p3.hashCode());
	}
}
