package com.java.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.java.junitTask.LeaveDetails;
import com.java.junitTask.LeaveStatus;
import com.java.junitTask.LeaveType;

public class LeaveDetailsTest {
	
	@Test
	public void testConstructor() throws ParseException {
		LeaveDetails leaved = new LeaveDetails();
		assertNotNull(leaved);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String Date;
		Date date = new Date();
		LeaveDetails emp = new LeaveDetails(1001, 1,"Ananya",sdf.parse("2023-09-10"),sdf.parse("2023-09-23")
				,LeaveStatus.PENDING,LeaveType.ML,"Going Home","Rejected",sdf.parse("11-09-2023"));
		
		assertEquals(1001,emp.getLeaveId());
		assertEquals(1,emp.getEmpId());
		assertEquals("Ananya",emp.getEmpName());
		assertEquals(sdf.parse("2023-09-10"),emp.getLeaveStartDate());
		assertEquals(sdf.parse("2023-09-23"),emp.getLeaveEndDate());
		assertEquals(LeaveStatus.PENDING,emp.getLeaveStatus());
		assertEquals(LeaveType.ML,emp.getLeaveType());
		assertEquals("Going Home",emp.getLeaveReason());
		assertEquals("Rejected",emp.getManagerComments());
		assertEquals(sdf.parse("11-09-2023"),emp.getAppliedOn());
	}
	}


