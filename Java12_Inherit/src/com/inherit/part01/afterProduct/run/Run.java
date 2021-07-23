package com.inherit.part01.afterProduct.run;

import java.util.Date;


import com.inherit.part01.afterProduct.model.Television;

public class Run {
	
	public static void main(String[] args) {
		Television t = new Television("삼성","03","T-01234","삼성TV",500000,new Date(),46);
	
		System.out.println(t.printInformation());
		
	}
	
	
}
