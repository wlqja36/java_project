package com.ict01.grammar3;
import java.util.Scanner;

class Ex08{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//숫자를 받아서 홀수, 짝수를 구분하자.
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		String snif = (num%2==0)? "짝수" : "홀수";
		System.out.println("결과는 : " + snif + "입니다.");


		//국어, 영어, 수학을 받아서 
		//점수의 평균이 60이상이고, 각각 점수는 40점 이상일때 합격 아니면 불합격

		System.out.print("국어점수 : ");
		int kor = sc.nextInt();

		System.out.print("영어점수 : ");
		int eng = sc.nextInt();

		System.out.print("수학점수 : ");
		int math = sc.nextInt();		
		int sum = kor + eng + math;
		double avg = (int)(sum / 3.0 * 10)/10.0;
		String str1 = (avg >= 60 && kor >= 40 && eng >= 40 && math >= 40)? "합격" : "불합격";
		System.out.println("당신은 " + str1 + " 입니다.");


		//알바시간을 입력받아서
		//8시간 까지는 시간당 8720이고
		//8시간을 초과한 시간만큼은 1.5배이다.
		//받을 금액을 계산하자
		
		System.out.print("알바시간(Ex:10) : ");
		int time = sc.nextInt();
		int dan = 8720;
		int money = (time <= 8 )? (dan*time) : (int)((dan*8)+((time-8)*dan*1.5)) ;
		System.out.println("당신이 받을 급여는 : " + money + "입니다 .");
	}
}