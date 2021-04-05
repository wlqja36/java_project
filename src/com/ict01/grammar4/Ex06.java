package com.ict01.grammar4;
import java.util.Scanner;
class Ex06 
{
	public static void main(String[] args) 
	{
		//do ~ while문 : while문과 같은 반복문
		//				먼저 실행한 후 나중에 비교한다
		//형식)
		//초기식;
		//do{
		//	실행할 문장;
		//	증감식;
		//}
		//whle(조건식);

		//0~10까지 출력
		int i = 0;
		do{
			System.out.print(i+" ");
			i++;
		}

		while(i<11);
		System.out.println();

		//반복횟수를 받아서 처리하자.

		Scanner sc = new Scanner(System.in);
		System.out.print("반복횟수를 정하세요 : ");
		int N = sc.nextInt();
		i=1;
		do{
			System.out.println("안녕하세요");
			i++;
		}while(i <= N);


		//반복횟수와 일반 숫자를 받아서 홀수, 짝수를 출력, 
		System.out.print("반복 횟수를 정하세요 : ");
		int N1=sc.nextInt();
		i=1;
		String msg = "";
		do{
			System.out.print("판별할 숫자를 입력하세요 : ");
			int num1=sc.nextInt();
			if(num1%2==0){
				msg = "짝수";
			}else{
				msg = "홀수";
			}
			System.out.println("입력한 수 "+num1+"은/는 "+msg+"입니다.");
			i++;
			System.out.println();
		}while(i<=N1);
			




	}
}
