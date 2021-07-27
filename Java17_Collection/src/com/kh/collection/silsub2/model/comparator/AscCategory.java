package com.kh.collection.silsub2.model.comparator;

import java.util.Comparator;

import com.kh.collection.silsub2.model.vo.Book;

public class AscCategory implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int cate1 = ((Book)o1).getCategory();
		int cate2 = ((Book)o2).getCategory();
		if(cate1>cate2)
			return 1;
		else
			return -1;
	}

}
