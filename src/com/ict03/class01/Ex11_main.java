package com.ict03.class01;

public class Ex11_main {
	public static void main(String[] args) {
//		Ex11 test1 = new Ex11();
		//그러므로 다른 생성자로 객체 생성을 해야된다.
		Ex11 test1 = new Ex11(17,"임꺽정");
		System.out.println("이름 : " + test1.getName());
		System.out.println("나이 : " + test1.getAge());
		System.out.println("설별 : " + test1.isGender());
		
		/*
//		Ex11 test2 = new Ex11();
		System.out.println("이름 : " + test2.getName());
		System.out.println("나이 : " + test2.getAge());
		System.out.println("설별 : " + test2.isGender());
		
		// setter를 이용해서 멤버필드의 값을 변경할 수 있다.
//		test2.setName("일지매");
		System.out.println("이름 : " + test2.getName());
		System.out.println("나이 : " + test2.getAge());
		System.out.println("설별 : " + test2.isGender());
		*/
	}
	
	
	
}
