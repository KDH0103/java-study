package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex04Update {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 사용자 입출력 구간
		System.out.println("======회원정보 수정 ======");
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();

		System.out.print("수정할 점수 입력 : ");
		int score = sc.nextInt();

		PreparedStatement psmt = null;
		Connection conn = null;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			String user = "hr";

			String password = "hr";

			conn = DriverManager.getConnection(url, user, password);

			String sql = "UPDATE DATADESIGNMEMBER SET SCORE =? WHERE ID = ? AND PW = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, score);
			psmt.setString(2, id);
			psmt.setString(3, pw);

			int row = psmt.executeUpdate();
			if (row > 0) {
				System.out.println("회원정보수정 성공!");
			} else {
				System.out.println("회원정보수정 실패");
				System.out.println("아이디나 비밀번호를 확인하세요");
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}

}
