package com.collection.part01_list.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ArrayListTest {
	
	public void test() {
		
		//ArrayList Test
		ArrayList alist = new ArrayList();
		
		//다형성 적용
		List list = new ArrayList();
		Collection clist = new ArrayList();
	
		//AutoBoxing 처리 되는중
		alist.add("apple");
		alist.add(123);
		alist.add(45.67);
		alist.add(new Date());
		
		System.out.println("alist: "+alist);
		
		for(int i = 0 ; i<alist.size();i++) {
			System.out.println(i+" : "+alist.get(i));
		}
		//중복 저장 허용
		alist.add("apple");
		System.out.println("alist: "+alist);
		
		//원하는 index에 값 추가
		alist.add(1,"banana");
		System.out.println("alist: "+alist);
		
		//삭제
		alist.remove(2);
		System.out.println("alist: "+alist);
		
		//값 변경
		alist.set(2, 45);
		System.out.println("alist: "+alist);
		
		//리스트에 들어있는 값 전부 제거
		alist.clear();
		System.out.println("alist: "+alist);
	
		System.out.println();
		alist.add("apple");
		alist.add("orange");
		alist.add("banana");
		alist.add("mango");
		alist.add("grape");
		
		System.out.println("alist: "+alist);
		
		//리스트 안의 값 정렬
		Collections.sort(alist);
		System.out.println("alist: "+alist);
		
	}	
}
