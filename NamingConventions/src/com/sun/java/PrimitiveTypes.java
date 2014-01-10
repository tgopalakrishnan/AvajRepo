package com.sun.java;

public class PrimitiveTypes {
	private static int a = 150;
	public static String myName = "Gopalakrishnan";

	public static void main(String[] args) {

			double fb=10000;
			double gb=555;
			double rs=fb*gb;
			myName="Hello, "+myName;
			System.out.println("String:"+myName);
			System.out.println("double result: "+rs);
		System.out.println("Value of a: " + a);

		byte byt = (byte) a; /*
							 * down-casting/narrowing: int type variable
							 * assigned to short type variable
							 */
		System.out
				.println("data loss will happen while down-casting/narrowing:");
		System.out.println("int data(value= " + a
				+ " type changed to byte value=" + byt);

		long lg = a; /*
					 * widening: int type variable assigned to long type
					 * variable
					 */
		System.out.println("Widening: int data type changed to long:" + lg);

	}

}
