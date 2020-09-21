package com.nit.multithreading;

import com.nit.dp.Singleton;

public class MultiThreading_Test implements Runnable {
	Singleton s1=null;
	@Override
	public void run() {
		s1=Singleton.getInStance();
		System.out.println("hashcode of created objec is="+s1.hashCode()+" and thread name is="+Thread.currentThread().getName());

	}

	public static void main(String[] args) {
		MultiThreading_Test m=new MultiThreading_Test();
		Thread t1=new Thread(m);
		Thread t2=new Thread(m);
		Thread t3=new Thread(m);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
