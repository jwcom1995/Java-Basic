package com.poly.part0.test05;

public class Samsung_tv implements Tv {
	private int volumn;
	
	public Samsung_tv() {
		System.out.println("Samsung tv 가 켜졌습니다.");
	}
	
	public int getVolumn() {
		return volumn;
	}

	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
	
	public void tvClose() {
		System.out.println("Samsung tv가 꺼졌습니다.");
	}
	
	@Override
	public int volUp() {
		setVolumn(getVolumn()+3);
		return getVolumn();
	}

	@Override
	public int volDown() {
		setVolumn(getVolumn()-3);
		return getVolumn();
	}

}
