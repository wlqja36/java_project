package com.ict01.grammar4;
class Ex03 
{
	public static void main(String[] args) 
	{
		for(int i = 1 ; i < 4; i++){
			for (int j=1;j<6 ;j++ ){
				System.out.println("i="+i+", j="+j);
			}
		}
		
		//구구단 1 
		for (int i = 2; i <= 9;i++ ){
				System.out.println(i+"단");
			for(int j = 1; j<=9;j++){
				System.out.println(i + " * " + j +" = "+(i*j));
			}
		
		}
		//구구단 2
		for (int i = 2; i <= 9;i++ ){
				System.out.println(i+"단");
			for(int j = 1; j<=9;j++){
				System.out.print(i + " * " + j +" = "+(i*j)+" ");
			}
				System.out.println();
		
		}
		//구구단 3
		for (int i = 1; i <= 9;i++ ){

			for(int j = 2; j<=9;j++){
				System.out.print(j + " * " + i +" = "+(i*j)+" ");
			}
				System.out.println();
		
		}
		// 0 0 0 0 
		// 0 0 0 0 
		// 0 0 0 0 
		// 0 0 0 0 
		for(int i=0; i<4;i++){
			for(int j=0; j<4; j++){

				System.out.print(" 0");

			}
			System.out.println();
		}

		// 1 0 0 0 
		// 0 1 0 0 
		// 0 0 1 0 
		// 0 0 0 1 
		for(int i=0; i<4;i++){
			for(int j=0; j<4; j++){
				if(i==j){
					System.out.print(" 1");
				}else{
					System.out.print(" 0");
				}
			}
			System.out.println();
		}
		
	}
}
