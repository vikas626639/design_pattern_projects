package com.nit.test;

import com.nit.dp.Singleton;
import com.nit.reflectionTest.Singleton_by_reflection;
import com.nit.serializable.Serialize_printer;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Singleton p1=null,p2=null,p3=null,p4=null,p5=null;
		
		p1=Singleton.getInStance();
		
		//clonning of p1 class object
		p2=(Singleton) p1.clone();							//testing cloning
		Serialize_printer.doSerialize(p2);					
		p3=(Singleton) Serialize_printer.dodeserialize();	//testing desirialization
		p4=(Singleton) Singleton_by_reflection.doReflection();		//testing reflection api
		System.out.println("hashcode of p1="+p1.hashCode());
		System.out.println("hashcode of p2="+p2.hashCode());
		System.out.println("hashcode of p3="+p3.hashCode());
		//System.out.println("hashcode of p4="+p4.hashCode());
	}
}
