package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex03 {
	public static void main(String[] args) {
		// JDBC(Java Database Connectivity)는 자바에서 데이터베이스에 접속할 수 있도록 지원하는
		// 자바 API 이다.
		
		// DB 처리에 필요한 클래스 3개
		Connection conn = null;
		PreparedStatement pstmt = null; // statement를 상송받는 인터페이스
		ResultSet rs = null; // select 문의 결과를 받는 클래스 cursor를 사용해서 정보 추출
		int result = 0; // select 문을 제외한 나머지 결과를 받을 때 사용
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. 접속정보 (3개)
			String url = "jdbc:mysql://203.236.220.96:3306/test01db?characterEncording=utf-8&serverTimezone=UTC";
			String user = "test02";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
						
			// 쿼리문 작성 (select, insert, update, delete, ...)
			String sql = "insert into book values(?,?,?,?)";
			
			// 쿼리 구문 적용
			pstmt = conn.prepareStatement(sql);
			
			//바인딩 변수처리
			// pstmt.setInt(1, 5);
			
			pstmt.setInt(1, 15);
			pstmt.setString(2,"농구 바이블");
			pstmt.setString(3,"대한미디어");
			pstmt.setInt(4, 13000);
			
			
			// 실제 DB에 적용하고 결과받기
			
			result = pstmt.executeUpdate(); // 쿼리문이 select 문이면 excuteQuery(); - rs(ResultSet)
											// 쿼리문이 select를 제외한 구문이면 excuteUpdate(); - result(int)
			
			if(result>0) {
				sql = "select * from book order by bookid asc";
				pstmt = conn.prepareStatement(sql);
				rs=pstmt.executeQuery();
				while(rs.next()) {
					System.out.print(rs.getInt("bookid")+"\t");
					System.out.print(rs.getString("bookname")+"\t");
					System.out.print(rs.getString("publisher")+"\t");
					System.out.println(rs.getInt("price"));
				}
						
			}
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {

			}
		}
	}
}
