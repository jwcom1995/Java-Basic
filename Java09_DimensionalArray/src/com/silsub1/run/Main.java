package com.silsub1.run;

import com.silsub1.model.Sample;

public class Main {

	public static void main(String[] args) {
		//Sample test = new Sample();
		//test.munjae1();
		//test.munjae2();
//		test.munjae3();
		//test.munjae4();
		//test.munjae5();
	}

	public int d(int num) {
		int result=0;
		int numA =num;
		while(numA<1) {
			
			result+=numA%10;
			numA/=numA;
		}
		return (result+num);
	}
}
