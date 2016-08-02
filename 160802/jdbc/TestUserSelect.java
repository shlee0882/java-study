package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.vo.UserVO;

public class TestUserSelect {

	public static void main(String[] args) {
		
		String userid = args[0];
		
		// 1. Driver Class Loading
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 2. Connection 객체 생성
		// 오라클에서 쓰는 포트번호 xe db
		// driver type 
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		// tnsnames.ora 의 적혀있는 포트번호 1521
		String user = "scott";
		String pass = "tiger";
		Connection con = null;
		Statement stmt = null;
		
		try {
			con = DriverManager.getConnection(url,user,pass); // connection 인터페이스
			System.out.println(con.getClass().getName()); 
			// 3. Statement 객체 생성
			stmt = con.createStatement(); // Statement 인터페이스
			// new OracleStatementrapper 쓰지않게 하기 위해 종속적으로 쓰지않기위해
			System.out.println(stmt.getClass().getName());
			// 4. SQL문 실행 및 SQL 결과값 처리
			StringBuilder sb = new StringBuilder();
			sb.append("select userid,")
				.append("name,")
				.append("age,")
				.append("to_char(DATEOFBIRTH,'YYYY-MM-DD') dateofbirth ") // 공백
				.append("from users ") // 공백
				.append("where userid='"+userid+"'");
			
			System.out.println(sb.toString());
			
//			String sql = sb.toString();
//			select userid,name,age,to_char(DATEOFBIRTH,'YYYY-MM-DD') dateofbirth from users
//			String sql = "select * from users where userid='"+userid+"'";
			ResultSet rs = stmt.executeQuery(sb.toString());
			System.out.println(rs.getClass().getName());
			UserVO userVO = null;
			
			List<UserVO> userList = new ArrayList<>();
			
			while(rs.next()){ // next()커서 이동, 데이터있으면 true
				userVO = new UserVO(rs.getString("userid"), rs.getString("name"), rs.getInt("age"), rs.getString("dateofbirth"));
//				System.out.println(userVO);
				userList.add(userVO);
			}
			
			for (UserVO userVO2 : userList) {
				System.out.println(userVO2);
			}
			
			// 5. 사용한 resource(connection, statement, resultset) 종료
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{ // 결국에는 궁극적으로는 
			
			try {
				if(stmt != null)stmt.close();
				if(con != null)con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
