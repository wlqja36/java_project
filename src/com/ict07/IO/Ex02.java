package com.ict07.IO;

import java.io.File;

public class Ex02 {
	public static void main(String[] args) {
		String pathname_1 = "C:\\Beomstudy\\util"; // 운영체제가 windows 일 때
		String pathname_2 = "C:/Beomstudy/util"; // 운영체제가 Linux, Unix 일 때
		
		//운영체제와 상관없이 사용하는 방법
		
		String pathname_3 = "C:"+File.separator+"Beomstudy"+File.separator+"util";
		
		File file = new File(pathname_3);
		String[] arr = file.list();
		for (String k : arr) {
//			System.out.println(k);	
			File file2 = new File(pathname_3,k);
//			System.out.println(file2);
			if(file2.isDirectory()) {
				System.out.println("디렉토리"+file2);
			}else {
				System.out.println("파일 : "+file2);
			}
			
		}
	}
}
