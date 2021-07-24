package com.poly.part0.test06;

import java.util.Scanner;

public class Triangle extends AreaImpl{

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변: ");
		int x= sc.nextInt();
		System.out.print("높이: ");
		int y= sc.nextInt();
		
		double res = x*y/2.0;
		
		setResult(String.format("삼각형의 %.2f", res));
		
	}
}
