package com.ict01.grammar4;
class Ex02 
{
	public static void main(String[] args) 
	{
		// for문 : 정해진 규칙에 따라 실행문을 반복처리 하는 문
		// 형식 : for(초기식;조건식;증감식){
		// 조건식이 참일 때 실행할 문장;
		// 조건식이 참일 때 실행할 문장;
		// }

		//for문을 만나면 무조건 초기식으로 이동
		//초기식에서는 조건식을 이동
		//조건식이 참이면 for문을 실행
		//조건식이 거짓이면 for문 밖으로 빠져나간다.
		//for문 실행 중 for문의 끝을 만나면 무조건 증감식으로 간다.

		//안녕하세요, 열번 출력하기
		for(int i = 1 ; i < 11 ; i++){
			System.out.println("안녕하세요 - " + i);
		}
		//0~15 까지 출력하자
		for(int i = 0 ; i < 16 ; i++ )
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		//0~10까지 짝수만 출력
		for(int i =0; i <= 10; i++){
			if(i%2==0){
				System.out.print(i+" ");
				
			}
		}System.out.println();
		//0~10까지 홀수만 출력
		for(int i =0; i <= 10; i++){
			if(i%2==1){
				System.out.print(i+" ");
				
			}
		}System.out.println();
		//0~50까지 7의 배수만 출력
		for (int i=0 ;i <= 50 ;i++ )
		{
			 if(i%7==0){
				 System.out.print(i+" ");
				 
			 }
		}System.out.println();
		
		//5단 출력
		for (int i = 1 ;i <= 9 ;i++ )
		{
			
			System.out.println("5 * "+ i +" = " + i*5);
			
		}System.out.println();

		//0 0 0 0
		//0 0 0 0
		//0 0 0 0
		//0 0 0 0 출력
		for (int i=1;i<=16 ;i++ )
		{
			System.out.print("0 ");
			if(i%4==0){
				System.out.println();
			}
		}
		int sum= 0;
		for (int i=0; i<=10 ;i++ )
		{
			sum+=i;
		}
		System.out.println(sum);

		//홀수의 누적합
		int sum1=0;
		for (int i = 0 ;i<=10 ;i++ )
		{
			if(i%2==1){
				sum1+=i;
			}

		}
		System.out.println(sum1);
		
		//짝수의 누적합
		int sum2=0;
		for (int i = 0 ;i<=10 ;i++ )
		{
			if(i%2==0){
				sum2+=i;
			}

		}
		System.out.println(sum2);
		//홀수와 짝수의 누적합을 각각 구하시오.
		int evensum=0;
		int oddsum=0;
		for (int i = 0 ; i <= 10 ; i++ )
		{
			if(i%2==0){
				evensum += i;
			}
			else{
				oddsum +=i;
			}
		}
		System.out.println("홀수의 누적합 : "+oddsum+"  짝수의 누적합 : "+evensum);
		// 7!
		int fact=1;
		for (int i=7;i>=1 ;i-- )
		{
			fact*=i;
		}
		System.out.println(fact);

	}
	
}
