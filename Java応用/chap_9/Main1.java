package chap_9;
import java.sql.*;

public class Main1 {
	public static void main(String[] args) {
		try {
			Class.forName("org.h2.Driver");
		}catch(ClassNotFoundException e ) {
			throw new IllegalStateException("ドライべのロードに失敗しました");
		}
		Connection con = null;
		try {
			con = DriverManager.getConnection("jbdc:h2:|/rpgdb");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(con != null) {
				try {
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	}
}
