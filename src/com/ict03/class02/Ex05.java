package com.ict03.class02;

public class Ex05 {
	public static void main(String[] args) {
		// StringBuffer, StringBuilder -> 문자열을 빈번하게 수정, 삭제, 추가할 경우 사용을 권장한다.

		// String은 불변의 속성을 가지고 있어서 메모리에 새로운 영역을 차지해서 hello java 새로만든다.
		// 그렇기 때문에 StringBuffer-append를 쓴다.
		String msg = "hello";
		msg = msg + " java";
		System.out.println(msg);

		StringBuffer sb = new StringBuffer("welcome");
		System.out.println(sb);
		
		// StringBuffer는 가변형속성을 가지고있다.
		// 내용을 추가할 때(append("문자열"); )
		sb.append(" to Java");
		System.out.println(sb.toString());

	}
}
