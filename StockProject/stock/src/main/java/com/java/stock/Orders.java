package com.java.stock;

public class Orders {
	private String orderId;
	private String stockId;
	private int qntAmt;
	private double billAmt;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public int getQntAmt() {
		return qntAmt;
	}
	public void setQntAmt(int qntAmt) {
		this.qntAmt = qntAmt;
	}
	public double getBillAmt() {
		return billAmt;
	}
	public void setBillAmt(double billAmt) {
		this.billAmt = billAmt;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", stockId=" + stockId + ", qntAmt=" + qntAmt + ", billAmt=" + billAmt
				+ "]";
	}
	public Orders(String orderId, String stockId, int qntAmt, double billAmt) {
		super();
		this.orderId = orderId;
		this.stockId = stockId;
		this.qntAmt = qntAmt;
		this.billAmt = billAmt;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
