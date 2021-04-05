package com.ict03.class01;

public class Ex15 {

	int s1 = 100;
	static int s2 = 200;
	
	//static 초기화
	static {
		s2 = 2000;
		s3 = 3000;
		s4 = 4000;
	}
	
	//초기화 이후에 선언해도 오류발생 안함.
	static int s3= 300;
	static int s4;
	
	
	public static void main(String[] args) {
		//main() 도 static 이므로 전역변수가 instance이면 참조불가.
		//System.out.println(s1); -->인스턴스변수 참조불가
		System.out.println(s2); //2000
		System.out.println(s3); //300
		System.out.println(s4); //4000
		
		
		
	}
}
