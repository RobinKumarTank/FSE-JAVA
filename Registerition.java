import java.sql.*;
import java.util.Scanner;
public class Registration {
        static final String D_URL = "jdbc:mysql://localhost:3306/mycogdemo";
        static final String USER = "root";
        static final String PASS = "pass@word1";
        static final String QUERY = "insert into reg (fname,email,pass) values (?,?,?)";

        public static void main(String args []){
            try (Connection con = DriverManager.getConnection(D_URL, USER, PASS);
                 Statement stmt = con.createStatement();
                 PreparedStatement ps = con.prepareStatement(QUERY);){
                Scanner sc=new Scanner(System.in);
                System.out.print("FIRST NAME: ");
                String fname = sc.nextLine();
                System.out.print("EMAIL: ");
                String email = sc.nextLine();
                System.out.print("PASSWORD: ");
                String pass = sc.nextLine();

                ps.setString(1,fname);
                ps.setString(2,email);
                ps.setString(3,pass);
                ps.executeUpdate();
            }
            catch(SQLException e){

            }
        }
    }

