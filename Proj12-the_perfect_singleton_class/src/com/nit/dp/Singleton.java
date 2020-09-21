package com.nit.dp;

public class Singleton {
	//using minimum standard
	private static Singleton instance;
	private static boolean condition=false;

	//defining private constructor
	private Singleton() throws Exception {
		if(condition==true) {
			throw new InstantiationException("can not instantiate");
		}
		condition=true;
		System.out.println("0 param constructor");
	}

	//egar instantiation
	public static Singleton getinstance() throws Exception {
		//first null checking
		if(instance==null) {
			synchronized (Singleton.class) {
				//double null check
				if(instance==null) {
					instance=new Singleton();
				}
			}
		}
		return instance;
	}

	//cloning 
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return instance;
	}

	//deserialization
	public Object readResolve() {
		System.out.println("calling readResolve method");
		return instance;
	}
}
