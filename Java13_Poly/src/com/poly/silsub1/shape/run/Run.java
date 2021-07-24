package com.poly.silsub1.shape.run;

import com.poly.silsub1.shape.controller.ShapeManager;
import com.poly.silsub1.shape.controller.ShapeManager2;
import com.poly.silsub1.shape.controller.ShapeManagerAll;

public class Run {
	public static void main(String[] args) {
		ShapeManager test = new ShapeManager();
		test.calcShape();
		
		ShapeManager2 test2 = new ShapeManager2();
		test2.calcShape();
		
		ShapeManagerAll test3 = new ShapeManagerAll();
		test3.calcShapeArray();
	}
}
