package model.vo;

public class Top extends Product{	
	private String[] gender= {"All","M","W"};
	private int genderNum;
	private String size;
	private String[] category= {"셔츠","반팔티","긴팔티","후드티","맨투맨","니트"};
	private int cateNum;
	public Top() {}

	public Top(String pName, String price, String brand, int cateNum, int stock, int genderNum, String size) {
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
	public Top clone() throws CloneNotSupportedException {
		return (Top)super.clone();
	}
	@Override
	public String toString() {
		return "["+super.getpName()+","+super.getPrice()+","+super.getBrand()+","+getCategory()+","+super.getStock()+","+getGender()+","+size+"]";
	}
	
}
