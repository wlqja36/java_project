package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.BufferOverflowException;

public class Ex06 {
	public static void main(String[] args) {
		// 속도향상을 위해서 BufferedOutputStream을 사용한다
		// 혼자서는 사용 할 수 없고 반드시 OutputStream을 받아서 사용
		
		
		// 특정위치의 파일까지 지정
		String pathname = "C:"+File.separator+"Beomstudy"+File.separator+"util"+File.separator+"ict02.txt";
		
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			// 기존 파일이 있으면 덮어쓰기하고, 없으면 생성한다
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			
			// 기존 파일이 있으면 이어쓰기하고, 없으면 생성한다.
			//fos = new FileOutputStream(file, true);
			bos.write(65);
			bos.write(97);
			
			bos.write('j');
			bos.write('a');
			bos.write('v');
			bos.write('a');
			// 자바에서 줄변경은 13(Carriage return = CR = \r) 이다.
			// 다른 언어중에는 (\r\n(Line feed = 10)을 같이 사용하는 경우도 있다.)
			bos.write(13);
			
			// 배열을 이용해서 여러글자 쓰기
			byte[] b = {'b','o','y','s',13,'g','i','r','l','s',13};
			bos.write(b);
			
			
			bos.flush();
			// String을 이용하자(영어 이외 문자도 가능)
			String str = "Hell\r 안녕 \n 134 \r 大韓";
			byte[] c = str.getBytes();
			bos.write(c);
			
			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
