import java.sql.*;
import java.util.Scanner;

public class ChangePassword {
    static final String D_URL = "jdbc:mysql://localhost:3306/mycogdemo";
    static final String USER = "root";
    static final String PASS = "pass@word1";
    static final String QUERY = "update twiter set password = ? where email = ?;";

    public static void main(String args []){
        try (Connection con = DriverManager.getConnection(D_URL, USER, PASS);
            Statement stmt = con.createStatement();
             PreparedStatement ps = con.prepareStatement(QUERY);){

            Scanner sc=new Scanner(System.in);
            System.out.print("EMAIL: ");
            String email = sc.nextLine();

            System.out.print("NEW PASSWORD: ");
            String password = sc.nextLine();

            ps.setString(1,password);
            ps.setString(2,email);
            int c=ps.executeUpdate();

            System.out.println("password updated successfully");

        }
        catch(SQLException e){

        }
    }
}
