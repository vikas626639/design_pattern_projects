package com.nit.factory;

import com.nit.bike.BAjajDiscover;
import com.nit.bike.BAjajPlatina;
import com.nit.bike.BAjajPulser;
import com.nit.bike.BajajBike;

public class NagpurBajajBikeFactory {
	//factory pattern
	public static BajajBike buildBike(String model) {
		BajajBike bike=null;
		
		if(model.equalsIgnoreCase("Pulser")) {
			bike=new BAjajPulser();
			System.out.println("creating pulser bike");
		}
		else if(model.equalsIgnoreCase("Platina")) {
			bike=new BAjajPlatina();
			System.out.println("creating Platina bike");
		}
		else if(model.equalsIgnoreCase("discover")) {
			bike=new BAjajDiscover();
			System.out.println("creating discover bike");
		}
		else 
		{
			throw new IllegalArgumentException("bike not found");
		}
		
		Assemble();
		paint();
		//Oiling();
		roadTest();
		return bike;
	}
	
	public static  void paint() {
		System.out.println("NagpurBajajBikeFactory.paint()-->painting the bike");
	}
	
	public static void Assemble() {
		System.out.println("NagpurBajajBikeFactory.Assemble()--> assembling the bike");
	}
	
	//public static void Oiling() {
	//	System.out.println("NagpurBajajBikeFactory.Oiling()----> oiling the bike");
	//}
	
	public static void roadTest() {
		System.out.println("NagpurBajajBikeFactory.roadTest()--> roadtesting the bike");
	}
	
}
