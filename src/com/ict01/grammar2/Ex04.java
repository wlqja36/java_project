package com.ict01.grammar2;
class Ex04{
	public static void main(String[] args){
		// 숫자들의 크기에 따른 저장원리
		// char < int < long < float < double ;
		// (문자) (정수형 숫자) (실수형 숫자)

		//형변환 : 자동 형변환과 강제 형변환
		//자동 형변환 : 작은 자료형이 큰 자료형에 저장될 때. (프로모션)

		// char를 int에 저장할 수 있다.
		char c1 = 'a';
		System.out.println(c1); //a

		int s1='a';
		System.out.println(s1); //97
		
		int s2 = c1;
		System.out.println(s2); //97
		
		//int를 long에 저장할 수 있다.
		long s3 = 117l;
		System.out.println(s3);
		long s4 = 117;

		//long이 float 나 double에 저장할 수 있다.
		float s5 = s3;
		System.out.println(s5);
		
		
		//강제 형변환 : 큰 자료형을 작은 자료형으로 저장할 때 오류가 발생한다.
		//		이 때 강제로 형 변환해서 오류를 나지않게 한다.
		//		그러나 데이터 손실할 가능성이 있다.
		//강제 형 변환 방법 : =를 기준으로 무조건 왼쪽 자료형에 맞춘다.
		//			=(왼쪽자료형)(대상);

		byte k1= (byte)(257);
		System.out.println(k1);
		
		//int를 char에 넣자
		char k2 = 97;
		System.out.println(k2);
		
		int k3 = 97;
		char k4 = (char)(k3); //char k4 = k3; =>오류 . 강제형변환 시켜야함.
		System.out.println(k4);

		//float나 double를 int로 저장
		int k5 = (int)(87.64);
		System.out.println(k5);




	}
}