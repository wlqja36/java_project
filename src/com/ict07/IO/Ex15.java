package com.ict07.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex15 {
	public static void main(String[] args) {
		// 문자스트림(사람중심) : 모든 처리를 2byte씩 처리
		// 대상 : 전 세계의 모든 언어로 구성된 문서 파일들
		// 최상우 ㅣ클래스 : Reader(입력), Writer(출력)
		
		// FileInputStream(바이트) : 1byte 처리, write(int b), write(byte[] b) 
		// FileWriter(문자) 	   : 2byte 처리, write(int b), write(char[] b), write(String str) 
		
		String pathname = "C:"+File.separator+"Beomstudy"+File.separator+"util"+File.separator+"ict06.txt";
		
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			// 한글자쓰기
			bw.write(97); // a
			bw.write(65); // A
			
			// int 이므로 char로 대처할 수 있다.
			bw.write('J');
			bw.write('A');
			bw.write('V');
			bw.write('A');
			// FileOutputStream은 한글이 안되지만 FileWriter는 사용 가능
			bw.write('대'); 
			bw.write('한'); 
			bw.write('민');
			bw.write('국');
			
			char[] c = {13,'아','이','스','크','림'};
			bw.write(c);
			bw.write("\n한국 ICT인재 개발원");
			bw.newLine();// 줄 변경 메소드
			bw.write("1강의장");
			bw.newLine();
			bw.write("자바수업");
			bw.flush();
			
			
		} catch (Exception e) {
			
		}finally {
			try {
				bw.close();
				fw.close();
				
			} catch (Exception e2) {

			}
		}
	}
}
