package com.nit.dp;

public class Printer {
		
	static {
		System.out.println("Printer class loaded");
	}
	
		private static Printer instence=new Printer();

		private Printer() {
			System.out.println("object created with 0 param constructor");
		}

		//static factory method
		public static Printer getInstance() {
			return instence;
		}
		
		public void printDate(String data) {
			System.out.println("user given data is ="+data);
		}
	}

