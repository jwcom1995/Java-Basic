package model.vo;

public class Top extends Product{	
	private String gender;
	private String size;
	private String[] category= {"셔츠/블라우스","반팔티","긴팔티","후드티","맨투맨","니트"};
	private int cateNum;
	public Top() {}

	public Top(String pName, String price, String brand, int cateNum, int stock, String gender, String size) {
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
