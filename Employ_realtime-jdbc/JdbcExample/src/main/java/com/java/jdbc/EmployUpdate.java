package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployUpdate {
	public static void main(String[] args) {
		int empno;
		double basic;
		String name,gender,dept,desig;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employ no: ");
		empno = sc.nextInt();
		System.out.println("Enter Employ Name: ");
		name = sc.next();
		System.out.println("Enter gender:");
		gender = sc.next();
		System.out.println("Enter Department:");
		dept = sc.next();
		System.out.println("Enter designation:");
		desig = sc.next();
		System.out.println("Enter basic salary:");
		basic = sc.nextDouble();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/infinite_august23","root","India@123");
			String cmd = "Update employ1 set name =?, Gender=?, dept =?, desig =?, Basic =? where empno =?";
			PreparedStatement pst = connection.prepareStatement(cmd);
			pst.setInt(1, empno);
			pst.setString(2, name);
			pst.setString(3, gender);
			pst.setString(4, dept);
			pst.setString(5, desig);
			pst.setDouble(6, basic);
			pst.executeUpdate();
			System.out.println("*** Record Updated ***");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
