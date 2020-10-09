package com.nit.test;

import com.nit.bike.BajajBike;
import com.nit.factory.NagpurBajajBikeFactory;

public class NorthCustomer {

	public static void main(String[] args) {
		BajajBike bike=null;
		bike=NagpurBajajBikeFactory.buildBike("pulser");
		bike.drive();
	}

}
