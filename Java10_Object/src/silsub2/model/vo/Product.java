package silsub2.model.vo;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	public Product() {}
	
	public void setPName(String pName) {
		this.pName=pName;
	}	
	public void setPrice(int price) {
		this.price=price;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public String getPName() {
		return this.pName;
	}
	public int getPrice() {
		return this.price;
	}
	public String getBrand() {
		return this.brand;
	}
	
	public String information() {
		String infor = "제품명 : "+this.pName+", 가격 : "+this.price+", 브랜드 : "+this.brand;
		return infor;
	}
}
