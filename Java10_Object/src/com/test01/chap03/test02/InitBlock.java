package com.test01.chap03.test02;

public class InitBlock {
	
	private String pName="아이폰";
	private int price=1900000;
	private static String brand="애플";
	
	{
		pName="갤럭시";
		price = 1000000;
		brand = "삼성";
	}
	
	static{
		//pName="갤럭시";
		//price = 1000000;
		brand = "엘지";
	}
	
	//생성자
	public InitBlock(){
		
	}
	
	//생성자
	public InitBlock(String pName, int price, String brand){
		
		this.pName=pName;
		this.price=price;
		InitBlock.brand=brand;
	
	}
	
	
	public void information() {
		System.out.println(pName+", "+price+", "+brand);
	}
}
