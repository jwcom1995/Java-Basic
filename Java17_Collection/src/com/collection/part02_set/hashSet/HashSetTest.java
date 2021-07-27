package com.collection.part02_set.hashSet;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public void test() {
		
		HashSet hset = new HashSet();
		
		hset.add("java");
		hset.add(123);
		hset.add(45.67);
		hset.add(new Date());
		
		System.out.println("hset: "+hset);
		
		hset.add("java");
		hset.add(123);		
		System.out.println("hset: "+hset);
		System.out.println("저장된 객체 수 : "+hset.size());
		System.out.println("포함확인 : "+hset.contains("java"));
		
		//저장된 객체를 하나씩 꺼내는 기능이 없음
		//해결
		//1. Iterator()
		Iterator iter = hset.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//2.toArray()
		Object[] arr = hset.toArray();
		
		for(int i = 0 ; i < arr.length;i++) {
			System.out.println(i+":"+arr[i]);
		}
		
		System.out.println("empty?:" + hset.isEmpty());
		hset.clear();
		System.out.println("empty?:"+hset.isEmpty());
	}
}
