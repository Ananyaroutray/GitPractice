package com.java.hib;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class CollegeDaoImpl implements CollegeDao {
	Connection connection;
	PreparedStatement pst;	
	
	@Override
	public List<College> showCollegeDAO() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from College";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<College> collegeList = new ArrayList<College>();
		College college = null;
		while(rs.next()) {
			college = new College();
		    college.setCollegeId(rs.getInt("collegeId"));
		    college.setName(rs.getString("name"));
		    college.setLocation(rs.getString("location"));
		    college.setDean(rs.getString("dean"));
		    college.setStudentCount(rs.getInt("studentCount"));
		    collegeList.add(college);			
		}
		return collegeList;		
	}
	@Override
	public String addcollege(College college) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into College(collegeId,name,location,dean,studentCount) "
         		+ " values(?,?,?,?,?)";
         PreparedStatement pst = connection.prepareStatement(cmd);
            pst.setInt(1,college.getCollegeId());
            pst.setString(2,college.getName());
            pst.setString(3,college.getLocation());
            pst.setString(4,college.getLocation());
            pst.setString(4,college.getDean());
            pst.setInt(6,college.getStudentCount());
		    pst.executeUpdate();
		    
		    return "CollgeShow";
		
}
}