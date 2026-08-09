import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateRecord {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url, username, password);

            String query = "UPDATE student SET name = ? WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, "Kaveri Patil");
            ps.setInt(2, 104);

            int rows = ps.executeUpdate();

            System.out.println(rows + " record updated successfully.");

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}