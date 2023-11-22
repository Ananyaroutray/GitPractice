package com.java.stock;

import java.sql.SQLException;
import java.util.List;


public interface StockDAO {
	String addStockDao(Stock stock) throws ClassNotFoundException, SQLException;
	List<Stock> showStockDao() throws ClassNotFoundException, SQLException;
	Stock searchStockDao(String stockid) throws ClassNotFoundException, SQLException;

}
