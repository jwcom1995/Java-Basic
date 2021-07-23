package com.inherit.part01.afterProduct.model;

import java.util.Date;

public class Television extends Product{

	private int inchType;

	public Television() {
		//super();
	}

	public Television(String brand, String productNumber, String productCode, String productName, int price,
			Date date,int inchType) {
		super(brand, productNumber, productCode, productName, price, date);

		this.inchType=inchType;
		
		System.out.println("자식생성자 호출..");
	}

	public int getInchType() {
		return inchType;
	}

	public void setInchType(int inchType) {
		this.inchType = inchType;
	}
	
	public String printInformation() {
		return super.printInformation()+", "+inchType;
	}
}
