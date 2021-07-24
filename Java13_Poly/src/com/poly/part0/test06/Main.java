package com.poly.part0.test06;

import java.util.Scanner;

public class Main {

	public static void main() {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("문자열을 입력해주세요: ");
			String str = sc.nextLine();
			if (str.equals("exit")) {
				break;
			} else {
				System.out.println(str.length() + "글자 입니다");
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
