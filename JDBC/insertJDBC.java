// This is first JDBC program
import java.sql.*;
class insertJDBC {
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

            // Create a Query
            String q = "CREATE TABLE table1 (tid int primary key auto_increment, tname varchar(200) not null, tcity varchar(100))"; 

            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);

            System.out.println("Table Created Successfully.........");
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