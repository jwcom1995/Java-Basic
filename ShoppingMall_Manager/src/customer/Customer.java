package customer;

import java.util.ArrayList;

import model.vo.Product;

public class Customer {
	private String id;
	private String pw;
	private String name;
	private String address;
	private ArrayList<Product> shoppingList;
	public Customer() {}
	public Customer(String id, String pw, String name, String address) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void addCart(Product p) {
		shoppingList.add(p);
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", pw=" + pw + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
