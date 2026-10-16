package l;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class lQ3 {
    public static void main(String[] args) {
        System.out.println("Name: Prabhjeet");
        String dbUrl = "jdbc:mysql://localhost:3306/Class1"; 
        String dbUser = "root";
        String dbPass = "Prabhjeet00";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            Statement statement = connection.createStatement();

            String fetchQuery = "SELECT * FROM Staff";
            ResultSet resultSet = statement.executeQuery(fetchQuery);

            System.out.println("--- Staff Details ---");
            while (resultSet.next()) { 
                int id = resultSet.getInt("emp_id");
                String name = resultSet.getString("emp_name");
                double salary = resultSet.getDouble("emp_salary");
                
                System.out.println("ID: " + id + " | Name: " + name + " | Salary: Rs." + salary);
            }

            connection.close();
        } catch (Exception ex) { 
            System.out.println("Data retrieval error: " + ex.getMessage());
        }
    }
}
