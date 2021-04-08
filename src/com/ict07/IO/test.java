package com.ict07.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		// 복사 장소와 파일명을 받고
		// 붙이기 장소와 파일명을 받아서 실행.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("복사할 파일의 경로와 파일명을 적어주세요 (기본경로 \\util) : ");
		String pathname_1 = "C:"+File.separator+"Beomstudy"+File.separator+"util"
							+File.separator+sc.next();
		System.out.print("파일이 복사될 경로와 파일명을 알려주세요 (기본경로 \\util): ");
		String pathname_2 = "C:"+File.separator+"Beomstudy"+File.separator+"util"
							+File.separator+sc.next();
		
		File file1 = new File(pathname_1);
		File file2 = new File(pathname_2);
		
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader(file1);
			br = new BufferedReader(fr);
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
			
			
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine()) != null) {
				sb.append(msg+"\n");
			}
			
			bw.write(sb.toString());
			bw.flush();
			
			
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				br.close();
				fr.close();
				bw.close();
				fw.close();
				
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
		
	}
}
