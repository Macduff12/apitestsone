import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDataExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://149.202.88.119:3306/gs209124";
        String username = "gs209124";
        String password = "8Zgw2bF8kw74";

        String deleteQuery = "DELETE FROM donate_log WHERE id = 1";

        try {
            // Крок 1: Завантаження драйвера та встановлення з'єднання
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);

            // Крок 2: Створення об'єкту Statement
            Statement statement = connection.createStatement();

            // Крок 3: Виконання запиту DELETE
            int rowsAffected = statement.executeUpdate(deleteQuery);

            System.out.println("Кількість видалених рядків: 1" + rowsAffected);

            // Крок 4: Закриття ресурсів
            statement.close();
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



