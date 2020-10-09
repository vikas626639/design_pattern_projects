package com.nit.dp;

import com.nit.bike.BajajBike;

public abstract class Bajajfactory {
	
	public abstract  void paint();
	public abstract void asamble();
	public abstract void oiling();
	public abstract void roadTest();
	
	public abstract BajajBike build(String model);
	
	public BajajBike manifucture(String model) {
		BajajBike f=null;
		f=build(model);
		f.drive();
		return f;
	}
}
