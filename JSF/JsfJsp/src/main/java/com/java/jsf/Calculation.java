package com.java.jsf;

import javax.faces.event.ActionEvent;

public class Calculation {
	private int firstNo;
	private int secondNo;
	private int addition;
	private int subtraction;
    private int multiplication;
    private double division;
	
    
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
	public int getAddition() {
		return addition;
	}
	public void setAddition(int addition) {
		this.addition = addition;
	}
	public int getSubtraction() {
		return subtraction;
	}
	public void setSubtraction(int subtraction) {
		this.subtraction = subtraction;
	}
	public int getMultiplication() {
		return multiplication;
	}
	public void setMultiplication(int multiplication) {
		this.multiplication = multiplication;
	}
	public double getDivision() {
		return division;
	}
	public void setDivision(double division) {
		this.division = division;
	}
	
	
	public Calculation() {
		
	}
	public void addition(ActionEvent evt) {
		this.addition=this.firstNo+this.secondNo;
	}
	public void subtraction(ActionEvent evt) {
        this.subtraction = this.firstNo - this.secondNo;
    }

    public void multiplication(ActionEvent evt) {
        this.multiplication = this.firstNo * this.secondNo;
    }

    public void division(ActionEvent evt) {
        if (this.secondNo != 0) {
            this.division = this.firstNo / this.secondNo;
        } else {
        }
    }
}
