import java.sql.*;
import java.util.Scanner;
public class StudentInsert {
    static final String D_URL="jdbc:mysql://localhost:3306/mycogdemo";
    static final String USER = "root";
    static final String PASS = "pass@word1";
    static final String QUERY = "insert into student(Student_id, name, roll_number, department) values (?, ?, ?, ?)";

    public static void main(String args []){
        try (Connection con = DriverManager.getConnection(D_URL, USER, PASS);
             Statement stmt = con.createStatement();
             PreparedStatement ps = con.prepareStatement(QUERY);){
            Scanner sc=new Scanner(System.in);
            System.out.print("Student_id: ");
            int student_id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Roll Number: ");
            int roll_number = sc.nextInt();
            System.out.print("Department: ");
            String department = sc.nextLine();

            ps.setInt(1, student_id);
            ps.setString(2, name);
            ps.setInt(3, roll_number);
            ps.setString(4, department);

            int c=ps.executeUpdate();
            if(c==1){
                System.out.println("Insertion is successfully");
            }
            else{
                System.out.println("Insertion is not  successfully");
            }
        }
        catch(SQLException e){

        }
    }


}
