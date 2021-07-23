package com.inherit.part01.beforeProduct.model;

import java.util.Date;

public class SmartPhone {
	//필드
	private String brand;			//제조사
	private String productNumber;	//상품번호
	private String productCode;		//상품코드
	private String productName;		//상품명
	private String cpu;				//cpu
	private int hdd;				//hdd
	private int ram;				//ram
	private String os;				//운영체제
	private int price;				//가격
	private Date date;				//제조일자
	private String moblieAgency;	//통신사
	
	//생성자
	public SmartPhone() {}

	public SmartPhone(String brand, String productNumber, String productCode, String productName, String cpu, int hdd,	int ram, String os, int price, Date date, String moblieAgency) {

		this.brand = brand;
		this.productNumber = productNumber;
		this.productCode = productCode;
		this.productName = productName;
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.os = os;
		this.price = price;
		this.date = date;
		this.moblieAgency = moblieAgency;
	}
	//getter % setter 메소드

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMoblieAgency() {
		return moblieAgency;
	}

	public void setMoblieAgency(String moblieAgency) {
		this.moblieAgency = moblieAgency;
	}
	
	public void information() {
		System.out.println(this.brand+", "+this.productNumber+", "+this.productCode+", "+this.productName+", "+this.cpu+", "+this.hdd+", "+this.ram+", "+this.os+", "+this.price+", "+this.date+", "+this.moblieAgency);
	}
}
