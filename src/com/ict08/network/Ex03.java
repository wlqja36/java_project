package com.ict08.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class Ex03 {
	public static void main(String[] args) {
		BufferedReader br = null;

		try {
			URL url = new URL("https://www.naver.com");
			URLConnection conn = url.openConnection();
			// 한번에 선언하기
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
			System.out.println("인코딩 : " + conn.getContentEncoding());
			System.out.println("길이 : " + conn.getContentLength());
			System.out.println("문서타입 : " + conn.getContentType());
			System.out.println("=====================");
			
			// HTTP 헤더와 바디로 나눠진다. (일반적인 <head><body> 태그가 아님)
			// 헤더는 HTTP 바디 및 요청/응답에 대한 정보를 포함하고 있다.
			// 헤더 정보를 이용해서 웹 브라우저가 해석하고 실행한다
			// 바디는 html 코드, 이미지, css, javascript
			
			Map<String, List<String>> list = conn.getHeaderFields();
			for (String k : list.keySet()) {
				System.out.println(list.get(k));
			}
			
			
			
			

		} catch (Exception e) {

		} finally {
			try {
				br.close();
			} catch (Exception e2) {

			}
		}
	}
}
