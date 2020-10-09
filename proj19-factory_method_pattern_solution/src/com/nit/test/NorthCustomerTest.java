package com.nit.test;

import java.util.Scanner;

import com.nit.dp.Bajajfactory;
import com.nit.dp.NagpurBajarFactory;

public class NorthCustomerTest {

	public static void main(String[] args) {
		System.out.println("nagpur bajaj factory bike supplier");
		Bajajfactory factory=null;
		//BajajBike bike=null;
		factory=new NagpurBajarFactory();
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter Bike model:-");
		String model=Sc.next();
		factory.manifucture(model);
				
	}

}
