package com.nit.vehical;

import com.nit.dp.Tyre;

public class LuxeryCar implements Car {
	private Tyre tyre;
	
	public LuxeryCar(Tyre tyre) {
		this.tyre=tyre;
	}
		
	@Override
	public void roadTest() {
		System.out.println("driving luxory car having "+tyre.info());

	}

}
