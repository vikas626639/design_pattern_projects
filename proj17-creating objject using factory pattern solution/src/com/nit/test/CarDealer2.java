package com.nit.test;
import com.nit.dp.MRFTyre;
import com.nit.dp.MechallinTyre;
import com.nit.dp.Tyre;
import com.nit.vehical.Car;
import com.nit.vehical.LuxeryCar;
import com.nit.vehical.SportsCar;

public class CarDealer2 {
	public static void main(String[] args) {
		System.out.println("sports car dealer");
		Tyre tyre=null;
		Car car=null;
		tyre=new MRFTyre();
		car=new SportsCar(tyre);
		car.roadTest();
	}
} 