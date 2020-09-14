package com.nit.dp;

public class Printer {
	
		//using lazy instantition
		private static Printer instence;

		private Printer() {
			System.out.println("0 param constructor");
		}

		//static factory method
		public static Printer getInstance() {
			if(instence==null) {
				instence =new Printer();
			}
			return instence;
		}
		
		public void printDate(String data) {
			System.out.println("user given data is ="+data);
		}
	}

