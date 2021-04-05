package com.ict03.class01;

public class Ex02_main {
	public static void main(String[] args) {
		// static은 객체 생성과 상관없이 미리만들어진다.
		// 호출은 클래스이름.메소드, 클래스이름.변수
		
//		System.out.println(Ex02.k1);//인스턴스
		System.out.println(Ex02.k2);
//		System.out.println(Ex02.K3);//인스턴스
		System.out.println(Ex02.K4);
		
		
		
		// void는 정보가 넘어오지않는다.
		Ex02.prn02();
		
		
		//void가 아니면 반드시 반환형에 맞춰서 저장하자. 
		double dou = Ex02.prn04();
		System.out.println(dou);
		
		System.out.println("====객체 생성 전 후====");
		
		
		// 1.Ex02클래스를 사용하기 위해서 객체로 만든다.
		//   Ex02클래스는 생성자가 존재하지 않으므로 기본생성자로 생성한다.
		//	 기본생성자란 인수 = 매개변수가 없는 생성자이다.('클래스이름()')
		//
		
		
		// 클래스 참조변수 = new 생성자;

		Ex02 ex02 = new Ex02();
		//주소
		System.out.println(ex02);
		System.out.println(ex02.k1);
		System.out.println(ex02.k2);
		System.out.println(ex02.K3);
		System.out.println(ex02.K4);
		System.out.println(Ex02.K4);
		//메소드 실행
		ex02.prn01();
		ex02.prn02();
		Ex02.prn02();// 이렇게 쓰는게 좀 더 좋음(static인 경우)
		int su  = ex02.prn03();
		System.out.println(su);
		double dou2 = Ex02.prn04();
		System.out.println(dou2);
		
		
		
		
	}
}
