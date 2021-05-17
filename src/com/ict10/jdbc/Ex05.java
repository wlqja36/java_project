package com.ict10.jdbc;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		esc: while (true) {
			Ex05_DAO dao = new Ex05_DAO();
			dao.getList();
			System.err.println("====================================");
			System.out.println("다음 중 선택하세요.");
			System.out.println("1. 삽입하기");
			System.out.println("2. 삭제하기");
			System.out.println("3. 수정하기");
			System.out.println("4. 검색하기");
			System.out.print("선택번호 : ");
			int su = sc.nextInt();
			switch (su) {
			case 1:
				System.out.print("bookid : ");
				int i_bookid = sc.nextInt();
				
				// next() 띄어쓰기 못함.
				System.out.print("bookname : ");
				String i_bookname = sc.next();
				System.out.print("publisher : ");
				String i_publisher = sc.next();
				System.out.print("price : ");
				int i_price = sc.nextInt();
				// 삽입하는 메소드
				Ex05_DAO i_dao = new Ex05_DAO();
				i_dao.getInsert(i_bookid, i_bookname, i_publisher, i_price );
				break;

			case 2:
				System.out.print("삭제할 bookid : ");
				int delete_id = sc.nextInt();
				// 삭제할 메소드
				Ex05_DAO d_dao = new Ex05_DAO();
				d_dao.getDelete(delete_id);
				break;

			case 3:
				System.out.print("bookid : ");
				int u_bookid = sc.nextInt();
				System.out.print("bookname : ");
				String u_bookname = sc.next();
				System.out.print("publisher : ");
				String u_publisher = sc.next();
				System.out.print("price : ");
				int u_price = sc.nextInt();
				// 수정할 메소드
				Ex05_DAO u_dao = new Ex05_DAO();
				u_dao.getUpdate(u_bookid, u_bookname, u_publisher, u_price);
				break;

				
				
			case 4:
				System.out.println("검색할 책번호 : ");
				int s_bookid = sc.nextInt();
				//String s_bookname = sc.next();
				// 검색할 메소드
				Ex05_DAO s_dao = new Ex05_DAO();
				s_dao.getSelect(s_bookid);
				break;
			default:
				System.out.print("위 번호중 입력해주세요.");
				continue esc;

			}

			while (true) {
				System.out.println("계속 할까요(y/n)?");
				String msg = sc.next();
				if (msg.equalsIgnoreCase("y")) {
					continue esc;
				} else if (msg.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.println("잘못 입력 하셨습니다.");
					continue;
				}
			}

		}
		
		System.out.println("변경된 내용");
		Ex05_DAO dao = new Ex05_DAO();
		dao.getList();
	}
}
