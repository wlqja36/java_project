package com.ict03.class02;

public class Ex05 {
	public static void main(String[] args) {
		// StringBuffer, StringBuilder -> ���ڿ��� ����ϰ� ����, ����, �߰��� ��� ����� �����Ѵ�.

		// String�� �Һ��� �Ӽ��� ������ �־ �޸𸮿� ���ο� ������ �����ؼ� hello java ���θ����.
		// �׷��� ������ StringBuffer-append�� ����.
		String msg = "hello";
		msg = msg + " java";
		System.out.println(msg);

		StringBuffer sb = new StringBuffer("welcome");
		System.out.println(sb);
		
		// StringBuffer�� �������Ӽ��� �������ִ�.
		// ������ �߰��� ��(append("���ڿ�"); )
		sb.append(" to Java");
		System.out.println(sb.toString());

	}
}
