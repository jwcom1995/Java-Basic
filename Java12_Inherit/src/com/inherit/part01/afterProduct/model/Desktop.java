package com.inherit.part01.afterProduct.model;

import java.util.Date;

public class Desktop extends Computer {
	
	private boolean allInOne;
	
	public Desktop() {}

	public Desktop(String brand, String productNumber, String productCode, String productName, int price, Date date,
			String cpu, int hdd, int ram, String os, boolean allInOne) {
		
		super(brand, productNumber, productCode, productName, price, date, cpu, hdd, ram, os);
		this.allInOne = allInOne;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public String printInformation() {
		return super.printInformation()+", "+this.allInOne;
	}
}
