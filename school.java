package StudentProject.StudentDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class school {
	public static void main(String args[]) throws Exception 
	{
		String query="";
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gl","root","root");
		Statement st=conn.createStatement();
		System.out.println("Enter some records");
		query=sc.nextLine();
		int i=st.executeUpdate(query);
		if(i>0)
		{
			System.out.println("Successfully inserted into database");
			ResultSet rs=st.executeQuery("select * from student");
			while(rs.next())
			{
				System.out.println(rs.getInt("roll_no")+" "+rs.getString("student_name")+" "+rs.getString("standard")+" "+rs.getDate("DOB")+" "+rs.getInt("fees_no"));
			}
			
		}
		System.out.println("Enter roll no.");
		int r=sc.nextInt();
		ResultSet rs2=st.executeQuery("select * from student where roll_no="+r);
		while(rs2.next())
		{
			System.out.println(rs2.getInt("roll_no")+" "+rs2.getString("student_name")+" "+rs2.getString("standard")+" "+rs2.getDate("DOB")+" "+rs2.getInt("fees_no"));
		}
			
		
	}

}
