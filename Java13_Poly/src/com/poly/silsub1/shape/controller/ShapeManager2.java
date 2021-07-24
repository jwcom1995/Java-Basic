package com.poly.silsub1.shape.controller;

import com.poly.silsub1.shape.model.vo.Circle2;
import com.poly.silsub1.shape.model.vo.Rectangle2;
import com.poly.silsub1.shape.model.vo.IShape;

public class ShapeManager2 {
	public void calcShape() {
		IShape s;

		s = new Circle2(15.5);
		System.out.println("원면적 : " + s.area());
		System.out.println("원둘레 : " + s.perimeter());

		s = new Rectangle2(34.5, 42.7);
		System.out.println("사각형면적 : " + s.area());
		System.out.println("사각형둘레 : " + s.perimeter());

	}
}
