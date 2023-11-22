package com.java.thr;

import java.util.LinkedList;

public class Thr2 implements Runnable  {

	@Override
	public void run() {
		LinkedList<String> names = new LinkedList<String>();
		names.add("Sourav");
		names.add("Abhishek");
		names.add("Kumar");
		names.add("Rajesh");
		names.add("Shivangi");
		names.add("Naveen");
		for (String s : names) {
			System.out.println("LinkedList Data "+s );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}	

}
