import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://149.202.88.119:3306/gs209124";
        String username = "gs209124";
        String password = "8Zgw2bF8kw74";

        try {
            // Крок 1: Завантаження драйвера та встановлення з'єднання
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);

            // Крок 2: Виконання SQL-запиту для створення таблиці
            String sql = "CREATE TABLE testsecond_table (id INT PRIMARY KEY, name VARCHAR(50))";

            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);

            System.out.println("Таблиця успішно створена.");

            // Крок 3: Закриття з'єднання
            connection.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Помилка: Драйвер не знайдено.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Помилка: Не вдалося підключитися до бази даних або виконати запит.");
            e.printStackTrace();
        }
    }
}

