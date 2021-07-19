package silsub3.run;

import java.awt.SystemColor;

import silsub3.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		Circle c = new Circle();
		
		c.setRadius(5);
		
		System.out.println(c.getRadius());
//		System.out.println("�썝�쓽 �몮�젅 : "+(2*c.getPI()*c.getRadius()));
//		System.out.println("�썝�쓽 �꼫鍮� : "+(c.getPI()*c.getRadius()*c.getRadius()));
//		System.out.println();
		
		c.incrementRadius();
		System.out.println("-----실행결과-----");
		System.out.println("원의 둘레 : "+(2*c.getPI()*c.getRadius()));
		System.out.println("원의 넓이 : "+(c.getPI()*c.getRadius()*c.getRadius()));
		
	}

}
