package controller;

import customer.CustomerDao;

public class CustomerManager {
	CustomerDao cd = new CustomerDao();
	
	public CustomerManager() {}
	
	public void setCsData() {
		cd.setData();
	}
	
	public boolean checkDupId(String id) {
		return cd.checkData(id);
	}
	
	public void addData(String[] data) {
		cd.addData(data);
	}
}
