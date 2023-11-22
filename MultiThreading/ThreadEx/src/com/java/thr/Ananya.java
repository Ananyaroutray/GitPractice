package com.java.thr;

public class Ananya implements Runnable {
	
	Data data;
	Ananya(Data data){
		this.data=data;
	}

	@Override
	public void run() {
		data.showMsg("Ananya");
		
	}

}
