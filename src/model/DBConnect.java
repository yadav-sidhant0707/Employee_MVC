package model;
import static model.DAOprovider.*;
import java.sql.*;


public class DBConnect {
	static Connection con;
	public static Connection connectDB() throws ClassNotFoundException,SQLException
	{
		Class.forName(DBDRIVER);
		con=DriverManager.getConnection(DBURL,DBUSER,DBPASS);
		return con;
	}
}
