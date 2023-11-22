package com.java.bean;

public class Calculation {
	private int firstNo;
	private int secondNo;
	
	
	public int getFirstNo() {
		return firstNo;
	}
	public void setFirstNo(int firstNo) {
		this.firstNo = firstNo;
	}
	public int getSecondNo() {
		return secondNo;
	}
	public void setSecondNo(int secondNo) {
		this.secondNo = secondNo;
	}
	
	public int Sum() {
		return firstNo+secondNo;
	}
	public int Sub() {
		return firstNo-secondNo;
	}
	public int Mul() {
		return firstNo*secondNo;
	}

}
