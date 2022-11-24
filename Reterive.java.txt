import java.sql.*;
public class StudentReterive {
    static final String D_URL="jdbc:mysql://localhost:3306/mycogdemo";
    static final String USER = "root";
    static final String PASS = "pass@word1";
    static final String QUERY= "select * from student";

    public static void main(String args []) {

        try (Connection con = DriverManager.getConnection(D_URL, USER, PASS);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(QUERY);) {

            while (rs.next()) {
                System.out.println("student_id: " + rs.getString("student_id"));
                System.out.println("name: " + rs.getString("name"));
                System.out.println("roll_number: " + rs.getString("roll_number"));
                System.out.println("department: " + rs.getInt("department"));
            }
        }
        catch(SQLException e){

        }
    }
}
