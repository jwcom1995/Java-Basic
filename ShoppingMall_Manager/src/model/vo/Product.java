package model.vo;

public class Product implements Cloneable{
	
	private String pName;
	private String price;
	private String brand;
	private int stock;
	
	public Product() {}

	public Product(String pName, String price, String brand,  int stock) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
		this.stock = stock;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void deStock(int cnt) {
		this.stock=this.stock-cnt;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	public Product clone() throws CloneNotSupportedException {
		return (Product)super.clone();
	}
	@Override
	public String toString() {
		return "Product [pName=" + pName + ", price=" + price + ", brand=" + brand + ", stock=" + stock + "]";
	}
	
}
