package com.java.rms;

public interface OrdersDAO {
	String placeOrderDao(Orders order);
	String orderHistoryDao(Orders order);
}
