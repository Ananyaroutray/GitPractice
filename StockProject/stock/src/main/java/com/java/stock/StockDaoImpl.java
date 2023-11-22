package com.java.stock;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class StockDaoImpl implements StockDAO{
	Connection connection;
	PreparedStatement pst;
	
	private String generateStockId() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select max(StockId) stockId from Stock";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		String stockId=rs.getString("stockId");
		if(stockId==null) {
			return "S001";
		}else {
			int num = Integer.parseInt(stockId.substring(1,4));
			return String.format("S%03d", ++num);
		}
		
	}
	
	@Override
	public String addStockDao(Stock stock) throws ClassNotFoundException, SQLException {
		String id=generateStockId();
		stock.setStockId(id);
		connection=ConnectionHelper.getConnection();
		String cmd="Insert into stock(StockId, ItemName, Price, QuantityAvail) values(?,?,?,?)";
		pst=connection.prepareStatement(cmd);
		pst.setString(1,stock.getStockId());
		pst.setString(2, stock.getItemName());
		pst.setDouble(3, stock.getPrice());
		pst.setInt(4, stock.getQuantityAvail());
		pst.executeUpdate();
		
		return "Stock Added with StockId " + id;
	}
	
	@Override
	public List<Stock> showStockDao() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Stock";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		Stock stock = null;
		List<Stock> stockList = new ArrayList<Stock>();
		while(rs.next()) {
			stock = new Stock();
			stock.setStockId(rs.getString("stockId"));
			stock.setItemName(rs.getString("itemName"));
			stock.setPrice(rs.getDouble("price"));
			stock.setQuantityAvail(rs.getInt("quantityAvail"));
			stockList.add(stock);
			
		}
		return stockList;
			
	}
	
	@Override
	public Stock searchStockDao(String stockid) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Stock where stockid = ?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, stockid);
		ResultSet rs = pst.executeQuery();
		Stock stock = null;
		if (rs.next()) {
			stock = new Stock();
			stock.setStockId(rs.getString("stockid"));
			stock.setItemName(rs.getString("ItemName"));
			stock.setPrice(rs.getDouble("Price"));
			stock.setQuantityAvail(rs.getInt("QuantityAvail"));
		}
		return stock;
	}
}


