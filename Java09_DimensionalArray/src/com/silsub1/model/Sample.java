package com.silsub1.model;

import java.util.Random;
import java.util.Scanner;

public class Sample {
	public void munjae1() {
		int[][] arr = new int[4][4];
		
		Random ran = new Random();
		
		
		//임의의 정수값 기록
		for(int i = 0 ; i <arr.length-1 ;i++ ) {
			for(int j = 0 ; j < arr[i].length-1 ; j++) {
				arr[i][j]=ran.nextInt(100);
			}
		}
		
		//마지막 행 값 일부 입력
		int sum = 0;
		for(int i = 0 ; i < arr.length-1;i++) {
			for(int j = 0 ; j < arr.length-1;j++) {
				sum+=arr[j][i];
			}
			arr[arr.length-1][i]=sum;
			sum=0;
		}
		//마지막 열 값 입력
		for(int i = 0 ; i < arr.length;i++) {
			for(int j = 0 ; j < arr.length-1;j++) {
				sum+=arr[i][j];
			}
			arr[i][arr.length-1]=sum;
			sum=0;
		}
		
		//출력
		for(int i = 0 ; i <arr.length ;i++ ) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void munjae2() {
		int arr[][]=new int[3][];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0행의 열 개수 : ");
		arr[0]= new int [sc.nextInt()];
		System.out.print("1행의 열 개수 : ");
		arr[1]= new int [sc.nextInt()];
		System.out.print("2행의 열 개수 : ");
		arr[2]= new int [sc.nextInt()];


		System.out.println();
		Random ran = new Random();
		int[] sum=new int [arr.length];

		System.out.println("=====행렬 값=====");
		for(int i =0; i < arr.length;i++) {
			System.out.print(i+"행:\t");
			for(int j=0; j<arr[i].length;j++) {
				
				arr[i][j]=ran.nextInt(100);
				sum[i]+=arr[i][j];
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		System.out.println();

		System.out.println("=====수행 결과=====");
		
		for(int i =0; i < arr.length;i++) {
			if(sum[i]%5==0) {
			System.out.print(i+"행:\t");
			for(int j=0; j<arr[i].length;j++) {				
					System.out.print(arr[i][j]+"\t");					
				}
				System.out.println("\t 합계 : "+sum[i]);
			}
		}
	}		
		
		
	public void munjae3() {
		
		int[][] arr = new int[5][5];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("5x5 배열에 들어갈 값을 입력하시오 : ");
		
		//값 입력
		for(int i = 0 ; i < arr.length;i++) {
			if(i%2==0) {
				for(int j = 0 ; j < arr[i].length;j++) {
					arr[i][j]=sc.nextInt();
				}
			} else {
				for(int j = arr[i].length-1 ; j >= 0;j--) {
					arr[i][j]=sc.nextInt();
				}
			}
		}
		
		//출력
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 0 ; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	public void munjae4() {
		
		int[][] arr = new int[5][5];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("5x5 배열에 들어갈 값을 입력하시오 : ");
		
		//값 입력
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 0 ; j < arr[i].length; j++) {
				arr[j][i]=sc.nextInt();
			}
		}
		
		//출력
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 0 ; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void munjae5()
	
    {

        System.out.println("실습 문제 2차원 : 5x5 행렬 생성 ");
        System.out.println("실습 문제 2차원 : 1,2,3,4,5 ");
        System.out.println("실습 문제 2차원 : 10,9,8,7,6 형식으로 ");
        int arr [][] = new int[5][5];
        int sum=0;
        int c= 1;
        for(int i = 0; i<arr.length;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<arr[i].length;j++)
                {
                    arr[i][j]=c;
                    c++;
                }
            }
                else
                {
                    for(int j=arr[i].length;j>=0;j--)
                    {
                    arr[i][j]= c;
                    c++;
                    }
                }

            }
            for(int i = 0;i<arr.length;i++)
            {
                for(int j=-0;j<arr[i].length;j++)
                {
                    System.out.print(arr[i][j]+ "\t");

                }
                System.out.println();
            }

    }
}
