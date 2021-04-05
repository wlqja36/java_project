package com.ict01.grammar3;
class Ex05{
	public static void main(String[] args){

		//int k1가 60이상이면 합격 아니면 불합격
		int k1 = 58;
		String res1 = k1 >= 60 ? "합격" : "불합격";
		System.out.println("결과 : " + res1);
		

		//int k2이 홀수인지 짝수인지 판별하자
		int k2 = 46;
		String res2 = k2%2 ==0 ? "짝수" : "홀수";
		System.out.println("결과 : " + res2);
	

		//char k3가 대문자인지 대문자가 아닌지 판별하자
		
		char k3 = 'K';
		String res3 = (k3 >= 'A' && k3 <='Z') ? "대문자" : "대문자가아님";
		System.out.println("결과 : " + res3);


		// 근무시간이 8시간 까지는 시간당 8720원이고
		// 8시간을 초과한 시간만큼은 1.5배이다
		// 현재 근무시간이 10시간이다.
		// 얼마를 받아야 하는가?
		int mytime = 10;
		int overtimeline = 8;
		int res4 = mytime <= 8 ? (int)(8720*mytime) : (8720*overtimeline)+(int)(8720*(mytime-overtimeline)*1.5);
		System.out.println("결과 : " + res4 + "원");
		/*
		int time = 10;
		int dan = 8720;
		int pay = ( time > 8 ) ? (int)((8*dan)+(time-8)*dan*1.5) : time * dan ;
		*/
	}
}