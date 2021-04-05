package com.ict01.grammar4;
class Ex04 
{
	public static void main(String[] args) 
	{
		//while문 : for문과 같은 반복문
		//형식1)										형식2)
		//초기식;										초기식;
		//while(조건식){								while(true){
		//조건식이 참일때 실행할 문장;					**if(빠져나갈 조건) break; (먼저탈출)
		//증감식;										조건식이 참일때 실행할 문장;
		//}												**if(빠져나갈 조건) break; (먼나중탈출)
		//**while문이 끝나면 조건식으로 이동하라.		증감식;;
		//												}

		//0~15 까지 출력하자
		int i = 0;
		while (i<16)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		
		i=0;
		while (true)
		{
			if(i >=16) break;
			System.out.print(i+" ");
			i++;

		}
		System.out.println();
			
		


		//0~10까지 홀수만 출력
		i=0;
		while(i<11){
			if(i%2==1){
			System.out.print(i+" ");
			}
			i++;

		}
		System.out.println();
		
		//0~10까지 짝수만 출력
				i=0;
		while(i<11){
			if(i%2==0){
				System.out.print(i+" ");

				}
			i++;

		}System.out.println();
		//0~50까지 7의 배수만 출력
		i=0;
		while(i<51){
			if(i%7==0){
			System.out.print(i+" ");
			
			}
		i++;

		}System.out.println();
		
		
		//5단 출력
		i=0;
		while(i < 10){
			System.out.println("5 * " + i + " = "+ 5*i);
			
			i++;

		}System.out.println();

		//0 0 0 0
		//0 0 0 0
		//0 0 0 0
		//0 0 0 0 출력
		i = 1;
		while(i < 17){
			
			System.out.print("0 ");
			if(i%4==0)
			{
				System.out.println();
			}
			i++;
		}
		//0~10까지의 누적합
		int sum=0;
		i=0;
		while(i<11){
			sum=sum+i;
			i++;
		}
		System.out.println("누적합 : "+sum);
		//홀수와 짝수의 누적합을 각각 구하시오.
		int odd = 0;
		int even = 0;
		i=0;
		while(i<11){
			if(i%2==0){
				even=even+i;
			}else{
				odd=odd+i;
			}
		i++;
	}
	System.out.println("짝수의 합 : " +even+"홀수의 합 : "+odd);
}
}