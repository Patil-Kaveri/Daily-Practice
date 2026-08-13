import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class StatementExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";

        try {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection con = DriverManager.getConnection(
                    url, username, password);

            // Create Statement
            Statement stmt = con.createStatement();

            // SQL query
            String query = "CREATE TABLE IF NOT EXISTS student (" +
                           "id INT PRIMARY KEY, " +
                           "name VARCHAR(50))";

            // Execute query
            stmt.executeUpdate(query);

            System.out.println("Table created successfully.");

            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}