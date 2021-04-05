package com.ict01.grammar4;
class Ex07 
{
	public static void main(String[] args) 
	{
		//break 문 : 현재 반복문을 탈출할 때 사용
		//continue문 : continue문 이하의 수행문을 포기하고 다음 회차를 반복수행

		for (int i = 1; i<11 ;i++ )
		{
			if(i==4) break;
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i = 1; i<11 ;i++ )
		{
			if(i==4) continue;
			System.out.print(i+" ");
		}
		System.out.println();
		
		int k = 11;
		while (k < 21)
		{
			if(k==17) break;
			
			System.out.print(k+" ");
			k++;
		}
		System.out.println();
		//k=17로 무한루프.
		k = 11;
		while (k < 21)
		{
			
			//if(k==17) continue;
			
			System.out.print(k+" ");
			k++;
		}
		System.out.println();
			

		//중첩 for 문에서 break사용 ; j= 3일때 break;
		for(int i = 1 ; i < 4 ; i++)
		{
			for (int  j = 1; j < 6 ; j++)
			{
				if(j==3) continue;
				System.out.print("i = "+i+", j= "+j);
			}
			System.out.println();
		}
		
		//중첩 for 문에서 break사용 ; i=2일 때 break;
		for(int i = 1 ; i < 4 ; i++)
		{
			for (int  j = 1; j < 6 ; j++)
			{
				if(i==2) continue;
				System.out.print("i = "+i+", j= "+j);
			}
			System.out.println();
		}
	
		


	}
}
