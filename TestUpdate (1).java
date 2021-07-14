import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestUpdate {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			System.out.println("connected...");
			Statement s = c.createStatement();	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter id for updation: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter updated name: ");
			String name = sc.nextLine();
			s.executeUpdate("update batch5pm set name='"+name+"' where id="+id);
			
			System.out.println("Id\tName");
			ResultSet rs = s.executeQuery("select * from batch5pm");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
			}
		 
			c.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
