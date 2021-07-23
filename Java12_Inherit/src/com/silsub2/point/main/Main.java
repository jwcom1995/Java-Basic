package com.silsub2.point.main;

import com.silsub2.point.model.vo.Circle;
import com.silsub2.point.model.vo.Rectangle;

public class Main {
	public static void main(String[] args) {
		
		Circle[] arrC= new Circle[3];
		arrC[0]=new Circle(2,2,4);
		arrC[1]=new Circle(4,-2,8);
		arrC[2]=new Circle(-7,3,5);
		
		for(int i = 0 ; i < arrC.length;i++) {			
			System.out.print((i+1)+"번째 원의 정보 : ");
			arrC[i].draw();
		}
		
		System.out.println();
		Rectangle[] arrR = new Rectangle[3];
		arrR[0]= new Rectangle(10,10,7,9);
		arrR[1]= new Rectangle(-4,-8,2,15);
		arrR[2]= new Rectangle(17,-14,48,27);
		
		for(int i = 0 ; i < arrR.length;i++) {			
			System.out.print((i+1)+"번째 사각형의 정보 : ");
			arrR[i].draw();
		}
	}
}
