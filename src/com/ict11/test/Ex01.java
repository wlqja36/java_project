package com.ict11.test;

public class Ex01 {
	// 문제 1. main 메소드의 선언부 기술
	public static void main(String[] args) {
	
	// 문제 2. 기본 자료형 8가지
	// boolean, char, byte, short, int, long, float, double
	
	// 문제 3. 
	// int intVar = 129; byte byteVar = (byte)intVar;
	
	// 문제 4. a++ 과 ++a의 차이점을 쓰시오
	// a++ : 현재 변수 a가 가지고 있는 값을 사용한후 나중에 a값이 1증가
	// ++a : 현재 변수 a가 가지고 있는 값에 1을 증가 한 후 나머지 계산
	
	
	// 문제 5. double s1 = 36.66666 일 때 소숫점 첫째 자리 까지만 구하는 코딩을 하시오
	double s1 = 36.666666;
	double k1 = (int) (s1*10)/10.0;
	System.out.println(k1);
	
	// 문제 1. 클래스 무엇으로 이루어 져있는가?
	//			멤버필드(변수,상수), 멤버 메소드, 생성자
	//
	// 문제 2. 클래스를 객체로 생성할 때 초기화를 목적으로 반드시 호출 하는 것
	//		    생성자
	//
	// 문제 3. 매개변수는 달라야하는 것을 무엇이라 하는가 ? 
	//		   중복 정의(오버로딩)
	
	// 문제 4. 상속관계에서 부모클래스 메소드를 자식클래스가 가져와서 상황에 맞게 변경하는것
	//		   재정의(오버라이딩)
	
	// 문제 5. 추상클래스와 인터페이스에 대해서 쓰시오
	//		   추상클래스 : 추상메소드를 하나이상 가지고 있는 클래스
	//		   				추상메소드란 body가 없는 메소드,  구체화가 되지않은 메소드
	//		   인터페이스 : 상수와 추상메소드로 이루어진 클래스	(생성자x, 객체생성x)
	
	// 문제 1. Random 활용해서 정수 1~10 사이 난수
	//		   Random random = new Random();
	//		   int su1 = random.nextInt(10)+1; //
	//		   int su2 = (int)(random.nextDouble()*10)+1;
	
	// 문제 2. 제네닉과 컬렉션에 대해 쓰시오
	// 제네닉 : 컬렉션이 어떤 객체들로 이루어졌는지 표시하는 객체타입
	// 컬렉션 : 객체를 모아서 관리하는 인터페이스를 구현한 것
	
	
	// 문제 3. Thread 클래스와 Runnable 인터페이스의 차이점을 쓰시오
	//	Thread => start(), run() 가 다있다.
	//	Runnable => run() 만 있다 start()가 없으므로
	//				별도의 스레드를 생성해서 run()를 가진 클래스를 타겟으로 잡아야된다.
	//
	// 문제 4. 동기화처리에 대해 쓰시오
	//		   멀티 스레드에서 공통으로 사용되는 영역(임계영역)에서 현재 실행중인 스레드가
	//		   순식간에 다른 스레드에게 제어권을 빼앗기는 문제가 발생한다.
	//		   이를 해결하기 위한 방법이 동기화 처리이다.
	//		   해당 임계영억에 synchronized 예약어를 사용하면 된다.
	
	// 문제 5. 바이트 스트림과 문자 스트림의 차이에대해 쓰시오
	//		   바이트 스트림 : 모든 처리르 1byte씩 처리, 1byte로 이루어진 파일(영상,소리 등) , 영어 대소문자, 숫자 스트림 가능
	//		   최상위 클래스 : InputStream(입력), OutputStream(출력)
	//		   문자 스트림(사람중시) : 모든 처리를 2btre씩 처리
	//		   대상 : 전 세계의 모든 언어로 구성된 문서 파일
	//		   최상위 클래스 : Reader(입력), Writer(출력)
	
	
	
 
	}
}
