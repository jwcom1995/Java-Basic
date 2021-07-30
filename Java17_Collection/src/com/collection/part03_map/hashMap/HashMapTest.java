package com.collection.part03_map.hashMap;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public void test() {
		HashMap hmap = new HashMap();
		
		hmap.put("one", new Date());
		hmap.put(12, "apple");
		hmap.put(33, 123);
		
		System.out.println("hmap: "+hmap);
		
		hmap.put(12, "banana");
		System.out.println("hmap: "+hmap);
		
		hmap.put(11, "banana");
		hmap.put(10, "banana");
		System.out.println("hmap: "+hmap);

		System.out.println("키 10에 대한 값: "+hmap.get(10));
		
		hmap.remove(10);
		System.out.println("hmap: "+hmap);
		
		System.out.println("hmap에 저장된 객체 수 : "+hmap.size());
	}
	
	public void test2() {
		
		HashMap hmap = new HashMap();
		
		hmap.put("one", "java 11");
		hmap.put("two", "oracle");
		hmap.put("three", "jdbc");
		hmap.put("four", "html5");
		hmap.put("five", "css3");
		
		System.out.println(hmap);
		
		
		//HashMap에 있는 데이터 접근 방법
		//1.keySet()
		
		Set keys = hmap.keySet();
		Iterator keyIter = keys.iterator();
		
		while(keyIter.hasNext()) {
			String key=(String)keyIter.next();
			String value = (String)hmap.get(key);
			System.out.println(key+"="+value);
		}
		System.out.println("-------------------------");
		//2.Map 내부 클래스 Entry 이용: entrySet()
		Set set = hmap.entrySet();
		Iterator entryIter=set.iterator();
		
		while(entryIter.hasNext()) {
			
			Map.Entry entry = (Map.Entry)entryIter.next();
			System.out.println(entry.getKey()+"="+entry.getValue());
			
		}
		
	}
	
	
}
