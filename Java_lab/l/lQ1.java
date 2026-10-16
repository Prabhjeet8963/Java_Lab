package l;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class lQ1 {
    public static void main(String[] args) {
        System.out.println("Name: Prabhjeet");
        String dbUrl = "jdbc:mysql://localhost:3306/Class1"; 
        String dbUser = "root";
        String dbPass = "Prabhjeet00"; 

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPass); 
            System.out.println("-> Database Connection Established Successfully!");

            Statement statement = connection.createStatement();
            String sqlQuery = "CREATE TABLE IF NOT EXISTS Staff (" + 
                              "emp_id INT PRIMARY KEY, " +
                              "emp_name VARCHAR(50), " +
                              "emp_salary DOUBLE)";

            statement.executeUpdate(sqlQuery);
            System.out.println("-> Staff table has been created successfully!");

            connection.close();
        } catch (Exception ex) { 
            System.out.println("Error occurred: " + ex.getMessage());
        }
    }
}
