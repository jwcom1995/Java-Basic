package com.poly.part0.test06;

public abstract class AreaImpl implements Area {
	
	private String result;
	
	@Override
	public void print() {
		System.out.println(Area.print+result);	//print는 static으로 선언되어서 super가아닌 Area.으로 접근가능	
	}

	public void setResult(String result) {
		this.result=result;
	}
	
	@Override
	public abstract void make();
	
}
