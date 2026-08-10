import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SearchRecord {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url, username, password);

            String query = "SELECT * FROM student WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, 101);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("Student Found!");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));

            } else {
                System.out.println("Student not found.");
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}