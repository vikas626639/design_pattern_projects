package com.nit.factory;

import com.nit.dp.Apollotyre;
import com.nit.dp.MRFTyre;
import com.nit.dp.MechallinTyre;
import com.nit.dp.Tyre;
import com.nit.vehical.Car;
import com.nit.vehical.LuxeryCar;
import com.nit.vehical.SportsCar;
import com.nit.vehical.StandardCar;

public class CarFactory{
	
	
	
	public static Car getInstance(String CarType) {
		Tyre tyre=null;
		Car car=null;
		
		if(CarType.equalsIgnoreCase("standard")) {
			tyre=new MRFTyre();
			car=new StandardCar(tyre);
		}else if(CarType.equalsIgnoreCase("sports")) {
			tyre=new Apollotyre();
			car=new SportsCar(tyre);
		}else if(CarType.equalsIgnoreCase("Luxery")) {
			tyre=new MechallinTyre();
			car=new LuxeryCar(tyre);
		}else {
			throw new IllegalArgumentException("car not found");
		}
		return car;
		
	}
}
