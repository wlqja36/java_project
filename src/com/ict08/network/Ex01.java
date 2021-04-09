package com.ict08.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {
	public static void main(String[] args) {
		// InetAddress : 자바에서 IP주소를 표현하는 클래스
		//				 생성자가 존재하지만 사용하지 않는다.
		//				 6개의 static 메소드를 이용한다.
		//	** localhost : 현재 내가 사용하고 있는 컴퓨터를 말한다.
		
		try {
			InetAddress addr = InetAddress.getByName("www.naver.com");
			System.out.println("이름 : " + addr.getHostName());
			System.out.println("주소 : " + addr.getHostAddress());
			System.out.println("toString : "+ addr.toString());
			System.out.println("===============================");
			//내컴퓨터
			addr = InetAddress.getLocalHost();
			System.out.println("이름 : " + addr.getHostName());
			System.out.println("주소 : " + addr.getHostAddress());
			System.out.println("toString : "+ addr.toString());
			System.out.println("================================");
			
			InetAddress[] addrs = InetAddress.getAllByName("www.daum.net");
			
			for (InetAddress k : addrs) {
				System.out.println("이름 : " + k.getHostName());
				System.out.println("주소 : " + k.getHostAddress());
				System.out.println("toString : "+ k.toString());
				System.out.println("---------------------------");
			}
			
			// 125.209.222.137
			byte[] b = {125, (byte)209, (byte)222, (byte)137}; //128넘어가면 에러나기 때문에 형변환.
			addr=InetAddress.getByAddress(b);
			
			//공공데이터포털 가입하기
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
