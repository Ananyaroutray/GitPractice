package com.java.day12;

public class Unboxing {
	
	void meth() {
		Byte b1 = new Byte((byte)10);
		Byte b2 = new Byte("10");
		
		Integer ival = new Integer(50);
		Boolean bval = new Boolean("Ganesh");
//		Boolean bval = new Boolean(true);
		
		byte b3 = b1.byteValue();
		byte b4 = b2.byteValue();
		int i = ival.intValue();
		boolean b = bval.booleanValue();
		
		System.out.println("Byte of WCO :"+b1);
		System.out.println("Byte of WCO :"+b2);
		System.out.println("Integer of WCO :"+ival);
		System.out.println("Boolean of WCO :"+bval);
		
		System.out.println("----------------------");
		
		
		System.out.println("byte PDT value : "+b3);
		System.out.println("byte PDT value : "+b4);
		System.out.println("int PDT value : "+i);
		System.out.println("boolean PDT value : "+b);
	}
	public static void main(String[] args) {
		new Unboxing().meth();
	}
	
}
