package controller;

import customer.Customer;
import customer.CustomerDao;
import model.vo.Product;

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
	
	public void addShoppingList(Product p) {
		
	}
	public int loginCheck(String id, String pwd) {
		// 아이디가 없는경우 1
		// 비밀번호가 틀린경우 2
		// 문제가 없는경우 0
		//회원정보에 아이디가 없는 경우
		if(!cd.checkData(id)) {
			return 1;
		} else if (cd.checkData(id, pwd)) {
			return 0;
		} else {
			return 2;
		}		
	}
	
	public Customer getCustomer(String id) {
		return cd.getData(id);
	}
}
