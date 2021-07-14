import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.PreparedStatement;
		import java.sql.ResultSet;
		import java.sql.Statement;
		import java.util.Scanner;

public class MySql {

	public static void main(String[] args) {
		 
		
		 
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch5pm", "root", "root");
					System.out.println("connected...");
					
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter roll: ");
					int roll = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter name: ");
					String name = sc.nextLine();
					System.out.println("Enter marks: ");
					double marks = sc.nextDouble();
					PreparedStatement ps = c.prepareStatement("insert into student  values(?,?,?)");
					ps.setInt(1,roll);
					ps.setString(2,name);
					ps.setDouble(3, marks);
					ps.executeUpdate();
					System.out.println("Roll\tName\tMarks");
					ps = c.prepareStatement("select * from student");
					ResultSet rs = ps.executeQuery();
					while(rs.next())
					{
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
					}
				 
					c.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

 