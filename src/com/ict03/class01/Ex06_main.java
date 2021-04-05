package com.ict03.class01;

public class Ex06_main {
	public static void main(String[] args) {
		Ex06 ex06 = new Ex06();
		
		
		String str = ex06.k1();
		System.out.println("이름 : " + str);

		int a = ex06.k2();
		System.out.println("나이 : " + a);
		
		double a2 = ex06.k3();
		System.out.println("키 : " + a2 );
		
		char a3 = ex06.k4();
		System.out.println("랭크 : "+ a3 );
		
		ex06.m1("고길동");
		
		
		System.out.println("이름 : " + ex06.k1());
		
		ex06.m2(37);
		System.out.println("나이 : " + ex06.k2() );
		ex06.m3(170.4);
		System.out.println("키 : " + ex06.k3() );
		ex06.m4('B');
		System.out.println("랭크 : " + ex06.k4() );
		
		
	}
}
