package com.ict03.class01;

public class Ex05_main {
	public static void main(String[] args) {
		// static 객체 생성과 상관없이 사용 가능
		// 클래스이름.멤버필드 , 클래스이름.멤버메소드
		
		
		System.err.println(Ex05.s3);
		
		
		//System.err.println(Ex05.s4);// static 이나 private이기 때문에 접근 불가.
		
		
		
		
		Ex05 ex05 = new Ex05();
		System.out.println(ex05.s1);
		
		//private는 접근안됨
		//System.out.println(ex05.s2);
		
		System.out.println(ex05.s3);
		
		ex05.add();
		
		//ex05.add2();//접근불가
		ex05.add3();//접근은 이렇게.(add3()에는 add2를 호출하는 메소드있음)
		
		
	}
}
