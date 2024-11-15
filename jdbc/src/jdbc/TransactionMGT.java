package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TransactionMGT {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String driver,url,user,password;
	driver="com.mysql.cj.jdbc.Driver";
	url = "jdbc:mysql://localhost:3306/db123";
	user = "root";
	password = "Sairam@1439";
    String quary1="update student set mobile=mobile-2000 where id=123";
    String quary2="update student set mobile=mobile+2000 where id=101";
	Class.forName(driver);//loading driver is optional from java 1.6 jdbc 4.8 verssion
	//establish connection
	Connection con= DriverManager.getConnection(url,user,password);
	//disable auto commit
	con.setAutoCommit(false);
	Statement st =con .createStatement();
	//add batch
	st.addBatch(quary1);
	st.addBatch(quary2);
	//execute batch
	int[] result=st.executeBatch();
	//commit or roll back
	if(result[0]==1&&result[1]==1) {
		con.commit();
		System.out.println("transaction success");
	}else {
		con.rollback();
		System.out.println("transaction fail");
	}
	st.close();
	con.close();
}
}
