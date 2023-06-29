import java.sql.*;
import oracle.jdbc.driver.OracleDriver;
	public class ConnectionDemo {
		public static void main (String args[]) {
		Connection cn = null;
		try{
		OracleDriver driver = new OracleDriver();
			DriverManager.registerDriver(driver);
				cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
				if(cn !=null){
					System.out.println("Connection object is constructed.");
					}else{	
					System.out.println("connection object is not constructed.");
					}
				}catch(SQLException se){
					se.printStackTrace();
					}
				}
			}
		