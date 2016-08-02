package jdbc;

public class TestDepartments {

	public static void main(String[] args) {
		// 1. Driver Class Loading
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 2. Connection 객체 생성
		String url = "";
		String user = "";
		String pass = "";
		// 3. Statement 객체 생성
		// 4. SQL문 실행 및 SQL 결과값 처리
		// 5. 사용한 resource(connection, statement, resultset) 종료
	}

}
