package com.poly.silsub1.shape.model.vo;

public class Rectangle2 implements IShape{
	private double width;
	private double height;
	
	public Rectangle2() {}
	
	public Rectangle2(double width, double height) {
		this.width=width;
		this.height=height;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return height*width;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(height+width);
	}

}
