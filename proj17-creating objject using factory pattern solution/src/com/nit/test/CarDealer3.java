package com.nit.test;
import java.util.Scanner;

import com.nit.factory.CarFactory;
import com.nit.vehical.Car;

public class CarDealer3 {
	public static void main(String[] args) {
		System.out.println("All car dealer");
		Car car=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter car type:-");
		String line=sc.next();
		car=CarFactory.getInstance(line);
		car.roadTest();
	}
} 