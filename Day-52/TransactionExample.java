import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/bankdb";
        String username = "root";
        String password = "root";

        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, username, password);

            // Disable auto-commit
            con.setAutoCommit(false);

            String withdrawQuery =
                    "UPDATE account SET balance = balance - ? WHERE id = ?";

            String depositQuery =
                    "UPDATE account SET balance = balance + ? WHERE id = ?";

            PreparedStatement withdraw =
                    con.prepareStatement(withdrawQuery);

            PreparedStatement deposit =
                    con.prepareStatement(depositQuery);

            // Withdraw 500 from account 1
            withdraw.setDouble(1, 500);
            withdraw.setInt(2, 1);
            withdraw.executeUpdate();

            // Deposit 500 into account 2
            deposit.setDouble(1, 500);
            deposit.setInt(2, 2);
            deposit.executeUpdate();

            // Save both operations
            con.commit();

            System.out.println("Transaction completed successfully.");

            withdraw.close();
            deposit.close();

        } catch (Exception e) {

            try {
                if (con != null) {
                    con.rollback();
                    System.out.println("Transaction rolled back.");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } finally {

            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}