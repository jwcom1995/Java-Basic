package view;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import controller.CustomerManager;
import controller.ProductManager;
import customer.Customer;
import model.vo.Product;

public class ShoppingMallMenu {
	ProductManager pm = new ProductManager();
	CustomerManager cm = new CustomerManager();
	Scanner sc = new Scanner(System.in);
	Customer logonUser = null;
	ArrayList<Product> list;

	public void mainMenu() throws CloneNotSupportedException {
		boolean act = true;

		System.out.println("시스템 접속중 입니다.");
		pm.setData();
		cm.setCsData();

		while (act) {
			System.out.println();
			System.out.println("*** 쇼핑 관리 프로그램 ***");
			System.out.println("1. 새 물품 추가");
			System.out.println("2. 물품 차트");
			System.out.println("3. 물품 검색");
			if (logonUser == null) {
				System.out.println("4. 회원가입");
				System.out.println("5. 로그인");
			} else {
				System.out.println("4. 회원정보");
				System.out.println("5. 로그아웃");

			}
			System.out.println("7. 종료");
			System.out.println("----------------------");
			System.out.print("메뉴 번호 선택 : ");
			int menuNum = sc.nextInt();
			int productNum = 0;
			switch (menuNum) {
			case 1:
				System.out.println();
				System.out.println("------[새 물품 추가]------");
				boolean addAct = true;
				while (addAct) {
					productNum = selectProduct();
					pm.addProduct(productNum, inputData(productNum));
					System.out.print("계속 하시겠습니까?(Y/N) : ");
					String answer = sc.next();
					System.out.println();
					if (answer.toUpperCase().equals("Y")) {
						continue;
					} else if (answer.toUpperCase().equals("N")) {
						System.out.println("메인 메뉴로 돌아갑니다.");
						addAct = false;
					} else {
						System.out.println("잘못된 값을 입력하였습니다.");
					}
				}
				break;
			case 2:
				System.out.println();
				System.out.println("------[물품 차트]------");
				list = null;
				boolean showAct = true;
				while (showAct) {
					productNum = selectProduct();
					list = pm.getProduct(productNum);
					showProduct(list);
					System.out.print("계속 하시겠습니까?(Y/N) : ");
					String answer = sc.next();
					System.out.println();
					if (answer.toUpperCase().equals("Y")) {
						continue;
					} else if (answer.toUpperCase().equals("N")) {
						System.out.println("메인 메뉴로 돌아갑니다.");
						showAct = false;
					} else {
						System.out.println("잘못된 값을 입력하였습니다.");
					}
				}
				break;
			case 3:
				System.out.println();
				System.out.println("------[물품 검색]------");

				boolean searchAct = true;
				while (searchAct) {
					searchProduct();
					System.out.print("계속 하시겠습니까?(Y/N) : ");
					String answer = sc.next();
					System.out.println();
					if (answer.toUpperCase().equals("Y")) {
						continue;
					} else if (answer.toUpperCase().equals("N")) {
						System.out.println("메인 메뉴로 돌아갑니다.");
						searchAct = false;
					} else {
						System.out.println("잘못된 값을 입력하였습니다.");
						System.out.println();
					}
				}
				break;
			case 4:
				if (logonUser == null) {
					System.out.println();
					System.out.println("------[회원가입]------");
					cm.addData(inputCsData());
					System.out.println();
					System.out.println("회원가입이 완료되었습니다.");
				} else {
					System.out.println();
					System.out.println("------[회원정보]------");
					csInfor();
				}
				break;
			case 5:
				if (logonUser == null) {
					System.out.println();
					System.out.println("------[로그인]------");
					login();
				} else {
					System.out.println();
					System.out.println("------[로그아웃]------");
					logonUser = null;
				}
				break;
			case 7:
				act = false;
				break;

			}
		}
	}

	public String[] inputData(int productNum) {

		String[] Data = new String[7];

		if (productNum == 1) {
			System.out.print("카테고리 [1.셔츠/블라우스, 2.반팔티, 3.긴팔티, 4.후드티, 5.맨투맨, 6.니트]: ");
			Data[3] = Integer.toString(sc.nextInt() - 1);
		} else if (productNum == 2) {
			System.out.print("카테고리 [1.청바지, 2.반바지, 3.레깅스, 4.치마, 5.트레이닝복, 6.면바지]: ");
			Data[3] = Integer.toString(sc.nextInt() - 1);
		} else if (productNum == 3) {
			System.out.print("카테고리 [1.가방, 2.모자, 3.쥬얼리, 4.시계, 5.지갑]: ");
			Data[3] = Integer.toString(sc.nextInt() - 1);
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
		if (list.isEmpty()) {
			System.out.println("해당 물품이 존재하지 않습니다.");
		} else {
			System.out.println();
			System.out.println(" INDEX\t\t제품명\t\t 종류\t 브랜드\t성별\t사이즈\t가격\t\t재고량");
			System.out.println();
			for (int i = 0; i < list.size(); i++) {
				System.out.println("[" + (i + 1) + "]" + "\t" + pm.printP(list.get(i)));
			}
		}
	}

	public String[] inputCsData() {

		String[] Data = new String[4];
		String tempId, tempPw1, tempPw2 = "";
		boolean check = true;
		while (check) {
			System.out.print("아이디 : ");
			tempId = sc.next();
			if (tempId.length() < 6) {
				System.out.println("id가 너무 짧습니다. 다시 입력해주세요.");
			} else {
				if (cm.checkDupId(tempId)) {
					Data[0] = tempId;
					break;
				} else {
					System.out.println("중복된 id가 존재합니다.");
					System.out.println("다른 id를 입력해주세요.");
				}
			}
		}
		while (check) {
			System.out.print("비밀번호 \t: ");
			tempPw1 = sc.next();
			System.out.print("비밀번호 재확인\t: ");
			tempPw2 = sc.next();

			if (tempPw1.equals(tempPw2)) {
				Data[1] = tempPw1;
				break;
			} else {
				System.out.println("입력한 값이 서로 다릅니다.");
				System.out.println();
			}
		}
		System.out.print("이름 :");
		Data[2] = sc.next();

		System.out.print("주소 :");
		sc.nextLine();
		Data[3] = sc.nextLine();
		return Data;
	}

	public void login() {
		String id, pw = "";
		System.out.print("아이디 :");
		id = sc.next();
		System.out.print("비밀번호 :");
		pw = sc.next();
		if (cm.loginCheck(id, pw) == 0) {
			logonUser = cm.getCustomer(id);
			System.out.println("로그인이 정상적으로 이루어졌습니다.");
		} else if (cm.loginCheck(id, pw) == 1) {
			System.out.println("입력한 아이디는 존재하지 않습니다.");
		} else {
			System.out.println("입력한 아이디와 비밀번호가 일치하지 않습니다.");
		}
	}

	public void showProduct(ArrayList<Product> list) throws CloneNotSupportedException {
		System.out.println();
		System.out.println(" INDEX\t\t제품명\t\t 종류\t 브랜드\t성별\t사이즈\t가격\t\t재고량");
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.print("  [" + i + "]" + "\t");
			System.out.println(pm.printP(list.get(i)));
		}
		// 고객에게 구매의사를 물어봄
		System.out.println();
		System.out.print("구매하고자 하는 상품이 있습니까? (Y/N) : ");
		String answer = sc.next();
		System.out.println();

		if (answer.toUpperCase().equals("Y")) {
			if (logonUser == null) {
				System.out.println("로그인을 먼저 진행해주세요.");
			} else {
				System.out.println();
				System.out.println("구매하고자 하는 품목의 번호와 수량을 입력해주세요.");
				System.out.print("품목의 번호 : ");
				int index = sc.nextInt();
				System.out.print(((Product) (list.get(index))).getpName() + "의 수량 : ");
				int count = sc.nextInt();
				Product p = list.get(index).clone();
				p.setStock(count);
				logonUser.addCart(p);
				pm.sellProduct(list.get(index), count);
			}

		} else if (answer.toUpperCase().equals("N")) {

		} else {
			System.out.println("잘못된 값을 입력하였습니다.");
			System.out.println();
		}

	}

	public void csInfor() {
		System.out.println("아이디 \t: " + logonUser.getId());
		System.out.println("이름 \t: " + logonUser.getName());
		System.out.println("주소 \t: " + logonUser.getAddress());
		System.out.println("-----쇼핑 리스트----- ");
		if (logonUser.getCart() == null) {
			System.out.println("Empty");
		} else {
			ArrayList<Product> cart = logonUser.getCart();
			int total = 0;
			System.out.println();
			System.out.println(" INDEX\t\t제품명\t\t 종류\t 브랜드\t성별\t사이즈\t가격\t\t재고량");
			System.out.println();
			for (int i = 0; i < cart.size(); i++) {
				System.out.println("  [" + i + "]" + "\t" + pm.printP(cart.get(i)));
				total += Integer.parseInt(cart.get(i).getPrice()) * cart.get(i).getStock();
			}
			System.out.println("-----------------------------");
			System.out.println("  총 합계 : " + total + "원");
		}
	}

}
