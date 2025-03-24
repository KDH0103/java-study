package Modle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	// [DAO]
	// -> Database Access Object(DB에 접근하기 위한 객체)

	Connection conn = null; // DB연결
	PreparedStatement psmt = null; // sql구문세팅/실행
	int result = 0; // return되는 int 형태 결과를 저장
	ResultSet rs = null; // return되는 테이블 형태 결과를 저장

	public void getConn() { // DB 접속 메소드
		try {
			// getConn
			// - 드라이버 로딩, url/user/pw/로 db접속
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// DB연결에 필요한 설정값
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void close() {
		try {
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				psmt.close();
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}

	}

	public int join(MemberDTO dto) { // 회원가입 쿼리 메소드
		// DB접근
		getConn();

		// DB쿼리문실행

		String sql = "INSERT INTO DATADESIGNMEMBER VALUES(?,?,?,?,0)";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setInt(4, dto.getAge());
			result = psmt.executeUpdate();// 실행

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(); // 도구 반납
		}

		return result;

	}

	public ArrayList<MemberDTO> list() {
		ArrayList<MemberDTO> resultList = new ArrayList<>();
		getConn();

		// 샘플쿼리준비->샘플쿼리장착-> (?채우기) -> 실행메소드
		String sql = "SELECT ID,NAME,AGE FROM DATADESIGNMEMBER";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			// ResultSet 형태의 결과물을
			// ArrayList<MemberDTO> 타입 데이터로 변환

			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				resultList.add(new MemberDTO(id, name, age));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return resultList;

	}

	public int update(MemberDTO dto) {
		getConn();

		String sql = "UPDATE DATADESIGNMEMBER SET NAME=? WHERE ID=? AND PW=?";
		int isSuccess = 0;

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getId());
			psmt.setString(3, dto.getPw());

			isSuccess = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return isSuccess;
	}
	
	
	public int delete(MemberDTO dto) {
		// DB접근
				getConn();

				// DB쿼리문실행

				String sql = "DELETE DATADESIGNMEMBER WHERE ID=? AND PW=? ";

				try {
					psmt = conn.prepareStatement(sql);
					psmt.setString(1, dto.getId());
					psmt.setString(2, dto.getPw());
			
			
					result = psmt.executeUpdate();// 실행

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					close(); // 도구 반납
				}

				return result;

	}
	
	
}
