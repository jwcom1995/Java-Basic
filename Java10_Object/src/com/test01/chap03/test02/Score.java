package com.test01.chap03.test02;
public class Score {
	   //필드
	   private String name = "최주연";
	   private int kor = 90;
	   private int eng = 84;
	   private int math = 97;
	   
	//   private int sum = 0; 나의풀이
	   
	   
	   
	   //총합을 구해 출력하는 메소드
	   public void sum() {
//	      sum += kor;  나의풀이
//	      sum += eng;
//	      sum += math;
//	      System.out.println("총합: "+sum);
	      
	      //선생님풀이
	      System.out.println("총합: "+(kor+eng+math));
	   }
	   
	   
	   
	   //평균을 구해 출력하는 메소드
	   public void avg() {
//	      int avg = sum/3;
//	      System.out.println("평균: "+avg);
	      
	      //선생님풀이
	      System.out.println("평균: " + (kor+eng+math)/3.0);
	   }
	   
	   
	   
	   //평균 점수를 구해 등급을 출력하는 메소드
	   public void grade() {
//	      for(int i =3;i<=1;i--) {
//	         if(sum/3<=50) {
//	            System.out.println(i+"등급");
//	         }
//	         if(sum/3<=70) {
//	            System.out.println(i+"등급");
//	         }
//	         if(sum/3<=90) {
//	            System.out.println(i+"등급");
//	         }
	      
	      
	      //선생님 풀이
	      double avg = (kor+eng+math)/3.0;
	      
	      if(avg>90) {
	         System.out.println("평균은"+avg+"점이고, 등급은 A입니다.");
	      }else if(avg>70) {
	         System.out.println("평균은"+avg+"점이고, 등급은 B입니다.");
	      } else {
	         System.out.println("평균은"+avg+"점이고, 등급은 C입니다.");
	      }
	   }
	   
	   
	   //필드값을 출력하는 메소드
	   public void prn() {
	      //선생님 풀이
	      System.out.println("name: "+name+"kor: "+kor+"eng: "+eng+"math: "+math);
	      
	   }
	   
	   
	   //메소드 작성 후 main에서
	   //해당 클래스 객체 생성 후 각 메소드 실행하여 결과 확인
	   
	}