package com.java.otm;

public class Department {
	
    private int id;
    private String departmentName;
    private String headOfDepartment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(String headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    public String toString() {
        return "Department [id=" + id + ", departmentName=" + departmentName + ", headOfDepartment=" + headOfDepartment + "]";
    }
}
