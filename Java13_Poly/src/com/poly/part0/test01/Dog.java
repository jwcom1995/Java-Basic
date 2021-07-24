package com.poly.part0.test01;

public class Dog extends Animal{
	
	@Override
	public void bark() {
		System.out.println("멍멍");
	}
	
	@Override
	public void eat(String animal) {
		super.eat(animal);
	}
}
