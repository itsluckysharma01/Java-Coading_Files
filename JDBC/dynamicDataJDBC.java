// This is Dynamic Statement Example
import java.sql.*;
import java.io.*;

public class dynamicDataJDBC {
    public static void main(String args[])
    {
        try{

            // Load the driver mysql.cj
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // creating a connection
            String url="jdbc:mysql://localhost:3306/JDBC";
            String username = "root";
            String password = "Lucky@9977";

            Connection con=DriverManager.getConnection(url, username, password);

            // Create a query
            String q = "INSERT INTO table1 (tname,tcity) values (?,?)"; 


            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name: ");
            String name= br.readLine();

            System.out.println("Enter city: ");
            String city= br.readLine();

            
            PreparedStatement pstmt= con.prepareStatement(q);
            //set the vlues to query
            pstmt.setString(1,name);  //name
            pstmt.setString(2,city); // city
            pstmt.executeUpdate();

            System.out.println("Inserted Successfully.........");
            con.close();





            if(con.isClosed()){
                System.out.println("Connection is Closed");
            }
            else{
                System.out.println("Connection is Created..........");
            }



        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}