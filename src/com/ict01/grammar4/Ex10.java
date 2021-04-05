package com.ict01.grammar4;
import java.util.Scanner;
class Ex10 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		esc:
		while(true){
			System.out.print("숫자입력 : ");
			int k = sc.nextInt();
			String msg = "";
			if(k%2==0){
				msg="짝수";
			}
			else{
				msg="홀수";
			}
			System.out.println(k+" 는 " + msg + " 입니다. ");
			while(true){
				System.out.println("계속하시겟습니까?(1-yes, 2-no)>>>");
				int k2 = sc.nextInt();
				if(k==1) {
					//continue esc; - 안쪽바깥쪽 끝 사이에 코드문이들어가있으면 오류.
					break;
				}
				else if(k2==2){
					break esc;
				}
				else{

					continue;
				}
			}// 안쪽
			System.out.println("안쪽 while문 끝");
		}//밖쪽
	}
}
