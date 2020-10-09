package com.nit.dp;

import com.nit.bike.BajajBike;
import com.nit.bike.BajajDiscover;
import com.nit.bike.BajajPlatina;
import com.nit.bike.BajajPulser;

public class NagpurBajarFactory extends Bajajfactory {

	@Override
	public void paint() {
		System.out.println("nagpur bajaj factory ---> bike paint successfull");
		
	}

	@Override
	public void asamble() {
		System.out.println("nagpur bajaj factory ---> bike asamble successfull");
		
	}

	@Override
	public void oiling() {
		System.out.println("nagpur bajaj factory ---> bike oiled successfull");
		
	}

	@Override
	public void roadTest() {
		System.out.println("nagpur bajaj factory ---> bike road test successfull");
		
		
	}

	@Override
	public BajajBike build(String model) {
		BajajBike bike=null;
		if(model.equalsIgnoreCase("pulser")) {
			bike=new BajajPulser();
			System.out.println("pulser bike ready");
		}
		else if(model.equalsIgnoreCase("Discover")) {
			bike=new BajajDiscover();
			System.out.println("Discover bike ready");
		}else if(model.equalsIgnoreCase("Platina")) {
			bike=new BajajPlatina();
			System.out.println("Platina bike ready");
		}else {
			throw new IllegalArgumentException("sorry:-- model not found try another bajaj model");
		}
		paint();
		asamble();
		oiling();
		roadTest();
		return bike;
	}

}
