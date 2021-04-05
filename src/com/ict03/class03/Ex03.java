package com.ict03.class03;


// Ex02와 Ex03은 상속관계
public class Ex03 extends Ex02{
	String name = "차두리";
	int age = 34;
	static String hobby = "영화보기";
	
	
	public Ex03() {

		System.out.println("자식 클래스 생성자");
	}
	
	public void sound() {
		System.out.println("자식 클래스 메소드");
	}
	public void stydy() {
		System.out.println("공부장소 : " + addr );
		
		// 상속 관계라도 private는 사용할 수 없다.
		//System.out.println("우리집 애완동물 : " + dog);
		
		System.out.println("name : "+this.name); //차두리
		System.out.println("name :"+super.name); //차범근
		
	}
	
	@Override
	public void eat() {
		System.out.println("자식 클래스 메소드 냠냠");
	}
	
	//오버라이딩 : 부모메소드를 겉 모양은 그대로 사용하면서
	//				(재정의) 내용만 변경한다.
	
	
//	오버라이딩 불가!
//	오버라이딩을 할수 없게 하는 예약어 final
//	
//	public void walk() {
//		System.out.println("하루에 무조건 1시간은 걷는다.");
//	}
	
	
	
	
	
	
}
