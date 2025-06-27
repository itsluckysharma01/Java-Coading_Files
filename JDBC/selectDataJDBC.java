import java.sql.*;
public class selectDataJDBC {
    public static void main(String[] args){

        try{    

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "Lucky@9977");

            String q= "select * from table1";

            Statement stmt = con.createStatement();
            ResultSet r=stmt.executeQuery(q);
            
            while(r.next()){
                int id = r.getInt(1);
                String name = r.getString(2);
                String city = r.getString(3);
                System.out.println("Nmae:  "+name +" id: "+id + "  City:  "+city);
            }
    


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
