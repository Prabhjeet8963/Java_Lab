package l;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class lQ5 {
    public static void main(String[] args) {
        System.out.println("Name: Prabhjeet");
        String dbUrl = "jdbc:mysql://localhost:3306/Class1"; 
        String dbUser = "root";
        String dbPass = "Prabhjeet00";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            Statement statement = connection.createStatement();

            int removeId = 102;
            String deleteQuery = "DELETE FROM Staff WHERE emp_id = " + removeId;

            int deletedRows = statement.executeUpdate(deleteQuery);
            System.out.println("-> Process completed. " + deletedRows + " record(s) deleted from Staff table.");

            connection.close();
        } catch (Exception ex) { 
            System.out.println("Deletion error: " + ex.getMessage());
        }
    }
}
