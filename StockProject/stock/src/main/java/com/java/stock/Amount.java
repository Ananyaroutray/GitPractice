package com.java.stock;

public class Amount {
	private double Gamt;

	public double getGamt() {
		return Gamt;
	}

	public void setGamt(double gamt) {
		Gamt = gamt;
	}

	@Override
	public String toString() {
		return "Amount [Gamt=" + Gamt + "]";
	}

	public Amount(double gamt) {
		super();
		Gamt = gamt;
	}

	public Amount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
