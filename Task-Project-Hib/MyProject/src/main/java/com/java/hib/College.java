package com.java.hib;

public class College {
    
    private int collegeId;
    private String name;
    private String location;
    private String dean;
    private int studentCount;

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDean() {
        return dean;
    }

    public void setDean(String dean) {
        this.dean = dean;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    @Override
    public String toString() {
        return "College [collegeId=" + collegeId + ", name=" + name + ", location=" + location + ", dean=" + dean
                + ", studentCount=" + studentCount + "]";
    }

    public College(int collegeId, String name, String location, String dean, int studentCount) {
        super();
        this.collegeId = collegeId;
        this.name = name;
        this.location = location;
        this.dean = dean;
        this.studentCount = studentCount;
    }

    public College() {
        super();
    }
}

