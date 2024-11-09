package jdbc;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class CallableStementDemo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String driver,url,user,password;
	driver="com.mysql.cj.jdbc.Driver";
	url = "jdbc:mysql://localhost:3306/db12634";
	user = "root";
	password = "Sairam@1439";
	String procedure ="{call getAllemployee()}";
	String procedure1 ="{call new_procedure()}";
	Class.forName(driver);
	Connection con= DriverManager.getConnection(url,user,password);
	CallableStatement st= con.prepareCall(procedure);
	CallableStatement st1= con.prepareCall(procedure1);
	ResultSet rs=st.executeQuery();
	ResultSet rs1=st1.executeQuery();
	while(rs.next()) {
		System.out.println(rs.getInt("id"));
		System.out.println(rs.getString("name"));
		System.out.println(rs.getString("salary"));
		System.out.println(rs.getString("gender"));
		System.out.println(rs.getString("city"));
		System.out.println("-------------------------");
		}
	while(rs1.next()) {
		System.out.println(rs1.getInt("id"));
		System.out.println(rs1.getString("name"));
		System.out.println(rs1.getString("salary"));
		System.out.println(rs1.getString("gender"));
		System.out.println(rs1.getString("city"));
		System.out.println("-------------------------");
		}
	rs.close();
	st.close();
	con.close();
}
}
