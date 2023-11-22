package com.java.rms;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.hibernate.loader.custom.Return;

public class CustomerController {

	
	private Customer customer;
	private CustomerDaoImpl daoImpl;
	private RestaurantDaoImpl resDao;
	
	
	public RestaurantDaoImpl getResDao() {
		return resDao;
	}

	public void setResDao(RestaurantDaoImpl resDao) {
		this.resDao = resDao;
	}

	public CustomerDaoImpl getDaoImpl() {
		return daoImpl;
	}

	public void setDaoImpl(CustomerDaoImpl daoImpl) {
		this.daoImpl = daoImpl;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String addCustomer() {
		if (addValid()) {
				return daoImpl.addCustomerDao(customer);
		}
		return "";
	}
	public String customerLogin() {
			return daoImpl.customerLoginDao(customer);
	}
	
	public String showCustomerWallet() {
		return daoImpl.showCustomerWalletDao();
	}
	public String searchCustomer() { 
		return daoImpl.searchCustomerDetailsDao();
	}
	public List<Restaurant> showRestaurants() {
		return resDao.showRestaurantsDao();
	}
	
	public boolean addValid() {
	    FacesContext context = FacesContext.getCurrentInstance();

	    String name = "^[A-Za-z\\s]*$"; // Allow names with any number of characters
	    String phoneNumber = "^(\\+91|91|0)?[6789]\\d{9}$";
	    String username = "^[^\\s]{5,10}$";
	    String passWord = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!])(?!.*\\s).{5,16}$";
	    String email = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

	    if (!Pattern.matches(name, customer.getCusname())) {
	        context.addMessage("form:name", new FacesMessage("Invalid Customer Name."));
	        return false;
	    }

	    if (!Pattern.matches(phoneNumber, customer.getCusphnno())) {
	        context.addMessage("form:phoneno", new FacesMessage("Invalid Phone Number."));
	        return false;
	    }

	    if (!Pattern.matches(username, customer.getCususername())) {
	        context.addMessage("form:username", new FacesMessage("Invalid Username."));
	        return false;
	    }

	    if (!Pattern.matches(passWord, customer.getCuspassword())) {
	        context.addMessage("form:password", new FacesMessage("Invalid Password."));
	        return false;
	    }

	    if (!Pattern.matches(email, customer.getCusemail())) {
	        context.addMessage("form:email", new FacesMessage("Invalid Email."));
	        return false;
	    }

	    return true;
	}

}
