package model.vo;

public class Product {
	
	private String pName;
	private String price;
	private String brand;
	private String category;
	private int stock;
	
	public Product() {}

	public Product(String pName, String price, String brand, String category, int stock) {
		super();
		this.pName = pName;
		this.price = price;
		this.brand = brand;
		this.category = category;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Product [pName=" + pName + ", price=" + price + ", brand=" + brand + ", category=" + category
				+ ", stock=" + stock + "]";
	}
	
}
