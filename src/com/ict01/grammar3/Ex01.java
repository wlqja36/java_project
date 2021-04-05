package com.ict01.grammar3;
class Ex01{
	public static void main(String[] args){
		// 논리연산자 : &&(AND, 논리곱), ||(OR, 논리합), !(NOT, 논리부정)
		// 사용되는 자원 : boolean형, 비교연산, 논리연산
		// 결과는 boolean형 => 조건식에 사용된다.

		// &&(AND, 논리곱, 교집합)
		// - 주어진 조건이 모두 true 일 때만 결과가 true
		// - 주어진 조건들 중에 false를 만나는 순간 결과 false
		// - false를 만나면 이후의 있는 연산은 하지 않는다.
		
		int s1 = 10;
		int s2 = 7;
		boolean result = false && true;
		System.out.println(result); // true
		
		result = (s1 <= 7) && (s2 >= 5);
		System.out.println(result); //true

		
		//false 만나면 이후 연산하지 않는다.
		result = ((s1 = s1+2) < s2) && ( s1 == (s2=s2+5));
		System.out.println("결과 : "+result);
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);

		result = ((s1 = s1+2) > s2) && ( s1 == (s2=s2+5));
		System.out.println("결과 : "+result);
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);

		//&& 는 숫자일 경우 범위를 지정할 수 있다.
		//a >= 10 && a <= 20 ;
		s1 = 24;
		result = (s1 >=	20) && (s1 <=30);
		System.out.println("결과 : " + result);

		// char c1이 소문자이냐? (a=97, z=122)
		char c1 = 'k'; // D => 68
		//result = (c1 >= 97) && (c1 <= 122); // 소문자 범위
		result = (c1 >= 'a') && (c1 <= 'z'); // 소문자 범위
		System.out.println("결과 : " + result);


	}
}