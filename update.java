import java.sql.*;
import java.util.Scanner;
public class StudentUpdate {
    static final String D_URL="jdbc:mysql://localhost:3306/mycogdemo";
    static final String USER = "root";
    static final String PASS = "pass@word1";
    static final String QUERY=  "update student set roll_number = ? where student_id = ?";

    public static void main(String args []){
        try (Connection con = DriverManager.getConnection(D_URL, USER, PASS);
             Statement stmt = con.createStatement();
             PreparedStatement ps = con.prepareStatement(QUERY);){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter new roll number: ");
            int roll_number = sc.nextInt();
            System.out.print("Enter student id for which you want to update roll number: ");
            int student_id = sc.nextInt();

            ps.setInt(1, student_id);
            ps.setInt(2, roll_number);

            int c=ps.executeUpdate();
            if(c==1){
                System.out.println("Roll Number is updated successfully");
            }
            else{
                System.out.println("Roll Number is not updated successfully");
            }
        }
        catch(SQLException e){

        }

    }
}
