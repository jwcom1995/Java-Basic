package com.silsub2.point.model.vo;

import java.lang.Math;

public class Circle extends Point {
	private int radius;
	
	
	public Circle() {}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		double area = Math.PI*radius*radius;
		double round = 2*Math.PI*radius;
		System.out.printf("x 좌표 : %d , y 좌표 : %d , 원의 면적 : %.1f , 원의 넓이 : %.1f%n",super.x,super.y,area,round);
	}
}
