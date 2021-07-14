package ps;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestUpdate {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			System.out.println("connected...");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name: ");
			String name = sc.nextLine();
			PreparedStatement ps = c.prepareStatement("insert into batch5pm values(?,?)");
			ps.setInt(1,id);
			ps.setString(2,name);
			ps.executeUpdate();
			System.out.println("Id\tName");
			ps = c.prepareStatement("select * from batch5pm");
			ResultSet rs = ps.executeQuery();
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
