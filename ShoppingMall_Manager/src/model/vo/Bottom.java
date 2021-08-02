package model.vo;

public class Bottom extends Product{
	private String[] gender= {"All","M","W"};
	private int genderNum;
	private String size;
	private String[] category= {"청바지","반바지","레깅스","치마","트레이닝복","면바지"};
	private int cateNum;
	public Bottom() {}

	public Bottom(String pName, String price, String brand, int cateNum, int stock, int genderNum, String size) {
		super(pName,price,brand,stock);
		this.cateNum=cateNum;
		this.genderNum = genderNum;
		this.size = size;
	}

	public String getCategory() {
		return category[this.cateNum];
	}


	public String getGender() {
		return gender[genderNum];
	}


	public String getSize() {
		return size;
	}
	public int getCateNum() {
		return cateNum;
	}
	public int getGenderNum() {
		return genderNum;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public Bottom clone() throws CloneNotSupportedException {
		return (Bottom)super.clone();
	}
	@Override
	public String toString() {
		return "["+super.getpName()+","+super.getPrice()+","+super.getBrand()+","+getCategory()+","+super.getStock()+","+getGender()+","+size+"]";
	}
}
