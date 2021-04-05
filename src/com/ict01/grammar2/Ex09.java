package com.ict01.grammar2;
class Ex09{
	public static void main(String[] args){
		// 2시간 40분 23초를 초단위로 변경하라. 09
		int hour = 2;
		int min = 40;
		int sec = 23;
		
		System.out.println("2시간 40분 23초는 : " + ((hour*60*60)+(min*60)+sec)+"초 입니다.");

		//9630초는 몇시간 몇분 몇초 인가? 09		
		int allsec = 9630;
		int ssec = allsec % 60;
		int smin = (allsec / 60) % 60;
		int shour = allsec / (60 * 60);

		System.out.println("9630초는 : " + shour + "시간 " + smin + "분 " + ssec + "초");

		

		/* //강사님이 해주신 것.
		int res = 0;
		shour = allsec / (60*60);
		res = allsec %(60*60);
		smin = res / 60;
		ssec = res % 60;
		*/

	}
}