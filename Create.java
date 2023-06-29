import java.sql.*;
public class Create {
	public Static void main(String args[]){
		Connection cn = null ;
		Statement st = null;
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		cn = DriverManager.getConnection("jdbc:Oracle:thin:@127.0.0.1:1521:XE","scott","tiger");
		st = cn.createStatement();
		int x=st.executeUpdate("create table j_emp(roll number(3),name varchar2(25))");
		System.out.println(x);
		System.out.println("Table is created.");
		}catch(ClassNotfoundException ce){
			System.out.println("class Not found.");
			}
		catch(SQLException ss){
			ss.printlnStackTrace();
			}
		finally{
			try{
			cn.close();
			}catch(SQLException ss){
				ss.printStackTrace();
				}
			}
		}
	}