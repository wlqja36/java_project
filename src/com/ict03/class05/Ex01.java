package com.ict03.class05;

public interface Ex01 {
	// 인터페이스 : 서비스를 제공하는 목록과 같은 것이다.
	//				상수와 추상메소드들로 이루어졌다.
	//				생성자가 없다.(객체 생성 불가) => 실제 사용 불가
	//				실제 사용하기 위해서는 인터페이스를 상속받은 클래스가 있고
	//				상속받은 클래스를 사용하는 것이다.
	//			*** '인터페이스'가 같다라는 말은 대체(호환)이 가능하다 라는 뜻이다.
	//
	// 인터페이스는 상수와 추상메소드만 가지고있다.
	
	final int SU1 = 10;
	static final int SU2 = 20;
	int su3 = 30;
	static int su4 = 40;
	// 위 멤버 필드들은 모두 static final이다.
	
	//public void play() {}; -> 추상메소드가 아니기때문에 오류발생 
	
	
	
	//원래 추상메소드라면 이렇게 하는것이 맞음. 하지만 인터페이스에서 생략가능
	public abstract void like(); 
	
	//인터페이스 안에서 abstract 생략가능. 보이는 것과 달리 아래문장은 추상메소드.
	public void play();

}
