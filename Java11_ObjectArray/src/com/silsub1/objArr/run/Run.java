package com.silsub1.objArr.run;

import com.silsub1.objArr.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student st1 = new Student(3,1,1,"홍길동");
		Student st2 = new Student(4,3,2,"유관순");
		Student st3 = new Student(2,7,3,"윤봉길");
		
		Student[] objArr = new Student[3];
		objArr[0] = st1;
		objArr[1] = st2;
		objArr[2] = st3;
		
		for(int i = 0 ; i < objArr.length ; i++) {
			System.out.println(objArr[i].information());
		}

	}

}
