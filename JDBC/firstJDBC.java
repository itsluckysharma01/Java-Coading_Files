// This is first JDBC program
import java.sql.*;
class firstJDBC {
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