import java.sql.*;
import java.util.Scanner;
import java.lang.*;

public class NewTweet {

    static final String D_URL="jdbc:mysql://localhost:3306/mycogdemo";
    static final String USER = "root";
    static final String PASS = "pass@word1";
    static final String QUERY ="insert into twiter (first_name, email, password, newtweet) values (?,?,?,?);";

    public static void main(String args []){
        try (Connection con = DriverManager.getConnection(D_URL, USER, PASS);
             Statement stmt = con.createStatement();
             PreparedStatement ps = con.prepareStatement(QUERY);){
             Scanner sc=new Scanner(System.in);
             System.out.print("FIRST NAME: ");
             String first_name = sc.nextLine();

            System.out.print("EMAIL: ");
            String email = sc.nextLine();

            System.out.print("PASSWORD: ");
            String password = sc.nextLine();

            System.out.print("ENTER NEW TWEET MESSAGE: ");
            String newtweet = sc.nextLine();

            ps.setString(1, first_name);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.setString(4, newtweet);
            ps.executeUpdate();

            System.out.println("Your New twiter message is done successfully!!");
        }
        catch(SQLException e){

        }

    }



}
