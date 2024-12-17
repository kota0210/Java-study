package chap_9;
import java.sql.*;
public class Main2 {
	public static void main(String[] args) {
	try {
		Class.forName("org.h2.Driver");
		
	}catch(ClassNotFoundException e) {
		throw new IllegalStateException("ドライバのロードに失敗しました。");
	}
	
	Connection con = null;
	
	try {
		con = DriverManager.getConnection("jbdc:h2:~/rpgdb");
		con.setAutoCommit(false);
		con.commit();
	}catch(SQLException e) {
		try {
			con.rollback();
		}catch(SQLException e2) {
			e2.printStackTrace();
		}
	}finally {
		if(con != null) {
			try {
				con.close();
			}catch(SQLException e3) {
				e3.printStackTrace();
			}
		}
	}
}
}
