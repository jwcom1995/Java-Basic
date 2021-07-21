package com.silsub2.person.model.vo;

public class Person {
	private String name;
	private int age;
	private int height;
	
	public Person() {}
	
	public Person(String name, int age, int height) {
		this.name=name;
		this.age=age;
		this.height=height;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return this.age;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	public int getHeight() {
		return this.height;
	}
	
	public String information() {
		return "이름 : "+this.name+", 나이 : "+this.age+"세, 키 : "+this.height+"cm";
	}
}
