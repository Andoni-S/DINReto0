package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
	private ResourceBundle configFile;
	private String url;
	private String user;
	private String pass;

	public DBConnection() {
		configFile = ResourceBundle.getBundle("application.Config");
		url = configFile.getString("URL");
		user = configFile.getString("USER");
		pass = configFile.getString("PASSWORD");
	}

	public Connection openConnection() {
		Connection con = null;
		
            try {
                con = DriverManager.getConnection(url, user, pass);
            } catch (SQLException e) {
                //Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
                System.err.print(e.getMessage());
            }
		
		return con;
	}

	public void closeConnection(PreparedStatement stmt, Connection con){
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				//Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
                                 System.err.print(e.getMessage());
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				//Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
                                 System.err.print(e.getMessage());
			}
		}
	}
}
