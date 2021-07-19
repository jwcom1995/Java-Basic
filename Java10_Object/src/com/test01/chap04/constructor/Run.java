package com.test01.chap04.constructor;

import java.util.Date;

public class Run {
	public static void main(String[] args) {
		User u1 = new User();
		u1.information();
		
		User u2 = new User("user1","pass1","이창진");
		u2.information();
		
		User u3 = new User("user2","pass2","김철진",new Date());
	}
}
