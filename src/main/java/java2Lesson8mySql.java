import java.sql.*;

import static java.lang.Class.forName;

public class java2Lesson8mySql {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String user = "root";
        String password = "1380";
        String connectionUrl = "jdbc:mysql://localhost:3306/mysql";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(connectionUrl, "root", "1380");
        Statement statement = connection.createStatement();
        //statement.executeUpdate("INSERT INTO students.lesson8 (name, sirname) VALUES ('Homer', 'Simpson');");
        ResultSet rs = statement.executeQuery("SELECT * FROM students.lesson8");
        while (rs.next()) {
            System.out.println(rs.getString("name"));//.getString("TABLE_NAME"));
            System.out.println(rs.getString("sirname"));

        }
        //jdbc:mysql://localhost:3306/mysql
        //

    }
}
