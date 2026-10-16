package l;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class lQ4 {
    public static void main(String[] args) {
        System.out.println("Name: Prabhjeet");
        String dbUrl = "jdbc:mysql://localhost:3306/Class1"; 
        String dbUser = "root";
        String dbPass = "Prabhjeet00";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPass);

            int targetId = 101;
            double incrementedSalary = 55000.00;

            String updateSql = "UPDATE Staff SET emp_salary = ? WHERE emp_id = ?";
            PreparedStatement pstmt = connection.prepareStatement(updateSql);
            pstmt.setDouble(1, incrementedSalary);
            pstmt.setInt(2, targetId);

            int affectedRows = pstmt.executeUpdate();
            System.out.println("-> Success! " + affectedRows + " staff record(s) were updated.");

            connection.close();
        } catch (Exception ex) { 
            System.out.println("Update failed: " + ex.getMessage());
        }
    }
}
