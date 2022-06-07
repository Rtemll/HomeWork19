package HomeWork19;

import java.sql.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        try {
            Class.forName("org.sqlite.JDBC");
            Connection co = DriverManager.getConnection("jdbc:sqlite:my.db");
            System.out.println("OK");
//            String query = "CREATE TABLE users (name TEXT, surname TEXT);";
            String query = "INSERT INTO users (name, surname) VALUES ('Ivan', 'Ivanov');";
            Statement statement = co.createStatement();
            statement.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
