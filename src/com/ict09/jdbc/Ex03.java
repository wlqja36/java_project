package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03 {
	public static void main(String[] args) {
		//DB 접속 필요한 클래스 3개
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;  
		int result = 0; 	  // select문이 아닐경우
		
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. 접속 정보
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=utf-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. 쿼리문
			// custid 가 7인 사람의 이름을 박찬호 주소를 대한민국 서울로 변경
			String sql = "update customer set name = '박찬호', address='대한민국 서울' where custid = 7";
			
			// 4.실제 db에 보낼준비
			stmt = conn.createStatement();
			
			// 5. 실제 보내고 결과 받기
			// select문이면 
			// rs = stmt.executeQuery(sql);
			
			// select문이 아니면 => 
			result = stmt.executeUpdate(sql);
			
			if(result > 0) {
				System.out.println("갱신 성공");
				
				sql = "select * from customer";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					System.out.print(rs.getInt("custid")+"\t");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("address")+"\t");
					System.out.print(rs.getString("phone"));
					System.out.println();
				}
				
			}else {
				System.out.println("갱신 실패-1");
			}
			
			
			
		} catch (Exception e) {
			System.out.println("update 실패-2"+e);
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
