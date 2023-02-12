import java.sql.*;
import java.util.concurrent.locks.StampedLock;

public class CRUDClass {
    public static void main(String[]args){
        try{
            // Loading the driver
            Class.forName("com.mysql.jdbc.Driver");

            //creating a connection
            String url="jdbc:mysql://localhost:3306/vaibhav";
            String username="root";
            String password="Mummy@80";
            Connection con=DriverManager.getConnection(url,username,password);
            //create a TABLE WITH table1
            String q="crete table table1(task INT (200) not null ,is_completed varchar(50),end_date DATE )";
            // create a statment
            Statement stmt= con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("table created in database");
            con.close();
        }catch (Exception e){

        }
    }
}
