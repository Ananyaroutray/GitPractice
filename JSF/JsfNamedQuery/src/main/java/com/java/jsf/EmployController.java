package com.java.jsf;

import java.util.List;

public class EmployController {
    private EmployDAO employDao;
    private Employ employ;
    private Login login; // Add a property for the Login object

    public EmployDAO getEmployDao() {
        return employDao;
    }

    public void setEmployDao(EmployDAO employDao) {
        this.employDao = employDao;
    }

    public Employ getEmploy() {
        return employ;
    }

    public void setEmploy(Employ employ) {
        this.employ = employ;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public List<Employ> showEmploy() {
        return employDao.showEmployDao();
    }

    public String searchEmploy(int empno) {
        return employDao.searchEmployDao(empno);
    }

    public String validate() {
        
        if ("correct_username".equals(login.getUserName()) && "correct_password".equals(login.getPassCode())) 
        {
            
            return "success"; 
        } else {
            
            return "error";
        }
    }
}
