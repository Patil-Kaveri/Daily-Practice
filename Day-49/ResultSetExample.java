import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetExample {

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
            String query = "SELECT * FROM student";

            // Execute query
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Student Records:");

            // Read records
            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");

                System.out.println(
                        "ID: " + id + ", Name: " + name);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}