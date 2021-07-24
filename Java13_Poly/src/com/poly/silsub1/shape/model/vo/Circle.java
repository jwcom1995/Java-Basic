package com.poly.silsub1.shape.model.vo;

public class Circle extends Shape{
	
	private double radius;
	
	public Circle() {}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		int area = (int)(Math.PI*radius*radius * 100);
		return (double)(area/100.0);
	}

	@Override
	public double perimeter() {
		int peri=(int)(2*Math.PI*radius*100);
		return (double)(peri/100.0);
	}
	
}
