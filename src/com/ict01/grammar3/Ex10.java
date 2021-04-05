package com.ict01.grammar3;
import java.util.Scanner;

class Ex10{
	public static void main(String[] args){
		
		//if ~ else ~ : 조건식이 참일 때와 거짓일 때 각각 나눠서 처리한다.
		//형식 : if(조건식){
		//		조건식이 참일때 실행할 문장;
		//		}else {
		//		조건식이 거짓일때 실행할 문장;
		//		}
		//단, 실행할 문장이 한 줄이면 생략 가능하다.
		
		//int k1이 60이상이면 합격 아니면 불합격
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요");
		int k1 = sc.nextInt();
		if( k1 >= 60 ){
			System.out.println("합격");
		}
		else{
			System.out.println("불합격");
		}

		//int k2이 홀수인지 짝수인지 판별하자
		System.out.print("숫자를 입력하세요");
		int k2=sc.nextInt();
		if( k2 % 2 == 0 ){
			System.out.println(k2 + "는 짝수입니다.");
		}else{
			System.out.println(k2 + "는 홀수입니다.");
		}
		
		//char k3가 대문자인지 대문자가 아닌지 판별하자
		
		char k3 = 'A';
		if(k3 >= 'A' && k3 <= 'Z'){
			System.out.println("대문자입니다.");
		}else{
			System.out.println("대문자가 아닙니다.");			
		}


		//k4가 1 또는 3이면 남자 아니면 여자		
		System.out.print("남자여자 판별기 : ");
		int k4 = sc.nextInt();
		if(k4==1 || k4==3){
			System.out.println("남자입니다");
		}else{
			System.out.println("여자입니다");
		}
		
		//근무시간이 8시까지는 시간당 8720이고 8시간을 초과한 시간만큼은 1.5배이다. 현재 근무시간은 10시간이다
		//얼마를 받아야하는가?
		System.out.print("근무시간을 입력하세요 : ");
		int time = sc.nextInt();
		int dan = 8720;
		int pay = time*dan;
		if(time > 8){
			pay = (int)((time-8)*dan*1.5)+(8*dan);
		}
		System.out.println("받아야할 급여는 : " +pay +"입니다.");
		
	}
}