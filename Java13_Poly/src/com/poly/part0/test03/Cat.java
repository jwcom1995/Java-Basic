package com.poly.part0.test03;

public class Cat implements Animal{

	@Override
	public void bark() {
		System.out.println("야옹");
	}

	@Override
	public void eat(String feed) {
		System.out.println(feed+"먹는다!");
	}

}
