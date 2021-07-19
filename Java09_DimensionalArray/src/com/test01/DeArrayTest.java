package com.test01;

public class DeArrayTest {
	public static void main(String[] args) {
		//new DeArrayTest().test1();
		//new DeArrayTest().test2();
		//new DeArrayTest().test3();
		new DeArrayTest().test4();
	}
	
	public void test1 () {
		int[][] iarr1;
		int iarr2[][];
		
		iarr1 = new int[3][5];
		
		iarr2= new int[3][];
		
		iarr2[0]=new int[5];
		iarr2[1]=new int[5];
		iarr2[2]=new int[5];
		
		for(int i =0; i < iarr2.length;i++) {
			for(int j=0; j<iarr2[i].length;j++) {
				System.out.print(iarr2[i][j]+" ");
			}
			System.out.println();
		} //heap영역에는 빈방이 있으면 안되므로 jvm에서 0을 자동으로 저장
	}
	
	public void test2() {
		int[][] iarr= new int[3][5];
		
		//인덱스에 접근하여 값 기록
		iarr[0][0] = 1;
		iarr[0][1] = 2;
		iarr[0][2] = 3;
		iarr[0][3] = 4;
		iarr[0][4] = 5;
		
		iarr[1][0] = 6;
		iarr[1][1] = 7;
		iarr[1][2] = 8;
		iarr[1][3] = 9;
		iarr[1][4] = 10;
		
		iarr[2][0] = 11;
		iarr[2][1] = 12;
		iarr[2][2] = 13;
		iarr[2][3] = 14;
		iarr[2][4] = 15;
		
		prn(iarr);
	}
	
	
	//출력하는 메소드
	public void prn(int[][] iarr) {
		for(int i = 0 ; i < iarr.length ; i++) {
			for(int j = 0; j < iarr[i].length;j++) {
				System.out.print("\t"+iarr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	//가변 배열 생성
	public void test3() {
		int[][] iarr = new int[3][];
		
		iarr[0]=new int[5];
		iarr[1]=new int[3];
		iarr[2]=new int[10];
		
		prn(iarr);
		
		int value=0;
		for(int i = 0 ; i < iarr.length ; i++) {
			for(int j = 0; j < iarr[i].length;j++) {
				iarr[i][j] = ++value;
			}
		}
		
		prn(iarr);
	}
	
	public void test4() {
		//이차원에배열의 할당과 초기화를 동시에
		int[][] iarr = {{1,2,3},{4,5,6,7,8,9},{10}};
		
		prn(iarr);
	}
}
