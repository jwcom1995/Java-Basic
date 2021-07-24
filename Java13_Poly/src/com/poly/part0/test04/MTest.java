package com.poly.part0.test04;

public class MTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.bark();
		cat.eat("참치");
		
		Dog dog = new Dog();
		dog.bark();
		dog.eat("뼈다귀");
		
		Eagle eagle = new Eagle();
		eagle.fly();
		eagle.bark();
		eagle.eat("토끼");
	}

}
