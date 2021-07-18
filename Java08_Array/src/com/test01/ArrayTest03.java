package com.test01;

public class ArrayTest03 {
	
	public void shallowCopy() {
		//얕은복사
		int[] originArr= {1,2,3,4,5};
		int[] copyArr = originArr;
		
		String str = "";		
		for ( int i = 0 ; i < originArr.length;i++) {
			str += originArr[i]+ " ";
		}		
		System.out.println("1.originArr: "+str);
		
		str="";		
		for(int i = 0; i < copyArr.length ; i++) {
			str += copyArr[i]+" ";
		}
		System.out.println("2.copyArr: "+str);
	
		originArr[0]=99;
		
		str="";		
		for ( int i = 0 ; i < originArr.length;i++) {
			str += originArr[i]+ " ";
		}		
		System.out.println("originArr: "+str);
		
		str="";		
		for(int i = 0; i < copyArr.length ; i++) {
			str += copyArr[i]+" ";
		}
		System.out.println("copyArr: "+str);
		
		System.out.println("originArr의 hashcode: "+originArr.hashCode());
		System.out.println("copyArr의 hashcode: "+copyArr.hashCode());
	}
	
	public void deepCopy1() {
		
		int[] originArr= {1,2,3,4,5};
		int[] copyArr= new int[5];
		
		for ( int i = 0 ; i < originArr.length;i++) {
			copyArr[i]=originArr[i];
		}
		String oStr="";
		String cStr="";
		
		for(int i = 0 ; i < 5 ;i++) {
			oStr+= originArr[i]+" ";
			cStr+= copyArr[i]+" ";
		}
		System.out.println("originArr : " + oStr);
		System.out.println("copyArr : " + cStr);
		
		originArr[0]=99;
		
		oStr="";
		cStr="";
		
		for(int i = 0 ; i < 5 ;i++) {
			oStr+= originArr[i]+" ";
			cStr+= copyArr[i]+" ";
		}
		System.out.println("originArr : " + oStr);
		System.out.println("copyArr : " + cStr);
		
		System.out.println("originArr의 hashcode : " + originArr.hashCode());
		System.out.println("copyArr의 hashcode : " + copyArr.hashCode());
		
	}
	
	public void deepCopy2(){
		//2.arraycopy();
		//java.lang.System에 있는 메소드
				
		int originArr[]= {1,2,3,4,5};
		int[] copyArr= new int[10];
		
		//arrayCopy(Object src, int srcPos, Object dest, int destPos, int length)
		//src : 원본배열  srcPos : 복사시작 위치
		//dest:카피 배열 destPos: 붙여넣기 시작 위치
		//length : 복사될 길이
		
		System.arraycopy(originArr, 0, copyArr, 4, originArr.length);
		
		String oStr="";
		String cStr="";
		
		for(int i = 0 ; i < originArr.length ;i++) {
			oStr+= originArr[i]+" ";
		
		}
		for (int i = 0 ; i < copyArr.length; i++) {
			cStr+= copyArr[i]+" ";
		}
		System.out.println("originArr : " + oStr);
		System.out.println("copyArr : " + cStr);
		
		System.out.println("originArr의 hashcode : " + originArr.hashCode());
		System.out.println("copyArr의 hashcode : " + copyArr.hashCode());
		
	}
	
	public void deepCopy3() {
		//3.clone();
		
		int originArr[]= {1,2,3,4,5};
		int[] copyArr= new int[5];
		
		System.out.println("copyArr의 hashcode : " + copyArr.hashCode());
				
		copyArr= originArr.clone();
		
		String oStr="";
		String cStr="";
		
		for(int i = 0 ; i < 5 ;i++) {
			oStr+= originArr[i]+" ";
			cStr+= copyArr[i]+" ";
		}
		
		System.out.println("originArr : " + oStr);
		System.out.println("copyArr : " + cStr);
		
		System.out.println("originArr의 hashcode : " + originArr.hashCode());
		System.out.println("copyArr의 hashcode : " + copyArr.hashCode());
		
	}
}