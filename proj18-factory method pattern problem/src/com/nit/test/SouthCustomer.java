package com.nit.test;

import com.nit.bike.BajajBike;
import com.nit.factory.ChennaiBajajBikeFactory;

public class SouthCustomer {

	public static void main(String[] args) {
		BajajBike bike=null;
		bike=ChennaiBajajBikeFactory.buildBike("pulser");
		bike.drive();

	}

}
