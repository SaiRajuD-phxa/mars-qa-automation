package Mars10.tests;
import java.sql.*;
public class JDBC {

	public static void main(String[] args) {
 try {
		String url="jdbc:oracle://192.168.169.138:1561//V10QA01";
		String uname ="mars";
		String pass = "mars";
		String query = ("select * from ms_rep where Rep_id='183995'");
	//	Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString("FIRST_NM");
		System.out.println(name);
		st.close();
		con.close();
 }
 		catch(Exception exc) {
 			exc.printStackTrace();
	}
	}
}
