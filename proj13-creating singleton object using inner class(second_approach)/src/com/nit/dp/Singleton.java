package com.nit.dp;

import java.io.Serializable;

public class Singleton implements Cloneable,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static boolean  condition;
	public Singleton() {
		if(condition==true) {
			throw new IllegalArgumentException("------***---object can not created---***--------");
		}
		condition=true;
		System.out.println("0 param constructor");
	}

	public static Singleton getInStance() {
		return Hold_singleton.instance;
	}
	
	static class Hold_singleton{
		//egar instantion
		private static Singleton instance=new Singleton();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return Hold_singleton.instance;
	}
	
	//calling readResolve method to stop creating object
	public Object readResolve() {
		System.out.println("Calling readResolve method ");
		return Hold_singleton.instance;
	}
	
}
