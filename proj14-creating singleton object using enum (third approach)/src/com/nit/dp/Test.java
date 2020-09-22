package com.nit.dp;

import com.nit.reflectionTest.Singleton_by_reflection;
import com.nit.serializable.Serialize_printer;

public class Test {

	public static void main(String[] args) {
		Singleton s1=null, s2=null, s3=null,s4=null;
		s1=Singleton.getInstance();
		s2=Singleton.getInstance();
		Serialize_printer.doSerialize(s2);
		s3=Singleton.getInstance();
		s4=(Singleton) Singleton_by_reflection.doReflection();
		System.out.println("hashcode of s1="+s1.hashCode());
		System.out.println("hashcode of s2="+s2.hashCode());
		System.out.println("hashcode of s3="+s3.hashCode());
		System.out.println("hashcode of s4="+s4.hashCode());
		
	}
}
