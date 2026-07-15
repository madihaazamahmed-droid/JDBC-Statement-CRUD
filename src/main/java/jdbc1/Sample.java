package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
//	Statement s=c.createStatement();
//	s.execute("create database employee");
//	System.out.println("data base ctreated");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
	Statement s=c.createStatement();
//	s.execute("create table emp_det(name varchar(40),id int primary key,ph_no long)");
//	System.out.println("table created");
	
	//s.execute("insert into emp_det values('abc',101,1234567890)");
//	s.execute("insert into emp_det values('def',102,2345678901)");
//	s.execute("insert into emp_det values('ghi',103,3456789012)");
//	s.execute("insert into emp_det values('abc',104,4567890123)");
//		System.out.println("values inserted");
		
//		s.execute("update emp_det set name='xyz' where id=102");
//		System.out.println("value updated");
	
	s.execute("delete from emp_det where id=104");
	System.out.println("data deleted");
	
		
	}

}
