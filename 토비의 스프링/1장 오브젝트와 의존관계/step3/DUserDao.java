package tobi_spring.chapter1.step3;

import java.sql.Connection;
import java.sql.SQLException;

public class DUserDao extends UserDao{

	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		/**ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 * 
		 * 	   [D] 사 DB Connection 생성 코드
		 * 
		 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ**/
		return null;
	}

}
