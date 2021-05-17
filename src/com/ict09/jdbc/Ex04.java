package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04 {
	public static void main(String[] args) {
		// DB접속에 필요한 클래스 3개
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
		
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. 접속정보
			String url = "jdbc:mysql://localhost/test01db?characterEncording=usf-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			// 3. 쿼리작성
			// customer테이블에서 이름이 손흥민인 사람 삭제
			String sql = "delete from customer where name = '손흥민'";			
			
			// 4. 실제 db에 보낼준비
			stmt = conn.createStatement();
			
			// 5. 실제 db에 보내고 결과받기
			result = stmt.executeUpdate(sql);
			
			
			if(result>0) {
				System.out.println("삭제 성공");
				
				sql = "select * from customer";
				stmt=conn.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getInt("custid")+"\t");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("address")+"\t");
					System.out.print(rs.getString("phone"));
					System.out.println();
					
				}
			}else {
				System.out.println("삭제 실패-1");
			}
			
		} catch (Exception e) {
			System.out.println("삭제실패 -2 "+e);
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			
			} catch (Exception e2) {

			}
		}
	}
}
