package com.silsub1.book.main;

import com.silsub1.book.model.vo.Book;

public class Main {

	public static void main(String[] args) {
		
		Book bk1 = new Book("수학의정석","김기석",24000);
		Book bk2 = new Book("과학의정석","김중석",22000);

		System.out.println("bk1의 정보 : "+bk1.toString());
		System.out.println("bk2의 정보 : "+bk2.toString());
		
		System.out.println("bk1과 bk2의 일치? : "+bk1.equals(bk2));
		
		Book copy1 = bk1;
		Book copy2 = new Book("수학의정석","김기석",24000);
		
		System.out.println("bk1의 주소 \t: "+bk1.hashCode());
		System.out.println("copy1(얕은복사)의 주소 \t: "+copy1.hashCode());
		System.out.println("copy2(깊은복사)의 주소 \t: "+copy2.hashCode());		

		System.out.println("bk1와 copy1(얕은복사) 일치? 주소 \t: "+bk1.equals(copy1));
		System.out.println("bk1와 copy2(깊은복사) 일치? 주소 \t: "+bk1.equals(copy2));
	}

}
