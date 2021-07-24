package com.poly.part0.test04;

public abstract class Animal {
	
	public void eat(String feed) {
		System.out.println(feed+"먹는다");
	}
	
	public abstract void bark();
}
