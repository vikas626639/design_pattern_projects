package com.nit.multithreding;
import com.nit.dp.Printer;

public class Printer_Multi implements Runnable {
	Printer p=null;
	@Override
	public void run() {
		p=Printer.getInstance();
		System.out.println("hashcode of p="+p.hashCode()+
							" and thread name is="+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		Printer_Multi p=new Printer_Multi();
		Thread t=new Thread(p);
		Thread t1=new Thread(p);
		t.start();
		t1.start();
	}
}
