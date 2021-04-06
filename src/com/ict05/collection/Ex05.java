package com.ict05.collection;

import java.util.Iterator;
import java.util.Stack;

public class Ex05 {
	// List 인터페이스를 구현한 클래스들 : Stack, ArrayList, Vector;
	// Stack(스택) : LIFO (Last In First Out) : 마지막에 들어온 데이터가 맨 처음 나간다.
	// 주요메소드
	// add, push, add Element => 추가
	// add(index, E) => 삽입
	// pop : 맨위에 존재하는 객체를 반환하고 삭제한다.
	// peek : 맨위에 존재하는 객체글 반환하고 삭제하지 않는다.(무한루프조심)
	// search : 검색(오른쪽부터, 1부터)
	// indexOf : 검색(왼쪽부터, 0부터) => 배열방식
	// elementAt(index) : 위치값을 받아서 해당 객체 추출 
	// get(index) : 위치값을 받아서 해당 객체 추출
	// firstElement : 맨 처음 요소 추출
	// lastElement :  맨 마지막 요소 추출
	// setElement(Element, index) : 치환
	
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.add("둘리");
		stack.addElement("공실이");
		stack.push("마이콜");
		System.out.println(stack);
		
		stack.add(1, "도우너"); // 삽입
		stack.add(0, "또치"); // 삽입
		stack.add(1, "뿌끄"); // 삽입 (중복이 아니다.)
		stack.add(1, "둘리"); // 중복 사용 가능
		
		System.out.println(stack);
		
		System.out.println("===================================");
		// 마지막 객체 보기 pop(삭제O), peek(삭제X = for문 사용하면 무한루프)
		System.out.println(stack.peek());
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack);
		
		// contains, indexOf, search, get, elementsAt, firstElements, lastElement
		
		if(stack.contains("둘리")) {
			System.out.println("있다");
			// 해당 객체의 위치 값.
			System.out.println(stack.indexOf("둘리")+"번째 위치");
			System.out.println(stack.search("둘리")+"번째 위치");
			System.out.println(stack.get(1));
			System.out.println(stack.get(stack.indexOf("둘리"))); //둘리라는 단어를 찾아서 출력까지 한번에 - 배열식 
			System.out.println(stack.elementAt(stack.indexOf("둘리"))); //둘리라는 단어를 찾아서 출력까지 한번에 - stack식
			System.out.println(stack.firstElement());
			System.out.println(stack.lastElement());
			
			
			
		}else {
			System.out.println("없다.");
		}
		
		System.out.println(stack.size()+"요소가 존재합니다.");
		// index가 3인
//		stack.set(3, "마이콜"); 아래와 비교
		stack.setElementAt("마이콜",3);
		System.out.println(stack);
		
		// 하나씩 꺼내기 (개선된 for, iterator =(데이터가 그대로 존재) // pop (데이터가 삭제됨)
		for (String k : stack) {
			System.out.print(k+" ");
		}
		System.out.println(stack.size() + "요소가 존재함");
		System.out.println("======================");
		Iterator<String> it = stack.iterator();
		while (it.hasNext()) {
			String msg = (String) it.next();
			System.out.print(msg+" ");
		}
		System.out.println(stack.size()+"요소가 존재함");
		System.out.println("======================");
		while(! stack.isEmpty()) {
			
			System.out.println(stack.pop()+"삭제됨, 크기는 "+stack.size());
		}
		
		
		
		
	}
	
}
