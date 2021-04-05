package com.ict01.grammar2;
class Ex08{
	public static void main(String[] args){


		// 아메리카노가 2500원이다. 친구와 둘이서 10000원을 내고 2개 주문했다.
		// 잔돈은 얼마인가? (부가세 10%가 추가된다.) 08

		// 입력정보
		String coff = "아메리카노";
		int ame = 2500;
		int frd = 2;
		int input = 10000;
		int total = ame*frd;
		int vat = (int)(total*0.1);
		int output = input - (total+vat);
		
		int total2 =(int)((ame*frd)*1.1);
		int output2 = input-(total2);

		
		System.out.println("잔돈 : " + output);
		System.out.println("잔돈 : " + output2);

		// 2시간 40분 23초를 초단위로 변경하라. 09

		//9630초는 몇시간 몇분 몇초 인가? 09

	}
}