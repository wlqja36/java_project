package com.ict05.collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex06 {
	public static void main(String[] args) {
		// List 인터페이스를 구현한 클래스들 : Stack, ArrayList, Vector;
		// Array 와 Vector : 배열과 흡사한 구조이지만, 삽입, 삭제, 추가가 자유롭다.
		//					 크기를 미리 지정하지 않아도 된다.
		//					 ArrayList(동기화 지원 X)    Vector(동기화 지원 O = 동시접속)
		
		
		// Set 구조는 순서가 없다. 중복 안됨
		// List 구조는 순서가 존재, 중복가능
		ArrayList<String> list = new ArrayList<String>();
		//추가 : add
		list.add("박찬호");
		list.add("류현진");
		list.add("손흥민");
		
		System.out.println(list);
		
		// 삽입 : add
		list.add(1, "추신수");
		System.out.println(list);
		System.out.println();
		
		
		Vector<String> vector = new Vector<String>();
		vector.add("둘리");
		vector.add("도우너");
		vector.addElement("또치");
		System.out.println(vector);
		
		//삽입 : 
		vector.add(2,"희동이");
		System.out.println(vector);
		
		
		
		
		
		if(list.contains("손흥민")) {
			// 검색 : 위치값 검색
			System.out.println(list.indexOf("손흥민")+"번째 위치"); // 검색
			// 검색 : 해당 위치에 존재하는 객체 검색
			System.out.println(list.get(3));						// 검색
			// list에 존재하면 가져오기
			System.out.println(list.get(list.indexOf("손흥민")));
			
			
		}else {
			System.out.println("존재하지 않습니다.");
		}
		System.out.println("list 는 " +list.size()+"요소가 있습니다");
		
		//치환 set
		list.set(3, "이대호");
		System.out.println(list);
		
		//추신수가 있으면 추신수를 이종법으로 변경해라
		
		if(list.contains("추신수")) {
			list.set(list.indexOf("추신수"), "이종범");
		}else {
			System.out.println("추신수의 이름은 없습니다.");
		}
		System.out.println("=============");
		//하나씩 꺼내서 (for, iterator)
		for (String k : list) {
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.println("=============");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s1 = (String)(it.next());
			System.out.print(s1+" ");
//			System.out.println(it.next()); //?
		}
		
		
	}
	
}
