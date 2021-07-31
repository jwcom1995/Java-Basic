package com.collection.part04_generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GenericsTest {
	
	public void test1() {
		ArrayList list = new ArrayList();
		
		list.add(new String("Object"));
		list.add(new Book());
		list.add(new Student());
		list.add(new Car());
		
		System.out.println("저장된 객체 수 : "+ list.size());
		System.out.println("list: "+ list);
		
		for(int i =0;i<list.size();i++) {
			Object obj = list.get(i);
			
			System.out.println(obj);
			if(obj instanceof Book) {
				((Book)obj).printBook();
			} else if(obj instanceof Student) {
				((Student)obj).score();
			} else if(obj instanceof Car) {
				((Car)obj).printCar();
			}
		}
	}
	
	public void test2() {
		//제네릭스 : 컬렉션에 저장되는 객체의 자료형에 제한을 거는 기능
		ArrayList <Book> list = new ArrayList<Book>();
		ArrayList list2 = new ArrayList();
		
		list.add(new Book());
		list.add(new Book());
		// list.add("test"); Generics가 Book으로 설정되어있기 때문에 불가능
		
		
		list2.add(new Book());
		list2.add(new Book());
		// list2.add("test");
		
		for(Object obj:list2) {
			((Book)obj).printBook();
		}
		
		for(Book bk:list) {
			bk.printBook();
		}
		
	}
	
	public void test3() {
		HashMap<String,Book> map = new HashMap<>();
		
		map.put("one", new Book());
		map.put("two", new Book());
		
		//System.out.println(map);
		
		//Map.Entry를 이용하여 Iterator를 생성하고 키 벨류를 동시에 처리하는 방법
		//단 generics 설정을 하며 작성
		Set<Map.Entry<String, Book>> set = map.entrySet();
		Iterator<Map.Entry<String, Book>> itr =set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, Book> me = itr.next();
			System.out.println(me.getKey()+" : "+me.getValue());
		}
		
		//set에 key만 추출하여 Iterator 활용
		Set<String> setK = map.keySet();
		Iterator<String> itk = setK.iterator();
		while (itk.hasNext()) {
			String key = itk.next();
			Book value = map.get(key);
			System.out.println(key+" : "+value);
		}
	}
	
}

//추가로 클래스 생성 가능, 클래스명에 접근제한자 작성 불가능
class Book{
	private String title;
	
	public Book() {}

	public Book(String title) {		
		this.title = title;
	}
	public void printBook() {
		System.out.println("printBook() call...");
	}
	@Override
	public String toString() {
		return "Book";
	}
}

class Student{
	public Student() {}
	public void score() {
		System.out.println("score90 call...");
	}
	@Override
	public String toString() {
		return "Student";
	}
}
class Car{
	public Car() {}
	public void printCar() {
		System.out.println("printCar() call...");
	}
	@Override
	public String toString() {
		return "Car";
	}
}