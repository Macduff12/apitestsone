import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Встановлення з'єднання з базою даних
            String url = "jdbc:mysql://149.202.88.119:3306/gs209124";
            String username = "gs209124";
            String password = "8Zgw2bF8kw74";
            connection = DriverManager.getConnection(url, username, password);

            System.out.println("Підключення до бази даних успішне!");
        } catch (SQLException e) {
            System.out.println("Помилка підключення до бази даних: " + e.getMessage());
        } finally {
            // Закриття з'єднання
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("Помилка при закритті з'єднання: " + e.getMessage());
                }
            }
        }
    }
}

