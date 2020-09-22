package com.nit.dp;

public enum Singleton implements Cloneable  {
	instance;
	
	public static Singleton getInstance() {
		return instance;
	}
	
	//business method
	public void printData(String data) {
		System.out.println("user given data is="+data);
	}
	
	// after implements cloneable interface also clone method not availbe here 
	//so we can not override clone method here so cloning not possible here
	
	
	
}

//Group of named constants (final and static) is called enum ,  enum can have normal method and normal instance variables also 
//Enum is internally is class which is extending one predefine class called enum.
//By using enum most of the problem can solve by enum which is came since java 5 on words.


//enum object is alredy static and final and enum is internally is a class
//which is extends java.lang.enum so we can not extends another class

//enum is internally implements serializable interface so when we deserialize enum object 
//so it returns same object 

//enum can not support reflection api 

//we can not clone of enum object becouse for cloning purpose ww have to implements clonable marker interface
//and clone method also availbe on object class and enum extends java.lang.enum so clone method also not 
//availbe here so we can not clone of enum object

//so enum is the best approach to develop singleton class object 