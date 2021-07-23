package com.inherit.silsub0;

public class Car {
	private String color;
	private int speed;
	
	public Car() {}
	
	public Car(String color) {
		this.color=color;
	}
	
	public Car(String color,int speed) {
		this.color=color;
		this.speed=speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void accelPedal() {
		System.out.println("속도가 올라갑니다.");
		setSpeed(getSpeed()+10);
	}
	
	public void breakPedal() {
		setSpeed(getSpeed()-10);
		
		if(getSpeed()>0) {
			System.out.println("속도가 줄어듭니다.");
		}else {
			setSpeed(0);
			System.out.println("멈췄습니다.");
		}
	}
	
	@Override
	public String toString() {
		return "현재속도는 "+speed+" 입니다.";
	}
}
