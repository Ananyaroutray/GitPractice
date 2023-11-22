package com.java.lms;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LeaveDAOImpl implements LeaveDetailsDAO{
	
	Connection connection;
	PreparedStatement pst;
	
	public int dateDiff(Date startDate, Date endDate) {
		long ms = endDate.getTime()-startDate.getTime();
		int diff = (int)(ms/(1000 * 60 * 60 * 24));
		diff++;
		return diff;
		}
	
	@Override
	public String applyLeave(LeaveDetails leaveDetails) throws ClassNotFoundException, SQLException {
		
		Employee emp = new EmployeeDAOImpl().searchEmployeeDao(leaveDetails.getEmpId());
		int leaveAvail = emp.getLeaveAvail();
		System.out.println(leaveDetails);
		java.util.Date today = new java.util.Date();
		System.out.println(dateDiff(new Date(today.getTime()), leaveDetails.getLeaveStartDate())); 
		
		if (dateDiff(new Date(today.getTime()), leaveDetails.getLeaveStartDate()) <= 0) 
		{
		return "Start-Date Cannot be Yesterday's Date...";
		} 
		
		if(dateDiff(new Date(today.getTime()), leaveDetails.getLeaveEndDate()) <= 0)
		{
		return "End-Date Cannot be Yesterday's Date...";
		}

		if(dateDiff(leaveDetails.getLeaveStartDate(),leaveDetails.getLeaveEndDate()) < 1 ) {
			return "Start-Date cannot be greater than equal to End-Date...";	
		}
		
//		long totalDays = calculateDateDifference(leaveDetails.getLeaveStartDate(),leaveDetails.getLeaveEndDate());
//		if(totalDays <= )
		
		if(leaveDetails.getNoOfDays() <= leaveAvail ) {
			return "noOfDays of leave must be less than or equals to leave available...";	
		}
		connection =  ConnectionHelper.getConnection(); 
		int diff  = dateDiff(leaveDetails.getLeaveStartDate(), leaveDetails.getLeaveEndDate());
		leaveDetails.setNoOfDays (diff);
		String cmd = "Insert into LeaveDetails (EmpId, LeaveStartDate, LeaveEndDate + "
				      + "noOfDays, leaveType, leaveReason) values (?,?,?,?,?,?)";
		
		pst =  connection.prepareStatement (cmd);
		pst.setInt(1, leaveDetails.getEmpId()); pst.setDate(2, leaveDetails.getLeaveStartDate());
		pst.setDate(3, leaveDetails.getLeaveEndDate()); pst.setInt(4, leaveDetails.getNoOfDays());
		pst.setString(5, leaveDetails.getLeaveType().toString());
		pst.setString(6, leaveDetails.getLeaveReason());
		pst.executeUpdate(); 
		
		cmd  = "Update Employee set LeaveAvail = LeaveAvail ? Where EmpId=?";
		pst = connection.prepareStatement (cmd);
		pst.setInt(1, diff); pst.setInt(2, leaveDetails.getEmpId());
		pst.executeUpdate(); 
		return "Leave Applied...";
	
	}
	
	private long calculateDateDifference(Date leaveStartDate, Date leaveEndDate) {
		// TODO Auto-generated method stub
		long differenceInMills= leaveStartDate.getTime() - leaveEndDate.getTime();
		return differenceInMills/(24*60*60*1000);
	}
	
}