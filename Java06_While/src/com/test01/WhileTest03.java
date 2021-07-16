package com.test01;

public class WhileTest03 {
	  public static void main(String[] args) {
		  
		  WhileTest03.prn01();
		  WhileTest03.prn02();
		  WhileTest03.prn03();
		  
	  }
	   //1~100까지 역순출력
	   public static void prn01() {	      
	      int i=100;
	      
	      while(i>0) {	         
	         System.out.println(i);
	         i--;	         
	      }      
	   }
	   
	   
	   //1~100까지중 2의배수 출력
	   public static void prn02() {	      
	      int i=1;
	      
	      while(i<=100) {	         
	         if(i%2==0)
	            System.out.println(i);	         
	         i++;	         
	      }	      
	   }
	   
	   //1~100 7의배수의 갯수와 총합출력
	   public static void prn03() {
	      
	      int i=1;
	      int count=0;
	      int sum=0;
	      
	      while(i<=100){	         
	         if(i%7==0) {
	            count++;
	            sum+=i;
	         }
	         i++;
	      }	      
	      System.out.printf("7의 배수 갯수는 %d, 총합은 %d\n",count,sum);	   
	   }

}
