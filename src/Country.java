import java.sql.*;

public class Country {
    final String DB_URL = "jdbc:mysql://localhost:3306/newdb";
    final String USER = "root";
    final String PASS = "admin";
    Connection connection = null;

    public void giveCountry() {
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            String queryGiveCountry = ""
                    + "ALTER TABLE students ADD country VARCHAR(30)";
            statement.executeUpdate(queryGiveCountry);


            statement.close();
            connection.close();
            System.out.println("eseguito con successo");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void insertCountry (String country){
        try {


            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            String queryInsert = "INSERT INTO students (country) VALUES ('" +country+ "');";
            statement.executeUpdate(queryInsert);
            statement.close();
            System.out.println("eseguito con successo");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}
