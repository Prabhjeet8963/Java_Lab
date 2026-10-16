package l;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class lQ2 {
    public static void main(String[] args) {
        System.out.println("Name: Prabhjeet");
        String dbUrl = "jdbc:mysql://localhost:3306/Class1"; 
        String dbUser = "root";
        String dbPass = "Prabhjeet00";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPass);

            // Using PreparedStatement to change the logic and make it better
            String insertQuery = "INSERT INTO Staff (emp_id, emp_name, emp_salary) VALUES (?, ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(insertQuery);
            
            // Insert 1
            pstmt.setInt(1, 101);
            pstmt.setString(2, "Rahul Singh");
            pstmt.setDouble(3, 25500.00);
            pstmt.executeUpdate();
            
            // Insert 2
            pstmt.setInt(1, 102);
            pstmt.setString(2, "Amit Sharma");
            pstmt.setDouble(3, 30500.00);
            pstmt.executeUpdate();

            // Insert 3
            pstmt.setInt(1, 103);
            pstmt.setString(2, "Neha Gupta");
            pstmt.setDouble(3, 40500.00);
            pstmt.executeUpdate();

            System.out.println("-> All staff records have been inserted successfully!");

            connection.close();
        } catch (Exception ex) { 
            System.out.println("Insertion failed: " + ex.getMessage());
        }
    }
}
