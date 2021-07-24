package com.poly.part0.test01;

public class Cat extends Animal{

	@Override
	public void bark() {
		System.out.println("야옹");
	}
	@Override
	public void eat(String animal) {
		super.eat(animal);
	}
}
