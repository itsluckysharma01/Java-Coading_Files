import java.sql.*;
import java.io.*;

public class imageJDBC {
    public static void main(String[] args){

        try{    

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "Lucky@9977");

            String q= "insert into images(pic) values(?)";
            //for Dynamic allocation
            PreparedStatement pstmt = con.prepareStatement(q);

            FileInputStream fis =new FileInputStream("pic1.jpg");
            //method for image it need file stream

            pstmt.setBinaryStream(1,fis,fis.available());
            pstmt.executeUpdate();
            System.out.println("Done.......");
            con.close();



            if (con.isClosed()){
                System.out.println("Connection Closed ! ");
            }
            else{
                System.out.println("Connection Started.........");
            }

        }
        catch(Exception e){
            System.out.println("Error !! ");
            e.printStackTrace();
        }
    }
    
}
