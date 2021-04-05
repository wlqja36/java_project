package com.ict03.class03;

public class Ex15 extends Ex14{
	String name = "홍일점";
	int id = 2410;
	
	public Ex15() {
		//super();//원래는 생략이 되어있는것.
		super("name",16);
		System.out.println("자식클래스 생성자 : " +this);
		name = "홍두깨";
		id = 1004;
	}

	public Ex15(String name) {
		super(name,15);
		this.name = name;
		System.out.println("자식클래스 이름변경생성자");
	}
	
	public void prn() {
		String name = "홍시";
		//지역, 전역, 부모 모두 같은이름의 변수를 가지고있다. ;반드시 구분
		System.out.println("지역변수이름 : " + name);
		System.out.println("전역변수이름 : " + this.name);
		System.out.println("부모변수이름 : " + super.name);
		
		//부모만 가지고 있는 변수 : 구분하지 않아도 됨(this, super쓰지 않아도 됨)
		System.out.println("지역변수이름 : " + age);
		System.out.println("전역변수이름 : " + this.age);
		System.out.println("부모변수이름 : " + super.age);
		
		//전역변수만 가지고 있는 변수 : super 사용불가.
		System.out.println("지역변수이름 : " + id);
		System.out.println("전역변수이름 : " + this.id);
		//System.out.println("부모변수이름 : " + super.id);//오류발생 -> 부모에 id가 없기때문.
		
		
	}
}
