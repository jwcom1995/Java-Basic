package model.vo;

public class Bottom extends Product{
	private String gender;
	private String size;
	
	public Bottom() {}

	public Bottom(String pName, String price, String brand, String category, int stock, String gender, String size) {
		super(pName,price,brand,category,stock);
		this.gender = gender;
		this.size = size;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "["+super.getpName()+","+super.getPrice()+","+super.getBrand()+","+super.getCategory()+","+super.getStock()+","+gender+","+size+"]";
	}
}
