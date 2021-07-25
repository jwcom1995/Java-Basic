package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.CustomerManager;
import controller.ProductManager;
import model.vo.Product;

public class ShoppingMallMenu {
	ProductManager pm = new ProductManager();
	CustomerManager cm = new CustomerManager();
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		boolean act = true;
		pm.setData();
		cm.setCsData();
		while (act) {
			System.out.println();
			System.out.println("*** 쇼핑 관리 프로그램 ***");
			System.out.println("1. 새 물품 추가");
			System.out.println("2. 물품 차트");
			System.out.println("3. 물품 검색");
			System.out.println("4. 회원가입");
			System.out.println("5. 로그인");
			System.out.println("7. 종료");
			System.out.println("----------------------");
			System.out.print("메뉴 번호 선택 : ");
			int menuNum = sc.nextInt();
			int productNum = 0;
			switch (menuNum) {
			case 1:
				System.out.println();
				System.out.println("------[새 물품 추가]------");
				productNum = selectProduct();
				pm.addProduct(productNum, inputData(productNum));
				break;
			case 2:
				System.out.println();
				System.out.println("------[물품 차트]------");
				productNum = selectProduct();
				pm.showProduct(productNum);
				break;
			case 3:
				System.out.println();
				System.out.println("------[물품 검색]------");
				searchProduct();
				break;
			case 4:
				System.out.println();
				System.out.println("------[회원가입]------");
				cm.addData(inputCsData());
				break;
			case 5:
				System.out.println();
				System.out.println("------[로그인]------");
			case 7:
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

	public void searchProduct() {
		System.out.print("찾는 물품을 검색해 주세요: ");
		sc.nextLine();
		String word = sc.nextLine();
		ArrayList<Product> list = pm.searchProduct(word);
		if(list.isEmpty()) {
			System.out.println("해당 물품이 존재하지 않습니다.");			
		} else {
			for(int i = 0 ; i < list.size();i++) {
				System.out.println("["+(i+1)+"]"+"\t"+list.get(i).toString());
			}
		}
	}
	
	public String[] inputCsData() {
		String[] Data = new String[4];
		String tempId,tempPw1,tempPw2 = "";
		boolean check = true;
		while(check) {
			System.out.print("아이디 : ");
			tempId=sc.next();
			if(cm.checkDupId(tempId)) {
				Data[0]=tempId;
				break;
			}
			else {
				System.out.println("중복된 id가 존재합니다.");
				System.out.println("다른 id를 입력해주세요.");
			}
		}
		while(check) {
			System.out.print("비밀번호 : ");
			tempPw1=sc.next();
			System.out.print("비밀번호 재확인: ");
			tempPw2=sc.next();
			
			if(tempPw1.equals(tempPw2)) {
				Data[1]=tempPw1;
				break;
			}
			else {
				System.out.println("입력한 값이 서로 다릅니다.");
				System.out.println();
			}
		}
		System.out.print("이름 :");
		Data[2]=sc.next();

		System.out.print("주소 :");
		sc.nextLine();
		Data[3]=sc.nextLine();
		return Data;
	}
}
