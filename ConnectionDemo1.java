import java.sql.*;
public class ConnectionDemo1{
	public static void main(String argsp[]){
		Connection cn = null;
		'try'{
		Class.forName("Oracle.jdbc.driver.OracleDriver");
		cn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","scott","tiger");
		if(cn !=null){
			System.out.println("Connection Object is Constructed.");
			}else{
		System.out.println("Connection Object is Not Constructed.");
			}
		}
	}
}
