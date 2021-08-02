package model.vo;

public class Accessory extends Product {
	private String[] category= {"가방","모자","쥬얼리","시계","지갑"};
	private int cateNum;
	
	public Accessory() {}

	public Accessory(String pName, String price, String brand,int cateNum,  int stock) {
		super(pName,price,brand,stock);
		this.cateNum = cateNum;
	}

	public String getCategory() {
		return category[cateNum];
	}

	public int getCateNum() {
		return cateNum;
	}
	@Override
	public Accessory clone() throws CloneNotSupportedException {
		return (Accessory)super.clone();
	}
	@Override
	public String toString() {
		return "["+super.getpName()+","+super.getPrice()+","+super.getBrand()+","+getCategory()+","+super.getStock()+"]";
	}
}
