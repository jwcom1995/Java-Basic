package customer;

import java.util.ArrayList;

import model.vo.Product;

public class Customer {
	private String id;
	private String pwd;
	private String name;
	private String address;
	private ArrayList<Product> shoppingList=new ArrayList<Product>();
	public Customer() {}
	public Customer(String id, String pwd, String name, String address) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
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
	public ArrayList<Product> getCart() {
		return shoppingList;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", pwd=" + pwd + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
