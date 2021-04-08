package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex08 {
	public static void main(String[] args) {
		// 속도 향상을 위해서 BufferedInputStream을 사용한다.
		// 혼자서 사용할 수 없고 반드시 InputStream을 받아서 사용한다.
		// 생성자 : BufferedInputStream(InputStream in)
		
		String pathname = "C:"+File.separator+"Beomstudy"+File.separator+"util"+File.separator+"ict01.txt";
		
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis=new FileInputStream(file);
			bis=new BufferedInputStream(fis);
			// 한글자 읽어오기 : read() => 숫자(아스키코드) -> 형변환
			//int k = fis.read();
			
			//System.out.println(k+" : "+(char)(k));
			
			// 한 글자씩 계속 읽기 : 그림, 소리, 동영상, 파일을 무조건 해당 방식을 사용
			//						 비 영어권인 문자들은 읽을 수 없다.
			
			/*
			int k = 0;
			while(true) {
				k = bis.read();
				if(k == -1) break;
				System.out.println(k + " : " + (char)(k));
			}
			*/
			
			/*
			// 보통 이렇게 쓴다 위 주석은 풀어논 것.
			int k = 0;
			// bis을 이용해서 한 글자를 읽었을 때 -1과 같지 않으면 실행해라
			while((k=fis.read()) != -1) {
				System.out.println(k + ":" +(char)(k));
			}
			*/
			
			// 배열을 이용한 방법 : 비 영어권 사용 못함.
			/*
			byte[] b = new byte[(int)(file.length())];
			bis.read(b);
			for (byte k : b) {
				System.out.println(k+" : "+(char)(k));
			}
			*/
			
			// String 을 이용하자(영어 이외 문자도 가능)
			// String 생성자에는 byte[] 인자로 받는 생성자를 이용하면 된다.
			
			byte[] b = new byte[(int)(file.length())];
			bis.read(b);
			String str = new String(b);
			System.out.println(str);
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
