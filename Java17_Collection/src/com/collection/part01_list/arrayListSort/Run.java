package com.collection.part01_list.arrayListSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(new Score("이창진",89));
		list.add(new Score("김창진",94));
		list.add(new Score("박창진",57));
		list.add(new Score("강창진",62));
		list.add(new Score("유창진",72));
		list.add(new Score("남창진",32));
		System.out.println("list: "+list);
		
		//정렬
		//1.Comparable : 기본 정렬 기준
		Collections.sort(list);
		System.out.println("list: "+list);
		
		//override한 정렬기준
		list.sort(null);
		System.out.println("list: "+ list);
		
		//2.Comparator: 기본 정렬 기준 외에 다른 기준으로 정렬
		list.sort(new ScoreAsc());
		System.out.println("list: "+list);
	}

}
