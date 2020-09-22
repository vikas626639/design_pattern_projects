package com.nit.multithreadingTest;

import com.nit.dp.Singleton;

public class Multi_Singleton implements Runnable {
		
	Singleton s1=null,s2=null;
	@Override
	public void run() {
		s1=Singleton.getInstance();
		System.out.println("hashcode of s1="+s1.hashCode()+" and running thread name is="+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		Multi_Singleton m=new Multi_Singleton();
		Thread t1=new Thread(m);
		Thread t2=new Thread(m);
		t1.start();
		t2.start();	
	}

}
