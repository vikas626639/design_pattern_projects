package com.nit.test;

import com.nit.dp.MechallinTyre;
import com.nit.dp.Tyre;
import com.nit.vehical.Car;
import com.nit.vehical.LuxeryCar;

public class CarDealer1 {

	public static void main(String[] args) {
		System.out.println("luxery car dealer");
		Tyre tyre1=null;
		Car car=null;
		tyre1=new MechallinTyre();
		car=new LuxeryCar(tyre1);
		car.roadTest();
	}

}
