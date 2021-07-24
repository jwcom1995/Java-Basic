package test;

import java.util.Scanner;

import model.vo.TopDao;

public class test {
	public static void main(String[] args) {
		TopDao td = new TopDao();
		td.setData();
		td.showData();
		Scanner sc = new Scanner(System.in);
		String[] topData = new String[7];
		System.out.print("제품명: ");
		topData[0]=sc.next();
		System.out.print("가격: ");
		topData[1]=sc.next();
		System.out.print("브랜드: ");
		topData[2]=sc.next();
		System.out.print("카테고리: ");
		topData[3]=sc.next();
		System.out.print("재고량: ");
		topData[4]=sc.next();
		System.out.print("성별: ");
		topData[5]=sc.next();
		System.out.print("사이즈: ");
		topData[6]=sc.next();
		td.addData(topData);
		td.showData();
	}
}
