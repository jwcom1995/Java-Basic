package com.inherit.part01.beforeProduct.run;

import java.util.Date;

import com.inherit.part01.beforeProduct.model.Desktop;
import com.inherit.part01.beforeProduct.model.SmartPhone;
import com.inherit.part01.beforeProduct.model.Television;

public class Run {
	
	public static void main(String[] args) {
	
		Desktop d = new Desktop("삼성","01","S-01234","매직스테이션","i7",500,8,"window11",1000000,new Date(),false);
		SmartPhone s = new SmartPhone("삼성","02","G-01234","갤럭시20","퀼컴",1024,8,"android",8000000,new Date(),"KT");
		Television t = new Television("삼성","03","T-01234","삼성TV",500000,new Date(),46);
	
		d.information();
		s.information();
		t.information();
		
		System.out.println(Integer.toString(1245).charAt(0));
	}
	
}
