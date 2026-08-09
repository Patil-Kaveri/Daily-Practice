import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertRecord {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url, username, password);

            String query = "INSERT INTO student (id, name) VALUES (?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, 104);
            ps.setString(2, "Kaveri");

            int rows = ps.executeUpdate();

            System.out.println(rows + " record inserted successfully.");

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}