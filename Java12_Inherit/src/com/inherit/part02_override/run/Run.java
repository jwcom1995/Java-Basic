package com.inherit.part02_override.run;

import com.inherit.part02_override.model.Book;

public class Run {
	public static void main(String[] args) {
		Book b1 = new Book("수학의 정석","홍성대",200000);
		Book b2 = new Book("오리진","댄브라운",18000);
//		toString()
//		System.out.println("b1 = "+ b1.toString());
//		System.out.println("b2 = "+ b2.toString());
		
		System.out.println("b1 = "+ b1);
		System.out.println("b2 = "+ b2);
		
		//두 객체를 비교
		System.out.println("b1과 b2는 같은 객체? : "+ b1.equals(b2));
		
		//얕은 복사
		Book b3 = b1;
		System.out.println("b1과 b3는 같은 객체? : "+b1.equals(b3));
		
		//b1과 값이 동일햔 b4 생성
		Book b4 = new Book("수학의 정석","홍성대",200000);
		System.out.println("b1과 b4는 같은 객체? : "+b1.equals(b4));
		
		//hash 코드 비교
		
		System.out.println(b1.hashCode());
		System.out.println(b4.hashCode());
	}
}
