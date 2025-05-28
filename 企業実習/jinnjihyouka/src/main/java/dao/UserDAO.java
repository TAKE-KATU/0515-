package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import model.User; 


public class UserDAO {
	
	private final String JDBC_URL = "jdbc:h2:~/desktop/DB/jinji";
	private final String DB_USER="sa";
	private final String DB_PASS="";
	
	public List<User>findAll(){
		List<User> udbList = new ArrayList<>();
		
		try {
			Class.forName("org.h2.Driver");
		}catch(ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバを読み込めませんでした");
		}
		
		try(Connection conn=DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)){
			String sql="SELECT id,pass FROM USERS";
			PreparedStatement pStmt=conn.prepareStatement(sql);
			
			ResultSet rs =pStmt.executeQuery();
			
			while(rs.next()) {
				String id=rs.getString("id");
				String pass=rs.getString("pass");
				User user=new User(id,pass);
				udbList.add(user);
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return udbList;
	}
	public User findByIdAndPass(String id, String pass) {
	    System.out.println("検索中: id=" + id + ", pass=" + pass);

	    try {
	        Class.forName("org.h2.Driver");

	        try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
	            String sql = "SELECT id, pass, name, role, lastlogin, lastlogout FROM USERS WHERE id = ? AND pass = ?";
	            PreparedStatement pStmt = conn.prepareStatement(sql);
	            pStmt.setString(1, id);
	            pStmt.setString(2, pass);

	            ResultSet rs = pStmt.executeQuery();

	            if (rs.next()) {
	                System.out.println("該当ユーザーが見つかりました。");
	                String userId = rs.getString("id");
	                String userPass = rs.getString("pass");
	                String userName = rs.getString("name");
	                String userRole = rs.getString("role");
	                Timestamp lastLogin = rs.getTimestamp("LASTLOGIN");
	                Timestamp lastLogout = rs.getTimestamp("LASTLOGOUT");
	                return new User(userId, userPass, userName, userRole, lastLogin, lastLogout);
	            } else {
	                System.out.println("該当ユーザーが見つかりませんでした。");
	            }
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return null;
	}


}
