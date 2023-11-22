package com.java.day12;

public class Boxing {
	
	void meth() {
		int i = 5;
		Integer ival = Integer.valueOf(i);
		System.out.println("PDT value is : "+i);
		System.out.println("WCD value is : "+ival);
		
		long l = 2399l;
		Long lval = Long.valueOf(l);
		System.out.println("PDT value is : "+l);
		System.out.println("WCD value is : "+lval);
		
		float f = 23.86F;
		Float fval = Float.valueOf(f);
		System.out.println("PDT value is : "+f);
		System.out.println("WCD value is : "+fval);
		
		Integer ival1 = Integer.valueOf("5000");
		System.out.println("Integer WCD value : "+ival1);
		
		Character cval = Character.valueOf('A');
		System.out.println("Character WCD value : "+cval);
	}
	public static void main(String[] args) {
		new Boxing().meth();
	}
	
}
