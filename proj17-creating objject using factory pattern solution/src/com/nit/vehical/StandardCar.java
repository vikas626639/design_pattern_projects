package com.nit.vehical;

import com.nit.dp.Tyre;

public class StandardCar implements Car {
	private Tyre tyre;
	
	public StandardCar(Tyre tyre) {
		System.out.println("StandardCar.StandardCar()");
		this.tyre=tyre;
	}

	@Override
	public void roadTest() {
		System.out.println("Driving statndard caf having "+tyre.info());
	}

}
