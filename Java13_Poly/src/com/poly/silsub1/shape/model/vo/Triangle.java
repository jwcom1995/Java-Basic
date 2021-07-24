package com.poly.silsub1.shape.model.vo;

public class Triangle implements IShape {

	private double base;
	private double height;
	
	public Triangle() {}
	
	public Triangle(double base, double height) {
		this.base=base;
		this.height=height;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public double getHypoteneuse() {
		return Math.sqrt(base*base+height*height);
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (base*height)/2;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return base+height+this.getHypoteneuse();
	}

}
