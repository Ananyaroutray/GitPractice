package com.java.day12;

public class Explicit {
	void meth() {
	System.err.println("Performing Explicit Type Casting...");	
	int a = 15;
	byte b = (byte)a;
	System.out.println("Integer value is : "+a);	
	System.out.println("Byte value is : "+b);
	
//	Out of Range...
	int c = 500;
	byte d = (byte)c;
	System.out.println("Integer value is : "+c);//500
//	min + (value - max -1); 
//	-128 + 500 - 127 - 1 = 244;
//	-128 + 244 -127-1 = -12;
	System.out.println("Byte value is : "+d);//-12
	
	float f = 13.88f;
	byte e = (byte)f;
	System.out.println("Float value is : "+f);
	System.out.println("Byte Value is : "+e);
	
	int i1 = 10;
	float f1 = (float)10;
	System.out.println(i1);
	System.out.println(f1);
	
	}
	public static void main(String[] args) {
		new Explicit().meth();
	}
}
