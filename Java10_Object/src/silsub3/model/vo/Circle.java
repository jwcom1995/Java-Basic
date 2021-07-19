package silsub3.model.vo;

public class Circle {
	public static final double PI = 3.14;
	private static int radius;
	private double area = 2*this.PI*this.radius;
	private double round = this.PI*this.radius*this.radius;
			
	public Circle() {}
		
	public double getArea() {
		return area;
	}
	public double getRound() {
		return round;
	}
	
	public void setRadius(int radius) {
		this.radius=radius;
	}
	
	public double getPI() {
		return this.PI;
	}
	public int getRadius() {
		return this.radius;
	}
	
	
	public void incrementRadius() {
		this.radius++;
	}
}
