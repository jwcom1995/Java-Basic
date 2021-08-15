package com.view;

import java.util.List;
import java.util.Scanner;

import com.controller.ProductController;
import com.model.dto.Product;

public class ProductMenu {
	
	ProductController pc = new ProductController();
	
	public void menu() {
		
		boolean run=true;
		int menu;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			
			System.out.println();
			System.out.println("--------[메  뉴]--------");
			System.out.println("(1) 전체 상품 조회");
			System.out.println("(2) 상품 추가");
			System.out.println("(3) 상품 수정");
			System.out.println("(4) 상품 삭제");
			System.out.println("(5) 상품 검색");
			System.out.println("(0) 프로그램 종료하기");
			System.out.println();
		
			System.out.print("실행할 메뉴를 선택하세요 : ");
			menu=Integer.parseInt(sc.nextLine());
			System.out.println();
			
			switch(menu) {
			case 1:
				System.out.println();					
				System.out.println("(1) 전체 상품 조회");
				List<Product> list = pc.selectAll();
				
				for(int i = 0 ; i <list.size();i++) {
					System.out.println(list.get(i));
				}
				
				break;
			case 2:
				System.out.println();					
				System.out.println("(2) 상품 추가");				
				pc.insert();
				break;
			case 3:
				System.out.println();					
				System.out.println("(3) 상품 수정");
				pc.update();
				break;
			case 4:
				System.out.println();					
				System.out.println("(4) 상품 삭제");
				pc.delete();
				break;
			case 5:
				System.out.println();					
				System.out.println("(5) 상품 검색");				
				Product p =pc.selectOne();
				
				System.out.println("---------상품 검색 결과--------");
				System.out.println(p);
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				run=false;
				break;
			default:
				System.out.println("올바른 값을 입력하세요.");
			}
		}
	}
	
}
