import java.sql.*;
import java.lang.*;

public class ViewTweet {
    static final String D_URL = "jdbc:mysql://localhost:3306/mycogdemo";
    static final String USER = "root";
    static final String PASS = "pass@word1";
    static final String QUERY =  "select * from twiter";

    public static void main(String args []){
        try (Connection con = DriverManager.getConnection(D_URL, USER, PASS);
             Statement stmt = con.createStatement();
             ResultSet rs=stmt.executeQuery(QUERY);){

            while(rs.next()){
                System.out.println("FIRST NAME: "+ rs.getString("first_name"));
                System.out.println("EMAIL: "+ rs.getString("email"));
                System.out.println("PASSWORD: "+ rs.getString("password"));
                System.out.println("TWEET MEESAGE: "+ rs.getInt("newtweet"));
            }
        }
        catch(SQLException e){

        }

    }

}
