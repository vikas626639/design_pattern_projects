package com.nit.vehical;

import com.nit.dp.Tyre;

public class SportsCar implements Car {
	
	private Tyre tyre;
	
	public SportsCar(Tyre tyre) {
		System.out.println("SportsCar.SportsCar()");
		this.tyre=tyre;
	}

	@Override
	public void roadTest() {
		System.out.println("driving sprots car having "+tyre.info());
	}

}
