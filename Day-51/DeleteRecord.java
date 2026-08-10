import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteRecord {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url, username, password);

            String query = "DELETE FROM student WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, 104);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Record deleted successfully.");
            } else {
                System.out.println("Record not found.");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}