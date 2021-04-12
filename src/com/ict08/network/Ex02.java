package com.ict08.network;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Ex02 {
	public static void main(String[] args) {
		// URL 클래스 : URL(Uniform Resource Locator) : 접근 가능한 자원의 주소를 말한다.
		//				Final 클래스이기 때문에 상속 안됨.
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br =null;
		
		String pathname = "C:"+File.separator+"Beomstudy"+File.separator+"util"+File.separator+"기상청.txt";
		File file = new File(pathname);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		try {
			//먼저 웹페이지 읽기
			URL url = new URL("https://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			is = url.openStream(); // <<이거는 기계 : 기계로 옮겨옴
			isr = new InputStreamReader(is,"utf-8"); //<<여기서는 글자로 읽는 것 , "utf-8" 은 한글처리 한것.
			br = new BufferedReader(isr); // <<속도향상
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg=br.readLine())!=null) {
				sb.append(msg+"\n");
				
			}
			
			System.out.println(sb.toString());
			
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write(sb.toString());
			bw.flush();
			
			
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
	}
}
