package com.java.stock;

import java.sql.SQLException;
import java.util.Scanner;

public class StockAddMain {
	public static void main(String[] args) {
		Stock stock = new Stock();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name: ");
		stock.setItemName(sc.next());
		
		System.out.println("Enter the price of Item: ");
		stock.setPrice(sc.nextDouble());
		
		System.out.println("Enter the quantity Available: ");
		stock.setQuantityAvail(sc.nextInt());
		
		StockDAO stockdao=new StockDaoImpl();
		
		try {
			System.out.println(stockdao.addStockDao(stock));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




}
