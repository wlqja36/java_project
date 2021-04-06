package com.ict05.collection;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex09 {
	public static void main(String[] args) {
		// 나라정보를 받으면 해당 나라의 수도를 출력하는 프로그램
		
		// 1. 나라와 수도를 가지고 있는 데이터
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("한국","서울");
		map.put("대한민국", "서울");
		map.put("KOREA","서울");
		map.put("korea", "서울");
		map.put("미국", "워싱턴");
		map.put("중국", "북경");
		map.put("일본", "동경");
		map.put("태국", "방콕");
		map.put("캐나다", "오타와");
		// 나라 (key)를 set컬렉션에 넣음.
		Set<String> keyset = map.keySet(); // 질문. map.containsKey --> 단일성, keyset으로 저장하면 다시 쓸 수있다.
		Scanner sc = new Scanner(System.in);
		esc:
		while(true) {
			System.out.print("나라 : ");
			String con=sc.next();
			
			if(map.containsKey(con)) { //if(keyset.contains(con)) => 따로 저장해서 다시 쓸수있어서 사용
				String res = map.get(con);
				System.out.println(con+"의 수도는 "+res+"입니다.");
				
			}else {
				System.out.println("데이터에 없는 나라입니다.");
			}
			
			while(true) {
				System.out.print("계속 하시겠습니까?(y/n)");
				String str = sc.next();
				if(str.equalsIgnoreCase("y")) {
					continue esc;
				}else if(str.equalsIgnoreCase("n")) {
					break esc;
			}else {
				System.out.print("잘못 입력 하셨습니다 y 혹은 n을 입력해주세요");
				continue;
				}
			
			}
		
		}
		System.out.println("종료합니다.");
	}
}
