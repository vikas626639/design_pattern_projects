package com.nit.dp;

public class Printer {
	
		private static Printer instence=new Printer();

		private Printer() {
			System.out.println("0 param constructor");
		}

		//static factory method
		public static Printer getInstance() {
			return instence;
		}
		
		public void printDate(String data) {
			System.out.println("user given data is ="+data);
		}
	}

