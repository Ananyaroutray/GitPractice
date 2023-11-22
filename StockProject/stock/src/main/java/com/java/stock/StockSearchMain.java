package com.java.stock;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Scanner;

public class StockSearchMain {
	public static void main(String[] args) {
		String stockId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Stock Id:  ");
		stockId = sc.next();
		StockDAO dao = new StockDaoImpl();
		
			try {
				Optional<Stock> stock = Optional.ofNullable(dao.searchStockDao(stockId));
				if (stock.isPresent()) {
					System.out.println(stock);
				} else {
					System.out.println("Not Found...");
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}
