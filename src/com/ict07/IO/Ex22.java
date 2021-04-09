package com.ict07.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex22 {
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 문자입력 : "); 
		String msg = sc.next();
		System.out.println("받은 문자 : " + msg);
		*/
		// InputStreamReader 와 OutputStreamWriter를 이용해서 작성하시오
		
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			
			bw.write("원하는 문자 입력 : ");
			bw.flush();
			String msg = br.readLine();
			bw.write("받은 문자 : "+msg);
			bw.flush();
			
			
			
		} catch (Exception e) {

		} finally {
			try {
				bw.close();
				osw.close();
				br.close();
				isr.close();
			} catch (Exception e2) {
				
			}
		}
		
		
	}
}
