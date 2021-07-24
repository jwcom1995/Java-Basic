package model.vo;

public class Bottom extends Product{
	private String gender;
	private String size;
	private String[] category= {"청바지","반바지","레깅스","치마","트레이닝복","면바지"};
	private int cateNum;
	public Bottom() {}

	public Bottom(String pName, String price, String brand, int cateNum, int stock, String gender, String size) {
		super(pName,price,brand,stock);
		this.cateNum=cateNum;
		this.gender = gender;
		this.size = size;
	}

	public String getCategory() {
		return category[this.cateNum];
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
		return "["+super.getpName()+","+super.getPrice()+","+super.getBrand()+","+getCategory()+","+super.getStock()+","+gender+","+size+"]";
	}
}
