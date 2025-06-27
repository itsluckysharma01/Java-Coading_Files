import java.sql.*;
import java.io.*;

public class updateTable {
    public static void main(String[] args){

        try{    

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "Lucky@9977");

            String q= "update table1 set tname=?, tcity=? where tid=?";
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Enter New Name: ");
            String name = br.readLine();
            System.out.println("Enter New City: ");
            String city=br.readLine();
            System.out.println("Enter the id: ");
            int id = Integer.parseInt(br.readLine());

            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.setInt(3, id);

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
