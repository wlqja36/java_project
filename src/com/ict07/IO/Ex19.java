package com.ict07.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		// 복사 장소와 파일명을 받고
		// 붙이기 장소와 파일명을 받아서 실행.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("복사할 파일명(확장자포함)을 경로와 함께 입력해주세요 : ");
		String pathname_1 = sc.next();
		System.out.print("파일이 복사될 경로와 파일명을 알려주세요 : ");
		String pathname_2 = sc.next();
		
		File file1 = new File(pathname_1);
		File file2 = new File(pathname_2);
				
		
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw =null;
		BufferedWriter bw = null;
		
		
		try {
			fr = new FileReader(file1);
			br = new BufferedReader(fr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg=br.readLine()) != null) {
				sb.append(msg+"\n");
			}
			
			
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
			String str = sb.toString();
			//치환
			str = str.replace("대한민국", "대한");
			fw.write(str);
			bw.flush();
			
			
					
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
		
		
		
		
	}
}
