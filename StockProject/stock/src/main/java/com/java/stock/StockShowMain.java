package com.java.stock;

import java.sql.SQLException;
import java.util.List;

public class StockShowMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		StockDAO dao = new StockDaoImpl();
		
		try {
			List<Stock> stockList = dao.showStockDao();
			stockList.forEach(System.out::println);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
