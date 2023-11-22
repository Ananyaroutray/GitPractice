package com.java.day12;

public class ClassA {
	
	void implicit() {
		byte b = 10;
		System.out.println("byte : "+b);//10
		short s = b;
		System.out.println("short : "+s);//10
		s++;//11
		int i = s++;//12
		System.out.println("int value is :"+i);//11
		System.out.println("short value is :"+s);//12
		long l = i;//12
		System.out.println("long value is : "+(--l));//11
		float f = l;//11
		System.out.println("The value of float is : "+(f+b));//11+10
		double d = (--f);//10
		System.out.println("The value of double is "+d);//10
		show();
		System.out.println(d);  // d = f = 9
		System.out.println(f);
		if(!(d==f)) 
			System.out.println("Equal...");
		else
			System.out.println("Not Equal...");	
	}
	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.implicit();
	}
	static void show() {
		char c = 'A';//65
		int a = ++c;//66
		System.out.println(a);//66
		ClassA obj = new ClassA();
		String s = obj.meth1();
		System.out.println(s);//Implicit
	}
		String meth1() {
			String s = "Implicit";
			return s;
		}	
	}

