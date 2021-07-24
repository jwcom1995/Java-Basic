package view;

import java.util.Scanner;

import controller.ProductManager;

public class ShoppingMallMenu {
	ProductManager pm = new ProductManager();
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		boolean act = true;
		pm.setData();
		while (act) {
			System.out.println();
			System.out.println("*** 쇼핑 관리 프로그램 ***");
			System.out.println("1. 새 물품 추가");
			System.out.println("2. 물품 차트");
			System.out.println("3. 회원가입");
			System.out.println("4. 로그인");
			System.out.println("5. 종료");
			System.out.println("----------------------");
			System.out.print("메뉴 번호 선택 : ");
			int menuNum = sc.nextInt();
			int productNum = 0;
			switch (menuNum) {
			case 1:
				System.out.println("------[새 물품 추가]------");
				productNum = selectProduct();
				pm.addProduct(productNum, inputData(productNum));
				break;
			case 2:
				System.out.println("------[물품 차트]------");
				productNum = selectProduct();
				pm.showProduct(productNum);
				break;
			case 5:
				act=false;
				break;
				
			}
		}
	}

	public String[] inputData(int productNum) {

		String[] Data = new String[7];
		
		if (productNum == 1) {
			System.out.print("카테고리 [1.셔츠/블라우스, 2.반팔티, 3.긴팔티, 4.후드티, 5.맨투맨, 6.니트]: ");
			Data[3] = sc.next();
		} else if (productNum == 2) {
			System.out.print("카테고리 [1.청바지, 2.반바지, 3.레깅스, 4.치마, 5.트레이닝복, 6.면바지]: ");
			Data[3] = sc.next();
		} else if (productNum == 3) {
			System.out.print("카테고리 [1.가방, 2.모자, 3.쥬얼리, 4.시계, 5.지갑]: ");
			Data[3] = sc.next();
		}
		System.out.print("브랜드: ");
		Data[2] = sc.next();
		sc.nextLine();
		System.out.print("제품명: ");
		Data[0] = sc.nextLine();
		System.out.print("가격: ");
		Data[1] = sc.next();
		
		System.out.print("재고량: ");
		Data[4] = sc.next();
		if (productNum == 3) {
			return Data;
		}
		System.out.print("성별 [ 1. All, 2. M , 3. W ]: ");
		Data[5] = sc.next();
		System.out.print("사이즈: ");
		Data[6] = sc.next();
		return Data;
	}

	public int selectProduct() {
		System.out.print("원하는 물품을 고르세요(1.상의 2.하의 3.악세서리) : ");
		int productNum = sc.nextInt();
		return productNum;
	}
}
