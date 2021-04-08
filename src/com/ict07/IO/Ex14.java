package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ex14 {
	public static void main(String[] args) {
		// PrintStream : 모든 기본자료형을 출력할 수 있다.
		//				 화면에 출력 하려면 System.out 을 활용
		//				 파일에 출력 하려면 FileOutputStream과 BufferedOutputStream을 활용
		
		String pathname = "C:"+File.separator+"Beomstudy"+File.separator+"util"+File.separator+"ict04.txt";
		
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps=null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos);
			
			//화면에 출력
			System.out.println(24.1);
			System.out.println(24);
			System.out.println('c');
			System.out.println("qweqrw");
			System.out.println("대한민국");
			System.out.println(true);
			
			
			
			
			//파일에 출력
			ps.println(24.1);
			ps.println(24);
			ps.println('c');
			ps.println("qweqw");
			ps.println("대한민국");
			ps.print(true);
			
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				ps.close();
				bos.close();
				fos.close();
				
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
	}
}
