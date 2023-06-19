import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseQueryExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://149.202.88.119:3306/gs209124";
        String username = "gs209124";
        String password = "8Zgw2bF8kw74";

        try {
            // Крок 1: Встановлення з'єднання
            Connection connection = DriverManager.getConnection(url, username, password);

            // Крок 2: Створення об'єкта Statement
            Statement statement = connection.createStatement();

            // Крок 3: Виконання запиту
            String query = "SELECT * FROM accounts";
            ResultSet resultSet = statement.executeQuery(query);

            // Крок 4: Обробка результатів запиту
            while (resultSet.next()) {
                // Отримання даних з рядка результатів
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                int password1 = resultSet.getInt("password");
                int skin = resultSet.getInt("skin");
                int level = resultSet.getInt("level");
                int money = resultSet.getInt("money");
                // Додаткові поля, якщо є


                // Обробка даних (наприклад, виведення на консоль)
                System.out.println("ID: 2" + id + ", Name: " + name + ", Password: " + password1 +  ", Email : " + email +  ", Skin : " + skin +  ", Level : " + level +  ", Money : " + money);
            }

            // Крок 5: Закриття ресурсів
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Помилка: Не вдалося підключитися до бази даних або виконати запит.");
            e.printStackTrace();
        }
    }
}


