import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestJdbc {

	public static void main(String[] args) {
		
		try {
		// 1: Load the Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
		// 2: Crate a Connection
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			System.out.println("connected...");
		// 3: create statement
			Statement s = c.createStatement();
		// 4: perform operation: 
			//s.executeUpdate("create table batch5pm (id number,name varchar2(20))");
			//int x = s.executeUpdate("insert into batch5pm values(112,'harsh')");
			//System.out.println(x+" row is inserted in my table.");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name: ");
			String name = sc.nextLine();
			s.executeUpdate("insert into batch5pm values("+id+",'"+name+"')");
			
			System.out.println("Id\tName");
			ResultSet rs = s.executeQuery("select * from batch5pm");
			while(rs.next())
			{
				System.out.println(rs.getInt("id")+"\t"+rs.getString(2));
			}
		// 5: close the connection
			c.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
