package com.ict01.grammar3;
class Ex11{
	public static void main(String[] args){
		
		//다중 if문 : 조건식이 거짓일 때 다시 조건식을 사용한다.
		//if(조건식1){
		//	조건식1이 참일때 실행;
		//} else if(조건식2){
		//	조건식1은 거짓이면서 조건식2는 참일 때 실행;
		//} else if(조건식3){
		//	조건식1,2는 거짓이면서 조건식3은 참일때 실행;
		//} else{
		//	조건식1,2,3 모두 거짓일때(나머지인 경우) 실행;
		//}
	

		//int k1의 점수가 90 이상이면 A, 80이상이면 B, 70이상이면 C 나머지 F
		int k1 = 90;
		String str="F";
		if(k1>=90){
			str="A";
		}
		else if(k1>=80){
			str="B";
		}
		else if(k1>=70){
			str="C";
		}
		System.out.println(str);

		//char k2 가 대문자인지, 소문자인지, 숫자인지, 기타문자인지 판별
		char k2 = 'a';
		String str1 = "기타문자";
		if(k2>='A' && k2<='Z'){
			str1="대문자";
		}
		else if(k2>='a' && k2<='z'){
			str1="소문자";
		}
		else if(k2>=0 && k2<=9){
			str1="숫자";
		}
		System.out.println(str1);
		//char k3가 A,a 이면 아프리카 B,b이면 브라질 C,c이면 캐나다 나머지 한국
		char k3 = 'b';
		String str2="한국";

		if(k3=='A'||k3=='a'){
			str2="아프리카";
		}
		else if(k3=='B'||k3=='b'){
			str2="브라질";
		}
		else if(k3=='C'||k3=='c'){
			str2="캐나다";
		}
		System.out.println(str2);

		//menu가 1이면 카페모카 3500, 2이면 카페라떼 4000,
		//3이면 아메리카노 3000, 4이면 과일쥬스 3500이다.
		//친구와 2잔을 10000내고 먹었다.
		//잔돈은 얼마인가?(단, 부가세 10%를 포함시키자.)
		int menu = 1;
		int money = 10000;
		int moka = 3500;
		int latte = 4000;
		int ame = 3000;
		int juice = 3500;
		if(menu == 1){
			money = money - (int)(moka*2*1.1);
		}
		else if(menu == 2){
			money = money -(int)(latte*2*1.1);
		}
		else if(menu ==3){
			money = money -(int)(ame*2*1.1);
		}
		else{
			money = money - (int)(juice*2*1.1);
		}
		
		System.out.println(money);


	}
}