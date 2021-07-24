package com.poly.part0.test05;

public class Lg_tv implements Tv{
	private int volumn;
	
	public Lg_tv() {
		System.out.println("Lg tv가 켜졌습니다.");
	}
	
	public int getVolumn() {
		return volumn;
	}

	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}

	@Override
	public int volUp() {
		setVolumn(getVolumn()+1);
		return getVolumn();
	}

	@Override
	public int volDown() {
		setVolumn(getVolumn()-1);
		return getVolumn();
	}

	public void tvClosed() {
		System.out.println("Lg tv가 꺼졌습니다.");
	}
}
